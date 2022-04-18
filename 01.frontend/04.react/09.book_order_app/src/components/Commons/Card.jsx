import React from 'react'
import classes from './Card.module.css'

const Card = (props) => {
    // props.children 는 <Card>이 안에 자식 태그 하나 더 있다는 뜻</Card>
  return (
    <div className={classes.card}>{props.children}</div>
  )
}
export default Card