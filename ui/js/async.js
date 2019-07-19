const getUser =async ()=>{
    const _url ='https://reqres.in/api/users?page=2';
    const res = await fetch(_url);
    const result = await res.json();
    console.log(result.data);
    console.log("hello first");
}

getUser();

const getUsers1 = () =>{
    const _url1 = 'https://reqres.in/api/users?page=1';

    fetch(_url1,{
        method: 'GET'
    })
    .then(res=>res.json())
    .then((result)=>{
        console.log(result.data);
    })
}
getUsers1();