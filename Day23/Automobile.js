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

exports.Car = Car;
