// 10- Beautiful Matrix

var matrix = []
var res = 0
for (var i = 0; i < 5; i++) {
  matrix.push(
    readline()
      .split(' ')
      .map((a) => parseInt(a))
  )
}
for (var i = 0; i < 5; i++) {
  for (var j = 0; j < 5; j++) {
    if (matrix[i][j] == 1) {
      res = Math.abs(i - 2) + Math.abs(j - 2)
    }
  }
}
print(res)
