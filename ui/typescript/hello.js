var a = "hello";
var b = '10';
console.log(a);
function message() {
    return "hello";
}
var sum = function (num1, num2) {
    return num1 + num2;
};
console.log(message());
console.log(sum(12, 7));
var users = Array(2);
users[0] = "saket";
users[1] = "saxena";
users[2] = " hello";
console.log('string[]');
users.forEach(function (u) {
    console.log(u);
});
var employee = {
    id: 1,
    name: "saket",
    address: {
        street: "globus township"
    }
};
console.log(employee);
