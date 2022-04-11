const express = require('express');//express 패키지 import

const app = express();

// localhost:3000/ -> 요청을 받으면 해당 함수 호출
app.get('/', (request, response) => {
    response.send('');
});

app.listen(3000,()=>{
    console.log('http://127.0.0.1:3000/ app listening on port 3000!');
});
