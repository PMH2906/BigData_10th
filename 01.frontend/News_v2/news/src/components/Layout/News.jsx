import React from 'react'

const News = (props) => {
  return (
    <>
        <div>
            <h3>{props.title}</h3>
            <div>{props.description}</div>
            <a href={props.originallink}>{props.originallink}</a>
        </div>
    </>
  )
}


export default News