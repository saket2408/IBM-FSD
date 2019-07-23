const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const itemRoutes = require('./apis/items').itemRoutes;

// apply json parser
server.use(parser.json());
// apply cors
server.use(cors());


server.use('/items',itemRoutes);

server.listen(1269,()=>{
    console.log('Server started at 1269');
});