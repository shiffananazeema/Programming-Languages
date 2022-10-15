/*JavaScript is the world's most popular programming language.
  JavaScript to program the behavior of Web pages.

//The Script Tag
<script>
document.getElementById("demo").innerHTML = "My First JavaScript";
</script>
//JavaScript function is placed in the <head> section of an HTML page.

<script>
function myFunction()
{
  document.getElementById("demo").innerHTML = "My First Javascript";
}
</script>
//JavaScript function is placed in the <body> section of an HTML page.

/*JavaScript Display Possibilities
Writing into an HTML element, using innerHTML.
Writing into the HTML output using document.write().
Writing into an alert box, using window.alert().
Writing into the browser console, using console.log().

//Inner Html
<script>
document.getElementById("demo").innerHTML = 5 + 6;
</script>

//Attribute Value
<body>
<button onclick="document.getElementById('myImage').src='picname.img'">Show
</button>
<button onclick="document.getElementById('myImage').src='picname.img'">Don't Show
</button>
</body>
//It will change the images on the click

//Style
<p id="demo">Change the Font Size.</p>
<button onclick="document.getElementById('demo').style.fontSize='35px'">
Change</button>
//It will change the font size on the click

//Hide Elements
<p id="demo">Hide the Elements.</p>
<button onclick="document.getElementById('demo').style.display='none'">
Hide</button>
//It will hide the elements on the click

//Display Elements
<p> It will show the hidden elements.</p>
<p id="demo" style="display:none">Display the Elements</p>
<button onclick="document.getElementById('demo').style.display='block'">
Show</button>
//It will display the hidden elements on the click

//Using document.write() to show in the web browser
<script>
document.write(5 + 6);
</script>

//Using the alert message
alert("HI! World")
alert(varname);
//It will display the alert message on the web page

//Using window.alert()
<script>
window.alert(5 + 6);
</script>
//It will also display the alert message on the web page

//Using console.log() to display the message in console
<script>
console.log(5 + 6);
</script>
//Console is used for debugging. We can see that by F12.

//JavaScript Print
<button onclick="window.print()">Print</button>
//It will lead to the printing page.

//Code Block
<button  type="button" onclick="myFunction()"></button>
function myFunction() {
    document.getElementById("demo1").innerHTML = "Hello Dolly!";
    document.getElementById("demo2").innerHTML = "How are you?";
  }
//It will display the message after  clicking the button.

//JavaScript Variables
var homeCity / car1 = "cgk";
var x = 5;
var y = 6;
var z = x + y;
 
//Variable Basics
var status="Single";
console.log(status);
/*OUTPUT:
Single

//To know the type
var name = "Robin";
var age = 42;
var height = 1.74;
console.log(typeof(name/age/height));
String/NUmber
 
//Assignment Operators
+ Addition - Adds numbers - (z = x + y)
- Subtraction - Subtracts numbers - (z = x - y)
* Multiplication - Multiplies numbers - (z = x * y)
/ Division - Divides numbers - (z = x / y)
% Modulus(Division Remainder) - Returns the division remainder - (z = x % y)
++ Increment - Increments numbers - (var x = 5; x++; var z = x;)
-- Decrement - Decrements numbers - (var x = 5; x--; var z = x;)
** Exponentiation - Raises the first operand to the power of the 
|                             second operand. - (var x = 5; var z = x ** 2;)

<script>
var x = 5;
var y = 2;
var z = x * y;
document.getElementById("demo").innerHTML = z;
</script>


var height = 1.72;
var age = 42;
age++/age--
height -=/+=/ *=/ /= 0.2;
console.log(height);

/*Only Strings have ""

//Comparision Operators
== Equals(= =)
=== Equal value and equal type(= = =)
!= Different or Not equal(! =)
!== Not equal value or not equal type(! = =)
> Greater than
< Less than
>= Greater or equal(> =)
<= Lesser then or equal(< =)
? Ternary Operator

//Logical Operations
&& needs every condition to be true in order not to be false logical and
|| needs any one to be true to show true logical or
! is the logical not if a content is true this will make it false or if its false it will make it true
""  NUmber in quotes like "4">"33" = true because it only looks at the character in alphabatical order

//Type Operators
typeof - Returns the type of a variable
instanceof - Returns true if an object is an instance of an object type
 
//Bitwise Operators
& AND
| OR
~ NOT
^ XOR
<< Zero fill left shift
>> Signed right shift
>>> Zero fill right shift

//JavaScript is Case Sensitive
lastName = "name1" - Correct
lastname = "name2" - Wrong

//HTML Events
onchange - An Html element has been changed
onclick - The user clicks an HTML element
onmouseover - The user moves the mouse over an HTML element
onmouseout - The user moves the mouse away from an HTML element
onkeydown - The user pushes a keyboard key
onload - The browser has finished loading the page*/