class Car {
	
	constructor(vin,model,make='Audi',speed=350) {
		console.log("Inside Car constructor!!!!");	
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.speed = speed;
	}

	speedUp(newSpeed) {
		this.speed = this.speed + newSpeed;
	}

	speedDown() {
		this.speed = this.speed - 50;
	}
}

var car1 = new Car(100,'Q7','Audi');
//var car2 = new Car(101,'Q5','Audi');
var car2 = new Car(101,'Q5');


console.log(car1.vin);
console.log(car2.vin);

console.log(car1.model);
console.log(car2.model);

console.log(car1.make);
console.log(car2.make);

car1.speedUp(2);
car1.speedUp(4);
car1.speedUp(5);
car1.speedUp(10);
car1.speedUp(50);


console.log(car1.speed);
console.log(car2.speed);
