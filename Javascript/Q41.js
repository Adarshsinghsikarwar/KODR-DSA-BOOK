const prompt = require("prompt-sync")();

const required = +prompt("Enter required number : ");
let a = null;
let b = null;
let operator = null;
let ans = 0;

do {
  a = +prompt("Enter first value : ");
  operator = prompt("Enter operator : ");
  b = +prompt("Enter second value : ");

  switch (operator) {
    case "+":
      ans = a + b;
      break;
    case "-":
      ans = a - b;
      break;
    case "*":
      ans = a * b;
      break;
    case "/":
      ans = a / b;
  }
  if (ans != required) {
    console.log("Wrong input , try again");
  }
} while (ans != required);

console.log("correct ans");
