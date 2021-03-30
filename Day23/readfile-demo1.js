var fs = require('fs');
console.log("Module imported successfully!!!!");

function handleData(err,data){
	console.log("File reading completed!!");
	if(!err)
		console.log(data.toString());
	else
		console.log(err.message);
		
}

fs.readFile('C:/files/cricket.txt',handleData);

//100 loc

console.log("Finish Line!!");

