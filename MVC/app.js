let express = require('express');
// let path = require('path');
// let cookieParser = require('cookie-parser');
let logger = require('morgan');
let bodyParser = require('body-parser');


var app = express();

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
// app.use(cookieParser());
// app.use(express.static(path.join(__dirname, 'public')));

app.use(bodyParser.json());

var Routers = require('./routes/routes');
app.use('/', Routers);

//Banco de dados
var connection = require('./config/database.js')();

//Error Handlers
app.use((req, res, next) => {
    let err = new Error('Not found');
    err.status = 404
    next(err);
})

app.use((err, req, res, next) => {
    res.status(err.status || 500)
    .json({
        msg: err.message,
        err: err
    })
})
module.exports = app;
