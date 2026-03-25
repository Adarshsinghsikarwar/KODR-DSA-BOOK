const prompt = require("prompt-sync")();

let day = null;

do {
  day = +prompt("Enter day : ");
  switch (day) {
    case 0:
      console.log("Sunday");
      break;
    case 1:
      console.log("monday");
      break;
    case 2:
      console.log("Tuesday");
      break;
    case 3:
      console.log("Wendesday");
      break;
    case 4:
      console.log("Thursday");
      break;
    case 5:
      console.log("Friday");
      break;
    case 6:
      console.log("Saturday");
      break;
    default:
      console.log("It is not correct");
  }

} while (true);
