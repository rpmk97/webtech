class Car {
	
	constructor() {
		console.log("Inside Car constructor!!!!");	
		this.vin = 100;
	}
}

var car = new Car();
var car1 = new Car();

console.log(car.vin);
console.log(car1.vin);

console.log(car);
console.log(car.constructor);

console.log(typeof car);
console.log(car instanceof Car);
