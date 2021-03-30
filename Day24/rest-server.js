var express = require('express');
var bodyParser = require('body-parser');

var app = express();

app.use(bodyParser.json());
app.use(function(req, res, next) {
  res.header("Access-Control-Allow-Origin", "http://localhost:4200"); // update to match the domain you will make the request from
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

//DB Storage
let cars = [
	{"vin":100,"model":"Audi Q5","price":3400000},
	{"vin":101,"model":"Audi Q7","price":9000000},
	{"vin":102,"model":"Audi A2","price":4500000}
];

//API returing all cars
app.get('/api/cars',(req,res) => {
	console.log("===== About to return all cars =====");
	//Make DB call to load all cars in JSON form
	//Send JSON data to client
	res.status(200).send(cars);
 });

//API returing single car
app.get('/api/car/:vin',(req,res) => {
	console.log("===== About to return single car =====");
	let vin = parseInt(req.params.vin);	
	let found = false;
	for(let idx=0;idx<cars.length;idx++) {
		var car = cars[idx];
		if(car.vin === vin) {
			console.log("===== Inside condition =====");
			found = true;
			break;		
		}
	}
	if(found) {
		res.status(200).send(car)
	} else {
		 res.status(404).send({
			"success":false,
			"message":"Car not Found with vin "+vin
		});
	}
});

//API adding new car
app.post('/api/car',(req,res) => {
	console.log("===== About to add a new car =====");
	
	var vin = cars.length+100;
	let car = {
		"vin":vin,
		"model":req.body.model,
		"price":req.body.price
	};

	cars.push(car); 

 	res.status(200).send({
		"success":true,
		"message":"Car added to DB with vin "+vin
	});
});

//API updating an existing car
app.put('/api/car/:vin',(req,res) => {
	console.log("===== About to update an existing car =====");
	
	let vin = parseInt(req.params.vin);	
	let found = false;
	for(var idx=0;idx<cars.length;idx++) {
		var car = cars[idx];
		if(car.vin === vin) {
			console.log("===== Inside condition =====");
			found = true;
			break;		
		}
	}
	if(found) {
		let updatedCar = {
			"vin":vin,
			"model":req.body.model,
			"price":req.body.price
		};	
		cars.splice(idx,1,updatedCar);
	} else {
		 res.status(404).send({
			"success":false,
			"message":"Car can not be updated coz not Found with vin "+vin
		});
	}
});

//API deleting a car
app.delete('/api/car/:vin',(req,res) => {
	console.log("===== About to delete an existing car =====");
});

const PORT = 5000;

app.listen(PORT,() => {
	console.log(`REST API is ready on port ${PORT}!!`);
});


