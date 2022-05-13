// import React, { Component } from 'react';
// import './App.css';
import React, { useState } from 'react'
import Body from './components/Layout/Body';
import Header from './components/Layout/Header';
import News from './components/Layout/News';

function App() {

  const [state, setState] = useState([]);

  
  const [category, setCategory] = useState('IT');

  const categoryHandler =(data)=>{
    
    setCategory(data);

    changePage()
  }
  console.log(category);


  const changePage = () =>{
    fetch(`http://localhost:3001/api?query=${category}`)
    .then(res => res.json())
    .then(responseData=>{

      console.log(responseData.items);
      // const newsData_json = JSON.stringify( responseData.items);
      const newData = responseData.items;
      
      // console.log(typeof newsData_json);// string
      // console.log(typeof newData); //Object

      const newsItems=newData

      const newsArray = [];
        for(let i=0; i< newsItems.length; i++){
            let newsItem = {};
            newsItem.title=newsItems[i].title.replace(/(<([^>]+)>)|&quot;/ig,""); //나머지 아이템들 생략
            newsItem.link=newsItems[i].link.replace(/(<([^>]+)>)|&quot;/ig,"");
            newsItem.description=newsItems[i].description.replace(/(<([^>]+)>)|&quot;/ig,"");
            newsItem.pubDate=newsItems[i].pubDate.replace(/(<([^>]+)>)|&quot;/ig,"");
            newsItem.originallink=newsItems[i].originallink.replace(/(<([^>]+)>)|&quot;/ig,"");
            newsArray.push(newsItem);
        }
      

      setState(newsArray);
    });
  }


const NewsList2 = state.map(news => (
  <News
      title={news.title}
      originallink={news.originallink}
      description={news.description}
      link={news.link}
  /> 
));

  return (
    <>
    <div className="App">
      <Header onCategory={categoryHandler} />   
      <Body >
        {NewsList2}
      </Body> 
    </div>
    </>
  );
}

export default App;
