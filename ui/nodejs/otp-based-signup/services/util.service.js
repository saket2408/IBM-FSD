const UserConstants = {
    mongo: {
        url : 'mongodb://localhost:',
        port : 27017,
        db : 'userjwt',
        collections: {
            user : 'user'
        },
        smtp : {
            provider : 'gmail',
            address :  'ibmtechtraining007@gmail.com',
            password : 'India@786'
        }
    }
}


module.exports = {
    UserConstants
}