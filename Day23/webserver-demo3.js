var http = require('http');
var fs = require('fs');

var server = http.createServer();

console.log(__dirname);
console.log(__filename);


server.on('request',(req,res) => {
	console.log("Server received a request!");
	if(req.url.endsWith('weather')) {
		let content = fs.readFileSync('./pages/weather.html');		
		res.write(content);
	}else if(req.url.endsWith('news')) {
		let content = fs.readFileSync('./pages/news.html');		
		res.write(content);
	}
	res.end();
});

server.listen(4000,() => {
	console.log("Server is ready and listening on port 4000!!");
});


