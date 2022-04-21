import React from 'react'
import classes from './Header.module.css'
import Category from './Category'
import Press from './Press'

const Header = (props) => {
  return (
    <>
        <header className={classes.header}>
            <Category />
            <Press />
        </header>
    </>
  )
}

export default Header