const express = require('express');//express 패키지 import

const app = express();

// express의 static 미들웨어 활용.
app.use(express.static('public'));

app.use(express.json());

// localhost:3000/ -> 요청을 받으면 해당 함수 호출
app.get('/', (request, response) => {
    response.sendFile(__dirname,'index.html');
});

// 브라우저로부터 감지할 언어의 텍스트를 받아서, Naver 서버로 전송(요청) 및 결과 응답 
app.post('/detectLangs',(req, res)=>{
    // 127.0.0.1:3000/detectLangs로 요청했을 때
    console.log(req.body);
});

app.listen(3000,()=>{
    console.log('http://127.0.0.1:3000/ app listening on port 3000!');
});
