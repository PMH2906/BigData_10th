/**
 * XMLHttpRequest처럼 HTTP 요청 전송 기능을 지원하는 Web API
 * 사용법이 간편, promise를 지원
 */

// 기본 프로토타입
// const fetchResponsePromise = fetch(resource [, init])
// https://developer.mozilla.org/en-US/docs/Web/API/fetch

// fetch()는 HTTP응답(Response)을 나타내는 response객체를 감싼 promise 객체를 반환
// fetch()의 첫번째 인수로 HTTP요청을 전송할 URL을 작성하면 기본적으로 GET요청을 수행
// default값이 GET이라는 의미

const url = 'https://jsonplaceholder.typicode.com/todos';
// const promise = fetch(url)
// .then(response=>console.log(response));
// console.log(promise); // Promise 객체


fetch(url)
.then(response=>console.log(response.json())) // .json() : Response 객체에서 HTTP body(몸체)를 취득 후, Json데이터를 Object로 변환(객체화, 역직렬화)
.then(json=>console.log(json)) // 이 메서드에서는 json형의 데이터 출력




fetch('https://jsonplaceholder.typicode.com/todos')
.then(response=>console.log(response.json())) // .json() : Response 객체에서 HTTP body(몸체)를 취득 후, Json데이터를 Object로 변환(객체화, 역직렬화)
.then(json=>console.log(json)) // 이 메서드에서는 json형의 데이터 출력
.then(responseData=>{
    console.log(responseData);
    // const newsData=[];
    // for (const )
    
})

// fetch('https://book-order-3627f-default-rtdb.firebaseio.com/books.json')
// .then(response=>response.json())
// .then(responseData=>{
//   const booksData = [];
//   for(const key in responseData){
//     // console.log(key); // book1
//     const book = {
//       id:key,
//       name:responseData[key].name,
//       description:responseData[key].description,
//       author:responseData[key].author,
//       price:responseData[key].price
//     };
//     booksData.push(book);
//     console.log(booksData);
//   }
//   setBooks(booksData);