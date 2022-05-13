import React from 'react'
// import News from './News'
import classes from './NewsList.module.css'
// import App from '../../App'

const NewsList = (props) => {
  return (
    <>
      <div className={classes.newsList}>{props.children}</div>
    </>
  )
}

export default NewsList