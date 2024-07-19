function solution(inputArray) {
  var max = -Infinity;

  for (var i = 0; i + 1 < inputArray.length; i++) {
    if (max < inputArray[i] * inputArray[i + 1]) {
      max = inputArray[i] * inputArray[i + 1];
    }
  }
  return max;
}

const ans = solution([3, 4, -3, -9, 9, 7]);
console.log(ans);
