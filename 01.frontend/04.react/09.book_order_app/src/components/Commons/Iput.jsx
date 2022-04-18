import React from 'react'
import classes from './Input.module.css'

const Input = (props) => {
    // label 태그 기능 : label내용물을 클릭하면 input박스에 입력가능하도록 커서가 움직임
    // label이랑 input을 이어주기위해서는 id랑 label이 같아야함..?

    // ...props.input : spread operator문법
    // 즉, '...'은 배열, 문자열, 객체 등 반복 가능한 객체 (Iterable Object)를 개별 요소로 분리
    return (
    <div className={classes.input}>
        <label htmlFor={props.input.id}>{props.label}</label>
        <input {...props.input} />
    </div>
  )
}

export default Input