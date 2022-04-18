// Header.js에서 Header로 export된 값(함수, 변수)를 가져오겠다. 사용하겠다.
import Books from './components/Books/Books';
import Header from './components/Layout/Header'
import Main from './components/Layout/Main';

// 최상위 컴포넌트
function App() {
  return (
    <>
      <Header/>
      <Main>
        <Books/>
      </Main>
    </>
  );
}

// App이라는 것을 외부로 export함
export default App;
