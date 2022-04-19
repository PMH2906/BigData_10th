import React from 'react'
import classes from './CartItem.module.css'

const CartItem = (props) => {
    // classes['cart-item'] 에 classes 이름에 '-'기호가 있어서 []사용해야함
  return (
    <li className={classes['cart-item']}>
        <h2>{props.name}</h2>
        <div className={classes.summary}>
            <span className={classes.price}>$ {props.price}</span>
            <span className={classes.amount}>x 3{props.amount}</span>
        </div>
    </li>
  )
}

export default CartItem