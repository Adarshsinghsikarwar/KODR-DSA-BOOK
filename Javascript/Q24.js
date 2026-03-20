const prompt = require("prompt-sync")();

const val = +prompt("Enter value : ")
let sum = 0;

for(let i = 1; i <= val; i++){
    sum += i;
}
console.log(`Sum of n number : ${sum}`)