// const { request } = require('express');
const { query } = require('express');
const express = require('express');//express 패키지 import

const app = express();

const clientId = 'zKfcHiTw4W3XIpc9hcJ7';
const clientSecret = 'u9PlpnIubz';


const request = require('request'); // request 패키지 import


// express의 static 미들웨어 활용.
// express에게 static(정적인 파일) 관련 자원은 public 폴더 내에 있음을 명시.
app.use(express.static('public'));

// express의 json 미들웨어 활용.
// express에게 json 파싱을 위임
app.use(express.json());

// localhost:3000/ -> 요청을 받으면 해당 함수 호출
app.get('/', (request, response) => {
    response.sendFile(__dirname,'index.html');
});

// 브라우저로부터 감지할 언어의 텍스트를 받아서, Naver 서버로 전송(요청) 및 결과 응답 
app.post('/detectLangs',(req, res)=>{
    // 127.0.0.1:3000/detectLangs로 요청했을 때
    console.log(typeof req.body, req.body);

    // query에 우리가 보내려고 하는 데이터
    const {text:query, targetLanguage} = req.body;

    const url = "https://openapi.naver.com/v1/papago/detectLangs"

    const options = {
        url, // 언어감지 네이버 서버의 주소
        form: { query }, // form이라는 property에 우리가 보낼 데이터를 객체의 형태로 전송
        headers: {
            "X-Naver-Client-Id": clientId,
            "X-Naver-Client-Secret": clientSecret,
        },
    };
    // request.post('요청에 필요한 데이터 동봉', '요청에 따른 응답 정보를 확인하는 콜백함수');
    // options에 요청에 필요한 데이터들을 보관
    // () => {}: 요청에 따른 응답 정보 확인
    // 언어감지 요청 부분
    request.post(options, (error, response, body)=>{
        if(!error && response.statusCode === 200){
            const parseBody =JSON.parse(body);
            // parseBody 안에 {langCode : 'en'}

            //papago 번역 url로 재요청(redirect).querystring활용
            //translate를 하나의 url라고 보면 됨
            res.redirect(`translate?lang=${parseBody['langCode']}&targetLanguage=${targetLanguage}&query=${query}`);
            //localhost:3000/translate?lang=en&targetLanguage=ko&query=hi
            //전송하면 이런 url로 전송됨.
        }else {
            console.log(`error=${response.statusCode}`);
        }
    });
});

//papago 번역
app.get('/translate',(req,res)=>{
    // lang = 'en'
    console.log('translate',req.query);

    // 1. papago 번역 url 작성
    const url = "https://openapi.naver.com/v1/papago/n2mt"
    
    // 2. 서버에 보낼 데이터 동봉

    const options = {
        url, // 요청 URL
        form: { // 요청 파라미터
            source:req.query['lang'],
            target:req.query['targetLanguage'],
            text:req.query['query']
        },
        headers: { // Client ID와 Secret 값
            "X-Naver-Client-Id": clientId,
            "X-Naver-Client-Secret": clientSecret,
        },
    };
    
    // 3. 요청 전송 밒 응답 결과 확인
    request.post(options, (error, response, body)=>{
        if(!error && response.statusCode === 200){
            // console.log(body);
            
            // const parseBody =JSON.parse(body);
            // console.log(parseBody);

            // frontend 에 보내는 코드
            // 오류
            // res.json(body); // json데이터 형식으로 변환해서 보냄. stringfy()가 적용된 메서드 

            // frontend 에 보내는 코드
            // json 데이터를 보낸다는 것을 표시
            res.setHeader('Content-Type','application/json');
            res.send(body);
        }else {
            console.log(`error=${response.statusCode}`);
        }
    });
    
});

app.listen(3000,()=>{
    console.log('http://127.0.0.1:3000/ app listening on port 3000!');
});
