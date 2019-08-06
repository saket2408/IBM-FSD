interface automobile{
    id: number
    price: number
}

interface sportsCar extends automobile{
    engine : string
    topSpeed : string
    fueltype : string
}

interface bike extends automobile{
    engine : string
    milage : string
    ignitionType : string
}

interface car extends automobile{
    fueltype : string
    milage : string
}

const ferrari:sportsCar = {
    id : 1,
    price : 2000000,
    engine : "5000cc",
    topSpeed : "350 kmph",
    fueltype : "jetfuel"
}

const hayabusa:bike = {
    id : 2,
    price : 2500000,
    engine : "5000cc",
    milage : "12",
    ignitionType : "spark"
}

const swift:car = {
    id : 3,
    price : 800000,
    fueltype : "diesel and petrol",
    milage : "24"
}


class A<T extends automobile>{
    
    _automobile : T
    constructor( _automobile: T){
        this._automobile = _automobile
    }

    getAutomobile():T{
        return this._automobile;
    }
}

const obj1 = new A<car>(swift);
const obj2 = new A<sportsCar>(ferrari);
const obj3 = new A<bike>(hayabusa);

console.log(obj1.getAutomobile())
console.log(obj2.getAutomobile())
console.log(obj3.getAutomobile())