/**
 * JS는 비동기 처리를 위한 하나의 패턴으로 콜백함수를 사용
 * 이러한 콜백함수 패턴은 콜백 헬이라고 하는 가독성이 떨어지는 코드를 만들기 쉬움
 */

// 전통적인 콜백 패턴

// // 1. XMLHttpRequst 객체 불러오기
// const xhr = new XMLHttpRequest();

// // 2. Http 요청 준비
// xhr.open('GET','https://jsonplaceholder.typicode.com/todos/1');

// // 3. onload 이벤트 활용 데이터 GET
// // 데이터가 응답 완료 되었을 때만 사용
// xhr.onload = () =>{
//     // if(xhr.status===200){
//     //     const responseData = JSON.stringify(xhr.responseText);
//     // }
//     xhr.status === 200 ? console.log(xhr.response):console.log(`${xhr.status} ${xhr.statusText}`);;
// };
// // 4. 요청 전송
// xhr.send()

// callback hell
// 비동기 처리(HTTP 요청)의 결과로 얻은 값(post/1)으로 다시 비동기 요청을 하고자 할 때
// 발생되는 가독성 저하 케이스
const url = 'https://jsonplaceholder.typicode.com'

const get = (url, callback) =>{
    const xhr = new XMLHttpRequest();

    xhr.open('GET',url)

    xhr.onload = () =>{
        // if(xhr.status===200){
        //     const responseData = JSON.stringify(xhr.responseText);
        // }
        xhr.status === 200 ? callback(JSON.parse(xhr.response)):console.log(`${xhr.status} ${xhr.statusText}`);;
    };
    xhr.send()
};

// 함수 호출
// id가 1 인 post의 userId를 취득
get(`${url}/posts/1`,(user)=>{
    console.log(user);
    console.log(user.id);

    // post의 id를 이용해서 user의 정보를 획득
    // https://jsonplaceholder.typicode.com/users
    get(`${url}/users/${user.id}`,userInfo=>console.log(userInfo));
});