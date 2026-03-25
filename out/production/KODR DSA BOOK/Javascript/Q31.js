const prompt = require("prompt-sync")();

const val = +prompt("Enter value : ");

let sum = 0;

for (let i = 1; i <= val / i; i++) {
  if (val % i == 0) {
    sum += i;

    if (val / i != i) {
      sum += val / i;
    }
  }
}

 console.log(`The sum is : ${sum}`);