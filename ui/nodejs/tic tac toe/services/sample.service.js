const MongoClient = require('mongodb').MongoClient;
class sampleService {

    _fetch(callback){
        MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('tic_tac').collection('sample').find({}).toArray((error,sample)=>{
                if(!error){
                    callback(sample);
                }
            });
        });
    }
    
    update(sample,callback){
        MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
            const id = sample._id;
            delete sample._id;
            conn.db('tic_tac').collection('sample').update({_id : id},{$set : sample},(err,res)=>{
                callback(err,res);
            });
    });
}
}
module.exports = {
    sampleService
}