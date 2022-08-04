// 3- string task

var userInput = readline()

var noVowels = userInput.replace(/[aeiouy]/gi, '')

var noVowelsWithComma = noVowels.replace(/([^aeiouy])/gi, '.$1')

var noVowelsWithCommaLower = noVowelsWithComma.toLowerCase()

print(noVowelsWithCommaLower)
