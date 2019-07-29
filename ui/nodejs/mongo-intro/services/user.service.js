const MongoClient = require('mongodb').MongoClient;
class UserService {

    fetchUsers(callback){
        MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('ibm-training').collection('users').find({}).toArray((error,users)=>{
                if(!error){
                    callback(users);
                }
            });
        });
    }
    
    add(_user,callback){
        MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('ibm-training').collection('users').insert(_user,(err,response)=>{
                callback(err,response);
            });
        });
    }

    delete(user,callback){
        MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('ibm-training').collection('users').remove({name:user.name},(error,response)=>{
                callback(error,response);
            });

    });
    }

    update(user,callback){
        MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
            console.log(user)
            const id = user._id;
            delete user._id;
            conn.db('ibm-training').collection('users').update({_id : id},{$set : user},(err,res)=>{
                callback(err,res);
            });
    });
}
}
module.exports = {
    UserService
}