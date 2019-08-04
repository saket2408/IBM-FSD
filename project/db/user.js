const userDetails = {
    mongo: {
        url: 'mongodb://localhost:',
        port: 27017,
        db: 'QAengine',
        collections: {
            user: 'users',
            security: 'security',
            credit : 'credits'
        }
    },
    jwt: {
        key: 'thisismyprivatekeytosuccess'
    }
}
module.exports.userDetails = userDetails;