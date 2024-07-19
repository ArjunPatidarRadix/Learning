function solution(s1, s2) {
  var count = 0;
  for (var i = 0; i < s1.length; i++) {
    var j = s2.indexOf(s1[i]);
    console.log("index : ", j);
    if (j >= 0) {
      count++;
      s2 = s2.replace(s1[i], "");
    }
  }
  return count;
}
// adcaa index of a is 0 now s2 is become "dcaa"
// dcaa index of a is 2 now s2 is become "dca"
// dca index of b is -1 now s2 is become "dca"
// dca index of c is 1 now s2 is become "da"
// da index of c is -1 now s2 is become "da"

const ans = solution("aabcc", "adcaa");
console.log(ans);
