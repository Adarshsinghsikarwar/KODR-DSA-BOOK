const prompt = require("prompt-sync")();

const row = +prompt("Enter row : ");
const col = +prompt("Enter col : ");

for (let i = 1; i <= row; i++) {
  for (let j = 1; j <= i; j++) {
    console.log("*" + " ");
  }
//   console.log("\n");
}
