import React from 'react'
import SideBar from './SideBar'
import classes from './Body.module.css'
// import Button from './Button'
import NewsList from './NewsList'
// import News from './News'

const Body = (props) => {
    
    return (
        <>
        <div className={classes.body}>
          <ul><NewsList>{props.children}</NewsList></ul>
          <ul><SideBar>{props.children}</SideBar></ul>
        </div>
        </>
  )
}

export default Body