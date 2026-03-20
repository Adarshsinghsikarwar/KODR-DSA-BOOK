const prompt = require("prompt-sync")();

const name = prompt("name : ");
const age = +prompt("age : ");

if (age < 18) {
  console.log(`Hello ${name}, you are not a valid voter`);
  console.log(`The user will be eligible after ${18 - age} years`);
} else {
  console.log(`Hello ${name}, you are a valid voter`);
}
