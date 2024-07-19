function solution(matrix) {
  let total = 0;

  for (let j = 0; j < matrix[0].length; j++) {
    for (let i = 0; i < matrix.length; i++) {
      console.log("i is :", i);
      console.log("j is :", j);
      console.log("\n");
      if (matrix[i][j] == 0) {
        break;
      } else {
        total += matrix[i][j];
      }
    }
  }
  return total;
}

const ans = solution([
  [0, 1, 1, 2],
  [0, 5, 0, 0],
  [2, 0, 3, 3],
]);

console.log(ans);
