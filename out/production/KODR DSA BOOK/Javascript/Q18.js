const prompt = require("prompt-sync")();

const a = +prompt("Enter first number : ");
const b = +prompt("Enter second number : ");
const c = +prompt("Enter third number : ");

if (a > b && a > c) {
    console.log(`${a} is greatest number`);
} else if (b > a && b > c) {
    console.log(`${b} is greatest number`);
} else {
    console.log(`${c} is greatest number`);
}


