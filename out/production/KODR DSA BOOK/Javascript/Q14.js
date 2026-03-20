const prompt = require("prompt-sync")();

const gender = prompt("Enter your gender : ");

if (gender === "male") {
    console.log("Good morning sir");
}   
else if (gender === "female") {
    console.log("Good morning ma'am");
}
else {
    console.log("Input is not valid");
}