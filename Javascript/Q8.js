const prompt = require("prompt-sync")();

const p = +prompt("Enter principal : ");
const r = +prompt("Enter rate : ");
const n = +prompt("Annual interest : ");

const ci = p * (1 + r / 100) ** n - p;

console.log("Compound interest : ", ci);
