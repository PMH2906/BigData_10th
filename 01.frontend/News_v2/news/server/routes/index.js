const express = require('express');
const router = express.Router();

const dotenv = require('dotenv');
dotenv.config();

const client_id = process.env.CLIENT_ID;
const client_secret = process.env.CLIENT_SECRET;


router.get('/', function (req, res) {
    const api_url = 'https://openapi.naver.com/v1/search/news?query=' + encodeURI(req.query.query); // json 결과
    // var api_url = 'https://openapi.naver.com/v1/search/blog.xml?query=' + encodeURI(req.query.query); // xml 결과
    const request = require('request');
    const options = {
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
