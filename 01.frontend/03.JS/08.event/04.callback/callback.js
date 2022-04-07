// 콜백함수 기본 : 매개변수로 함수를 넣어줌. 그 함수가 콜백함수.
// name : parameter(매개변수), arguments(인자값)
function greeting(name){ // 함수 정의, 선언부에 쓰는 것이 parameter
    // name : local variable
    // console.log('Hello '+name);
    console.log(`Hello ${name}`);
}

//함수 호출부
greeting('yoo'); // arguments(인자값)
function processUserInput(name, callbackFn){ // callbackFn : 콜백함수
    // callbackFn = greeting();
    callbackFn(name);
} 
processUserInput('yoo',greeting); // 함수 이름만 넘기면 됨. greeting()처럼 ()는 안써도 됨

function waitCoupang(pkg, callback){
    console.log(`쿠팡에서 ${pkg}가 도착했다.`);
    callback();
}
function bringItToNeighbor(){
    console.log('영화 아주머니에게 전달 완료!');
}
waitCoupang('사과',bringItToNeighbor);
document.querySelector('button').addEventListener('click',()=>{
    console.log('button clicked');
})
