const prompt = require("prompt-sync")();

const r = +prompt("Enter raduis : ");

const circumference = 2 * Math.PI * r;

console.log(`circumference of circle : ${circumference}`);
