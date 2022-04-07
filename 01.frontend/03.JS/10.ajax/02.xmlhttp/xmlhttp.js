// *참고
// const book = {
//     id : 1,
//     name : '노인과 바다',
//     // 함수 쓰기 가능. 함수는 변수에 할당가능하므로 같은 개념으로 할당 가능.
//     // checkStock 프로퍼티 메서드
//     checkStock : function(){
//         console.log('재고 없음');
//     } 
// }
// console.log(book.checkStock());

// // checkBookStock() 함수
// const checkBookStock = () => console.log('재고 없음');
// console.log(checkBookStock());


/**
 * XMLHttpRequest:
 * 객체는 서버와 상호작용하기 위하여 사용됨. 
 * 전체 페이지의 새로고침없이도 URL 로부터 데이터를 받아올 수 있음. 
 * 웹 페이지가 사용자가 하고 있는 것을 방해하지 않으면서 페이지의 일부를 업데이트할 수 있도록 해줌.
 */

// XMLHttpRequest객체의 프로퍼티와 메세드
//  1. readyState : HTTP 요청의 현재 상태를 가지고 있는 정수값
//     -0(UNSENT) : 초기화 전. open() 호출하기 전.
//     -1(OPEND) : 열림. open()을 호출했고, send()는 호출하지 않은 상태
//     -2(HEADERS_RECEIVED) : 보냄. send()를 호출했지만 서버로부터 응답은 받지 못한 상태
//     -3(LOADING) : 데이터 수신 중. 응답 데이터의 일부를 받고 있는 상태
//     -4(DONE) : 완료. 응답 데이터를 모두 받은 상태

// 2. status : HTTP 요청에 대한 응답의 성공 여부를 나타냄
// ex) 200(응답 성공), 404(요청 실패, 잘못된 경로)

// 3. statusText : HTTP 요청에 대한 응답 메시지를 나타내는 문자열
// ex) status가 200일 경우, 'OK'

// 4. responseType : 응답한 데이터의 타입
// ex) document, json, text, blob

// 5. respose : HTTP 요청에 대한 응답 몸체(body)

// 이벤트 핸들러와 관련된 프로퍼티
// 1. onreadystatechange : readyState 프로퍼티의 값이 변경된 경우 이벤트 발생

// 메서드
// 1.open() : HTTP요청 초기화(준비단계)
// 2.send() : HTTP요청 실제 전송

// console.log(new XMLHttpRequest());
const xhr = new XMLHttpRequest();
// DOM, xxx.getElemenById();

// 요청 보낼 준비
// xhr.open(요청 메서드,요청URL);
xhr.open('GET','https://jsonplaceholder.typicode.com/todos'); // 'GET' : server의 data를 조회하고 싶을 때
// console.log(xhr.readyState); // 1
console.log(`OPENDED, ${xhr.readyState}`); // OPENED, 1

// readeState 프로퍼티 값이 변경될 때마다 arrow함수 호출
xhr.onreadystatechange = () =>{
    if(xhr.readyState==2){ // 데이터가 send()를 호출했지만, server로 응답받지 x 
        console.log(`HEADER_RECEIVED ${xhr.readyState}`);
    }

    //데이터 응답(로딩) 완료와 같음. == onload
    if(xhr.readyState == 4 && xhr.status == 200) {// 응답이 끝났고 && 응답이 성공했을때
        console.log(`DONE, ${xhr.readyState}`); 
        console.log(`response data:${typeof xhr.responseText}`);
        
        // const responseData = xhr.responseText;
        // console.log(responseData.completed);
        // console.log(responseData[7]);

        // const parseData = JSON.parse(responseData);
        // console.log(parseData);
    }
};
// 브라우저가 데이터를 받는 동안 주기적으로 발생
xhr.onprogress = ()=> console.log(`LOADING, ${xhr.readyState}`);

// 데이터 응답(로딩)이 완료된 경우
xhr.onload = () => console.log(`DONE, ${xhr.readyState}`); 

xhr.send();