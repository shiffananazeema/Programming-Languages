#Python
"""
Python is a popular programming language. 
It was created by Guido van Rossum, and released in 1991.

It is used for:
Web Development (server-side),
Software Development,
Mathematics,
System Scripting.
"""

#Python Indentation
"""
Indentation refers to the spaces at the beginning of a code line.
Where in other programming languages the indentation in code is for readability only, the indentation in Python is very important.
Python uses indentation to indicate a block of code.

*The number of spaces is up to you as a programmer, but it has to be at least one.
"""

#print("Hello, World")

"""
if 5 > 2:
    
"""
print("Hello World")
#Python Variables
'''
w = """Hello world,
I am Shiffana"""
x = "Hello"
y = 'world'
Z = 5
print(w)
print(x)
print(y)
print(Z)
'''

#To Get the Type
"""
x = "Hello"
y = 'world'
Z = 5
print(type(x))
print(type(y))
print(type(Z))
"""

#Many Values to Multiple Variables
"""
x, y, z = "Orange", "Banana", "Cherry"
print(x)
print(y)
print(z)
"""

#One Value to Multiple Variables
"""
x = y = z = "Orange"
print(x)
print(y)
print(z)
"""

#Unpack a Collection
"""
fruits = ["apple", "banana", "cherry"]
x, y, z = fruits
print(x)
print(y)
print(z)
"""

#Output Variables
"""
x = "awesome"
print("Python is " + x)

x = "Python is "
y = "awesome"
z =  x + y
print(z)

x = 5
y = 10
print(x + y)

print(50+50)
"""

#Python Data Types
"""
Text Type:	str
Numeric Types:	int, float, complex
Sequence Types:	list, tuple, range
Mapping Type:	dict
Set Types:	set, frozenset
Boolean Type:	bool
Binary Types:	bytes, bytearray, memoryview
"""

#Python Numbers
"""
There are three numeric types in Python:
int
float
complex
"""

"""
x = 1    # int
y = 2.8  # float
z = 1j   # complex
"""

#Type Conversion
"""
x = 1    # int
y = 2.8  # float
z = 1j   # complex

#convert from int to float:
a = float(x)

#convert from float to int:
b = int(y)

#convert from int to complex:
c = complex(x)

print(a)
print(b)
print(c)

print(type(a))
print(type(b))
print(type(c))
"""

#Python Strings
"""
w = '''Hello world,
I am Shiffana'''
x = "Hello"
y = 'world'
print(w)
print(x)
print(y)
"""

#Strings are Arrays
'''
a = "Hello, World!"
print(a[1])
'''
#Looping Through a String
'''
for x in "banana":
  print(x)
'''
#String Length
'''
a = "Hello, World!"
print(len(a))
'''
#Check String
'''
txt = "The best things in life are free!"
print("free" in txt)
(or)
txt = "The best things in life are free!"
if "free" in txt:
  print("Yes, 'free' is present.")
'''

#Check if NOT
'''
txt = "The best things in life are free!"
print("expensive" not in txt)
(or)
txt = "The best things in life are free!"
if "expensive" not in txt:
  print("No, 'expensive' is NOT present.")
'''

#Slicing
'''
b = "Hello, World!"
print(b[2:5])
'''
#Slice From the Start
'''
b = "Hello, World!"
print(b[:5])
'''
#Slice To the End
'''
b = "Hello, World!"
print(b[2:])
'''
#Negative Indexing
'''
b = "Hello, World!"
print(b[-5:-2])
'''

#Python - Modify Strings

#Upper Case
'''
a = "Hello, World!"
print(a.upper())
'''
#Lower Case
'''
a = "Hello, World!"
print(a.lower())
'''
#Remove Whitespace
'''
a = " Hello, World! "
print(a.strip())  #returns "Hello, World!"
'''
#Replace String
'''
a = "Hello, World!"
print(a.replace("H", "J"))
'''
#Split String
'''
a = "Hello, World!"
print(a.split(",")) # returns ['Hello', ' World!']
'''
#String Concatenation
'''
a = "Hello"
b = "World"
c = a + b
print(c)
(or)
a = "Hello"
b = "World"
c = a + " " + b
print(c)
'''
#String Format
'''
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))
(or)
quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))
(or)
quantity = 3
itemno = 567
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))
'''
#Escape Character
'''
txt = "We are the so-called \"Vikings\" from the north."
'''
'''
\'	Single Quote	
\\	Backslash	
\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace
'''

#Python Booleans
'''
Booleans represent one of two values: True or False.
'''
'''
print(10 > 9)
print(10 == 9)
print(10 < 9)
(or)
a = 200
b = 33

if b > a:
  print("b is greater than a")
else:
  print("b is not greater than a")
'''

#Python Operators
'''
Python divides the operators in the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Identity operators
Membership operators
Bitwise operators
'''
#Python Arithmetic Operators
'''
+	 Addition	      x + y	
-	 Subtraction      x - y	
*	 Multiplication	  x * y	
/	 Division	      x / y	
%	 Modulus	      x % y	
**	 Exponentiation	  x ** y	
//	 Floor division	  x // y
'''
#Python Assignment Operators
'''
=	  x = 5	     x = 5	
+=	  x += 3	 x = x + 3	
-=	  x -= 3	 x = x - 3	
*=	  x *= 3	 x = x * 3	
/=	  x /= 3	 x = x / 3	
%=	  x %= 3	 x = x % 3	
//=	  x //= 3	 x = x // 3	
**=	  x **= 3	 x = x ** 3	
&=	  x &= 3	 x = x & 3	
|=	  x |= 3	 x = x | 3	
^=	  x ^= 3	 x = x ^ 3	
>>=	  x >>= 3	 x = x >> 3	
<<=	  x <<= 3	 x = x << 3	
'''
#Python Comparison Operators
'''
==	 Equal	                    x == y	
!=	 Not equal	                x != y	
>	 Greater than	            x > y	
<	 Less than	                x < y	
>=	 Greater than or equal to	x >= y	
<=	 Less than or equal to	    x <= y
'''
#Python Logical Operators
'''
and 	Returns True if both statements are true	            x < 5 and  x < 10	
or	Returns True if one of the statements is true	            x < 5 or x < 4	
not	Reverse the result, returns False if the result is true	    not(x < 5 and x < 10)
'''
#Python Identity Operators
'''
is 	Returns True if both variables are the same object	           x is y	
is not	Returns True if both variables are not the same object	   x is not y
'''
#Python Membership Operators
'''
in 	Returns True if a sequence with the specified value is present in the object	         x in y	
not in	Returns True if a sequence with the specified value is not present in the object	 x not in y
'''
#Python Bitwise Operators
'''
& 	 AND	          Sets each bit to 1 if both bits are 1
|	   OR	            Sets each bit to 1 if one of two bits is 1
 ^	 XOR	          Sets each bit to 1 if only one of two bits is 1
~ 	 NOT	          Inverts all the bits
<<	 Zero fill      Shift left by pushing zeros in from the right 
      left shift	     and let the leftmost bits fall off
>>	 Signed         Shift right by pushing copies of the leftmost
      right shift	     bit in from the left, and let the rightmost bits fall off   
'''
#Python Lists