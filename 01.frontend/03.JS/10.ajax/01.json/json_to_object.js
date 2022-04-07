// JavaSrcipt Object
const book = {
    title : "노인과 바다",
    author : "해밍웨이",
    isSold : false,
    genre : ["소설","비극"],
};

// 서버에서 응답한 데이터라고 가정
const resposeData = JSON.stringify(book);
console.log(resposeData);

// Json 포맷의 문자열을 객체로 변환 
const ObjData = JSON.parse(resposeData);
console.log(typeof ObjData);
console.log(ObjData.title);
console.log(ObjData.author);
console.log(ObjData.isSold);
console.log(ObjData.genre);

const books = [
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
// 서버에서 응답한 데이터라고 가정
const resposeDatas = JSON.stringify(books);
console.log(resposeDatas);

// Json 포맷의 문자열을 객체로 변환(역직렬화,deserialization)
const parsedData = JSON.parse(resposeDatas);
console.log(typeof parsedData,parsedData);