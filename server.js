var express = require("express");
var app = express();
app.use(express.static(__dirname + '/dist/'));
app.get('/', function (req, res) {
  res.status(200).send('ok')
});
app.listen(process.env.PORT || 8080);