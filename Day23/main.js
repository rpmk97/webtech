var ref = require('./greet.js');
var cal = require('./cal');
const automobile = require('./Automobile');

console.log(ref.title);

ref.hello('Jaggu');

ref.hi('Jaggu');

ref.bye('Jaggu');

console.log(cal.title);
cal.sum(2,2);
cal.diff(20,2);

var car = new automobile.Car(); 
car.speedUp(2);
car.speedUp(4);
car.speedUp(6);
console.log(car.speed);


