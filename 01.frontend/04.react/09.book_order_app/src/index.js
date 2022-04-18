import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App'; // App.js에서 가져와서 App을 import해줌

// React 17 -> 18버전으로 바뀌면서
// 17버전에서는 ReactDOM.render()
// 18버전에서는 ReactDOM.createRoot()
const root = ReactDOM.createRoot(document.getElementById('root'));
// App.js 부분을 rendering
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

