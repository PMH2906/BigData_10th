import React from 'react'
// import Button from './Button'
import classes from './Category.module.css'

const Category = (props) => {


  return (
    <>

    
      {/* <div className={classes.category} id="uniquekeyone"> */}
        {/* <Button onclick="document.getElementById("unq")">IT / 과학</Button> */}
        {/* <Button className="Cbtn" id="economy" onClick={()=>props.onCategory('경제')}>경제</Button> */}
        {/* <Button className="Cbtn" id="society">사회</Button> */}
        {/* <Button classNsame="Cbtn" id="entertain">연예</Button> */}
        {/* <Button className="Cbtn" id="sports">스포츠</Button> */}
      {/* </div> */}
      <button className={classes.button} onClick={()=>props.onCategory('경제')}>경제</button>
      <button className={classes.button} onClick={()=>props.onCategory('사회')}>사회</button>
      <button className={classes.button} onClick={()=>props.onCategory('연예')}>연예</button>
      <button className={classes.button} onClick={()=>props.onCategory('스포츠')}>스포츠</button>
    
    </>
  ) 
}

export default Category