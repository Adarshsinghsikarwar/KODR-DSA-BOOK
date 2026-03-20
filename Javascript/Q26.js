const prompt = require("prompt-sync")();

const  val = +prompt("Enter value : ");

for(let i = 1; i <= 10; i++){
    console.log(`${i*val}`)
}