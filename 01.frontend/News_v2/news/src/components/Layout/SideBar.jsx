
import React from 'react'
import classes from './SideBar.module.css'

const SideBar = (props) => {
  return (
    <>
    <div className={classes.sideBar}>
          {props.children}
    </div>
    </>
  )
}

export default SideBar