//Given an array of strings, return another array containing all of its longest strings.

//Example

// For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
// solution(inputArray) = ["aba", "vcd", "aba"].

function solution(inputArray) {
  let longest = 0;
  for (let i = 0; i < inputArray.length; i++) {
    if (inputArray[i].length > longest) {
      longest = inputArray[i].length;
    }
  }

  return inputArray.filter((el) => el.length === longest);
}

const ans = solution(["aba", "aa", "ad", "vcd", "aba"]);
console.log(ans);
