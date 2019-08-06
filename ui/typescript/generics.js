var ferrari = {
    id: 1,
    price: 2000000,
    engine: "5000cc",
    topSpeed: "350 kmph",
    fueltype: "jetfuel"
};
var hayabusa = {
    id: 2,
    price: 2500000,
    engine: "5000cc",
    milage: "12",
    ignitionType: "spark"
};
var swift = {
    id: 3,
    price: 800000,
    fueltype: "diesel and petrol",
    milage: "24"
};
var A = (function () {
    function A(_automobile) {
        this._automobile = _automobile;
    }
    A.prototype.getAutomobile = function () {
        return this._automobile;
    };
    return A;
})();
var obj1 = new A(swift);
var obj2 = new A(ferrari);
var obj3 = new A(hayabusa);
console.log(obj1.getAutomobile());
console.log(obj2.getAutomobile());
console.log(obj3.getAutomobile());
