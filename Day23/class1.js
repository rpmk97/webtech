class Car {
	
	constructor() {
		console.log("Inside Car constructor!!!!");	
		this.vin = 100;
		this.model = 'X1';
		this.make = 'BMW';
	}
}

var car1 = new Car();
var car2 = new Car();

console.log(car1.vin);
console.log(car2.vin);

console.log(car1.model);
console.log(car2.model);


