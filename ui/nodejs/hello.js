class Calculator{
    _add(i,j){
        return i+j;
    }
    _sub(i,j){
        return i-j;
    }
    _mul(i,j){
        return i*j;
    }
    _div(i,j){
        return i/j;
    }
    _operation(_operator,_first,_second){
    if(_operator == 'add'){
        console.log(this._add(_first,_second));
    }
    else if(_operator == 'sub'){
        console.log(this._sub(_first,_second));
    }
    else if(_operator == 'mul'){
        console.log(this._mul(_first,_second));
    }
    else if(_operator == 'div'){
        console.log(this._div(_first,_second));
    }
    else{
        console.log('wrong operator');
    }
}
}

module.exports = {
    Calculator
}