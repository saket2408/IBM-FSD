const server = require('http');

// create Http Server
const http = server.createServer((request,response)=>{
    if(request.url === '/login'){
        response.end(JSON.stringify({
            id:1,
            user : 'bob marshals',
            email : 'bob@gg.com'
        }));
    }
});

http.listen(1234);
