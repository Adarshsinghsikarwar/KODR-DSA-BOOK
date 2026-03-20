const prompt = require("prompt-sync")();

const num1 = +prompt("Enter first number : ");
const num2 = +prompt("Enter second number : ");

const sum = num1 + num2;

console.log("Sum is : ", sum)
