import React, { useState, useEffect } from 'react'
import classes from './Board.module.css'
import { shuffle, createBoard, hasWon } from '../../utils/helpers'
import { BOARD_SIZE } from '../../utils/constants'
import Button from '../Button'
import Cell from '../Cell'

const Board = () => {
  const [mainCells, setMainCells] = useState([])
  const [counter, setCounter] = useState(0)

  useEffect(() => {
    const cells = createBoard(BOARD_SIZE)
    setMainCells(shuffle(cells))
  }, [])

  // handle swap and click move logic
  const swap = (currentValueIndex, zeroIndex) => {
    let temp = [...mainCells]
    temp[zeroIndex] = mainCells[currentValueIndex]
    temp[currentValueIndex] = 0
    setMainCells(() => [...temp])
  }

  const handleMove = (value) => {
    let zeroIndex = mainCells.indexOf(0)
    let currentValueIndex = mainCells.indexOf(value)

    if (
      currentValueIndex + 4 === zeroIndex ||
      currentValueIndex - 4 === zeroIndex
    ) {
      swap(currentValueIndex, zeroIndex)
      setCounter((prev) => prev + 1)
    } else if (currentValueIndex + 1 === zeroIndex && zeroIndex % 4 !== 0) {
      swap(currentValueIndex, zeroIndex)
      setCounter((prev) => prev + 1)
    } else if (
      currentValueIndex - 1 === zeroIndex &&
      (zeroIndex + 1) % 4 !== 0
    ) {
      swap(currentValueIndex, zeroIndex)
      setCounter((prev) => prev + 1)
    }
  }

  return (
    <>
      <div className={classes.Container}>
        {mainCells.map((value) => {
          return (
            <div key={value} className={classes['Cell-Style']}>
              <Cell value={value} handleClick={handleMove} />
            </div>
          )
        })}
      </div>
      {hasWon(mainCells) && (
        <div className={classes.Congratulation}>
          <h1>Congratulations!</h1>
          <Button
            onClick={() => {
              setMainCells(shuffle(createBoard(BOARD_SIZE)))
              setCounter(0)
            }}
          >
            Play Again
          </Button>
        </div>
      )}
      <div className={classes['Buttons-Container']}>
        {!hasWon(mainCells) && (
          <Button
            onClick={() => {
              setMainCells(shuffle(createBoard(BOARD_SIZE)))
              setCounter(0)
            }}
          >
            New Game/Reset Game
          </Button>
        )}
        {/* show moves counter */}
        <div className={classes.Counter}>
          <span>Moves: {counter}</span>
        </div>
      </div>
    </>
  )
}

export default Board
