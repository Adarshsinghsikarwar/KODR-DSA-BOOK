const prompt = require("prompt-sync")();

let val = +prompt("Enter value : ");

let rev = 0;

while(val > 0){
    let rem = val % 10;
    rev = Math.floor(rev * 10)+ rem;
    val /= 10;
}

console.log(`The reverse number : ${rev}`)