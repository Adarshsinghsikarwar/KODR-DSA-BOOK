const prompt = require("prompt-sync")();

let val = +prompt("Enter value : ")

while(val > 0){
    let rem = val % 10;
    console.log(`The value : ${rem}`);
    val = Math.floor(val/10) ;
}