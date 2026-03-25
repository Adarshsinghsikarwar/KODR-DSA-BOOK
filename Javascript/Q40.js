const prompt = require("prompt-sync")();

const val = +prompt("Enter val : ");
let required = null;

do {
  required = +prompt("Enter required value : ");
  if (required != val) {
    console.log("Wrong input , try again");
  }
} while (val != required);

console.log("Correct answer")
