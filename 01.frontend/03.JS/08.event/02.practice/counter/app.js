
// 버튼 객체화 다른 방법1
const [decreaseButton, resetButton, increaseButton] = document.getElementsByClassName('btn');
//decrease 버튼 눌렀을 때
// console.log(decreaseButton);
const countResult = document.querySelector('#count_result');

// 버튼 객체화 다른 방법2
// let countButton = document.querySelector('#count_result'); // type : HTMLcollection : 유사배열, 배열처럼 동작은 하나 배열 타입은 아님.
// 배열 타입으로 변환
// countButton = Array.from(countButton);



// function decreaseHandler(){
//     let count = Number.parseInt(countResult.innerHTML);
//     count=count-1;
//     countResult.innerHTML = count;
//     textColor(count)
// };

// function increaseHandler(){
//     let count = Number.parseInt(countResult.innerHTML);
//     count=count+1;
//     countResult.innerHTML = count;
//     textColor(count)
// };
// function resetHandler(){
//     let count = Number.parseInt(countResult.innerHTML);
//     count=0;
//     countResult.innerHTML = count;
//     textColor(count)
    
// };

// function textColor(count){  
//     if(count>0) countResult.style.color='green';
//     else if(count==0) countResult.style.color='grey';
//     else countResult.style.color='red';
// }
// decreaseButton.addEventListener('click',decreaseHandler);
// resetButton.addEventListener('click',resetHandler);
// increaseButton.addEventListener('click',increaseHandler);

// Refactoring 과정 거친 후!!!
function commonHandler(number) {
    // 1단계 => 값 받아서 넘버 타입으로 바꾸기
    // innerText대신 textContent로 값 가져오기 가능.
    let count = Number.parseInt(countResult.innerText); // string => number 0
    console.log(count);
    if(number == 1) {
        count++;
    }
    else if(number ==-1) {
        count--;
    }
    else count = 0;

    countResult.innerText = count;
        
    if(count > 0) countResult.style.color = 'green';
    else if(count == 0) countResult.style.color = 'grey';
    else countResult.style.color = 'red';
}

// 콜백 함수에 파라미터 적용시킬려면, 
// commonHandler(parameter)=> X why? JS파일을 읽으면서 click을 안 했을 때도 commonHandler()함수가 실행됨.
// 따라서 함수 실행을 잠시 미룰 수 있는 화살표 함수를 사용!!
decreaseButton.addEventListener('click', () => commonHandler(-1));
resetButton.addEventListener('click', () => commonHandler(0));
increaseButton.addEventListener('click',() => commonHandler(1));

//// Refactoring!과정 진행!
// countResult 태그를 객체화 시킬 때 handler()함수 내에서 굳이 반복해서 선언할 필요 없이, 값이 실시간으로 바뀌어도 맨 위에 먼저 객체화를 시켜도 상관없다.
// 초기에는 버튼마다 callback_function을 선언하여 버튼을 누를 때마다 각각 호출하도록 했다가 반복되는 코드가 많아서, 콜백함수를 하나로 만들면 좋겠다고 생각해서 파라미터 값을 받는 콜백함수로 만들게 됨.
// callback_funtion(paramer)선언 할 때: () => callback_function(parameter) 형식으로 만들어야한다는 것을 알게 됨.


// 원래는 count를 판단하는 함수가 따로 있었으나, 콜백함수를 하나로 합치게 되면서 반복사용 되지 않는 이유로 판단함수를 없애고 if문을 그냥 적음.
