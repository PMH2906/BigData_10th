// 1. 함수가 호출된 순서대로 순차적으로 실행됨 - 동기(Synchronous)
// 함수 표현식 : 함수를 변수 안에 할당
const firstFunc = () => console.log('첫 번째 함수 호출됨.');
const someLongTasks = () => { // 함수 선언문
    // 함수 구현문
    console.log('------------------');
    console.log('특정 작업(task) 처리 중... 시간이 오래 소요됨');
    console.log('------------------');
}; 

const secondFunc = () => console.log('두 번째 함수 호출됨.');

firstFunc();
someLongTasks();
secondFunc();


// 현재 시간을 숫자(ms)로 변경하는 메서드
console.log(Date.now());

// 일정한 작업 시간이 경과한 이후에 함수가 호출되도록 시간을 지연시켜주는 sleep() 작성
/**
 * 
 * @param {*} callbackFunc :콜백함수
 * @param {*} delay :지연시킬 시간
 */
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
//첫번째 작업 3(3*1000)초 동안 블로킹 시키고 싶음.
sleep(firstWork,3*1000); // 첫 번째 작업 수행 후
secondFunc(); // 두 번째 작업 수행.

/**
 * 현재 실행 중인 작업(Task)이 종료할 때까지 다음에 실행될 작업이 대기하는 방식을
 * 동기(Synchronous) 처리라고 함.
 * 
 * 동기 처리 방식은 작업을 순서대로 하나씩 처리(순차적으로)하기 때문에
 * 장점 : 실행 순서가 보장됨.
 * 단점 : 앞선 작업이 종료할 때까지 이후의 작업들이 블로킹(Blocking)되는 단점이 있음.
 */
