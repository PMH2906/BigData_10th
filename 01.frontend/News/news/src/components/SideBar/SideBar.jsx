
// const SideBar = function tick() {
//     const [state, setState] = useState([]);

//     return (
  
//     useEffect(()=>{
      
//       fetch('http://localhost:3003/api')
//       .then(res => res.json())
//       .then(responseData=>{
//         console.log(responseData.items);
//         const newsData = JSON.stringify( responseData.items);
//         console.log(typeof newsData)
//         setState(newsData);
//       });
//     },[]);
//     return (
//       <div className="App">
//         {/* {state.items.map(item =>
//             <div key={item.title}>{item.title}</div>)} */}
//         {/* <div>{state}</div> */}
//         <div>{state}</div>
//       </div>
//     );
  
//     setInterval(tick, 1000);
//     );
//   }
  