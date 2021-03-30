var http = require('http');

var server = http.createServer();

server.on('request',(req,res) => {
	console.log("Server received a request!");
	if(req.url.endsWith('weather')) {
		res.write('<h1>Weather is cool</h1>');
	}else if(req.url.endsWith('news')) {
		res.write('<h1>Flood in Delhi roads</h1>');
	}
	res.end();
});

server.listen(4000,() => {
	console.log("Server is ready and listening on port 4000!!");
});


