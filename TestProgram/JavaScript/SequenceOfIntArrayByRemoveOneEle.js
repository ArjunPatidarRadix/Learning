function solution(sequence) {
  let cnt = 0;
  for (let i = 1; i < sequence.length && cnt < 2; ++i) {
    if (sequence[i - 1] >= sequence[i]) {
      ++cnt;
      if (cnt > 1) return false;
      if (i > 1 && sequence[i - 2] >= sequence[i])
        sequence[i] = sequence[i - 1];
    }
  }
  return true;
}
const ans = solution([1, 2, 1, 2]);
console.log("ans ", ans);
