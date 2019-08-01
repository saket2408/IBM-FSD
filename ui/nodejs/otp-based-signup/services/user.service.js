const client = require('mongodb').MongoClient;
const UserConstants = require('./util.service').UserConstants;
const Email = require('../services/email.service').Email;
const email = new Email();

var dateTime = require('node-datetime');
var dt = dateTime.create();


class Service {
    // verify user
    
    addUser(_user,callback){
        let otp = Math.floor(100000 + Math.random() * 900000);
        let emaildata = {
            email : _user.email,
            data : "your otp is :"+ otp
        }
        this.email(emaildata)
        var time = dt.format('H:M:S');
        let date = new Date();
        let hour =  date.getHours();        
        let min =  date.getMinutes() + 4;        
        let sec =  date.getSeconds(); 
        let expire_time = hour +":"+ min +":"+ sec
        let user = {
            email : _user.email,
            name : _user.name,
            phone : _user.phone,
            otp : otp,
            generate : time,
            expire_time : expire_time
        }
        const _url = UserConstants.mongo.url + UserConstants.mongo.port;
        client.connect(_url,(err,connection)=>{
            connection.db(UserConstants.mongo.db).collection(UserConstants.mongo.collections.user).insert(user,(err,response)=>{
                callback(err,response);
            });
        });
    } // end of add user
    // get all users
    findUsers(otp, callback){
        let _otp = parseInt(otp.otp)
        const _url = UserConstants.mongo.url + UserConstants.mongo.port;
        client.connect(_url,(err,connection)=>{
            connection
            .db(UserConstants.mongo.db)
            .collection(UserConstants.mongo.collections.user)
            .find({otp: _otp})
            .toArray((err,response)=>{
                callback(err,response);
            });
        });
    } // end of fetch user


    email(item){
        let userObj ={
            subject : "your otp",
            body : item.data,
            from : null,
            to : item.email
        }
        let status = email.emailWithAttachment(userObj);
        return status;
}
}
module.exports={
    UserService : Service
}