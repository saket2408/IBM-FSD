const emps=[
    {
        id:1,
        name:'ram',
        email:'saket@gmail',
        organization: 'ibm'
    },
    {
        id:2,
        name:'ramhda',
        email:'ram@gmail',
        organization: 'ibm'
    },
    {
        id:3,
        name:'ramsd',
        email:'sndsn@gmail',
        organization: 'cts'
    }
];

const loadEmployees = ()=>{
    let rows='';
    emps.forEach((employee)=>{
        rows += `<tr>
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.email}</td>
                    <td>${employee.organization}</td>
                </tr>`
    });

    let table = `<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>organization</th>
        </tr>
            ${rows}
        </table>`;
    document.getElementById('div-emps').innerHTML = table;

}

const search = ()=>{
    let rows = '';
    let match = document.getElementById('searchbyorg').value;
    emps.filter((m)=>{
        return m.organization  == match;
    }).forEach((e)=>{
        rows+= `<tr>
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.email}</td>
                <td>${e.organization}</td>
            </tr>`
    });

    let table = `<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>organization</th>
        </tr>
            ${rows}
        </table>`;
    document.getElementById('div-emps').innerHTML = table;
}

const searchid = ()=>{
    let match = document.getElementById('searchbyid').value;
    let id = emps.find((e)=>{
        return e.id  == match;
    });
    alert(`[${id.id},${id.name},${id.email},${id.organization}]`);
}

const saveLocalStorage=()=>{
    localStorage.setItem("message", "hello how r u?");
}
saveLocalStorage();