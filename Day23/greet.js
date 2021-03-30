let title = 'Simple Module Example';

function greet(name) {
	console.log("Hello "+name);
}

function hi(name) {
	console.log("Hi "+name);
}

exports.title = title;
exports.hello = greet;
exports.hi = hi;
exports.bye = function (name) {
	console.log("Bye "+name);
};


