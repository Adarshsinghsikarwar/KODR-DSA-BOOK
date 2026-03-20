const prompt = require("prompt-sync")();

const year = +prompt("Enter year : ");

if ((year % 4 == 0 || year % 100 != 0) && year % 400 == 0)
  console.log("It is a leap year ");
else console.log("It is not a leap year");
