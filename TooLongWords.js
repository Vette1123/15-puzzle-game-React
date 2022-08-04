// 2- too long words

var numberOfLines = readline()

while (numberOfLines-- > 0) {
  var userInput = readline()
  if (userInput.length > 10) {
    print(
      userInput[0] + (userInput.length - 2) + userInput[userInput.length - 1]
    )
  } else {
    print(userInput)
  }
}
