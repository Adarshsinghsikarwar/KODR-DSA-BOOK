const prompt = require("prompt-sync")();

const val = +prompt("Enter value : ");
let factorial = 1;

for(let i = 1; i <= val; i++){
    factorial *= 9;
}
console.log(`The factorial : ${factorial}`)