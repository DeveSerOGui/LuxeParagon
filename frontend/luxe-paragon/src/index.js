var express = require('express');
var server = express();

var moongose = require('mongoose');

moongose.connect ("mongodb+srv://OutroGui:vSQG1xJAKSZLOi3C@clusterluxeparagon.31izyz9.mongodb.net/?retryWrites=true&w=majority&appName=ClusterLuxeParagon",{useNewUrlParser: true, useUnifiedTopology: true}, function checkDB(){
    if(error){
      console.log("error")
    } else{
      console.log("sucesso")
    }
})

server.use(express.json());
