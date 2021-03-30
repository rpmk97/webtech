var fs = require('fs');

console.log("Start Line!!");

fs.readFile('C:/files/cricket.txt',(err,data) => {
	console.log("File 1 reading completed!!");
	console.log(data.toString());
});

console.log("Middle Line!!");

fs.readFile('C:/files/holidays.txt',(err,data) => {
	console.log("File 2 reading completed!!");
	console.log(data.toString());
});

console.log("Finish Line!!");

