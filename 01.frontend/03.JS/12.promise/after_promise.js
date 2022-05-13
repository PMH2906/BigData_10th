/**
 * promise가 fulfilled(응답 성공) 상태면 promise의 처리 결과(응답된 데이터)를 가지고 무언가 처리를 진행.
 * promise가 rejected 상태가 되면 처리 결과(에러)를 가지고 에러 처리를 해야함
 * 
 * 이러한 처리를 위해 사용하는 메서드
 * promise 객체가 보유하고 있는 메서드
 * then(), catch(), finally()
 * 
 * 이러한 '후속 처리 메서드'들은 다시 promise를 반환함 
 */

// fufilled
new Promise(resolve => resolve('서버로부터 응답된 데이터')) // promise 객체

// 응답 성공하면 promise의 then이라는 메서드 호출
// then()은 2개의 콜백 함수를 인수로 전달 받음
// 첫번째 인수(콜백함수) : promise가 fufilled상태(즉, resolve())
// 두번째 인수(콜백함수) : promise가 rejected상태(즉, reject())
.then(result=>console.log(result), error => console.log(error));

// rejected
new Promise((_,reject)=>reject('응답 실패')) //promise 객체
// 응답 실패하면 promise의 catch라는 메서드 호출
.catch(error=>console.log(error));


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

// 해당 함수는 promise객체 return
const pms = getRequestWithPromise('https://jsonplaceholder.typicode.com/posts/1'); 
// console.log(pms);
// pms.then(result=>console.log(result)) //promise객체 반환
// 따라서 밑에 코드 처럼 사용 가능
// finally() 함수는 요청에 성공했든 안 했든 실행되는 메서드
pms
.then(result=>console.log(result))
.catch(error=>console.log(error))
.finally(()=>console.log('요청종료'));
