const btn = document.getElementById('btn');
// console.log(btn);
const color = document.querySelector('.color');
console.dir(color);


// 버튼 한 번 클릭했을 때 출력
// addEventListener활용, 화살표 함수를 콜백함수로 직접 작성
btn.addEventListener('click',()=>{
    // console.log('button clicked!');
    const r = 100;
    const g = 50;
    const b = 20;
    
    // 템플릿 리터럴(backtick : `` : ${변수명} 으로 변수값 출력 가능 )
    color.textContent = `rgba(${r}, ${g}, ${b})`;
    
});

