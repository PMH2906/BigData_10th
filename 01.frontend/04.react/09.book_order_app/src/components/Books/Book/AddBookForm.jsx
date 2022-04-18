import React from 'react'
import classes from './AddBookForm.module.css'
import Input from '../../Commons/Iput'
import Button from '../../Commons/Button'
const AddBookForm = () => {
    // {} : 첫번째 괄호는 표현식
    // {{}} : 안에 괄호는 object
  return (
    <form className={classes.form}>
        <Input label={'Amount'} 
            input={{
                id:'amount',
                type : 'number',
                defaultValue:'1'
            }}
        />
        <Button type="submit">Add</Button>
    </form>
  )
}

export default AddBookForm