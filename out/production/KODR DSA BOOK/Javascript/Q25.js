const prompt = require("prompt-sync")();

const val = +prompt("Enter value : ")

for(; val > 0; val--){
    console.log(val)
}