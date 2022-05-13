// 해당 HTML 주소는 server 열었던 주소/html파일 이름
// ex)http://localhost:3000/index.html로 들어가야 됌.
const getButton = document.getElementById('get-btn');
console.log(getButton);

const postButton = document.getElementById('post-btn');
console.log(postButton);

const [id, realname] = document.getElementsByTagName('p');//HTMLCollection[p.id,p.name]
// console.log(id, realname); 

// 데이터 조회
getButton.addEventListener('click',()=>{
    // XMLHttpRequest 객체(인스턴스 생성)
    const xhr = new XMLHttpRequest();
    // const xhr2 = new XMLHttpRequest()
    // console.log(xhr==xhr2); // false 출력. 둘다 XMLHttpRequest 객체지만 구체적인 내용은 다르므로!
    // http://localhost:3000/users == /users why? 앞 내용은 해당 파일에 서버가 있기때문에 자동 인식
    xhr.open('GET','/users');
    
    // onreadystatechange == onload
    // onload : 데이터 로딩(응답)이 완려되었을 때 발생
    xhr.onload = ()=>{
        if (xhr.readyState == 4 && xhr.status==200){
            // console.log(`DONE${xhr.readyState}`);
            // console.log(`response data ${typeof xhr.responseText}`);
           const responseData = JSON.parse(xhr.response);
           console.log(responseData);

           id.innerHTML = responseData[0].id
           realname.textContent =responseData[0].name
        } 
    };
    xhr.send();
});

// 데이터 등록
postButton.addEventListener('click',()=>{
    // XMLHttpRequest 객체(인스턴스 생성)
    xhr = new XMLHttpRequest();

    //HTTP 요청 준비
    xhr.open('POST','/users');

    // xhr.setRequestHeader('key','value');
    xhr.setRequestHeader('Content-type','application/json');

    // HTTP 요청 상태 확인
    xhr.onload = () => {
        if(xhr.status === 200 || xhr.status === 201){
            console.log(xhr.response);
        }
    }

    const newUser = {
        id : 11,
        name : 'Me',
        username: 'park-me-hee',
        company : {
            id : 'c1',
            name : 'Me'
        }
    }; 

    const toJson = JSON.stringify(newUser);
    // HTTP 요청 전송
    xhr.send(toJson);
});