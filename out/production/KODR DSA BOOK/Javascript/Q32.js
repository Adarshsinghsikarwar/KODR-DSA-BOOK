const prompt = require("prompt-sync")();

let val = +prompt("Enter value : ");

let count = 0;

for (let i = 1; i <= val / i; i++) {
  if (val % i == 0) {
    count++;

    if (val / i != i) {
      count++;
    }
  }
}

if (count > 2) {
  console.log(`This is not a prime number : ${val}`);
} else {
  console.log(`This is a prime number : ${val}`);
}
