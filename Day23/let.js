var i = 10;
let j = 10;
const k = 10;

//k = 20;  //will not work


var rs = i + j + k;

console.log(rs);

if(true) {
	var a = 100; //no-block scope
	console.log(a);
	let b = 200; //block level scope
	console.log(b);
}

console.log(a);
//console.log(b); //will not work



for(let counter = 1; counter <= 20;counter++){
	console.log(counter);
}

//console.log(counter); //will not work



console.log("====================");

function doWork() {
	var age = 45;
	age = 35;
	console.log(age);
}

doWork();

//console.log(age); //will not work

doWork.author = "Ritesh Tyagi";

console.log(doWork.author);
