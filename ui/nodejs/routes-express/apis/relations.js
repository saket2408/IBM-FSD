const server = require('express').Router();
const RService = require('../services/relationService').relationService;
const relationService = new RService();
const setContentHeader = require('../services/utils').setContentHeader;

// get all projects
server.get('/',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        relation : relationService._all()
    }));
});

// add a new project
server.post('/add',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        relation : relationService._add(req.body)
    }));
});

module.exports.relationRoutes = server;