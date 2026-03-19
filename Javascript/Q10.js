const prompt = require("prompt-sync")();

const r = +prompt("enter raduis : ");

const surface_area = 4 * Math.PI * r * r;

console.log(`surface area of sphere : ${surface_area.toFixed(2)}`);
