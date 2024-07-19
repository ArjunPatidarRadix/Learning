function solution(n) {
  if (n >= 10 ** 4 || n < 1) {
    return false;
  }
  return n ** 2 + (n - 1) ** 2; // n ** 2 meand (n*n) and 10 ** 4 means (10*10*10*10)
}

const ans = solution(3);
console.log(ans);
