function display(){
    let _class = document.getElementById('selectClass').value ;
    if(_class == 'classA'){
        document.getElementById('class1').style.display = 'block';
        document.getElementById('class2').style.display = 'none';
    }
    else if(_class == 'classB'){
        document.getElementById('class1').style.display = 'none';
        document.getElementById('class2').style.display = 'block';
    }
    else{
        document.getElementById('class1').style.display = 'none';
        document.getElementById('class2').style.display = 'none';
    }
}


function saveTrainer(){
    let _name = document.getElementById('name').value;
    let _email = document.getElementById('address').value;
    let _subject = document.getElementsByName('_check');
    let ss =[];
    _subject.forEach(e=>{
        if(e.checked){
            ss.push(e.value);
        }
    })
    let emps = [];
    let trainer =
        {
            name: _name,
            email: _email,
            subjects: ss
        }
    if(localStorage.getItem("emps") !=null){
        emps = JSON.parse(localStorage.getItem("emps"));
        emps.push(trainer)
        }
    else{
        emps.push(trainer)
    }
       
    localStorage.setItem("emps",JSON.stringify(emps));

}

function selecttrainer(_time, _class){
if (_class = 'class1'){

    if(localStorage.getItem('class2') != null){
    let trainer = JSON.parse(localStorage.getItem('class2'));
    let periods = trainer.find((e)=>{
        return e.period == _time;
    });
    if (_time==10){
        
        let sub = document.getElementById('selectSubject1').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        let _trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
    
        let trainFound = _trainFound.filter((e)=>{
            return e.name != periods.name;
        })
    
        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer1').innerHTML = row;
    
    }
    if (_time==11){
        let sub = document.getElementById('selectSubject2').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })
        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer2').innerHTML = row;
    
    }
    if (_time==12){
        let sub = document.getElementById('selectSubject3').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })
        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer3').innerHTML = row;
    
    }
    if (_time==2){
        let sub = document.getElementById('selectSubject4').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })
        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer4').innerHTML = row;
    
    }
    if (_time==3){
        let sub = document.getElementById('selectSubject5').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })
 
        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer5').innerHTML = row;
    
    }
    if (_time==4){
        let sub = document.getElementById('selectSubject6').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })
        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer6').innerHTML = row;
    
    }
    
}
else {
    if (_time==10){
        let sub = document.getElementById('selectSubject1').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer1').innerHTML = row;
    
    }
    if (_time==11){
        let sub = document.getElementById('selectSubject2').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer2').innerHTML = row;
    
    }
    if (_time==12){
        let sub = document.getElementById('selectSubject3').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer3').innerHTML = row;
    
    }
    if (_time==2){
        let sub = document.getElementById('selectSubject4').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer4').innerHTML = row;
    
    }
    if (_time==3){
        let sub = document.getElementById('selectSubject5').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer5').innerHTML = row;
    
    }
    if (_time==4){
        let sub = document.getElementById('selectSubject6').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer6').innerHTML = row;
    
    }
}
}

if (_class = 'class2'){
    if(localStorage.getItem('class1') != null){
        let trainer = JSON.parse(localStorage.getItem('class1'));
        let periods = trainer.find((e)=>{
            return e.period == _time;
        });
    if (_time==10){
        let sub = document.getElementById('selectSubject7').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)   
        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer7').innerHTML = row;
    
    }
    if (_time==11){
        let sub = document.getElementById('selectSubject8').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        
        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer8').innerHTML = row;
    
    }
    if (_time==12){
        let sub = document.getElementById('selectSubject9').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        
        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer9').innerHTML = row;
    
    }
    if (_time==2){
        let sub = document.getElementById('selectSubject10').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        
        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer10').innerHTML = row;
    
    }
    if (_time==3){
        let sub = document.getElementById('selectSubject11').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

       
        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer11').innerHTML = row;
    
    }
    if (_time==4){
        let sub = document.getElementById('selectSubject12').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

       
        let _trainFound = train.filter((e)=>{
            let subFind = e.subjects.find((f)=>{
                return f == sub;
            })
            if (subFind!=undefined){
                return e;
            }
     }) ;
 
     let trainFound = _trainFound.filter((e)=>{
         return e.name != periods.name;
     })

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer12').innerHTML = row;
    
    }
    
}
else{
    if (_time==10){
        let sub = document.getElementById('selectSubject7').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer7').innerHTML = row;
    
    }
    if (_time==11){
        let sub = document.getElementById('selectSubject8').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer8').innerHTML = row;
    
    }
    if (_time==12){
        let sub = document.getElementById('selectSubject9').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer9').innerHTML = row;
    
    }
    if (_time==2){
        let sub = document.getElementById('selectSubject10').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer10').innerHTML = row;
    
    }
    if (_time==3){
        let sub = document.getElementById('selectSubject11').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer11').innerHTML = row;
    
    }
    if (_time==4){
        let sub = document.getElementById('selectSubject12').value;
        let train = JSON.parse(localStorage.getItem("emps"));
        console.log(train)

        let trainFound = train.filter((e)=>{
               let subFind = e.subjects.find((f)=>{
                   return f == sub;
               })
               if (subFind!=undefined){
                   return e;
               }
        }) ;
        console.log(trainFound);

        let row = '';
        trainFound.forEach((e)=>{
            row += `<option value=${e.name}>${e.name}</option>`;
        });
        document.getElementById('selectTrainer12').innerHTML = row;
    
    }
}
}
}


function savedetails(_class){
    if (_class == 'class1'){
        _trainer1 = document.getElementById('selectTrainer1').value;
        _trainer2 = document.getElementById('selectTrainer2').value;
        _trainer3 = document.getElementById('selectTrainer3').value;
        _trainer4 = document.getElementById('selectTrainer4').value;
        _trainer5 = document.getElementById('selectTrainer5').value;
        _trainer6 = document.getElementById('selectTrainer6').value;

        let _trainer=[
            {
                period: 10,
                name: _trainer1
            },
            {
                period: 11,
                name: _trainer2
            },
            {
                period: 12,
                name: _trainer3
            },
            {
                period: 2,
                name: _trainer4
            },
            {
                period: 3,
                name: _trainer5
            },
            {
                period: 4,
                name: _trainer6
            }
        ];
        localStorage.setItem(_class,JSON.stringify(_trainer));
    }
    else if (_class =='class2'){
        _trainer7 = document.getElementById('selectTrainer7').value;
        _trainer8 = document.getElementById('selectTrainer8').value;
        _trainer9 = document.getElementById('selectTrainer9').value;
        _trainer10 = document.getElementById('selectTrainer10').value;
        _trainer11= document.getElementById('selectTrainer11').value;
        _trainer12= document.getElementById('selectTrainer12').value;

        let _trainer=[
            {
                period: 10,
                name: _trainer7
            },
            {
                period: 11,
                name: _trainer8
            },
            {
                period: 12,
                name: _trainer9
            },
            {
                period: 2,
                name: _trainer10
            },
            {
                period: 3,
                name: _trainer11
            },
            {
                period: 4,
                name: _trainer12
            }
        ];
        localStorage.setItem(_class,JSON.stringify(_trainer));
    }
}
