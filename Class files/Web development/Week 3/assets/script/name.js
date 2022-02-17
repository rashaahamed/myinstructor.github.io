'use strict';

// Reading inputs

const myInput = document.getElementById('input');
const action = document.getElementById('action');

function greetings() {
  let name = myInput.value.trim();
  if (name.length > 0) {
      alert(`Welcome, ${name}`);
  } else {
    alert('Please, enter your name');
    myInput.value = '';
  }
}

action.addEventListener('click', function() {
  greetings();
});
