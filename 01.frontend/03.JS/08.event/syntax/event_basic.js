// 2. EventHandler property 방식:HTML과 JS를 분리

const evPropButton = document.getElementById('btn-ev-prop');
// const evPropButton2 = document.querySelector('#btn-ev-prop')

console.log(evPropButton); // ctrl + enter : 변수명 자동 완성
console.dir(typeof evPropButton);

const book = {id:1,author:'해밍웨이',title:'노인과바다'} // 책이라는 object 생성
// property로는 id, author, title
// id :1
// author : 해밍웨이
// title

console.log(book.title); //dot연산자

// JS에서 함수는 (일급)객체이기 때문에, 객체는 값이고, 값은 프로퍼티에 할당 가능
// 이 문법을 사용하면 이벤트 중복 불가능
evPropButton.onclick = function(){ // 익명함수 생성 및 할당
    console.log('by event property');
}
console.log(evPropButton); // onclick 프로퍼티에 만들어준 함수 할당되어 있음

// '새롭게 등록된 이벤트 핸들러' 출력되는 이벤트 핸들러 함수 화살표 함수로 작성 및 할당 
evPropButton.onclick = () => console.log("새롭게 등록된 이벤트 핸들러");

// 3. addEventListener method 방식
// addEventListener method 방식 - EventHandler property 방식 : 여기서는 onclick이라는 property에 영향 미치지 X

//  on 접두사 생략
const addEvLsnrButton = document.getElementById('btn-add-ev-lsnr')
console.log(addEvLsnrButton);

// 함수 선언문 방식으로 이벤트 핸들러 작성
 
function buttonHandler(){
    console.log('double clicked!');
}

// addEventListener() 메소드의 인자값으로 함수 입력.
// 그때 인자값으로 넘겨진 함수를 콜백함수 callback function라고 함.ex)buttonHandler
// 콜백함수 : 어떠한 함수에 인자값으로 함수를 넘겼을 때, 넘겨진 함수!!!!
addEvLsnrButton.addEventListener('dblclick',buttonHandler);

const buttonHandler2 = () => console.log('MouseOver!')
addEvLsnrButton.addEventListener('mouseover',buttonHandler2);

// click 이벤트 화살표 함수를 콜백함수 파라미터 자리에 직접 작성
addEvLsnrButton.addEventListener('click',()=>{
    console.log('by addEventListener with arrow function');
});

// 이벤트 핸들러 제거
// 1. EventHandler attribute : onclick attribute 코드 제거

// 2. EventHandler property 방식 : 해당 property에 null 할당
evPropButton.onclick=null;

// 3. addEventListener method 방식 : 별도의 이벤트 제거 함수 호출
addEvLsnrButton.removeEventListener('dblclick',buttonHandler);
addEvLsnrButton.removeEventListener('mouseover',buttonHandler2);

// click 이벤트도 제거 => 제거 불가능
// why? 익명함수라서