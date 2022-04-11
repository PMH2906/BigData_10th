// const beforeText = document.getElementById('before_text');
// const afterText = document.getElementById('after_text');
// beforeText.onkeyup = function() {
//     afterText.textContent = beforeText.value;
// }

// 변수 네이밍 컨벤션, 도메인과 관련된 용어를 정의
// source : 번역할 텍스트와 관련된 명칭
// target : 번역된 결과와 관련된 명칭
const [sourceTextArea, targetTextArea] = document.getElementsByTagName('textarea');
// console.log(sourceTextArea, targetTextArea);

const [sourceSelect, targetSelect] = document.getElementsByTagName('select');
// console.log(sourceSelect, targetSelect);

// 번역할 언어의 기본 타입(en)
let targetLanguage = 'en';

// 어떤 언어로 번역할 지 선택하는 target selectbox의 option(선택지)의 값이 바뀔 때마다 이벤트가 발생.
targetSelect.addEventListener('change', () => {
    // console.dir(targetSelect);
    const selectedIndex = targetSelect.selectedIndex;
    targetLanguage = targetSelect.options[selectedIndex].value;
    console.log(targetSelect.options[1]);
});

sourceTextArea.addEventListener('input', (event) => {
    const text = event.target.value;
    console.log(text);
});