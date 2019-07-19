function ClickMe(){
    let math = document.getElementById('math');
    let eng = document.getElementById('eng');
    let cs = document.getElementById('cs');

    let _table=`<br><table border='collaspe'>
    <tr>
        <th>Subjects</th>
        <th>Min marks</th>
        <th>Max marks</th>
        <th>Marks obtained</th>
    </tr>
    <tr>
        <td>Maths</td>
        <td>60</td>
        <td>100</td>
        <td>${math.value}</td>
    </tr>
    <tr>
            <td>english</td>
            <td>60</td>
            <td>100</td>
            <td>${eng.value}</td>
        </tr>
        <tr>
                <td>CS</td>
                <td>60</td>
                <td>100</td>
                <td>${cs.value}</td>
            </tr>
    </table>`;

    document.getElementById('table_').innerHTML= _table;

    let sum= parseInt(math.value) + parseInt(eng.value) + parseInt(cs.value);
    avg= sum/3;

    if(math.value<60 || eng.value<60 || cs.value< 60){
        document.getElementById('result').innerHTML= `Total marks obtained= ${sum}<br/>
        result= <span style="color:red">Failed</span>`;
    }
    else if(avg<60){
        document.getElementById('result').innerHTML= `Total marks obtained= ${sum}<br/>
        result= <span style="color:orange">second devision</span>`;
    }
    else if(avg>=60 && avg<80){
        document.getElementById('result').innerHTML= `Total marks obtained= ${sum}<br/>
        result= <span style="color:green">first devision</span>`;
    }
    else{
        document.getElementById('result').innerHTML= `Total marks obtained= ${sum}<br/>
        result=<span style="color:green">passed with distinction</span>`;
    }


}
