export const shuffle = (array) => {
  return [...array].sort(() => Math.random() - 0.5)
}

export const createBoard = (size) => {
  return Array.from({ length: size }, (item, index) => index)
}

export const hasWon = (array) => {
  return array.every(
    (item, index) =>
      (item === index + 1 && item !== 0) || (item === index && item === 0)
  )
}
