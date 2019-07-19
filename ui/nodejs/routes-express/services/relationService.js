const relation = require('../db/relation').relation;
class relationService{
    relation=[];
    constructor(){
        this.relation = relation;
    }
    _all(){
        return this.relation;
    }
    _add(_relation){
        this.relation.push(_relation);
        return this.relation;
    }
}

module.exports.relationService = relationService;