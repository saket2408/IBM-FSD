class Parent{
    message(){
        console.log("parent message");
    }
    static getMessage(){
        console.log("static get message");
    }

}

class child extends Parent{
    message(){
        console.log('child message');
        //make call to parent message
        super.message();
    }
    newmessage(){
        this.message();
        super.message();
    }
}



const obj = new child();
obj.message();
child.getMessage();
obj.newmessage();