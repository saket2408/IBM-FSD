const Client = require('mongodb').MongoClient;
const userDetails = require('../db/user').userDetails;
const jwt = require('jsonwebtoken');



//class user services
class UserService {

    //verify user
    fetchUser(_email, _pass, callback) {
            const _url = userDetails.mongo.url + userDetails.mongo.port;
            Client.connect(_url, (err, conn) => {
                conn.db(userDetails.mongo.db)
                    .collection(userDetails.mongo.collections.user)
                    .find({ email: _email, password: _pass }).toArray((err, res) => {
                        callback(err, res);
                    });
            });

        }
    
    getUser(_email, callback) {
        const _url = userDetails.mongo.url + userDetails.mongo.port;
        Client.connect(_url, (err, conn) => {
            conn.db(userDetails.mongo.db)
                .collection(userDetails.mongo.collections.user)
                .find({ email: _email}).toArray((err, res) => {
                    callback(err, res);
                });
        });

    }
    //create jwt token
    generateToken(user){
        const data = {
            email : user   
            }
        const token = jwt.sign(data,userDetails.jwt.key,{
            expiresIn : '1200000000000s'
        });
        return token;
    }


    //save token
    saveToken(_user, callback) {
        const _url = userDetails.mongo.url + userDetails.mongo.port;
        Client.connect(_url, (err, conn) => {
            conn.db(userDetails.mongo.db)
                .collection(userDetails.mongo.collections.security)
                .update({ email: _user.email }, { $set: _user }, { upsert: true },
                    (err, res) => {
                        callback(err, res);
                    }
                )
        })
    }

    addUser(_user, callback) {
        const _url = userDetails.mongo.url + userDetails.mongo.port;
        Client.connect(_url, (err, connection) => {
            connection.db(userDetails.mongo.db)
                .collection(userDetails.mongo.collections.user)
                .update({ email: _user.email }, { $set: _user }, { upsert: true }, (err, response) => {
                    callback(err, response)
                });
                connection.db(userDetails.mongo.db)
                .collection(userDetails.mongo.collections.credit)
                .update({ email: _user.email }, { $set: {email : _user.email, credits : 10} }, { upsert: true })
         });
        
    }

    updateUser(_user, callback) {
        const _url = userDetails.mongo.url + userDetails.mongo.port;
        Client.connect(_url, (err, connection) => {
            connection.db(userDetails.mongo.db)
                .collection(userDetails.mongo.collections.user)
                .update({ email: _user.email }, { $set: _user }, { upsert: true }, (err, response) => {
                    callback(err, response)
                });

            })
    }
}


module.exports.UserService = UserService;