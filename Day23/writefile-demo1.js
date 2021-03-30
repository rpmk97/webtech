var fs = require('fs');
console.log("Module imported successfully!!!!");

function handleData(err){
	console.log("File writing completed!!");
	//20 loc
}

fs.writeFile('C:/files/cars.txt',"It is all about luxury cars.",handleData);
console.log("Finish Line!!");

