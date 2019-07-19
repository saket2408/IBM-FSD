//map
let uMap = new Map();
uMap.set('one', 'hi');
uMap.set('two','hello');

for(let [key,value] of uMap.entries()){
    console.log(`${key},${value}`)
}
for(let key of uMap.keys()){
    console.log(`${key}`)
}
for(let value of uMap.values()){
    console.log(`${value}`)
}


//set
let uSet = new Set();
uSet.add('hello');
uSet.add('hi');
uSet.add('hola');
 for(let item of uSet){
     console.log(item) ;
}

let i = uSet.has('hi');
console.log(i);

//weakmap
const mWeakMap= new WeakMap();
const obj1 = new String('wone');
const obj2 = new String('wtwo');
const obj3 = new String('wthree');
mWeakMap.set(obj1, 'hi');
mWeakMap.set(obj2, 'hello');
mWeakMap.set(obj3, 'hola');

console.log(mWeakMap.get(obj1));

//weak set
const mWeakSet = new WeakSet();
mWeakSet.add(obj1);
mWeakSet.add(obj2);
mWeakSet.add(obj3);
let j = mWeakSet.has(obj2);
console.log(j);


const _nums = [1,2,3,4,5];
const res = _nums.reduce((p,n)=>{
    return p+n;
})
console.log(res);

const str = ['hi','hello','hola'];
const strs = str.reduce((p1,n1)=>{

    return p1+n1;
})
console.log(strs);

const str1 = ['hi','hello','hola'];
const strs1 = str1.reduceRight((p1,n1)=>{

    return p1+n1;
})
console.log(strs1);


////////////reduce 
const emps=[
    {
        id:1,
        name:'ram',
        email:'saket@gmail',
        organization: 'ibm',
        salary: 12
    },
    {
        id:2,
        name:'ramhda',
        email:'ram@gmail',
        organization: 'ibm',
        salary: 20
    },
    {
        id:3,
        name:'ramsd',
        email:'sndsn@gmail',
        organization: 'cts',
        salary: 50
    }
];

let _sum = emps.reduce((prev,cur)=>{
    prev += cur.salary;
    return prev;
},0);

console.log('total salary is ',_sum);

const _group = emps.reduce((result,grp)=>{
    let key = grp.organization;
    if(!result[key]){
        result[key]=[];
    }
    result[key].push(grp);
    return result;
},{});
console.log(_group);