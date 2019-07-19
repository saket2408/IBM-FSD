// class Sample{
//     constructor(id,name){
//         this.id = id;
//         this.name = name;
//     }
//     sayhello(){
//         console.log('hello sayhello ', this.name);
//     }

//     static hello(){
//         console.log('hello static method');
//     }
// }

// const sampleobj = new Sample(1,'saket');
// sampleobj.sayhello();
// Sample.hello();

// ////////////////////////////////////////////////////////

// const employee = class{
//     constructor(id,name){
//         this.id = id;
//         this.name = name;
//     }
//     sayhello(){
//         console.log('hello sayhello ', this.name);
//     }

//     static hello(){
//         console.log('hello static method' , this.name);
//     }
// }

// const sampleobj1 = new employee(1,'saket');
// sampleobj1.sayhello();
// employee.hello();

class Employee{
    emps = [];
    constructor(name,email,organization){
        this.name = name;
        this.email = email;
        this.organization = organization;
    }

    saveEmployee(){
        let emp = {
            name : this.name,
            email: this.email,
            organization: this.organization
            };
        if(localStorage.getItem("emps") !=null){
           this.emps = JSON.parse(localStorage.getItem("emps"));
        let empfound =  this.emps.find((e)=>{
            return e.email == this.email;
            }); 

            if(empfound != undefined){
                alert('email exists try different');
            }   
            else{
                this.emps.push(emp);
            }
        }
        else{

            this.emps.push(emp);
        }
        
    localStorage.setItem("emps",JSON.stringify(this.emps));
    }

    loadEmployees(){
        let rows='';
        this.emps = JSON.parse(localStorage.getItem("emps"));
        this.emps.forEach((employee)=>{
            rows += `<tr>
                        <td>${employee.name}</td>
                        <td>${employee.email}</td>
                        <td>${employee.organization}</td>
                    </tr>`
        });
    
        let table = `<table>
             <tr>
            <th>name</th>
            <th>email</th>
            <th>organization</th>
            </tr>
                ${rows}
            </table>`;
        document.getElementById('table').innerHTML = table;
    
    }

}

class remove{
    emps =[];
    constructor(email){
        this._email = email;
    }
    
    removeEntry(){
        this.emps = JSON.parse(localStorage.getItem("emps"));
            const eExists = this.emps.find((e)=>{
                return e.email == this._email;
            });
            
            let newEmps = [];

            if(eExists != undefined){
                newEmps = this.emps.filter(e=>{
                    return eExists.email != e.email;
                });
                localStorage.setItem("emps",JSON.stringify(newEmps));
            }
            else{
                localStorage.setItem("emps",JSON.stringify(this.emps));
            }}
    

    loadEmployees(){
        let rows='';
        this.emps = JSON.parse(localStorage.getItem("emps"));
        this.emps.forEach((employee)=>{
            rows += `<tr>
                        <td>${employee.name}</td>
                        <td>${employee.email}</td>
                        <td>${employee.organization}</td>
                    </tr>`
        });
    
        let table = `<table>
                <tr>
            <th>name</th>
            <th>email</th>
            <th>organization</th>
            </tr>
                ${rows}
            </table>`;
        document.getElementById('table').innerHTML = table;
    
    }
}

function saveemp(){
    let name = document.getElementById('name').value;
    let email = document.getElementById('email').value;
    let organization = document.getElementById('organization').value;
    const emp1 = new Employee(name,email,organization);
    emp1.saveEmployee();
    emp1.loadEmployees();
}

function removeItem(){
    let email = document.getElementById('email1').value;
    const emp2 = new remove(email);
    emp2.removeEntry();
    emp2.loadEmployees();
}