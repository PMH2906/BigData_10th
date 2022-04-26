// import React, { Component } from 'react';
import './App.css';
import React, { useEffect, useState } from 'react'
import Body from './components/Layout/Body';
import Header from './components/Layout/Header';

function App() {

  const [state, setState] = useState([]);

  useEffect(()=> {
    // const state = {users:[]};
    fetch('http://localhost:3003/api')
    .then(res => res.json())
        // json형식으로 받아온 값을 setState를 이용해 값을 재설정해줌
    // .then(users => setState({ users }))
    .then(responseData=>{
      console.log(responseData.items);
      const newsData_json = JSON.stringify( responseData.items);
      const newData = responseData.items;
     
      console.log(typeof newsData_json);// string
      console.log(typeof newData); //Object
  
      // const newsItems=newData
  
      // const newsArray = [];
      //  for(let i=0; i< newsItems.length; i++){
      //      let newsItem = {};
      //      newsItem.title=newsItems[i].title.replace(/(<([^>]+)>)|&quot;/ig,""); //나머지 아이템들 생략
      //      newsItem.link=newsItems[i].link.replace(/(<([^>]+)>)|&quot;/ig,"");
      //      newsItem.description=newsItems[i].description.replace(/(<([^>]+)>)|&quot;/ig,"");
      //      newsItem.pubDate=newsItems[i].pubDate.replace(/(<([^>]+)>)|&quot;/ig,"");
      //      newsArray.push(newsItem);
      //  }
      setState(newData);
    })
    .catch(error=>console.log(error))
  },[]);

 
  // const NewsList = state.map(news=>{
  //   // title = {news.title}
  //   // originallink ={news.originallink}
  //   // link={news.link}
  //   // description={news.description}
  //   title = news.title
  //   originallink =news.originallink
  //   link=news.link
  //   description=news.description
  // })
  // console.log(NewsList)

  console.log(state);


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
      <Header />
      <Body>
       <div>{state[0].title}</div>
       <div>{state[0].originallink}</div>
       <div>{state[0].link}</div>
       <div>{state[0].description}</div>
      </Body>

    </div>
  )
}

export default App;
