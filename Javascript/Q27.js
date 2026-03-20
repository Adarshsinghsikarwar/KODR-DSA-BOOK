const prompt = require("prompt-sync")();

const val = +prompt("Enter value : ");

let sum = 0;

for (let i = 0; i <= val; i++) {
  sum += i;
}

console.log(`The sum : ${sum}`);
