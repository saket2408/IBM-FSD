console.log('hello world');
document.write("welcome to Javascript");

var uid = 10;
console.log('uid is ', uid);

uid = 'bob';
console.log(`modified uid ${uid}`);
document.write(`<br/>sum is =${3+4}`);

var vals = [1,'world','hello'];
document.write("<br/>");
document.write(`${vals[2]} ${vals[1]}`);

delete vals[0];
console.log(vals);

let user1={
    id: 1,
    name: 'user one',
    phone: 123
};

let user2 = {
    id: 2,
    name: 'user two',
    phone: 234,
    email: 'saket@SpeechGrammarList.com'
};

let users=[
    user1, user2
];

console.log(users);

if(users[0].email== undefined){
    console.log("email not present");
}

let i=11;
let j= 12;
if(i>j){
    console.log('i is greater');
}
else{
    console.log("j is greater");
}

let math = 80;
let english = 89;
let cs = 85;
let avg= (math + english + cs)/3;

if(math<60 || english<60 || math< 60){
    console.log("failed");
}
else if(avg<60){
    console.log("second division");
}
else if(avg>=60 && avg<80){
    console.log("first devision");
}
else{
    console.log("passed with distinction")
}

var evenNums = [2,4,6,8];
evenNums.push(10);
console.log(evenNums);
evenNums.pop();
console.log(evenNums);

var oddnums= [1,3,5,7];
console.log(oddnums);
oddnums = oddnums.concat(evenNums);
console.log(oddnums);

//for loop
for(i=0;i<5;i++){
    console.log(i);
}

//while loop
i=0;
while(i<5){
    console.log(i);
    i++;
}

//do while loop
i=0;
do{
    console.log(i);
    i++;
}while(i<5)

//fabbonacci series
console.log('fabbonacci series');

let a=0;
let b=1;
console.log(a);
console.log(b);
for(i=0;i<10;i++){
    sum=a+b;
    console.log(sum);
    a=b;
    b=sum;
}

//for in loop
console.log('for in loop');
let messages = ['hello','hi','hola'];
//print the values
for(let m of messages){
    console.log(m);
}
//print the indexes
for(let m in messages){
    console.log(m);
}


vals={
    one: 'one value',
    two: 'two value'
};
console.log(Object.keys(vals));

function ClickMe(){
   let name = document.getElementById('name');
    alert('hello '+ name.value);

}

