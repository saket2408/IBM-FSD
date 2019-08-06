let a = "hello";
let b: string = '10';
console.log(a)

function message(): string {
    return "hello";
}

const sum = (num1,num2): number => {
    return num1 + num2 ;
}

console.log(message());
console.log(sum(12,7));

let users:string[] = Array(2);
users[0] = "saket";
users[1] = "saxena";
users[2] = " hello";

console.log('string[]');
users.forEach(u=>{
    console.log(u);
})

interface Employee{
    id: number,
    name: number | string,
    address?: any //define optional field
}

let employee:Employee = {
    id : 1,
    name: 'saket',
    address: {
        street: "globus township"
    }
}

console.log(employee);