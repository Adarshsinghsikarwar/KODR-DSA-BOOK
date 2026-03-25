const prompt = require("prompt-sync")();

const actualNumber = +prompt("Enter actual number : ");
let requiredNumber = null;

do {
  requiredNumber = +prompt("Enter actual number : ");

  if (requiredNumber != actualNumber) {
    console.log("Wrong input");
  } else {
    console.log("Correct ");
    break;
  }
} while (actualNumber != requiredNumber);


