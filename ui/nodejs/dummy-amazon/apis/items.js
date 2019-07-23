const server = require('express').Router();
const itemService = require('../services/items-service').itemservice;
const iService = new itemService();


server.get('/',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._all()
    }));
});

server.post('/add',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._add(req.body)
    }));
});

server.post('/search',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._filter(req.body)
    }));
});

server.post('/update',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._edit(req.body)
    }));
});
server.post('/addcart',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._addtoCart(req.body)
    }));
});
server.post('/find',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._find(req.body)
    }));
});

server.post('/findCart',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._findCart(req.body)
    }));
});


server.post('/quantityCart',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._findCartquantity(req.body)
    }));
});

server.get('/cart',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iService._showCart()
    }));
});

server.get('/length',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        length : iService._totalcart()
    }));
});

server.post('/email',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        message : iService.email(req.body)
    }));
});


module.exports.itemRoutes = server;