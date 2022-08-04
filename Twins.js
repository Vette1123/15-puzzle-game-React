// 6- Twins

var userArraySize = parseInt(readline())
var coinsArray = []

for (var i = 0; i < userArraySize; i++) {
  var userInput = readline()
  coinsArray.push(userInput)
}
var sortedArray = coinsArray[0]

userArraySize > sortedArray ? print(sortedArray) : print(userArraySize)
