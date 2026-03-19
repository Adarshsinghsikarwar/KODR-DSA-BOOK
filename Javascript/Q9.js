const prompt = require("prompt-sync")();

const a = +prompt("first side : ");
const b = +prompt("second side : ");
const c = +prompt("third side : ");

const s = (a + b + c) / 2;
const result = Math.sqrt(s * (s - a) * (s - b) * (s - c));

console.log("Area of triangle is : ", result);
