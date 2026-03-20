const prompt = require("prompt-sync")();

const gender = prompt("Enter your gender : ");

if (gender === "male") {
  console.log("Good Morning Sir");
} else {
  console.log("Good Morning Ma'am");
}
