const prompt = require("prompt-sync")();

const name = prompt("name : ");
const age = +prompt("age : ")

console.log(`Hello ${name}, you are ${age} years old`)