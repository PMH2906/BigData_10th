/**
 * 기존의 XMLHttp 요청 방식으로는 콜백 헬 문제가 발생,
 * 대치방안으로 ES6문법의 Promise가 등장
 * 
 * 1. Promise(콜백함수) 생성 방식
 * 2. Promise의 상태 정보(pending(요청준비상태), fulfilled(pending상태에서 요청 성공 후 상태), rejected(요청 실패 상태))
 * 3. reject(), resolve
 * 
 * Promise는 비동기 처리 상태 및 처리 결과를 관리하는 객체
 */

// 1. Promise 객체 생성 방식(인자값으로 콜백 함수를 전달받음)
// new Promise()라는 생성자 '함수'의 인자값으로 콜백함수를 전달해야 함.
// 전달한 콜백함수의 인자값으로 resolve와 reject를 작성
// resolve, reject --> callback함수
const promise = new Promise((resolve, reject)=>{
    // 현재 17번 라인의 위치 : promise() 생성자 함수의 콜백 함수 내부에서 비동기 처리 수행할 예정
    // 만약, 비동기 처리가 성공하면 콜백 함수의 인수(인자)로 전달받은 resolve()가 호출
    // 비동기 처리가 실패하면 reject()를 호출함

    if(true) { // 비동기 요청 성공 시,
        resolve('비동기 처리에 따른 응답 결과값을 작성하는 부분');
    } else {
        reject('비동기 처리 실패에 대한 예외처리 작성하는 부분');
    }
});
console.log(promise); // 비동기 처리의 진행 상태(결과)를 나타내는 상태 정보(state)를 가짐

/**
 *                       의미                              상태 변경 조건
 * pending : 비동기 처리가 아직 수행되지 않은 상태,    프로미스가 생성된 직후 기본 상태
 * fulfilled : 비동기 처리가 수행된 상태(성공)         resolve 함수 호출
 * rejected : 비동기 처리가 수행된 상태(실패)          reject 함수 호출
 * 
 * 생성된 직후의 promise는 기본적으로 pending 상태.
 * 이후 비동기 처리가 수행되면 비동기 처리 결과에 따라 다음과 같이 프로미스의 상태가 변경됨.
 * 
 * 비동기 처리 성공 : resolve()를 호출해 프로미스를 pending -> fulfilled 상태로 변경.
 * 비동기 처리 실패 : reject()를 호출해 프로미스를 pending -> rejected 상태로 변경.
 */

// 정리하면, Promise는 비동기 처리 상태와 처리 결과값을 관리하는 객체.

// promise를 활용한 비동기 요청
const getRequestWithPromise = (url) =>{
    // promise 객체 반환
    return new Promise((reject, resolve)=>{
        // 비동기 요청 수행
        const xhr = new XMLHttpRequest();
        xhr.open('GET',url);

        xhr.onload=()=>{
            if(xhr.status===200){
                // 응답이 성공했을 때
                resolve(JSON.parse(xhr.response));
            } else {
                // 예러처리
                reject(xhr.status)
            }
        }
        xhr.send();
    });
};

console.log(getRequestWithPromise('https://jsonplaceholder.typicode.com/posts/1')); 

