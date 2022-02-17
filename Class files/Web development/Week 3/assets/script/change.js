'use strict';

const boxOne = document.getElementById('box-1');
const boxTwo = document.getElementById('box-2');
const boxThree = document.getElementById('box-3');

// When you write the function, a and b are called parameters
// function add(a, b) {
//   let c = a + b;
//   return c;
// }
// When you call the function, the values (a, b) are arguments
// let number = add(5, 10); // = 15

const btnTwo = document.getElementById('btn-two');
const btnThree = document.getElementById('btn-three');

// Calling with HTML onclick (not a good idea)
function toRed() {
  boxOne.style.backgroundColor = '#e54c02';
}

// These options are better
btnTwo.onclick = function() {
  boxTwo.style.backgroundColor = '#02e5be';
}

btnThree.addEventListener('click', function() {
  boxThree.style.backgroundColor = '#029be5';
});
