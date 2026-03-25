const prompt = require("prompt-sync")();

let num = +prompt("Enter number : ");
let rev = 0;
let actual = num;

while (num > 0) {
  let rem = num % 10;
  rev = Math.floor(rev * 10) + rem;
  num = Math.floor(num / 10);
}

if (actual == rev) {
  console.log("This is palindromic number");
} else {
  console.log("This is not palindromic number");
}
