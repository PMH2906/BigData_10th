const [decreaseButton, resetButton, increaseButton] = document.getElementsByClassName('btn');
//decrease 버튼 눌렀을 때
// console.log(decreaseButton);
const countResult = document.querySelector('#count_result');

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


function commonHandler(number) {
    // 1단계 => 값 받아서 넘버 타입으로 바꾸기
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

// decrease 버튼 눌렀을 때
decreaseButton.addEventListener('click', () => commonHandler(-1));
resetButton.addEventListener('click', () => commonHandler(0));
increaseButton.addEventListener('click',() => commonHandler(1));
