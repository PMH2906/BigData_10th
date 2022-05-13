import React from 'react'
import Button from './Button'
import classes from './Press.module.css'

const Press = () => {
  return (
      <div className={classes.Press}>
        <Button>1</Button>
        <Button>2</Button>
        <Button>3</Button>
        <Button>4</Button>
        <Button>5</Button>

      </div>
  )
}

export default Press