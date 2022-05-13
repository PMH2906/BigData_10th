import React from 'react'
import classes from './Title.module.css'
import Icon from './newsIcon.png'

const title = () => {
  return (
    <>
    <img className={classes.icon} src={Icon} alt="News"/>
    <div className={classes.Header}>
    </div>
    </>
  )
}

export default title