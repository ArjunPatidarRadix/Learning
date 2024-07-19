function solution(inputString) {
  if (inputString.length == 1) {
    return true;
  } else {
    // const rev = inputString.split("").reverse().join("");
    let rev = "";
    for (let i = inputString.length - 1; i >= 0; i--) {
      rev += inputString[i];
    }
    if (inputString === rev) {
      return true;
    }
    return false;
  }
}

const res = solution("abac");
console.log(res);
