'use strict';

// Validating forms

const form = document.getElementById('registration');
const send = document.getElementById('send');

function validate() {
  const firstName = document.getElementById('first-name').value.trim();
  const lastName = document.getElementById('last-name').value.trim();
  const age = document.getElementById('age').value.trim();
  const email = document.getElementById('email').value.trim();

  let message = '';
  let valid = true;
  let count = 0;

  if (firstName === '') {
    message += 'First name is required\n';
    valid = false;
    count++; // count = count + 1;
  }

  if (lastName === '') {
    message += 'Last name is required\n';
    valid = false;
    count++;
  }

  if (age === '') {
    message += 'Age is required\n';
    valid = false;
    count++;
  } else {
    let ageInt = parseInt(age);

    if (isNaN(age) || (ageInt < 16 || ageInt > 120)) {
      message += 'Invalid age\n';
      valid = false;
    }
  }

  if (email === '') {
    message += 'Email is required\n';
    valid = false;
    count++;
  }

  if (count > 0) {
    alert(message);
  }

  // Submit the form
  // form.submit();

}

send.addEventListener('click', function() {
  validate();
});
