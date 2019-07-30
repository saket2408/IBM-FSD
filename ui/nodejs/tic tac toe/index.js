const express = require('express');
const parser = require('body-parser');
const cors = require('cors');
const sampleRoutes = require('./routes/sample').sampleRoutes;

const server = express();
const PORT = 6789;
server.use(parser.json());
server.use(cors());

server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : "service running"
    });
});

// bind user routes
server.use('/save',sampleRoutes);

server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});
