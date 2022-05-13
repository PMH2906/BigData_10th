const btn = document.getElementById('btn');
// console.log(btn);
const color = document.querySelector('.color');
// console.dir(color);



// 버튼 한 번 클릭했을 때 출력
// addEventListener활용, 화살표 함수를 콜백함수로 직접 작성
btn.addEventListener('click',()=>{
    // console.log('button clicked!');
     
    // const r = randomRGBArray[0];
    // const g = randomRGBArray[1];
    // const b = randomRGBArray[2];
    const randomRGBArray = getRandomNumber(0,255); //추상적 : 캡슐화함. //변수 생성하면 가독성 좋아짐.
    const [r, g, b] = randomRGBArray
    
    // 템플릿 리터럴(backtick : `` : ${변수명} 으로 변수값 출력 가능 )
    const rgbColor = `rgba(${r}, ${g}, ${b})`
    
    color.textContent = rgbColor; // text 바꾸기
    console.log(typeof rgbColor); // 타입 체크 : string

    color.style.color = rgbColor; //text color 바꾸기

    // document.querySelector('body').backgroundColor = rgbColor;
    document.body.style.backgroundColor = rgbColor; // 배경 색상 바꾸기
});

// 구체적
function getRandomNumber(min, max){
    // rgb랜덤값 추출
    // 변수의 할당값이 바뀔수 있기 때문에 let 사용
    // const는 재할당 불가. 
    let randomRGBArray = [];
    console.log((Array.isArray(randomRGBArray)));

    for(let i = 0;i <3 ;i++){
        // console.log(Math.random);
        // max : 255
        // floor : 내림함수 
        // 0-255 : 255 -0 + 1 : (1더해주는 이유는 random함수는 1이하의 값을 return. 따라서 최댓값 255가 나올 수 x. 254가 최대이므로 +1 해줌. )
        // min 더하는 이유:최솟값을 min으로 설정해주기 위해
        const randomNumber = Math.floor(Math.random() * (max - min  + 1)) + min;
        // console.log(randoNumber)

        // 배열추가
        randomRGBArray.push(randomNumber);
        console.log(randomRGBArray);
    }
    return randomRGBArray;
}
