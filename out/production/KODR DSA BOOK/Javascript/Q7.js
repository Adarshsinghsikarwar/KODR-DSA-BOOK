const prompt = require("prompt-sync")();

const l = +prompt("Enter length : ");
const w = +prompt("Enter width : ");

const area = w * l;
const perimeter = (1 / 2) * (w * l);

console.log(`The area is : ${area} and perimeter is : ${perimeter}`);
