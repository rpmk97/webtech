let title = 'Simple Math Calculator';

exports.title = title;

exports.sum = function (arg1,arg2) {
	console.log("SUM : "+(arg1+arg2));
	console.log("SUM : ${arg1+arg2}");
	console.log('SUM : ${arg1+arg2}');
	console.log(`SUM : ${arg1+arg2}`);
};

exports.diff = function (arg1,arg2) {
	console.log(`DIFF : ${arg1-arg2}`);
};

