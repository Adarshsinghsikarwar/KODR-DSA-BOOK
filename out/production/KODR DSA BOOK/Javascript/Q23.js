const prompt = require("prompt-sync")();

const val = +prompt("Enter value :");

for(let i = 1; i <= val; i++){
    console.log(`Hello ${i}`)
}