let count = 0 ;
    let result = [0,0,0,0,0,0,0,0,0]
    function solve(int){
        if(count%2 == 0){
            document.getElementById(int).value = "X";
            document.getElementById(int).style.color = "red";
            document.getElementById(int).disabled = true;
            count = count + 1;
            result[int] = 1;
            document.getElementById('move').innerHTML = "<h3>Player 2 move</h3>";  
        }
        else if(count%2 != 0){
            document.getElementById(int).value = "o";
            document.getElementById(int).style.color = "green";
            document.getElementById(int).disabled = true;
            count = count + 1;
            result[int] = 2;
            document.getElementById('move').innerHTML = "<h3>Player 1 move</h3>";  
        }
        //main logic
        if((result[0]!= 0) && (result[1]==result[2]) && (result[0]==result[1])){
            let val = document.getElementById(int).value;
            console.log(val)
            if(val == 'X'){
                document.getElementById('result').innerHTML = "<h3>player 1 wins</h3>";
                disable();
                result=[0,0,0,0,0,0,0,0,0];
            }else{
                document.getElementById('result').innerHTML = "<h3>player 2 wins</h3>";
               disable();
               result=[0,0,0,0,0,0,0,0,0];
            }
        }
        else if((result[3]!= 0) && (result[3]==result[4]) && (result[4]==result[5])){
            let val = document.getElementById(int).value;
            console.log(val)
            if(val == 'X'){
                document.getElementById('result').innerHTML = "<h3>player 1 wins</h3>";
                disable();
                result=[0,0,0,0,0,0,0,0,0];
            }else{
                document.getElementById('result').innerHTML = "<h3>player 2 wins</h3>";
               disable();
               result=[0,0,0,0,0,0,0,0,0];
            }
        }
        else if((result[6]!= 0) && (result[6]==result[7]) && (result[7]==result[8])){
            let val = document.getElementById(int).value;
            console.log(val)
            if(val == 'X'){
                document.getElementById('result').innerHTML = "<h3>player 1 wins</h3>";
                disable();
                result=[0,0,0,0,0,0,0,0,0];
            }else{
                document.getElementById('result').innerHTML = "<h3>player 2 wins</h3>";
               disable();
               result=[0,0,0,0,0,0,0,0,0];
            }
        }
        else if((result[0]!= 0) && (result[0]==result[3]) && (result[3]==result[6])){
            let val = document.getElementById(int).value;
            console.log(val)
            if(val == 'X'){
                document.getElementById('result').innerHTML = "<h3>player 1 wins</h3>";
                disable();
                result=[0,0,0,0,0,0,0,0,0];
            }else{
                document.getElementById('result').innerHTML = "<h3>player 2 wins</h3>";
               disable();
               result=[0,0,0,0,0,0,0,0,0];
            }
        }
        else if((result[1]!= 0) && (result[1]==result[4]) && (result[4]==result[7])){
            let val = document.getElementById(int).value;
            console.log(val)
            if(val == 'X'){
                document.getElementById('result').innerHTML = "<h3>player 1 wins</h3>";
                disable();
                result=[0,0,0,0,0,0,0,0,0];
            }else{
                document.getElementById('result').innerHTML = "<h3>player 2 wins</h3>";
               disable();
               result=[0,0,0,0,0,0,0,0,0];
            }
        }
        else if((result[2]!= 0) && (result[2]==result[5]) && (result[5]==result[8])){
            let val = document.getElementById(int).value;
            console.log(val)
            if(val == 'X'){
                document.getElementById('result').innerHTML = "<h3>player 1 wins</h3>";
                disable();
                result=[0,0,0,0,0,0,0,0,0];
            }else{
                document.getElementById('result').innerHTML = "<h3>player 2 wins</h3>";
               disable();
               result=[0,0,0,0,0,0,0,0,0];
            }
        }
        else if((result[0]!= 0) && (result[0]==result[4]) && (result[4]==result[8])){
            let val = document.getElementById(int).value;
            console.log(val)
            if(val == 'X'){
                document.getElementById('result').innerHTML = "<h3>player 1 wins</h3>";
                disable();
                result=[0,0,0,0,0,0,0,0,0];
            }else{
                document.getElementById('result').innerHTML = "<h3>player 2 wins</h3>";
               disable();
               result=[0,0,0,0,0,0,0,0,0];
            }
        }
        else if((result[2]!= 0) && (result[2]==result[4]) && (result[4]==result[6])){
            let val = document.getElementById(int).value;
            console.log(val)
            if(val == 'X'){
                document.getElementById('result').innerHTML = "<h3>player 1 wins</h3>";
                disable();
                result=[0,0,0,0,0,0,0,0,0];
            }else{
                document.getElementById('result').innerHTML = "<h3>player 2 wins</h3>";
               disable();
               result=[0,0,0,0,0,0,0,0,0];
            }
        }else if(count == 9){
            document.getElementById('result').innerHTML = "<h3>game draw</h3>";
            result=[0,0,0,0,0,0,0,0,0];
        }
    }

    function start(){
        count = 0;
        result=[0,0,0,0,0,0,0,0,0];
        document.getElementById('result').innerHTML = "";
        document.getElementById('0').value = "";
        document.getElementById('1').value = "";
        document.getElementById('2').value = "";
        document.getElementById('3').value = "";
        document.getElementById('4').value = "";
        document.getElementById('5').value = "";
        document.getElementById('6').value = "";
        document.getElementById('7').value = "";
        document.getElementById('8').value = "";
        document.getElementById('0').disabled = false;
        document.getElementById('1').disabled = false;
        document.getElementById('2').disabled = false;
        document.getElementById('3').disabled = false;
        document.getElementById('4').disabled = false;
        document.getElementById('5').disabled = false;
        document.getElementById('6').disabled = false;
        document.getElementById('7').disabled = false;
        document.getElementById('8').disabled = false;
        document.getElementById('move').innerHTML = "<h3>Player 1 move</h3>";      
    }
    function disable(){
        document.getElementById('0').disabled = true;
        document.getElementById('1').disabled = true;
        document.getElementById('2').disabled = true;
        document.getElementById('3').disabled = true;
        document.getElementById('4').disabled = true;
        document.getElementById('5').disabled = true;
        document.getElementById('6').disabled = true;
        document.getElementById('7').disabled = true;
        document.getElementById('8').disabled = true;
    }

    function save(){
        if(count%2 == 0){
        _url = `http://localhost:6789/save/update`;
        fetch(_url,{
            method : 'POST',
            headers: {
                'content-type': 'application/json'
               },
            body : JSON.stringify({
                _id : 1,
                result : result,
                move : 1
            })
        })
        .then(res=>res.json())
    }
    else{
        _url = `http://localhost:6789/save/update`;
        fetch(_url,{
            method : 'POST',
            headers: {
                'content-type': 'application/json'
               },
            body : JSON.stringify({
                _id : 1,
                result : result,
                move : 2,
                count : count
            })
        })
        .then(res=>res.json())
    }

    }

    function resume(){
        _url = `http://localhost:6789/save`;
        fetch(_url)
        .then(res=>res.json())
        .then((res)=>{
            result = res.data[0].result;
            count = res.data[0].count;
            document.getElementById('0').disabled = false;
            document.getElementById('1').disabled = false;
            document.getElementById('2').disabled = false;
            document.getElementById('3').disabled = false;
            document.getElementById('4').disabled = false;
            document.getElementById('5').disabled = false;
            document.getElementById('6').disabled = false;
            document.getElementById('7').disabled = false;
            document.getElementById('8').disabled = false;
            for(i=0;i<9;i++){

                if(res.data[0].result[i] == 0){
                    document.getElementById(i).value = "";
                }
                else if(res.data[0].result[i] == 1){
                    document.getElementById(i).value = "X";
                    document.getElementById(i).style.color = "red";
                    document.getElementById(i).disabled = true;
                }
                else{
                    document.getElementById(i).value = "o";
                    document.getElementById(i).style.color = "green";
                    document.getElementById(i).disabled = true;
                }
            }
            if(res.data[0].move == 1){
                document.getElementById('move').innerHTML = "<h3>Player 1 move</h3>";  
            }
            else{
                document.getElementById('move').innerHTML = "<h3>Player 2 move</h3>"; 
            }
        })
    }
    