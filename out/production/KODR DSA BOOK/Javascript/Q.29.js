const prompt = require("prompt-sync")();

const val = +prompt("Enter value : ");

let evenSum = 0;
let oddSum = 0;

for (let i = 1; i <= val; i++) {
  if (i % 2 == 0) {
    evenSum += i;
  } else {
    oddSum += i;
  }
}

console.log(`evenSum upto val : ${evenSum}`);
console.log(`oddSum upto val : ${oddSum}`);
