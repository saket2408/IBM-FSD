const routes = require('express').Router();
const sampleService = require('../services/sample.service').sampleService;
const sService = new sampleService();

routes.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : "status running"
    });
});

routes.get('/',(rq,rs)=>{
    sService._fetch((data)=>{
        rs.status(200).json({
            data
        })
    });    
});


routes.post('/update',(rq,rs)=>{
    console.log(rq.body)
    sService.update(rq.body,(err,response)=>{
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
    sampleRoutes : routes
}