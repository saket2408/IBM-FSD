const routes = require('express').Router();
const UserService = require('../services/user_service').UserService;
const uservice = new UserService()

routes.get('/status', (rq, rs) => {
    res.status(200).json({
        message: "server is working"
    })

});

//generate new token
routes.post('/token', (rq, rs) => {
    if (rq.body.email == undefined || rq.body.password == undefined) {
        rs.status(401).json({
            message: 'Please provide the valid Credentials'
        });
    } else {
        uservice.fetchUser(rq.body.email, rq.body.password, (err, res) => {
            if (res != undefined && res.length > 0) {
                //generate jwt token
                const _token = uservice.generateToken(rq.body.email)

                const _user = {
                    token: _token,
                    email: rq.body.email
                }
                uservice.saveToken(_user, (err, data) => {
                    if (err) {
                        rs.status(401).json({
                            message: 'Unable to process your save request'
                        })
                    } else {
                        rs.status(200).json({
                            message: 'token generated successfullly',
                            token: _token
                        })
                    }
                })
            } else {
                rs.status(401).json({
                    message: 'Please provide the valid Credentials'
                })

            }
        })
    }
});

routes.post('/register', (rq, rs) => {
    uservice.getUser(rq.body.email, (err, res) => {
        if(res.length>0){
            rs.status(401).json({
                message: 'email exists'
            })
        }
        else{
        uservice.addUser(rq.body, (req, res) => {
            rs.status(200).json({
                message: 'user registered  successfully!'
            })
        })
    }
})
});

routes.post('/fetch', (rq, rs) => {
    uservice.getUser(rq.body.email, (err, res) => {
        if(res.length>0){
            rs.status(201).json({
                message: 'email exists',
                user : res[0]
            })
        }
        else{
            rs.status(201).json({
                message: 'email does not exists'
            })
    }
})
});

routes.post('/updateuser', (rq, rs) => {
    uservice.updateUser(rq.body, (err, res) => {
        
            rs.status(201).json({
                message: 'updated'
            })
})
});

module.exports.userRoutes = routes;