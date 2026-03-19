const prompt = require("prompt-sync")();

let a = +prompt("number1 : ");
let b = +prompt("number2 : ");

a = a + b;
b = a - b;
a = a - b;

console.log(`the swap value : ${a} and ${b}`);
