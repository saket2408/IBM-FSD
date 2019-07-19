const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
server.use(cors());

server.use(parser.json());

server.get('/:num1/:num2/:op',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    let _op = req.params.op;
   // console.log(_op)

    if(_op=='add'){
        console.log('op called ADD '+req.params.num1+"---" +req.params.num2);
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) + parseInt(req.params.num2)
    }));
    }
    else if(_op=='sub'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) - parseInt(req.params.num2)
    }));
    }
    else if(_op=='mul'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) * parseInt(req.params.num2)
    }));
    }
    else if(_op=='div'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) / parseInt(req.params.num2)
    }));
    }
});

server.post('/result',(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('content-type','application/json');
    let _op = req.body.op;
    if(_op=='add'){
        //console.log(_op);
        res.end(
            JSON.stringify({
                result: parseInt(req.body.num1) + parseInt(req.body.num2)
            })
        );
    }
    else if(_op=='sub'){
        //console.log(_op);
        res.end(
            JSON.stringify({
                result: parseInt(req.body.num1) - parseInt(req.body.num2)
            })
        );
    }
    else if(_op=='mul'){
        //console.log(_op);
        res.end(
            JSON.stringify({
                result: parseInt(req.body.num1) * parseInt(req.body.num2)
            })
        );
    }
    else if(_op=='div'){
        //console.log(_op);
        res.end(
            JSON.stringify({
                result: parseInt(req.body.num1) / parseInt(req.body.num2)
            })
        );
    }
});


const PORT = 1234;
server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});