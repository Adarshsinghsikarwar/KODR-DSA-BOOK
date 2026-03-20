const prompt = require("prompt-sync")();

const ch = +prompt("Enter char : ");

if (
  ch == "a" ||
  ch == "e" ||
  ch == "i" ||
  ch == "o" ||
  ch == "u" ||
  ch == "A" ||
  ch == "E" ||
  ch == "I" ||
  ch == "O" ||
  ch == "U"
) {
  console.log(`This character is vowel ${ch}`);
} else {
  console.log(`This character is consonant ${ch}`);
}
