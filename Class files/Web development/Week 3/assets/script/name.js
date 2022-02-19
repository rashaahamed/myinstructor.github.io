'use strict';

// Reading inputs

const myInput = document.getElementById('input');
const action = document.getElementById('action');
const output = document.getElementById('output');

function greetings() {
  let name = myInput.value.trim();

  if (name.length > 0) {
      output.innerText = `Welcome, ${name}`;
  } else {
    output.innerText = 'Please, enter your name';
  }

  myInput.value = '';
}

action.addEventListener('click', function() {
  greetings();
});
