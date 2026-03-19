const prompt = require("prompt-sync")();

const num = +prompt("Enter a number : ");

if (num % 2 === 0) {
  console.log(`${num} is even number`);
} else {
  console.log(`${num} is odd number`);
}
