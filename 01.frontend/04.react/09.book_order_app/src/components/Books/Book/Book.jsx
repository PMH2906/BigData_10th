// rafce
import React from 'react'
import AddBookForm from './AddBookForm'
import classes from './Book.module.css'

const Book = (props) => {
  return (
       // li태그들은 각각 고유한 key값을 가져야 함
      <li key={props.id} className={classes.book}>
          <div>
            <h3>{props.name}</h3>
            <div className={classes.description}>{props.description}</div>
            <div className={classes.price}>{props.price}</div>
          </div>
          <div><AddBookForm/></div>
      </li>
  )
}

export default Book