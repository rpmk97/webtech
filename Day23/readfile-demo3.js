var fs = require('fs');
console.log("Module imported successfully!!!!");

fs.readFile('C:/files/cricket.txt',(err,data) => {
	console.log("File reading completed!!");
	if(!err)
		console.log(data.toString());
	else
		console.log(err.message);
		
});

console.log("Finish Line!!");

