const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');

// apis
const securityAPis = require('./apis/security.api').server;

server.use(parser.json());
server.use(cors());

// apis
server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : 'Server is Running'
    });
});


server.use('/security',securityAPis);

const PORT = 46767;
server.listen(PORT,()=>{
    console.log(`Server is Started at ${PORT}`);
});
