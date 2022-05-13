import React, { useState } from 'react'
import Button from '../Commons/Button';
import Modal from '../Commons/Modal'
import CartItem from './CartItem';
import classes from '/.Cart.module.css'

const BOOKS = [
    {
      id: "book1",
      name: "THE OLD MAN AND THE SEA",
      description:
        "A story of Santiago, an aging Cuban fisherman who struggles with a giant marlin far out in the Gulf Stream off the coast of Cuba",
      author: "Ernest Hemingway",
      price: 10.57,
    },
    {
      id: "book2",
      name: "THE GREAT GATSBY",
      description:
        "Set in the Jazz Age on Long Island, near New York City, the novel depicts first-person narrator Nick Carraway's interactions with mysterious millionaire Jay Gatsby and Gatsby's obsession to reunite with his former lover, Daisy Buchanan.",
      author: "F.Scott Fitzgerald",
      price: 12.97,
    },
  ];
const Cart = () => {
    const[books, setBooks] = useState(BOOKS);
    
    // 장바구니에 등록된 상품 목롤
    const cartItems = (
        <ul className={classes['cart-items']}> 
            {books.map(book=>(
                <CartItem
                key={book.id}
                name={book.name}
                price={book.price}
                // amount={props.amount}
                />
            ))}
        </ul>
    )
    // 장바구니에 등록된 상품들의 총 금액
    const cartItemsTotal=(
        <div className={classes.total}>
            <span>Total Amount</span>
            <span>{55.24}</span>
        </div>
    )

    // 주문하기 버튼, Modal window 창 닫기 버튼
    const modalButton=(
        <div className={classes.button}>
            <Button>Close</Button>
            <Button>Order</Button>
        </div>
    )

    const cartMoalContent = (
        <>
        {cartItems}
        {cartItemsTotal}
        {modalButton}
        </>
    )
  return <Modal>{cartMoalContent}</Modal>
}

export default Cart