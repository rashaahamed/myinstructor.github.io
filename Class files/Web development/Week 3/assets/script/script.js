"use strict";

// internal style (single line comment)

/*
  Multi-line comment (js)
*/

// window.alert
// alert("Hello JavaScript");

// Data types
var name = "Jack Jones";
var age = 34;
var isMarried = false;

var num1 = 12;
var num2 = 23;

console.log(num1 + num2 + " Hello");
console.log("Hello " + num1 + num2);
console.log("Hello " + (num1 + num2));

if (true) {
  var x = "Cat"
}
console.log(x);

if (true) {
  // 'let' is block scoped
  let y = "Dog"
}

// Creating constants
const id = 37748;
// Can't do this
// id = 3434;


function myFunc(a, b, c) {
  console.log(a + " " + b + " " + c);
}
myFunc("Bird", "Cat", "Dog");

let myArray = [3, 4, 5, 6, 7, 8];
// index (position based data type)

for (let i = 0; i < myArray.length; i++) {
  console.log(i + " -> " + myArray[i]);
}

console.log("Length of array: " + myArray.length);
