// My variables
var email, at, dot, name;
var valid = false;

do {
  email = prompt('Please enter your email').trim();
  at = email.indexOf('@');
  dot = email.indexOf('.');
  name = email.substring(0, at);

  if (at >= 0 && dot >= 0) {
    alert(
      "The @ symbol is at position " + at + "\n" +
      "The . character is at position " + dot + "\n" +
      "Your user name is " + name + "\n" +
      "Your email ( " + email + ") is valid"
    );
    valid = true;
  } else {
    alert("Your email is not valid");
  }
} while (!valid); // not valid => not true
