const prompt = require("prompt-sync")();

let shopping = +prompt("Enter shopping price : ");

if (val >= 0 && val <= 500) {
  console.log(
    `you got 5% discount on your shopping : ${shopping - (shopping / 100) * 5}`
  );
} else if (val >= 1000 && val <= 1999) {
  console.log(
    `you got 10% discount in your shopping : ${
      shopping - (shopping / 100) * 10
    }`
  );
} else if (val >= 2000) {
  console.log(
    `You got 20% discount in your shopping : ${shopping - (shopping / 100) * 5}`
  );
} else {
  console.log(`In this shopping range you won't any discount`);
}

