const routes = require('express').Router();
const UserService = require('../services/user.service').UserService;
const userService = new UserService();

routes.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : "status running"
    });
});

routes.get('/',(rq,rs)=>{
    userService.fetchUsers((users)=>{
        rs.status(200).json({
            message : 'Users Fetched',
            users : users
        })
    });    
});
// add a new user
routes.post('/add',(rq,rs)=>{
    userService.add(rq.body,(err,result)=>{
        if(err){
            rs.status(400).json({
                message : 'Unable to process the request'
            });
        }else{
            rs.status(200).json({
                message : 'User created Successfully',
                result : result
            });
        }
    });
});

routes.post('/delete',(rq,rs)=>{
    userService.delete(rq.body,(err,response)=>{
        if(err){
            rs.status(400).json({
                message : 'Unable to process the request'
            });
        }else{
            rs.status(200).json({
                message : 'User deleted Successfully',
                result : response
            });
        }
    })
})

routes.post('/update',(rq,rs)=>{
    userService.update(rq.body,(err,response)=>{
        if(err){
            rs.status(400).json({
                message : 'Unable to process the request',
                error : err
            });
        }else{
            rs.status(200).json({
                message : 'User deleted Successfully',
                result : response
            });
        }
    })
})

module.exports = {
    userRoutes : routes
}