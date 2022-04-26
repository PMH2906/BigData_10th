const express = require('express');
const router = express.Router();

// router.get('/',function(req,res){
//     // res.sendFile(__dirname+'/index.html');
//     // res.send({greeting:'Hellow React x Node.js'});
//     // res.json([
//     //     {id: 1,
//     //      username: "VictorOladipo"}, 
//     //     {id: 2,
//     //      username: "RussellWestbrook"}
//     // ]);

//     res.json()

// });
// const dotenv = require('dotenv');
// dotenv.config();

// const clientId = process.env.CLIENT_ID;
// const clientSecret = process.env.CLIENT_SECRET;

client_id = '5pJTLeBERA6DFr9RJ25R';
client_secret = 'MwMB9yxCde';

router.get('/', function (req, res) {
    var api_url = 'https://openapi.naver.com/v1/search/news?query=' + encodeURI('it'); // json 결과
 //   var api_url = 'https://openapi.naver.com/v1/search/blog.xml?query=' + encodeURI(req.query.query); // xml 결과
    var request = require('request');
    var options = {
        url: api_url,
        headers: {'X-Naver-Client-Id':client_id, 'X-Naver-Client-Secret': client_secret}
     };
    request.get(options, function (error, response, body) {
      if (!error && response.statusCode == 200) {
        res.writeHead(200, {'Content-Type': 'text/json;charset=utf-8'});
        res.end(body);
      } else {
        res.status(response.statusCode).end();
        console.log('error = ' + response.statusCode);
      } 
    });
  });

module.exports = router;
