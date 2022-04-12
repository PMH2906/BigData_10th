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


const selectbox = document.getElementsByClassName('form-select');

// 번역할 언어의 기본 타입(en)
let targetLanguage = 'en';

// 어떤 언어로 번역할 지 선택하는 target selectbox의 option(선택지)의 값이 바뀔 때마다 이벤트가 발생.
targetSelect.addEventListener('change', () => {
    // console.dir(targetSelect);
    const selectedIndex = targetSelect.selectedIndex;
    targetLanguage = targetSelect.options[selectedIndex].value;
    console.log(targetSelect.options[1]);
});
let debouncer; // debounce 변수 선언
sourceTextArea.addEventListener('input', (event) => {

    // 디바운싱 
    if(debouncer){ // deboucer에 TimeID값이 있으면(카운팅 하고 있다는 의미)
        clearTimeout(debouncer); // 현재 타이머 카운트 초기화
    }

    debouncer = setTimeout(()=>{
        const text = event.target.value;
        console.log(text);
    
        if(text){ // text변수에 값이 있으면 true, 없으면 false
    
            //비동기 요청을 도와주는 Web API 객체 생성
            const xhr = new XMLHttpRequest();
        
            //node 서버의 특정 url 주소
            const url = '/detectLangs';
        
            xhr.onreadystatechange = ()=> {
                if(xhr.readyState === 4 && xhr.status === 200){
                    // console.log(xhr.responseText);
                    const responseData = JSON.parse(xhr.responseText);
        
                    const result = responseData['message']['result'];
                    
                    // 번역된 텍스트를 결과 화면에 입력
                    targetTextArea.value = result['translatedText'];
        
                    // const resultSrcLangType = result['SrcLangType'];
                    // console.log(selectbox)
                    // for(var i =0; i<=selectbox.length;i++){
                    //     if (selectbox.options[i].value===resultSrcLangType){
                    //         selectbox.options[i].selected = 'true';
                    //         break
                    //     }
                    // }
        
                }
            };
        
            // 요청준비
            xhr.open('POST',url);
        
            // Node 서버에 보낼 객체 형태의 JSON 데이터
            const requestData = {
                text, // 프로퍼티이름이랑 변수 이름 같으면 하나로 써줘도 됨. == text:text;
                targetLanguage,
            };
            
            xhr.setRequestHeader('Content-type','application/json');
            
            //JSON 의 타입은?
            const ObjectToJson = JSON.stringify(requestData);
        
        
            // 요청 전송
            //url = '/detectLangs';
            //xhr.open('POST',url); 이므로 send하면 해당 url server로 send!
            xhr.send(ObjectToJson);
        }
    },2000); //2초 후에 콜백함수 호출
});