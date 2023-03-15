var http = require('http');

console.log("before")//1

let num = 0;
let app = http.createServer(function (req, res) {
  num = num +1;
  console.log("Server Running:" + num);
  res.end("63106033Paween" + num); //to send data packet to Chrome
});
app.listen(5000);//define a port number for this Server

console.log("After")//3

  //res.writeHead(279, {'Content-Type': 'text/html'});
  //console.log("middle")//2
  //res.end("<h1>Atinat</h1>");