// Header 영역을 담당하는 Header컴포넌트 작성
import classes from './Header.module.css'

const Header = () => {
    // classes.header: Header.module.css에 있는 header를 가져옴
    return(
        <>
            <header className={classes.header}>
                <h1>Book Order App</h1>
            </header>
        </>
    )
};

export default Header;
