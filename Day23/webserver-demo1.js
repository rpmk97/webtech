var http = require('http');

var server = http.createServer();

server.on('request',(req,res) => {
	console.log("Server received a request!");
	res.write('<h1>Hello from fastest server in the world</h1>');
	res.write('<h1>Hello from fastest server in the world</h1>');
	res.write('<h1>Hello from fastest server in the world</h1>');
	res.write('<h1>Hello from fastest server in the world</h1>');
	res.write('<h1>Hello from fastest server in the world</h1>');
	res.end();
});

server.listen(4000,() => {
	console.log("Server is ready and listening on port 4000!!");
});


