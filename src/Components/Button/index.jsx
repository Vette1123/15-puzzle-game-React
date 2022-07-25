import React from 'react'
import classes from './Button.module.css'

const Button = (props) => {
  return (
    <>
      <button {...props} className={classes['glow-on-hover']} type='button'>
        {props.children}
      </button>
    </>
  )
}

export default Button
