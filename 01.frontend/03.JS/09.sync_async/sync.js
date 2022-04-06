// 1. 함수가 호출된 순서대로 순차적으로 실행됨 - 동기(Synchronous)
// 함수 표현식 : 함수를 변수 안에 할당
const firstFunc = () => console.log('첫 번째 함수 호출됨.');
const someLongTasks = () => {
    console.log('------------------');
    console.log('특정 작업(task) 처리 중... 시간이 오래 소요됨');
    console.log('------------------');
}; 

const secondFunc = () => console.log('두 번째 함수 호출됨.');

firstFunc();
someLongTasks();
secondFunc();

// 일정한 작업 시간이 경과한 이후에 함수가 호출되도록 시간을 지연시켜주는 sleep() 작성

// 현재 시간을 숫자(ms)로 변경하는 메서드
console.log(Date.now());

function sleep(callbackFunc, delay){
    console.log('시간 지연 중..');
    const delayTime = Date.now() + delay;

    while (Date.now() < delayTime); // delayTime 동안 while문에 갇혀서 다음 문장 실행 기다림.
    callbackFunc();
}
function firstWork(){
    console.log('첫 번째 작업 수행');
}

function secondWork(){
    console.log('두 번째 작업 수행');
}
//첫번째 작업 3초 동안 블로킹 시키고 싶음.
sleep(firstWork,3*1000);
secondFunc()

/**
 * 현재 실행 중인 작업이 종료할 때까지 다음에 실행될 작업이 대기하는 방식을 
 * 동기 처리라고 함
 * 
 * 동기 처리 방식은 작업을 순서대로 처리함
 * 
 */
