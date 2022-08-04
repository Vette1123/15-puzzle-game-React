// 8- Lucky Division
var lucky_numbers = [4, 7, 47, 74, 44, 444, 447, 474, 477, 777, 774, 744]

var userInput = parseInt(readline())
var count = 0

for (var i = 0; i < lucky_numbers.length; i++) {
  if (userInput % lucky_numbers[i] === 0) {
    count++
  }
}
count > 0 ? print('YES') : print('NO')
