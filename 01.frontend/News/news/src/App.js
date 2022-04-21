// import React, { Component } from 'react';
import './App.css';
import React, { useEffect, useState } from 'react'
// fetch('https://book-order-3627f-default-rtdb.firebaseio.com/books.json')
// .then(response=>response.json())
// .then(responseData=>{
//   const booksData = [];
//   for(const key in responseData){
//     // console.log(key); // book1
//     const book = {
//       id:key,
//       name:responseData[key].name,
//       description:responseData[key].description,
//       author:responseData[key].author,
//       price:responseData[key].price
//     };
//     booksData.push(book);
//     console.log(booksData);
//   }
//   setBooks(booksData);
// });

function App() {

  const [state, setState] = useState([]);

  useEffect(()=>{
    
    // const state = {users:[]};
    fetch('http://localhost:3003/api')
    .then(res => res.json())
        // json형식으로 받아온 값을 setState를 이용해 값을 재설정해줌
    // .then(users => setState({ users }))
    .then(responseData=>{
      // const NewsData =[];
      // for (const )
      console.log(responseData.items);
      const newsData = JSON.stringify( responseData.items);
      console.log(typeof newsData)
      setState(newsData);
    });
  },[]);
  // console.log(state);
  
  // function componentDidMount() {
  //     // 프록시로 등록한 서버주소가 생략됨
  //     fetch('http://localhost:3003/api')
  //       .then(res => res.json())
  //       // json형식으로 받아온 값을 setState를 이용해 값을 재설정해줌
  //       .then(users => this.setState({ users }));
  // }
  // componentDidMount()

  return (
    <div className="App">
      {/* {state.items.map(item =>
          <div key={item.title}>{item.title}</div>)} */}
      {/* <div>{state}</div> */}
      <div>{state}</div>
    </div>
  );
}

export default App;
