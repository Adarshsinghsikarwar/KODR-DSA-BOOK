const prompt = require("prompt-sync")();

let val = +prompt("Enter value : ");
let pow = +prompt("Enter power : ");

let result = 0

for(let i = 1; i <= pow; i++){
    result = pow * val; 
}

console.log(`The result : ${result}`)