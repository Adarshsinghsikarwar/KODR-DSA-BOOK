const prompt = require("prompt-sync")();

const num = +prompt("Enter number : ");

let square = num * num;
let lastDigit = square % 10;

if(lastDigit == num){
    console.log("It is a automorphic number ")
}
else {
    console.log("It is not a automorphic number")
}