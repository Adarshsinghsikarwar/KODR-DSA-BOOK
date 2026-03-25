const prompt = require("prompt-sync")();

let num = +prompt("Enter number : ")
let strong = 0;
let actual = num;

while (num > 0){
    let rem = num % 10;
    let fact = 1;

    for(let i = 1; i <= rem; i++){
        fact = fact * i;
    }
    strong += fact;

    num = Math.floor(num / 10);
}

if(actual == strong){
    console.log("It is a strong number ")
}
else {
    console.log("It is not a strong number");
}