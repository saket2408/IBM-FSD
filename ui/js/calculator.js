let number='' ;
let num2;
let sum;
let operator;
let operator1;
function getItem(num){
    number += num;
    document.getElementById('textfield').value = number;
}

function setNumber(operation){
    num1 = number;
    operator = operation;                                                   
    number = '';
    document.getElementById('textfield').value = '';
}

function calculate(){
    
    
    if (operator == '+'){
        num2 = number;
         operator1 = operator;
        sum = parseInt(num1) + parseInt(num2);
        num1 = new String(sum);
        document.getElementById('textfield').value = num1;
        number= num1;
        operator='';
    }
    else if (operator == '-'){
        num2 = number;
         operator1 = operator;
        sum = parseInt(num1) - parseInt(num2);
        num1 = new String(sum);
        document.getElementById('textfield').value = num1;
        number=num1;
        operator='';
    }
    else if (operator == '*'){
        num2 = number;
        operator1 = operator;
        sum = parseInt(num1) * parseInt(num2);
        num1 = new String(sum);
        document.getElementById('textfield').value = num1;
        number=num1;
        operator='';
    }
    else if (operator == '/'){
        num2 = number;
        operator1 = operator;
        sum = parseInt(num1) / parseInt(num2);
        num1 = new String(sum);
        document.getElementById('textfield').value = num1;
        number=num1;
        operator='';
    }
    else{
            if (operator1 == '+'){
                sum = parseInt(num1) + parseInt(num2);
                num1 = new String(sum);
                document.getElementById('textfield').value = num1;
                number=num1;
                
            }
            if (operator1 == '-'){
                sum = parseInt(num1) - parseInt(num2);
                num1 = new String(sum);
                document.getElementById('textfield').value = num1;
                number=num1;
                
            }
            if (operator1 == '*'){
                sum = parseInt(num1) * parseInt(num2);
                num1 = new String(sum);
                document.getElementById('textfield').value = num1;
                number=num1;
                
            }
            if (operator1 == '/'){
                sum = parseInt(num1) / parseInt(num2);
                num1 = new String(sum);
                document.getElementById('textfield').value = num1;
                number=num1;
            }

}
}



    