import React from 'react'
import classes from './Header.module.css'
import Category from './Category'
import Press from './Press'
import Title from './Title'

const Header = (props) => {
  return (
    <>
      <div className={classes.header}>
        <header className={classes.left}>
            <div className={classes.flex}><Title /></div>
        </header>
        <div className={classes.right}>
            <div className={classes.flex}><Category onCategory={props.onCategory}/></div>
            <div className={classes.flex}><Press /></div>
        </div>
      </div>
        <hr/>
    </>
  )
}


export default Header