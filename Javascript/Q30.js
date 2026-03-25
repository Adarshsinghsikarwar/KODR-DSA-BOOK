const prompt = require("prompt-sync")();

const val = +prompt("Enter value : ");

for(let i = 1; i <= val/i; i++){
    if(val % i == 0){
        console.log(`${i}`)

        if(val/ i != i){
            console.log(val/i);
        }
    }
}