const calculate =(_operator,_num1)=>{
    switch(_operator){
        case 'add':
            return (_num2)=>{
                return _num1 + _num2;
                } 

        case 'sub':
            return (_num2)=>{
                    return _num1 - _num2;
                    }

        case 'mul':
            return (_num2)=>{
                    return _num1 * _num2;
                    }

        case 'div':
            return (_num2)=>{
                    return _num1 / _num2;
                    }  
}
}

let _add = calculate('add',10)(23);
console.log(_add);

let sub = calculate('sub',10)(10);

console.log(sub);

let mul = calculate('mul',10)(10);

console.log(mul);

let div = calculate('div',10)(2);
console.log(div);