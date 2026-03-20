const prompt = require("prompt-sync")();

const num1 = +prompt("Enter first number : ");
const num2 = +prompt("Enter second number : ");

if (num1 > num2) {
    console.log(`${num1} is greater than ${num2}`);
}
else {
    console.log(`${num2} is greater than ${num1}`);
}