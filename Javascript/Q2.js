const prompt = require("prompt-sync")();

const nums1 = parseInt(prompt("number1 : "));
const nums2 = parseInt(prompt("number 2 : "));

const sum = nums1 + nums2;

console.log("The sum of ", nums1, "&", nums2, "=", sum);
