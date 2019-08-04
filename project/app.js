//dependencies
const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
var multer = require('multer');
const userRoutes = require('./routes/user').userRoutes;
//server created


//injecting body parser into server
server.use(parser.json());

//using cors
server.use(cors());

//status api
server.get('/status', (rq, rs) => {
    rs.status(200).json({
        message: 'Status is running!'
    })
})


//unauthorized access
server.get('/unauth', (rq, rs) => {
    rs.status(401).json({
        message: 'Unauthorize Access'
    });
});

//map routes
server.use('/user', userRoutes);

//port binding 
const PORT = 1234;
server.listen(PORT, () => {
    console.log(`server is running at ${PORT}`);
})