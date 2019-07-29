const express = require('express');
const parser = require('body-parser');
const cors = require('cors');
const userRoutes = require('./routes/users').userRoutes;

const server = express();
const PORT = 6669;
server.use(parser.json());
server.use(cors());

server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : "service running"
    });
});

// bind user routes
server.use('/api/users',userRoutes);

server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});
