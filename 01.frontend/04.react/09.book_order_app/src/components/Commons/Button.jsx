import React from 'react'
import classes from './Button.module.css'

const Button = (props) => {
    // props.type || "button" : type이 지정되면 해당 type의 버튼으로, 지정이 안되면 type을 일반 button으로 지정
  return (
    <button 
        className={classes.button}
        type={props.type || "button"}
        onClick={props.onClick}
    >
        {props.children}
    </button>
  )
}

export default Button