var name;
var valid = false;

do {
  name = prompt("Enter your name, please").trim();
  if (name) {
    alert('Welcome, ' + name);
    valid = true;
  }
} while (!valid);
