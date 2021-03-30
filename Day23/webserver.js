var express = require('express');

var server = express();

server.get('/weather',(req,res) => {
	console.log("Server received a request!");
	res.write('<h1>Weather is cool</h1>');
	res.end();
});

server.get('/news',(req,res) => {
	console.log("Server received a request!");
	res.write('<h1>Tomorrow is cricket match</h1>');
	res.end();
});

server.listen(5000,() => {
	console.log("Express Server is ready and listening on port 5000!!");
});


