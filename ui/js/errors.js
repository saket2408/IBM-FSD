const calculate = (_first,_next)=>{
    try{
        if(_next==0){
            throw new Error('division by zero is not possible');
        }else{
            return sum = _first / _next;
        }
    }
    catch(error){
        console.log(error);
        return sum = _first/1;
    }
}

sum = calculate(10,0);
console.log(sum);


/////////////////////////////////////////self build error class////////////////////////////////////////////////
class ArthmeticError extends Error{
    constructor(errorMessage){
        super(errorMessage);
    }
    getmessage(){
        return this.message;
    }
}

const add = (_first,_next)=>{
    try{
        if(_next==0){
            throw new ArthmeticError('addition by zero is not possible');
        }else{
            return sum = _first + _next;
        }
    }
    catch(error){
        console.log(error);
        return sum = _first;
    }
}

sum = add(10,0);
console.log(sum);