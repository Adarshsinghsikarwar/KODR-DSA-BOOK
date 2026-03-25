const prompt = require("prompt-sync")();

let val = +prompt("Enter value : ");

let sum = 0;

while(val > 0){
    let rem = val % 10;
    sum += rem;
    val = Math.floor(val/10);
}

console.log(`Sum of a value digit : ${sum}`);