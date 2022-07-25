import React from 'react'
import classes from './Cell.module.css'

const Cell = ({ value, handleClick }) => {
  return (
    <>
      <div
        className={value === 0 ? classes['Empty-cell'] : classes['Full-Cell']}
        onClick={() => handleClick(value)}
      >
        {value}
      </div>
    </>
  )
}

export default Cell
