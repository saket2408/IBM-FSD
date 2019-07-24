const items = require('../dbs/items').items;
const cart = require('../dbs/items').cart;
const Email = require('./email.service').Email;
const emailService = new Email();
class itemService{
    items = [];
    cart = [];
    searchitems=[];
    constructor(){
        this.items = items;
        this.cart = cart;
    }
    _all(){
        return this.items;
    }
    _add(item){
        this.items.push(item);
        return this.items;
    }
    _addtoCart(item){
        this.cart.push(item);
        return this.cart;
    }
    _showCart(){
        return this.cart;
    }
    _totalcart(){
        return this.cart.length;
    }

    _filter(item){
       this.searchitems =  this.items.filter(e=>{
            return e.category == item.category;
        })
        return this.searchitems;
    }

    _find(item){
        this.searchitems =  this.items.find(e=>{
            return e.id == item.id;
        })
        return this.searchitems;
    }
    _edit(item){
        let index;
         this.items.find((e,i)=>{
             index=i
            return item.id == e.id
        })
        this.items[index] = item;
        return this.items;
    }
    _findCart(item){
        this.searchitems =  this.cart.find(e=>{
            return e.id == item.id;
        });
        let index;
         this.cart.find((e,i)=>{
             index=i
            return this.searchitems.id == e.id
        })
        this.cart.splice(index,1);
        return this.cart;
    }

    _findCartquantity(item){
        let index;
        this.searchitems =  this.cart.find((e,i)=>{
            index = i
            return e.id == item.id;
        });
        this.cart[index].quantity = item.quantity;
        return this.cart;

    }

    email(item){
        let userObj ={
            subject : "invoice",
            body : item.data,
            from : null,
            to : item.email
        }
        let status = emailService.emailWithAttachment(userObj);
        return status;
    }
    
    delete(){
        this.cart = [];
        return this.cart;
    }

}

module.exports.itemservice = itemService;