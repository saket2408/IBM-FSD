const server = require('express').Router();
const UserService = require('../services/user.service').UserService;
const userService = new UserService();
var dateTime = require('node-datetime');
var dt = dateTime.create();

// apis
server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : 'Security Service is Running'
    });
});
// sign up
server.post('/register',(rq,rs)=>{
    userService.addUser(rq.body,(err,res)=>{
        if(err){
            rs.status(402).json({
                message : 'Unable to proceess the request',
                trace : err
            });
        }else{
            rs.status(200).json({
                message : 'User created successfully',
                users : res 
            });
        }
    });
});

server.post('/validotp',(rq,rs)=>{
    userService.findUsers(rq.body,(err,res)=>{
        if(res.length!=0){
            var time = dt.format('H:M:S');
            if(time <= res[0].expire_time){
                rs.status(200).json({
                    message : 'valid'
                });
            }
            else{
                rs.status(400).json({
                    message : 'Invalid'
                });
            }
        }
        else{
            rs.status(400).json({
                message : 'InvalidOTP'
            });
        }
    })
})


// redirect in case of invalid / no access
server.get('/unauthorize',(rq,rs)=>{
    rs.status(403).json({
        message : 'Unauthorize Access'
    });
});

module.exports = {
    server
}