const prompt = require("prompt-sync")();

let unit = +prompt("Enter unit : ");

if (unit >= 0 && unit <= 100) {
  console.log(`you bill Rs. ${unit * 4.2}/unit`);
} else if (unit >= 101 && unit <= 200) {
  console.log(`you bill Rs. ${unit * 6}/unit`);
} else if (unit >= 201 && unit <= 400) {
  console.log(`you bill Rs. ${unit * 8}/unit`);
} else {
  console.log(`you bill Rs. ${unit * 13}/unit`);
}
