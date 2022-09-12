// //Link of the Video = https://youtu.be/Qqx_wzMmFeA
// // Ctrl + k + c = To Command the code
// // Ctrl + k + u = To Remove the command

// //Print in Console
// console.log("In JavaScript");

// //Alert the Page
// alert("Alert Message");

// // Variables
// // Variables are used to store information to be referenced and
// //                           manipulated in a computer program.
// var b = "Variable";
// console.log(b);
// alert(b);

// //Getting Element by the ID from js to html
// document.getElementById("id_1").innerHTML = "Get Element By Id";

// //Prompt used to display a prompt box that prompts the user for the input.
// var display = prompt("Enter your Name");
// console.log(display);
// document.getElementById("id_2").innerHTML = display;

// //Numbers in Java
// var num1 = 10;
// console.log(num1);

// // Increment num1 by 1
// num1++;
// console.log(num1);

// // Decrement num1 by 1
// num1--;
// console.log(num1);

// // Divide /
// num2 = num1/5;
// console.log(num2);

// // Multiply *
// num3 = num1*2;
// console.log(num3);

// // Remainder %
// num4 = num1%3;
// console.log(num4);

// // Increment/Decrement by any number you want
// num1 += 20;
// console.log(num1);
// num1 -= 5;
// console.log(num1);

// //Functinons
// // A function is a block of organized code
// //           that is used to perform a single task.
// // 1. Create function
// // 2. Call function
// function greet() {
//   var name = prompt("Enter your Name");
//   var result = 'Hello '+ name;
//   console.log(result);
// }
// greet();

// // Adding two numbers using function
// function sum(sum1, sum2) {
//   var result = sum1 + sum2;
//   console.log(result);
// }
// sum(10, 10);
// // sum("Hello ", "Maddy");

// // Loops are used in programming to execute
// //    a block of code repeatedly until a specified condition is met.

// // While Loop
// //  While Loop control flow statement that allows code to be executed
// //       repeatedly based on a given Boolean condition.
// var num = 0;
// while (num < 10) {
//   num += 1;
//   console.log(num);
// }

// // For Loop
// // For Loop a control flow statement for specifying iteration, which
// //        allows code to be executed repeatedly.
// // We can use let instead of var (variable)
// for (let num = 0; num <= 10; num++) {
//   console.log(num);
// }

// // DataTypes
// // A data type, in programming, is a classification that specifies which type of value a variable has and what
// //       type of mathematical, relational or logical operations can be applied to it without causing an error.
// let age = 21; //number use the decimal system to represent numbers
// let name = "Maddy"; //string a sequence of characters, either as a literal constant or as some kind of variable
// let names = { first: "Shiffana", last: "Nazeema" }; //object an abstract data type created by a developer
// let truth = false; // boolean that has one of two possible values
// let fruitse = ["apple", "orange", "banana"]; // Array store a fixed-size collection of elements of the same data type.
// let random; // undefined is a condition where an expression does not have a correct value
// let nothing = null; // value null is a built-in constant that has a value of zero

// // Strings in JavaScripts(common methods)
// let fruit = "banana, apple, orange, strawberry";
// let moreFruits = "banana\napple"; //new line

// console.log(fruit.length);
// console.log(fruit.indexOf("nan"));
// console.log(fruit.slice(2, 6));
// console.log(fruit.replace("a", "@"));
// console.log(fruit.toUpperCase());
// console.log(fruit.toLowerCase());
// console.log(fruit.charAt(15));
// console.log(fruit[16]);
// console.log(fruit.split(",")); //split by comma
// console.log(fruit.split("")); //split by character

// //

// // Array
// // An array is a data structure, which can store a
// //          fixed-size collection of elements of the same data type.
// let fruits = ["apple", "orange", "banana"];
// fruits = new Array("strawberry", "pineapple", "grapes");

// console.log(fruits[0]);

// fruits[0] = "pears";
// console.log(fruits);

// for (let i = 0; i < fruits.length; i++) {
//   console.log(fruits[i]);
// }

// console.log("Fruits - ", fruits.toString());
// console.log(fruits.join(" - "));
// console.log(fruits.pop(), fruits); //pop - Delete last Element
// console.log(fruits.push("blackberries"), fruits); // push - Add last Element
// fruits[fruits.length] = "pomegranate"; //Another way to add
// console.log(fruits);
// fruits.shift(); // Delete first Element
// console.log(fruits);
// fruits.unshift('mango'); // Add first Element
// console.log(fruits);

// let veggie = ["carrot", "tomato", "onion"];
// let cook = fruits.concat(veggie); //joins two or more strings
// console.log(cook);
// console.log(cook.slice(1, 4)); // cutting out the undeclared values
// console.log(cook.reverse()); // reversing the elements
// console.log(cook.sort()); // sorting the elements in alphabetical order

// let number = [9, 7, 8, 7, 3, 6, 9, 8, 8, 4];
// console.log(
//   number.sort(function (a, b) {
//     return a - b; //ascending order
//   })
// );
// console.log(
//   number.sort(function (a, b) {
//     return b - a; //descendin order
//   })
// );

// let emtarray = new Array();
// for (let num = 0; num <= 10; num++) {
//   emtarray.push(num);
// }
// console.log(emtarray);

//

// // Objects
// //object an abstract data type created by a developer
// let person = {
//   first: "Shiffana",
//   last: "Nazeema",
//   age: 21,
//   info: function () {
//     return this.first + "\n" + this.last + "\n" + this.age;
//   },
// };
// console.log(person);
// console.log(person.first);
// console.log(person.last);
// person.first = "Maddy"; //Change the value
// console.log(person.first);
// person.age++;
// console.log(person.age);
// console.log(person.info());

//

// // If Else Condition
