export const shuffle = (array) => {
  return [...array].sort(() => Math.random() - 0.5)
}

export const createBoard = (size) => {
  return Array.from({ length: size }, (item, index) => index)
}

export const hasWon = (array) => {
  return array.every((value, index) => value === index)
}
