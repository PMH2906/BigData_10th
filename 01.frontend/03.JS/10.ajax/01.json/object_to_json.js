/**
 * Json : 클라이언트와 서버 간 HTTP 통신을 위한 텍스트 데이터 포맷 방식
 * JavaScript에 종속되지 않은 독립적인 데이터 포맷
 * 대부분의 프로그래밍 언어에서 사용 가능 
*/

// JSON 작성 방식 : JavaScript의 객체 작성 방식과 유사

// JavaSrcipt Object
const book = {
    title : "노인과 바다",
    author : "해밍웨이",
    isSold : false,
    genre : ["소설","비극"],
};

// Json, Key(property)로 ""(double quote)로 작성('(single quote) 는 사용 불가)
// {
//     "title" : "노인과 바다",
//     "author" : "해밍웨이",
//     "isSold" : false,
//     "genre" : ["소설","비극"],
// }


// JS Object → Json 변환 과정 : 직렬화(문자열화) 과정이라고 함.
// Json : JS Object을 직렬화해서 문자로 만든 것.
/**
 * Json.stringify()는 client 측에서 서버로 데이터(일반적으로 객체)를 전송하기 위해 문자열화 해야함.
 * 문자열화를 직렬화(Serialization)라고 함
 */
const jsonData = JSON.stringify(book);
console.log(typeof jsonData); // String타입
console.log(jsonData);

const bookparsedDatas = [
    {
        id: 1,
        title : '하농',
        author : '하농',
        isSold : false,
    },
    {
        id: 1,
        title : '체르니',
        author : '체르니',
        isSold : true,
    },
    {
        id: 1,
        title : '부르크뮐러',
        author : '부르크뮐러',
        isSold : true,
    },
];

// 배열 JSON 포맷의 문자열로 변환
const jsonDatas = JSON.stringify(books);
console.log(typeof jsonDatas);
console.log(jsonDatas);