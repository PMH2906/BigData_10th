const clickButton = document.getElementById('check');
const textDst = document.getElementById('text-dst');
const tableDst = document.getElementById('value-table');
// https://jsonplaceholder.typicode.com/users
const xhr = new XMLHttpRequest();
xhr.open('get','https://jsonplaceholder.typicode.com/users');
console.log(xhr.readyState);
xhr.onreadystatechange = () => {
    if(xhr.readyState ==4 && xhr.status==200) {
        console.log(xhr.readyState);
        let parsedData = JSON.parse(xhr.responseText);
        parsedData = Array.from(parsedData);
        console.log(parsedData[0]);
        console.log(Array.isArray(parsedData));
        let infoList = [];
        clickButton.addEventListener('click', () => {
            parsedData.forEach((index) => {
                // table 구조 바꾸기
                   infoList.push(`<tr><td>${index.id}</td>
                                <td>${index.name}</td>
                                <td>${index.username}</td>
                                <td>${index.email}</td>
                                <td>${index.address}</td>
                                </tr>`);
                tableDst.innerHTML =  infoList;
            });
        });
        console.log(parsedData[0].username);
    }
}
// column 개수 8개
xhr.send();
console.log(xhr.readyState);