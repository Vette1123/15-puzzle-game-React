// 1-watermalon

// const weight = parseInt(readline())
// if (weight % 2 === 0 && weight != 2) {
//   print('YES')
// } else {
//   print('NO')
// }

// 2- too long words

// var numberOfLines = readline()

// while (numberOfLines-- > 0) {
//   var userInput = readline()
//   if (userInput.length > 10) {
//     print(
//       userInput[0] + (userInput.length - 2) + userInput[userInput.length - 1]
//     )
//   } else {
//     print(userInput)
//   }
// }

// 3- string task

// var userInput = readline()

// var noVowels = userInput.replace(/[aeiouy]/gi, '')

// var noVowelsWithComma = noVowels.replace(/([^aeiouy])/gi, '.$1')

// var noVowelsWithCommaLower = noVowelsWithComma.toLowerCase()

// print(noVowelsWithCommaLower)

//

// 4- Petya and Strings
// var userFirstInput = readline()
// var userSecondInput = readline()

// print(userFirstInput.toLowerCase().localeCompare(userSecondInput.toLowerCase()))

// 5- Helpful Maths
// var userInput = readline()
// var userInputArray = userInput.split('+')
// userInputArray.sort()
// var userInputReverse = userInputArray.join('+')
// print(userInputReverse)

// 6- Twins

// var userArraySize = parseInt(readline())
// var coinsArray = []

// for (var i = 0; i < userArraySize; i++) {
//   var userInput = readline()
//   coinsArray.push(userInput)
// }
// var sortedArray = coinsArray[0]

// userArraySize > sortedArray ? print(sortedArray) : print(userArraySize)

// 7- Chat room

// var regex = /h.*e.*l.*l.*o/

// var userInput = readline()
// userInput.match(regex) ? print('YES') : print('NO')

// 8- Lucky Division
// var lucky_numbers = [4, 7, 47, 74, 44, 444, 447, 474, 477, 777, 774, 744]

// var userInput = parseInt(readline())
// var count = 0

// for (var i = 0; i < lucky_numbers.length; i++) {
//   if (userInput % lucky_numbers[i] === 0) {
//     count++
//   }
// }
// count > 0 ? print('YES') : print('NO')

// 9- Presents  node.js

// let stdin = process.stdin;
// stdin.setEncoding('utf8');
// stdin.on('data', function (data) {
//     let input = data.split('\n');
//     let n = input[0].split(' ').map(function (a) { return parseInt(a); });
//     let k = input[1].split(' ').map(function (a) { return parseInt(a); });
//     let result = solution(n, k);
//     console.log(result);
// });

// End of interface

// const solution = (n, presentsArray) => {
// 	let res = '';
// 	let presentsArrayOfObjects = [];
// 	for (let j = 0; j<n; j++){
// 		presentsArrayOfObjects.push({p:presentsArray[j], i:j+1})
// 	}
// 	let presentsAOOsortedByP = 	presentsArrayOfObjects.sort(function(obj1, obj2){ return obj1.p - obj2.p})
// 	let resArray =[];
// 	for (let k =0; k<n; k++){
// 		resArray.push(presentsAOOsortedByP[k].i)
// 	}
// 	res = resArray.join(' ');
// 	return res;
// };

// 10- Beautiful Matrix

// var matrix = []
// var res = 0
// for (var i = 0; i < 5; i++) {
//   matrix.push(
//     readline()
//       .split(' ')
//       .map((a) => parseInt(a))
//   )
// }
// for (var i = 0; i < 5; i++) {
//   for (var j = 0; j < 5; j++) {
//     if (matrix[i][j] == 1) {
//       res = Math.abs(i - 2) + Math.abs(j - 2)
//     }
//   }
// }
// print(res)
