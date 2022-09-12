/*  JAVA                                                                                 [# = Output]    
   ******        
 (1) Java Introduction
 (2) Java Features
 (3) Java Uses
 (4) Java Internals
 (5) Java Syntax
 (6) Java Modifiers
 (7) Java Variables
 (8) Java DataType
 (9) Java Operators
(10) Java Control Statements
(11) Java Keywords
(12) Java Methods
(13) Java Arrays
(14) Java Strings
(15) Java Classes And Objects
(16) Java Constructors

(1) Java Introduction:-
**********************
Java is a computer programming language that enforces an object-oriented programming model.

Java is a popular programming language, created in 1995.

Java was originally developed by James Gosling at Sun Microsystems 
 (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform.

The language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by 
 the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia.

It is owned by Oracle, and more than 3 billion devices run Java.

-------------------------------------------------------------------------------------------------------------------------------------
(2) Java Features:-
******************
Simple: 
```````
    It is easy to learn and its syntax is quite simple, clean and easy to understand. The comfusing and 
ambigous concepts of C++ are either left our in java or they have been re-implemented in cleaner way. 

High Performance:
````````````````` 
    Although Java is an interpreted language, it was designed to support "just-in-time" compilers, which
dynamatically compile bytecodes to machine code.

Secure:
```````
    Java can be used to develop virus-free systems. Java is secured because:
    * Java Programs runs inside virtual machine sandbox to prevent any activity from untrusted sources.
    * No use of explict pointers.

Robust:
```````
    * Java checks the code during the compilation time and run time.
    * Java completely takes care of memory allocation and releasing, which makes Java more robust.
    
Portable:
`````````
     Applications written on one platform of Java can be easily ported to another platform(ubuntu,windows) as it is 
platform independent.

Dynamic:
````````
    Java is considered dynamic because of Bytecode. 
    Many objects are evaluated at run time and execution is carried over.  
    For example: Runtime polymorphism.

Distributed:
````````````
    RMI (Remote Method Invocation), EJB (Enterprise Java Beans) etc. are used for creating districuted
applications using Java. (Big Data)
    * Using this a program can call a method of another running in some other computers in the network.

Multi-threaded:
```````````````
    * Thread is a task in a process/program.
    * Multi-threading is multiple tasks/executing at the same time.
    * This facility is provided by Java so that many tasks can be executed at the same time.

Object Oriented:
````````````````
    Java is an object oriented programming language. Everything is performed using "objects". Java can
be easily extended since it is based on the Object model. 

------------------------------------------------------------------------------------------------------------------------------------

(3) Java Uses:-
***************
Android Apps:
`````````````
    All Android applications are written in Java programming language, with Google's Android API, which 
is similar to JDK.

Server Apps at Financial Services Industry:
```````````````````````````````````````````
   Lots of global investment banks like Citigroup, Barclays, Standard Chartered and other banks use Java
for writing front and back office electronic trading system, writing settlement and confirmation systems,
data processing projects and several others.

Java Web Applications:
``````````````````````
    Many of government, healthcare, insurance, education, defence and several other department have their
web application built in Java using Servlets, JSP, Struts, Spring MVC.

Embeded Systems:
````````````````
    Java is the platform where you only need 130kb memory to use Java technology(on a smart card or sensor)

Web Servers and Application Servers:
`````````````````````````````````````
    * Apache Tomcat, Simple.Jo!, Rimfaxe Wen Server(RWS) and Project Jigsaw are web server space.
    * WebLogin, WebSphere and Jboss EAP dominate commercial application server space.

Enterprise Applications:
````````````````````````
    Java Enterprise Edition (Java EE) is a popular platform that procides API and runtime environment for 
scripting and running enterprise softwares.

Scientific Applications:
````````````````````````
    * Java is the choice of many software developers for writing applications involving scientific calculations
and mathematical operations.
    * These programs are generally considered to be fast and secure, have a higher degree of protability and 
low maintenance.

Big Data technologies:
``````````````````````
    * Hadoop and other big data technologies are also using Java in one way or other
    * For Example Apache Kafka components API - Producer and Consumer are written in Java.

Internet of Things(IOT):
````````````````````````
   Internet of things wich is a way to blend hardware and software together to solve problems faced in real life.

------------------------------------------------------------------------------------------------------------------------------------

Why use JAVA?
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
It is one of the most popular programming language in the world
It is easy to learn and simple to use
It is open-source and free
It is secure, fast and powerful
It has a huge community support (tens of millions of developers)
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, 
lowering development costs. As Java is close to C++ and C#, it makes it easy for programmers to switch to 
Java or vice versa

-------------------------------------------------------------------------------------------------------------------------------------

(4) Java Internals:-
********************
Java Virtual Machine (JVM):
```````````````````````````
    * Java Virtual Machine(JVM) is the virtual machine that runs the Java bytecodes.
    * The JVM does not understand Java source code, that is why you compile your *.java files to obtain *.class files
that contain the bytecodes understood by the JVM.
    * The same bytecodes give the same results makes Java a Platform Independent Language(Write Once, Run Anywhere)

|                                                                   |-> Windows 
    Java Code(.Java)--->Java Complier--->Byte Code(.class)--->JVM-----> Ubuntu
|                                                                   |-> Mac

Java Runtime Environment (JRE):
```````````````````````````````
    * Java Runtime Environment(JRE) provides the libraries, the Java Virtual Machine, and other components to run
applets and applications written in the Java Programming language.
            JRE = JVM + Set of Libraries + Other Additional Files
    * The JRE does not contain tools and utilities such as compilers or debuggers for developing applets and application.                                                                    

Java Development Kit (JDK):
```````````````````````````
    JDK is a superset of JRE and contains everything that is in the JRE, plus tools such as the compilers and debuggers 
necessary for developing applets and applications 
            JDK = JRE + Development Tools
            JDK = (JVM + Set of Librarites + Other Additional files) + Development Tools 

------------------------------------------------------------------------------------------------------------------------------------

(5) Java Syntax:-
*****************
public class Learning 
{
  public static void main(String[] args) 
  {
    System.out.println("Hello World");
  }
}

#Hello World

// public class Learning
public - 
    [public Keyword is an access modifier which represents visibility, it means it is visible to all]
    Means that any other class can access it.
class - 
    [class keyword is used to declare a class in java]
    Every line of code that can actually run needs to be inside a class.
Learning - 
    It the name of the class
    This line declares a class named Learning, which is public.


// public static void main(String[] args) 
public - 
    This is the access modifier of the main method. It has to be public so that java runtime can execute this method. 
(Remember that if you make any method non-public then it’s not allowed to be executed by any program, there are some 
access restrictions applied.)

static - 
    [static is a keyword, if we declare any method as static, it is known as static method. The core advantage of static 
    method is that there is no need to create object to invoke the static method]
    In this main method has to be static so that JVM can load the class into memory and call the main method.
(When java runtime starts, there is no object of the class present. That’s why the main method has to be static so 
that JVM can load the class into memory and call the main method. If the main method won’t be static, JVM would not 
be able to call it because there is no object of the class is present.)

void - 
    [void is the return type of the method, it means it doesn't return any value]
    Java main method doesn't return anything, that's why it's return type is void.
(Java programming mandates that every method provide the return type. Java main method doesn’t return anything, 
that’s why it’s return type is void. This has been done to keep things simple because once the main method is 
finished executing, java program terminates. So there is no point in returning anything, there is nothing that 
can be done for the returned object by JVM. If we try to return something from the main method, it will give 
compilation error as an unexpected return value. )

main - 
    [main represents startup of the program]
    This is the name the method. It's fixed and when we start a java program, it looks for the main method.

// String[] args - 
    [String[] args is used for command line argument.]
    Java main method accepts a single argument of type String array. This is also called as java command line arguments.


// System.out.println("Hello World");
    [System.out.println() is used print statement.]
System - Is a pre-defined class that Java provides us and it holds some useful methods and variables.

out - Is a static variable within System that represents the output of your program (stdout).

println - Is a method of out that can be used to print a line.

------------------------------------------------------------------------------------------------------------------------------------
 
(6) Java Modifiers:-
********************
    Modifier is a word or phrase or clause that describes, changes or modifies the meaning of another word or phrase in some way.
Example:
  Policeman->Traffic Policeman
  Traffic here being the Modifier and specifying that reference is being made to a Traffic Policeman

  In Java Modifiers are keywords that you add to those definitions to change, modify or spcify their meanings.
There are two major types of Modifiers in Java
   (I)  Access Control Modifiers
   (II) Non-Access Modifiers

Access Control Modifiers:
`````````````````````````
    Java provides a number of access control modifiers to set access levels for classes, variables, methods and constructors
The four access levels are
    (i)  Default - Visible to the package
    (ii) Private - Visible to the class only
   (iii) Public - Visible to the world
    (iv) Protected - Visible to the package and all subclasses

Non-Access Modifiers:
`````````````````````
    Java provides a number of non-access modifiers to provide additional functionalities to a class, variable, method or
constructor. Some of them are:
  (i) static - The static modifier for calling methods and variables without an object to which it belongs
 (ii) final - The final modifier for finalizing the implementations of classes, methods, and variables
(iii) abstract - The abstract modifier for creating abstract classes and methods
 (iv) synchronized and volatile - The synchronized and volatile modifiers, which are used for threads. 


final int myNum = 15;
myNum = 20;           # will generate an error: cannot assign a value to a final variable

---------------------------------------------------------------------------------------------------------------------------------

(7) Variables:-
***************
 (Variables are container for storing data values.)
    * Variables are memory locations which are reserved to store values
    * This implies while declaring a variable you reserve some memory
There are 3 types of variables
  (I) Local
 (II) Instance
(III) Class/Static

1) Local Variable
``````````````````
    * A variable declared inside the body of the method is called local variable. You can use this 
variable only within that method and the other methods in the class aren't even aware that the variable exists.
    * A local variable cannot be defined with "static" keyword.

2) Instance Variable
`````````````````````
  * A variable declared inside the class but outside the body of the method, is called an instance 
variable. It is not declared as static.
  * It is called an instance variable because its value is instance-specific and is not shared among instances.

3) Static variable
```````````````````
  * A variable that is declared as static is called a static variable. It cannot be local. You can create a 
single copy of the static variable and share it among all the instances of the class. Memory allocation for 
static variables happens only once when the class is loaded in the memory.

{ #Not Important Just for Knowing--------------------------------------------------------------------------------

Local Variables:
 * Local variables are declared in methods, constructors or blocks 
 * Local variables are created when execution enters a method, constructor or block
 * Access modifiers cannot be used for local variables
 * Local variables are visible only within the declared method, constructor or block
 * Local variables are implemented at stack level internally
 * There is no default value for local variables, so local variables should be declared and an initial
value should be assigned before the first use

Instance Variables:
  * Instance variables are declared in a class
  * When a space is allocated for an object in the heap, a slot for each instance variable value is created
  * Instanve variables are created when an object is created with the use of the keyword 'new' and destroyed
when the object is destroyed
  * Access modifierws can be given for instance variables
  * The instance variables are visible for all methods, constructors and block in the class
  * Instance variables have default values. For numbers, the default value is 0, for Booleans it is false, and
for object references it is null
  * Values can be assigned during the declaration or within the constructor
  * Instance variables can be accessed directly by calling the variable name inside the class. However, within
static methods ( when instance variables are given accessibility), they should be called using the fully qualified
name ObjectReference VariableName.

Class/Static:
  * Class variables are declared with the static keyword inside a class, but it is created outside a method, 
constructor or a block
  * Class variables are declared as constants i.e. variables never change from their initial value
  * Static variables are stored in the static memory 
  * It is rare to use static variables other than declared final and used as either public or private constants
  * Static variables are created when the program starts and destroyed when the program stops
  * Static variables are declared public since they must be available for users of the class
  * Static variables can be accessed by calling with the class name - ClassName.VariableName
}------------------------------------------------------------------------------------

Types of Variables:
``````````````````
 * String - stores text, such as "Hello". String values are surrounded by double quotes
 * int - stores integers (whole numbers), without decimals, such as 123 or -123
 * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
 * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
 * boolean - stores values with two states: true or false

Syntax:
````````
type variable = value;

Example:
````````
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";

#
5
5.99
D
true
Hello

Program Example:
````````````````
String name = "John";
System.out.println(name); #John

int myNum = 15;
System.out.println(myNum);  #15
\
int myNum;
myNum = 15;
System.out.println(myNum);  #15

-------------------------------------------------------------------------------------------------------------------------------

(8) Datatypes:-
***************
  * Each variable in java has a specific type, which determines the size of memory, the range of values that 
can be stored and the set of operations that can be applied to the variable
  * Datatypes can be catagorized into two major typess
     (I) Primitive
    (II) Non-Primitive/Reference


|                                DataTypes
|                                    |
|                   Primitive ---------------- Non-Primitive
|                       |
|            Numeric ------- Non-Numeric
|               |               -char
|               |               -boolean
|               |
|   Integral ------- Floating-Point
|     -byte            -float
|     -short           -double
|     -int
|     -long
    
Primitive:
``````````
  * The datatypes which predefined by the language and named as a keyword
  * There are 8 major Primitive Datatypes
    (1) byte - number
    (2) short - number
    (3) int - number
    (4) long - number
    (5) float - float number
    (6) double - float number
    (7) char - a character
    (8) boolean - true or false

Syntax:
```````
  int num = 50;

-------------------------------------------------------------------------------------
|   Data Type    |                  Value Range                |   Bytes Required   |
|------------------------------------------------------------------------------------
|    byte        |                 -128 to 127                 |         1          |
|    short       |               -32768 to 32767               |         2          |
|    int         |          -2147483648 to 2147483647          |         4          |
|    long        | -9223372036854775808 to 9223372036854775807 |         8          |
|    float       |            +/- 3.40282347E+38F              |         4          |
|    double      |        +/- 1.79769313486231570E+308         |         8          |
|    char        |                    0 to 65536               |         2          |
|    boolean     |                 true or false               |         1(bit)     |
-------------------------------------------------------------------------------------

Non-Primitive/Reference:
````````````````````````
 Non-primitive data types are called reference types because they refer to objects.
  * Reference variables are created using defined constructors of the classes
  * There variables are declared to be of a specific type that cannot be changed
  * Objects of various classes Strings and Arrays come under reference datatype
  * Reference variable holds bits that represents a way to access an object
  * It does not hold the object itself, but it holds a reference address to the object
  * Reference type does not have size or bit range

Syntax:
```````
  Student s1 = new Student();
  
The Main Difference between primitive and non-primitive data types are:
````````````````````````````````````````````````````````````````````````
 * Primitive types are predefined (already defined) in Java. Non-primitive types are created 
by the programmer and is not defined by Java (except for String).
 * Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
 * A primitive type has always a value, while non-primitive types can be null.
 * A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
 * The size of a primitive type depends on the data type, while non-primitive types have all the same size.
  
Example for Variables and Data Types:
`````````````````````````````````````
public class Learning
{
    public static void main(String[] args)
    {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 401;
        float f = 50f;
        char c = 'A';
        double d = 60d;
        boolean bln = true;
        String str = "Hello";
        System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "
|                                +c+" "+d+" "+bln+" "+str);
    }
}

#true
10 20 30 401 50.0 A 60.0 true Hello

------------------------------------------------------------------------------------------------------------------------------

DataType Casting:-
******************
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically):
``````````````````````````````````
  * Converting a smaller type to a larger type size
      byte -> short -> char -> int -> long -> float -> double

Example:
````````
    int myInt = 9;
    double myDouble = myInt;          # Automatic casting: int to double
# 9 
  9.0

Narrowing Casting (manually): 
`````````````````````````````
  * Converting a larger type to a smaller size type
      double -> float -> long -> int -> char -> short -> byte

Example:
````````
    double myDouble = 9.78d;
    int myInt = (int) myDouble;          # Manual casting: double to int
# 9.78
  9

---------------------------------------------------------------------------------------------------------------------------

DataType Conversion:
********************
 * A datatype of a particular variable can be converted to other datatypes.
 * There are 2 ways in which we can perform Datatype Conversions:
        * Implicit Conversion
        * Explicit Conversion
        
    |-----short----|
  byte            int--->long--->float--->double
          chat<----^    
  
Note:
`````
 1. The arrow shows the possible implicit Type casting that are permissible between Primitive Datatypes
 2. As it shows int can be converted implicity to long,float,double
 3. For vice verse, they have to be converted explicity.

Implicit Conversion:
````````````````````
  An implicit conversion means that a value of one type is changed to a value of another type without any\
special directive from the programmer

For Example: 
````````````
  A char can be implicity converted to an int, a long, a float or a double

Example:
````````
 char c = 'a'
 int k = c
 float f = c
 long l = c
 double d = c

 # a
   97
   97.0
   97
   97.0
/
int a = 100;
String b = "hello";
String s = a + b ;    #100hello

Explicit conversions:
`````````````````````
 * Explicit conversions are done by Type Casting
 * The type to which you want a value converted is given in parentheses, in front of the current value of that
 * Casting can be used to convert among any of the primitive types except boolean

For Example:
````````````
  double d = 45d;
  int i = (int)d;    #45.0
|                     45


Difference Between Type Casting and Type Conversion:
`````````````````````````````````````````````````````
    In type casting, a data type is converted into another data type by a programmer 
using casting operator. Whereas in type conversion, a data type is converted into 
another data type by a compiler.

---------------------------------------------------------------------------------------------------------------------------------------

(9) Operators:-
***************
  Operator in Java is a symbol that is used to perform operations.
----------------------------------------------------------------------------------------------------
|    Operatior Type        |            Category             |             Prededence              |
|--------------------------------------------------------------------------------------------------|
|                          |            Postfix              |            expr++, expr--           |
|       Unary              |-----------------------------------------------------------------------|
|                          |            Prefix               |  ++expr, --expr, +expr, -expr, ~, ! |
|--------------------------------------------------------------------------------------------------|
|                          |         Multiplicative          |              *, /, %                |
|     Arithmetic           |-----------------------------------------------------------------------|
|                          |            Additive             |                +, -                 |
|--------------------------------------------------------------------------------------------------|
|       Shift              |             Shift               |            <<, >>, >>>              |
|--------------------------------------------------------------------------------------------------|
|                          |          Comparision            |       <, >, <=, >=, instanceof      |
|     Relational           |-----------------------------------------------------------------------|
|                          |            Equality             |              ==, !=                 |
|--------------------------------------------------------------------------------------------------|
|                          |          Bitwise AND            |                 &                   |
|                          |-----------------------------------------------------------------------|
|      Bitwise             |      Bitwise exclusive OR       |                 ^                   |
|                          |-----------------------------------------------------------------------|
|                          |      Bitwise inclusive OR       |                 |                   |
|--------------------------------------------------------------------------------------------------|
|                          |           Logical AND           |                &&                   |
|                          |-----------------------------------------------------------------------|
|      Logical             |           Logical OR            |                ||                   |
|                          |-----------------------------------------------------------------------|
|                          |           Logical NOT           |                 !                   | 
|--------------------------------------------------------------------------------------------------|
|      Ternary             |            Ternary              |                ?:                   |
|--------------------------------------------------------------------------------------------------|
|                          |                                 |   =, +=, -=, *=, /=, %=, &=, ^=,    |
|    Assignment            |          Assignment             |          |=, <<=, >>=, >>>=         |
----------------------------------------------------------------------------------------------------

Unary Operators:
```````````````
   The unary operator is an operator that can be used only with an operand. It is used to represent 
the positive or negative value, increment/decrement the value by 1, and complement a Boolean value. 

--------------------------------------------------------------------------------------------------------------------------------
| Operator |          	Name            | 	              Description	                   |   Syntax   |       Example	         |
-------------------------------------------------------------------------------------------------------------------------------|
|    +	   |         Unary Plus         |         	Represent positive values            | +(operand) |   x = +5;         #5   |
|------------------------------------------------------------------------------------------------------------------------------|
|    -	   |         Unary Minus        |     Converts positive value into negative      | -(operand) |   x = -5;         #-5  |
|------------------------------------------------------------------------------------------------------------------------------|
|          |           | Pre-increment  | Variable increased by 1 then returns the value |  ++operand |   x = 5; ++x;     #6   |
|    ++    | Increment |-------------------------------------------------------------------------------------------------------|
|          |           | Post-increment |  Variable returned first then increased by 1   |  operand++ |   x = 5; x++;     #7   |
|------------------------------------------------------------------------------------------------------------------------------|
|          |           | Pre-decrement  | Variable decreased by 1 then returns the value |  --operand |   x = 5; --x;     #6   |
|    --	   | Decrement |-------------------------------------------------------------------------------------------------------|
|          |           | Post-decrement |  Variable returned first then decreased by 1   |  operand-- |   x = 5; x--;     #5   |
|------------------------------------------------------------------------------------------------------------------------------|
|          |                            |     Minus of total positive values from 0      |            |   x = 5; sop(~x); #-6  |
|    ~     |       Compliment           |------------------------------------------------| ~(operand) |------------------------|
|          |                            |        Positive of total minus from 0          |            |   x = -5; (~x);   #4   |
|------------------------------------------------------------------------------------------------------------------------------|
|    !     |     Logical Compliment	    |         Inverts the Boolean Values             | !(operand) | x = true; (!x); #false | 
--------------------------------------------------------------------------------------------------------------------------------


Arithmetic Operators:
`````````````````````
   Arithmetic operators are used to perform common mathematical operations.
|                                                                             [x = 10; y = 5;]
--------------------------------------------------------------------------------------------
|  Operator  |    	Name        | 	       Description	           |  Syntax  |   Example	 |
--------------------------------------------------------------------------------------------
|     +	     |     Addition     |    	Adds together two values     |	x + y	  | x + y; #15 |
|------------------------------------------------------------------------------------------|
|     -	     |   Subtraction    | Subtracts one value from another | 	x - y	  | x - y; #5  |
|------------------------------------------------------------------------------------------|
|     *      |	Multiplication	|      Multiplies two values	     |  x * y	  | x * y; #50 |
|------------------------------------------------------------------------------------------|
|     /	     |    Division	    |   Divides one value by another   |	x / y	  | x / y; #2  |
|------------------------------------------------------------------------------------------|
|     %	     |     Modulus	    |  Returns the division remainder  |  x % y   | x % y; #0  |
--------------------------------------------------------------------------------------------

Shift Operators:
```````````````` 
   A Shift Operator performs bit manipulation on data by shifting the bits of its first operand right or left.
|                                                                                                          [ x = 10 ]                     
------------------------------------------------------------------------------------------------------------------------------
| Operator |    Name     | 	              Description                   |   Syntax    |              Example         	       |
--------------------------------------------------------------------------------------------------------------------- -------|
|    <<    |   Signed    |   Shift bits of op1 left by distance op2;    | op1 << op2  | (x << 2) #40 - 00001010 (decimal 10) | 
|          | Left Shift  | fills with zero bits on the right-hand side  |	            |        becomes 00101000 (decimal 40) |
|----------------------------------------------------------------------------------------------------------------------------|
|    >>    |   Signed    |   Shift bits of op1 right by distance op2    | op1 >> op2  | (x >> 2) #2  - 00001010 (decimal 10) | 
|          | Right Shift | fills with highest bit on the left-hand side |             |        becomes 00000010 (decimal 2)  |
|----------------------------------------------------------------------------------------------------------------------------|
|   >>>    |   Unsigned  |   Shift bits of op1 right by distance op2;   | op1 >>> op2 | (x >>> 3) #4 - 00100000 (decimal 32) | 
|          | Right Shift | fills with zero bits on the left-hand side   | 	          | [x=32] becomes 00000100 (decimal 4)  |
------------------------------------------------------------------------------------------------------------------------------

Relational Operators:
`````````````````````
   Relational Operators are used to compare Two Values and results in Boolean.
|                                                                                              [x = 10, y = 5;]
--------------------------------------------------------------------------------------------------------------------------
|  Operator  |         Name          | 	          Description	           |       Syntax        |         Example	       |
--------------------------------------------------------------------------------------------------------------------------
|     <	     |       Less than       |          Checks Less than         |       x <  y	       |     x <  y;      #false |
|------------------------------------------------------------------------------------------------------------------------|
|     >	     |     Greater than      |        Checks Greater than        | 	     x >  y	       |     x >  y;      #true  |
|------------------------------------------------------------------------------------------------------------------------|
|     <=     | Less than or Equal to |    Checks Less than / equal to	   |       x <= y	       |     x <= y;      #false |
|------------------------------------------------------------------------------------------------------------------------|
|     >=     | Greater than/Equal to |  Checks Greater than / equal to   |	     x >= y     	 |     x >= y;      #true  |
|------------------------------------------------------------------------------------------------------------------------|
| instanceof |      Instance of	     | Compares object to specified type | obj instanceof type | s intanceof main #true  |
|-----------------------------------------------------------------------------------------------------------------------|
|     ==     |       Equal to	       |        Checks if its Equal        |       x == y        |     x == y;      #false |
|------------------------------------------------------------------------------------------------------------------------|
|     !=     |       Not Equal	     |      Checks if its Not Equal      |       x != y        |     x != y;      #true  |
--------------------------------------------------------------------------------------------------------------------------

Bitwise Operators:
``````````````````
    Bitwise operators are used to performing manipulation of individual bits of a number.
|                                                                                  [x = 9, y = 8;]                      
--------------------------------------------------------------------------------------------
| Operator |       	Name          | 	       Description	           |  Syntax |  Example	 |
--------------------------------------------------------------------------------------------
|     &    |     Bitwise AND      | 1 if and only if both bits are 1 |	x & y	 | x & y; #8 |
|------------------------------------------------------------------------------------------|
|     ^	   | Bitwise Exclusive OR |   0 if both bits are the same    | 	x ^ y	 | x ^ y; #1 |
|------------------------------------------------------------------------------------------|
|     !    | Bitwise Inclusive OR |   1 if either of the bit is 1    |  x | y  | x ! y; #9 |
--------------------------------------------------------------------------------------------

Logical Operators:
``````````````````
   Logical operators are used to determine the logic between variables or values.
|                                                                                [i = random value]  [x = 5]
--------------------------------------------------------------------------------------------------------------------
|  Operator  |     Name    | 	           Description	             |        Syntax     |          Example	         |
--------------------------------------------------------------------------------------------------------------------
|     &&     | Logical AND |     Returns true if both are true     |   x < i && x < i	 |   x < 5 &&  x < 10 #true  |
|------------------------------------------------------------------------------------------------------------------|
|     ||     | Logical OR  |  Returns true if one of them is true  |   x < i || x < i	 |   x < 5 || x < 4   #true  |
|------------------------------------------------------------------------------------------------------------------|
|     !	     | Logical NOT | Reverse the result, false if its true | !(x < i && x < i) | !(x < 5 && x < 10) #false |
--------------------------------------------------------------------------------------------------------------------
  
Ternary Operators:
``````````````````
   Java ternary operator is the only conditional operator that takes three operands. 
|                                                                                                                      [x = 5, y = 10;]                         
-----------------------------------------------------------------------------------------------------------------------------------------
| Operator |   Name  | 	                    Description	                   |             Syntax            |          Example	          |
-----------------------------------------------------------------------------------------------------------------------------------------
|          |         |         If operates similarly to that of the        |         if(Expression1)       |                            |
|    ?:    | Ternary |   if-else statement as in Exression2 is executed    |   {variable = Expression2;}   | max = (n1 > n2) ? n1 : n2; |
|          |         | if Expression1 is true else Expression3 is executed.| else{variable = Expression3;} |                      # 10  |
-----------------------------------------------------------------------------------------------------------------------------------------
  
Assignment Operators:
`````````````````````
   Assignment operators are used in Java to assign values to variables.
----------------------------------------------------------------------------------
|  Operator  |              	Name                 |  Example |  Equivalent to	 |
----------------------------------------------------------------------------------
|     =	     |          Simple Assignment          | 	x = 5	  |    x = 5    #5   |
|--------------------------------------------------------------------------------|
|    +=	     |         Add AND assignment          |	x += 3	|  x = x + 3  #8   |
|--------------------------------------------------------------------------------|
|    -=      |	    Subtract AND assignment	       |  x -= 3	|  x = x - 3  #2   |
|--------------------------------------------------------------------------------|
|    *=	     |      Multiply AND assignment	       |  x *= 3	|  x = x * 3  #15  |
|--------------------------------------------------------------------------------|
|    /=	     |       Divide AND assignment	       |  x /= 3  |  x = x / 3  #1   |
|--------------------------------------------------------------------------------|
|    %=      |	    Modulus AND assignment	       |  x %=	3 |  x = x % 3  #2   |
|--------------------------------------------------------------------------------|
|    &=	     | 	    Bitwise AND assignment 	       |  x &= 3  |  x = x & 3   #1  |
|--------------------------------------------------------------------------------|
|    ^=      | Bitwise exclusive OR and assignment |  x ^= 3	|  x = x ^ 3   #6  |
|--------------------------------------------------------------------------------|
|    |=	     | Bitwise inclusive OR and assignment |  x |= 3  |  x = x | 3   #7  |
|--------------------------------------------------------------------------------|
|   <<=      |	   Left shift AND assignment       |  x <<= 3 |  x = x << 3  #40 |
|--------------------------------------------------------------------------------|
|   >>=	     |     Right shift AND assignment	     |  x >>= 3	|  x = x >> 3  #0  |
|--------------------------------------------------------------------------------|
|  >>>=      |	    Unsigned Right shift AND       | x >>>= 3 |  x = x >>> 3 #0  |
----------------------------------------------------------------------------------

Form College Lab:
`````````````````
import java.io.*;
class Learning
{
  public static void main(String args[])throws IOException
  {
    int a, b;
    DataInputStream d = new DataInputStream(System.in);
    System.out.println("Enter the Value of a");
    a = Integer.parseInt(d.readLine());
    System.out.println("Enter the Value of b");
    b = Integer.parseInt(d.readLine());
    System.out.println("a + b = " + (a+b));
    System.out.println("a - b = " + (a-b));
    System.out.println("a / b = " + (a/b));
    System.out.println("a * b = " + (a*b));
    System.out.println("a % b = " + (a%b));
    System.out.println("a > b = " + (a>b));
    System.out.println("a < b = " + (a<b));
  }
}

------------------------------------------------------------------------------------------------------------------------------------

(10) Java Keywords:
*******************
   Java keywords are also known as reserved words. Keywords are particular words that act as a key to a code. 
These are predefined words by Java so they cannot be used as a variable or object name or class name.

There are 48 Keywords in Java:
``````````````````````````````
 1. abstract  | 11. do       | 21. implements   | 31. private       | 41. this       |  - goto and const are not used
 2. boolean   | 12. double   | 22. import       | 32. protected     | 42. throw      |  
 3. break     | 13. else     | 23. instance of  | 33. public        | 43. throws     |  - the identifiers null, true and false
 4. byte      | 14. enum     | 24. int          | 34. return        | 44. transient  | denote literal values and may not be used
 5. case      | 15. extends  | 25. interface    | 35. short         | 45. try        | to create identifiers.
 6. catch     | 16. final    | 26. long         | 36. static        | 46. void       |
 7. char      | 17. finally  | 27. native       | 37. strictfp      | 47. volatile   |
 8. class     | 18. float    | 28. new          | 38. super         | 48. while      |
 9. continue  | 19. for      | 29. null         | 39. switch        |                |
10. default   | 20. if       | 30. package      | 40. synchronized  |                |

List of Java Keywords:
````````````````````````

1. abstract: 
    Java abstract keyword is used to declare an abstract class. An abstract class can provide the implementation 
of the interface. It can have abstract and non-abstract methods.

2. boolean:
    Java boolean keyword is used to declare a variable as a boolean type. It can hold True and False values only.

3. break: 
   Java break keyword is used to break the loop or switch statement. It breaks the current flow of the program at 
specified conditions.

4. byte: 
   Java byte keyword is used to declare a variable that can hold 8-bit data values.

5. case: 
   Java case keyword is used with the switch statements to mark blocks of text.

6. catch: 
   Java catch keyword is used to catch the exceptions generated by try statements. It must be used after the try block only.

7. char: 
   Java char keyword is used to declare a variable that can hold unsigned 16-bit Unicode characters

8. class: 
   Java class keyword is used to declare a class.

9. continue: 
   Java continue keyword is used to continue the loop. It continues the current flow of the program and skips the 
remaining code at the specified condition.

10. default: 
   Java default keyword is used to specify the default block of code in a switch statement.

11. do:
   Java do keyword is used in the control statement to declare a loop. It can iterate a part of the program several times.
   
12. double: 
   Java double keyword is used to declare a variable that can hold 64-bit floating-point number.

13. else: ```````````````
 1. abstract  |
   Java else keyword is used to indicate the alternative branches in an if statement.

14. enum: 
   Java enum keyword is used to define a fixed set of constants. Enum constructors are always private or default.

15. extends: 
   Java extends keyword is used to indicate that a class is derived from another class or interface.

16. final: 
   Java final keyword is used to indicate that a variable holds a constant value. It is used with a variable. 
It is used to restrict the user from updating the value of the variable.

17. finally: 
   Java finally keyword indicates a block of code in a try-catch structure. This block is always executed whether 
an exception is handled or not.

18. float:
   Java float keyword is used to declare a variable that can hold a 32-bit floating-point number.

19. for: 
   Java for keyword is used to start a for loop. It is used to execute a set of instructions/functions repeatedly 
when some condition becomes true. If the number of iteration is fixed, it is recommended to use for loop.

20. if: 
   Java if keyword tests the condition. It executes the if block if the condition is true.

21. implements: 
   Java implements keyword is used to implement an interface.

22. import: 
   Java import keyword makes classes and interfaces available and accessible to the current source code.

23. instanceof:
   Java instanceof keyword is used to test whether the object is an instance of the specified class or implements an interface.

24. int:
   Java int keyword is used to declare a variable that can hold a 32-bit signed integer.

25. interface:
   Java interface keyword is used to declare an interface. It can have only abstract methods.

26. long: 
   Java long keyword is used to declare a variable that can hold a 64-bit integer.

27. native: 
   Java native keyword is used to specify that a method is implemented in native code using JNI (Java Native Interface).

28. new:
   Java new keyword is used to create new objects.

29. null:
   Java null keyword is used to indicate that a reference does not refer to anything. It removes the garbage value.

30. package:
   Java package keyword is used to declare a Java package that includes the classes.

31. private:
   Java private keyword is an access modifier. It is used to indicate that a method or variable may be accessed only 
in the class in which it is declared.

32. protected:
   Java protected keyword is an access modifier. It can be accessible within the package and outside the package but 
through inheritance only. It can't be applied with the class.

33. public:
   Java public keyword is an access modifier. It is used to indicate that an item is accessible anywhere. It has 
the widest scope among all other modifiers.

34. return:
   Java return keyword is used to return from a method when its execution is complete.

35. short:
   Java short keyword is used to declare a variable that can hold a 16-bit integer.

36. static:
   Java static keyword is used to indicate that a variable or method is a class method. The static keyword in Java is 
mainly used for memory management.

37. strictfp:
   Java strictfp is used to restrict the floating-point calculations to ensure portability.

38. super:
   Java super keyword is a reference variable that is used to refer to parent class objects. It can be used to invoke 
the immediate parent class method.

39. switch:
   The Java switch keyword contains a switch statement that executes code based on test value. The switch statement 
tests the equality of a variable against multiple values.

40. synchronized:
   Java synchronized keyword is used to specify the critical sections or methods in multithreaded code.

41. this: 
   Java this keyword can be used to refer the current object in a method or constructor.

42. throw:
   The Java throw keyword is used to explicitly throw an exception. The throw keyword is mainly used to throw custom 
exceptions. It is followed by an instance.

43. throws:
   The Java throws keyword is used to declare an exception. Checked exceptions can be propagated with throws.

44. transient:
   Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.

45. try:
   Java try keyword is used to start a block of code that will be tested for exceptions. The try block must be followed 
by either catch or finally block.

46. void:
   Java void keyword is used to specify that a method does not have a return value.

47. volatile:
   Java volatile keyword is used to indicate that a variable may change asynchronously.

48. while:
   Java while keyword is used to start a while loop. This loop iterates a part of the program several times. 
If the number of iteration is not fixed, it is recommended to use the while loop.

--------------------------------------------------------------------------------------------------------------------------------

(11) Control Statements:-
************************
    A control statement in java is a statement that determines whether the other 
statements will be executed or not. It controls the flow of a program. 


|                                    Control Statements
|                                            |
|                    --------------------------------------------------
|                    |                       |                        |
|           Selection / Decision     Iteration / Loop               Jump
|            making Statements          Statements               Statements
|                    |                       |                        |
|          --------------------              |          ----------------------------
|          |                  |              |          |            |             |
|       if-else            switch            |        break      continue       Return
|                                            |
|                              -----------------------------
|                              |             |             |
|                             for          while       do...while

Selection Statements:
~~~~~~~~~~~~~~~~~~~~~
    The selection statement means the statements are executed depends – upon a condition.
This statement is also called a decision statement or selection statement because it helps 
in making decisions about which set of statements are to be executed.
    There is  types of Selection Statements
    (i) if Statement
   (ii) if-else Statement
  (iii) if-else-if ladder
   (iv) nested if statement

(i) if Statement:
`````````````````
    An if statement consits of a expression, which is checked and returns a Boolean value, 
if true will execute the statements in the if block.\

Syntax:
```````
if(condition)
{
  //statements
}

Example:
````````
if (10 > 5) 
{
  System.out.println("10 is greater than 5");
}

# 10 is greater than 5

/
int x = 10, y = 5;
if (x > y) 
{
  System.out.println("x is greater than y");
}

# x is greater than y
    
(ii) if-else Statement:
```````````````````````
    An if statement can be followed by an optional else statement, which executes when
the if condition is false.

Syntax:
```````
if(condition)
{
  Statement
}
else
{
  Statement
}

Example:
````````
int x = 5, y = 10;
if (x < y) 
{
  System.out.println("x is greater than y");
}
else
{
  System.out.println("y is greater than x");
}

# y is greater than 10

(iii) if-else-if ladder:
````````````````````````
    The if-else-if ladder statement executes one condition from multiple statements.

Syntax:
```````
if(condition1)
{  
  Statement1 
}
else if(condition2)
{  
  Statement2 
}  
else if(condition3)
{  
  Statement3 
}  
...  
else
{ 
  Statement4 
}
   
Example:
````````
int marks=65;  
if(marks<50)
{  
  System.out.println("fail");  
}  
else if(marks>=50 && marks<60)
{  
  System.out.println("D grade");  
}  
else if(marks>=60 && marks<70)
{  
  System.out.println("C grade");  
}  
else if(marks>=70 && marks<80)
{  
  System.out.println("B grade");  
}  
else if(marks>=80 && marks<90)
{  
  System.out.println("A grade");  
}
else if(marks>=90 && marks<100)
{  
  System.out.println("A+ grade");  
}
else
{  
  System.out.println("Invalid!");  
}  

# C grade

(iv) nested if statement:
`````````````````````````
   The nested if statement represents the if block within another if block. 
Here, the inner if block condition executes only when outer if block condition is true.

Syntax:
```````
if(condition){    
  //code to be executed    
       if(condition){  
         //code to be executed    
    }    
}  

Example:
````````
int age=20;  
int weight=80;    
//applying condition on age and weight  
if(age>=18)
{    
  if(weight>50)
  {  
    System.out.println("You are eligible to donate blood");  
  }    
}    

Switch Statement:
~~~~~~~~~~~~~~~~
   The Java switch statement executes one statement from multiple conditions. 
It is like if-else-if ladder statement. 

Syntax:
```````
switch(expression){    
case value1:    
 //code to be executed;    
 break;  //optional  
case value2:    
 //code to be executed;    
 break;  //optional  
......    
    
default:     
  code to be executed if all cases are not matched;  
}    

Example:
````````
int number=20;  
 //Switch expression  
switch(number)
{  
//Case statements  
case 10: System.out.println("10");  
break;  
case 20: System.out.println("20");  
break;  
case 30: System.out.println("30");  
break;  
//Default case statement  
default:
System.out.println("Not in 10, 20 or 30");  
}  

#20

Loop Statements:
~~~~~~~~~~~~~~~~
    The Java for loop is used to iterate a part of the program several times. 
If the number of iteration is fixed, it is recommended to use for loop.
    There are three types of fro loops in Java
   (i) for loop
  (ii) while loop
 (iii) do-while loop
 
(i) for loop:
``````````````
    The java for loop is used to iterate a part of the program several times.
If the number of iteration is fixed, it is recommended to use for loop.
   - Nested for Loop
   - for-each Loop
   - Labeled For Loop
   - Infinitive for Loop

Syntax:
```````
for(initialization; condition; increment/decrement)
{    
//statement or code to be executed    
}    

Example:
````````
for(int i=1;i<=10;i++)
{  
  System.out.println(i);  
} 

# 1 2 3 4 5 6 7 8 9 10

Nested for Loop:
````````````````
    If we have a for loop inside the another loop, it is known as nested for loop. 
The inner loop executes completely whenever outer loop executes.

Example:
````````
//loop of i  
for(int i=1;i<=3;i++){  
//loop of j  
for(int j=1;j<=3;j++){  
        System.out.println(i+" "+j);  
}//end of i  
}//end of j

#
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3

Pyramid Example:
`````````````````
for(int i=1;i<=5;i++){  
for(int j=1;j<=i;j++){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}

#
* 
* * 
* * * 
* * * * 
* * * * * 

int term=6;  
for(int i=1;i<=term;i++){  
for(int j=term;j>=i;j--){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}  

#
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
*  

for-each Loop:
``````````````
   The for-each loop is used to traverse array or collection in Java. It is easier to use 
than simple for loop because we don't need to increment value and use subscript notation.

Syntax:
```````
for(data_type variable : array_name)
{    
//code to be executed    
}    

Example:
````````
//Declaring an array  
  int arr[]={12,23,44,56,78};  
//Printing array using for-each loop  
  for(int i:arr)
  {  
    System.out.println(i);  
  }  

#
12
23
44
56
78

Labeled For Loop:
`````````````````
   We can have a name of each Java for loop. To do so, we use label before the for loop. 
It is useful while using the nested for loop as we can break/continue specific for loop.

Syntax:
```````
labelname:    
for(initialization; condition; increment/decrement)
{    
//code to be executed    
}    

Example:
````````
aa:  
 for(int i=1;i<=3;i++)
 {  
  bb:  
    for(int j=1;j<=3;j++)
    {  
      if(i==2&&j==2)
      {  
        break bb;  
      }  
      System.out.println(i+" "+j);  
    }  
  } 

#
1 1
1 2
1 3
2 1
3 1
3 2
3 3

Infinitive for Loop:
````````````````````
    If you use two semicolons ;; in the for loop, it will be infinitive for loop.

Syntax:
```````
for(;;)
{  
//code to be executed  
}  

Example:
````````
for(;;)
{  
  System.out.println("infinitive loop");  
}  

#
infinitive loop
infinitive loop
infinitive loop
infinitive loop
infinitive loop
ctrl+c


(ii) while loop:
~~~~~~~~~~~~~~~~
    The Java while loop is used to iterate a part of the program repeatedly until 
the specified Boolean condition is true. As soon as the Boolean condition becomes false, 
the loop automatically stops.

    The while loop is considered as a repeating if statement. If the number of iteration is not fixed, 
it is recommended to use the while loop.
   - Infinitive While Loop

Syntax:
```````
while (condition){    
//code to be executed   
Increment / decrement statement  
}    

Example:
````````
int i=1;  
  while(i<=10)
  {  
    System.out.println(i);  
    i++;  
  }  

# 
1
2
3
4
5
6
7
8
9
10

Infinitive While Loop:
`````````````````````
    If you pass true in the while loop, it will be infinitive while loop.

Syntax:
```````
while(true)
{  
//code to be executed  
}  

Example:
````````
while(true)
{    
  System.out.println("infinitive while loop");    
}  
# 
infinitive while loop
infinitive while loop
infinitive while loop
infinitive while loop
infinitive while loop
ctrl+c

(iii) do-while loop:
~~~~~~~~~~~~~~~~~~~~
    The Java do-while loop is used to iterate a part of the program repeatedly, 
until the specified condition is true. If the number of iteration is not fixed and you 
must have to execute the loop at least once, it is recommended to use a do-while loop.

Java do-while loop is called an exit control loop. Therefore, unlike while loop and for loop, 
the do-while check the condition at the end of loop body. The Java do-while loop is executed at 
least once because condition is checked after loop body.

Syntax:
```````
do{    
//code to be executed / loop body  
//update statement   
}
while (condition);  

Example:
````````
 int i=1;    
    do{    
        System.out.println(i);    
    i++;    
    }while(i<=10);   

# 
1
2
3
4
5
6
7
8
9
10
 
Infinitive do-while Loop:
``````````````````````````
    If you pass true in the do-while loop, it will be infinitive do-while loop.
 
Syntax:
```````
do{  
//code to be executed  
}
while(true);  

Example:
````````    
do{  
    System.out.println("infinitive do while loop");  
  }
while(true);  

#
infinitive do while loop
infinitive do while loop
infinitive do while loop
ctrl+c


Jump Statement:
~~~~~~~~~~~~~~~
    Jump statements are used to transfer the control of the program to the specific statements. 
In other words, jump statements transfer the execution control to the other part of the program. 
There are two types of jump statements in Java. 
   (i) break
  (ii) continue
 (iii) return

(i) Break Statement:
````````````````````
    When a break statement is encountered inside a loop, the loop is immediately terminated and the program 
control resumes at the next statement following the loop.

The Java break statement is used to break loop or switch statement. It breaks the current flow of the program 
at specified condition. In case of inner loop, it breaks only inner loop.

We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.

Syntax:
```````
jump-statement;    
break;  

Example:
````````
//using for loop  
for(int i=1;i<=10;i++)
{  
  if(i==5)
  {  
  //breaking the loop  
    break;  
  }  
  System.out.println(i);  
}  

#
1
2
3
4

(ii) Continue Statement:
`````````````````````````
The continue statement is used in loop control structure when you need to jump to the next 
iteration of the loop immediately. It can be used with for loop or while loop.

The Java continue statement is used to continue the loop. It continues the current flow of 
the program and skips the remaining code at the specified condition. In case of an inner loop, 
it continues the inner loop only.

We can use Java continue statement in all types of loops such as for loop, while loop and do-while loop.

Syntax:
```````
jump-statement;    
continue;   

Example:
````````
//for loop  
for(int i=1;i<=10;i++)
{  
  if(i==5)
  {  
    //using continue statement  
    continue;//it will skip the rest statement  
  }  
  System.out.println(i);  
}  

#
1
2
3
4
6
7
8
9
10

(iii) Return Statement:
```````````````````````
    The return statement is a control flow statement that terminates the execution of method and
return control to its caller
    When return type of any method is void then the method does not return anything

Syntax:
```````
return returnvalue;  

Example:
`````````
public class SampleReturn1   
{  
    // Method with an integer return type and no arguments 
    public int CompareNum()   
    {   
        int x = 3;  
        int y = 8;  
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }  
      
    //Driver Code   
    public static void main(String ar[])   
    {  
        SampleReturn1 obj = new SampleReturn1();  
        int result = obj.CompareNum();  
        System.out.println("The greater number among x and y is: " + result);  
    }  
}  

#
x = 3
y = 8
The greater number among x and y is: 8

---------------------------------------------------------------------------------------------------------------------------------
(12) Methods in Java:
**********************
    A Method has a group of statements
    Re-usabilithy of block of code minimizes redundancy
    A class may have multiple methods
    A method returns a null or a value using the return statement

Syntax:
```````
public int demo(int a, int b)
{
  System.out.println(a+""+b);
}
return a;
}

In this

public -  Modifier - It defines the access type of the method.

int - Return Type - Method may return a value.

demo - Name of Method - This is the method name.

(int a, int b) - Parameter List(Optional) - The list of paramenters, it is the type, order and 
|                                           number of paramenters of a method.

{                                   |
  System.out.println(a+""+b);       |
}                                   |-- Method body - The method body defines what the method does with the statements.
return a;                           |
}                                   |

Call By Value:
``````````````
    In the Call by Value method of passing arguments to a function copies the actual value of an argument into the
formal parameter of a function.
   There is only call by value in java, not call by reference. If we call a method passing a value, it is known as 
call by value. The changes being done in the called method, is not affected in the calling method.

Example:
````````
class Operation{  
 int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
   Operation op=new Operation();  
  
   System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  
  
 }  
}  

#
before change 50
after change 50		

---------------------------------------------------------------------------------------------------------------------------------

(13) Java Arrays:-
*******************

    Arrays are used to solve the problem of storing multiple elements of the same Data Type.
    
    - An Array is a group of like-typed variables, that are referred to by a common name
    - Specific element in an array is accessed by it's index
    - Array size is fixed and can not be changed

|                       ---------------------
|                       | 87 | 60 | 70 | 80 | <-- Values of elements
|                       ---------------------
| Every Array starts--> |  0 | 1  | 2  | 3  | <-- Index of elements
|  with index zero      ---------------------
|                       |-------------------|
|                                 |
|                      The elements from array   
|                       can be accessed using
|                       their respective index

Array Declaration:
``````````````````
    Arrays are created either using the new operator or by array initializer

|         new operator                  array initializer
|     int [] a = new int[5];          int[]a = {2,4,6,8,10};

Different ways of declaring arrays:

1. int a [] = new int [10];

2. int [] b = new int [5];

3. int c [] = {1,2,3,4,5};

4. int [] d = new int [] {1,2,3,4,5};

   The length of an array is set, when it is declared
   When an array is declared, array index gets initialized

Example:
````````
int x [] = new int[20];
System.out.println(x.length);

# 20

Types of Array in java:
```````````````````````
   There are two types of array.
    - Single Dimensional Array
    - Multidimensional Array

One Dimensional Array:
``````````````````````
   One Dimensional Array in java is always used with only one subscript([]). 
A one-dimensional array behaves likes a list of variables. You can access the 
variables of an array by using an index in square brackets preceded by the name 
of that array. Index value should be an integer.

Memory Allocation:
``````````````````
  int [] a = new int [5];

  Integer value requires 4 Bytes to allocate a variable in memory. So, to allocate
an array of 5 elements in memory 4*5=20 Bytes are required.

Syntax:
```````
dataType[] arr; (or)  
dataType []arr; (or)  
dataType arr[];  

Example:
````````
class Testarray{  
public static void main(String args[]){  
int a[]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}}  

#
10
20
70
40
50

Multi Dimensional Array;
````````````````````````
     A multi-dimensional array is an array that has more than one dimension. ... A 2D array 
is also called a matrix, or a table of rows and columns. Declaring a multi-dimensional array 
is similar to the one-dimensional arrays.   

Memory Allocation:
``````````````````
  int [] [] a = new int [5][5];

  Total number of elements in given Multi Dimensional Array = 5*5=25. So, 25*4=100 Bytes
are required to allocate these elements in memory.

Syntax:
```````
dataType[][] arrayRefVar; (or)  
dataType [][]arrayRefVar; (or)  
dataType arrayRefVar[][]; (or)  
dataType []arrayRefVar[];   

Example:
````````
class Testarray{  
public static void main(String args[]){  
//declaring and initializing 2D array  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
//printing 2D array  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
}}  

#
1 2 3
2 4 5
4 4 5

Addition of 2 Matrices in Java
``````````````````````````````
class Testarray{  
public static void main(String args[]){  
//creating two matrices  
int a[][]={{1,3,4},{3,4,5}};  
int b[][]={{1,3,4},{3,4,5}};  
  
//creating another matrix to store the sum of two matrices  
int c[][]=new int[2][3];  
  
//adding and printing addition of 2 matrices  
for(int i=0;i<2;i++){  
for(int j=0;j<3;j++){  
c[i][j]=a[i][j]+b[i][j];  
System.out.print(c[i][j]+" ");  
}  
System.out.println();//new line  
}    
}
}  

#
2 6 8 
6 8 10

------------------------------------------------------------------------------------------------------------------------------

(14) Java Strings:-
*******************

    Java String is a sequence of characters. They are objects of type String Class.
Onve a String object is created, it can not be changed. Strings are immutable.

Different ways to declaring a String:
`````````````````````````````````````
char c[] = {'a','b','c'};
String str = new String(); - String creation using new keyword
String str1 = "Shiffana!"; - String creation using literals

Immutability Of Strings:
````````````````````````
    Java Strings are immutable for several reasons

  (i) Security:
        Strings are used for network connection and for database connection. To avoid the 
access to these connections from external users, Strings are immutable.

 (ii) Synchronization:
        Immutability of Strings automatically makes system thread safe to solve the 
synchronization problem.

(iii) Caching:
        If two String objects are having the same value, and you need only one string, then
the two objects will point to the same memory location pointing same String object.

String Pool:
````````````
    String Pool used in Java is a pool of strings stored in Java Heap Memory. 
    String Pool is possible only because Strings are immutable.
    String Pool helps in saving lot of space for Java Runtime.

|               | H | E | L | L | O |
|           |H|O|W| |A|R|E| |Y|O|U|?|?|?| 

  The String Pool can contain multiple Strins but a heap memory can have only one String Pool 

Memory Allocation:
```````````````````
    The String is not a primitive data type                                      |    Stack          
    The Java Strings are stored in the String Pool of the heap area              |    Heap
|                                                                                | Data Section
    String s = "Hello";                                                          | Code Section
        When we create object of string, then object name(variable) will be stored in Stack Portion,
and the value we are assigning to that variable will be stored in String Pool(portion of heap memory)

String Operations:
``````````````````
  compareTo() -
      String s1 = "Hello";
      String s2 = "Heldo";
      System.out.println(s1.compareTo(s2));

      # 8

  isEmpty() - 
      String s4 = "";
      System.out.println(s4.isEmpty());
      
      # true

  toLowerCase() - 
      String s1 = "Hello";
      System.out.println(s1.toLowerCase());

      # hello

  toUpperCase() - 
      String s1 = "Hello";
      System.out.println(s1.toUpperCase());
      
      # HELLO

  valueOf() -
      int a = 50;
      String s = String.valueOf(a);
      System.out.println(s);
      
      # 50

  replace() -
      String s2 = "Heldo";
      String replace = s2.replace('d','l');
      System.out.println(replace);
      
      # Hello
      
  contains() -
      String s2 = "Heldo";
      String replace = s2.replace('d','l');
      System.out.println(replace.contains("d"));
      
      # false

  equals() - 
      String x = "Start Learning";
      String y = "StArT LeArNiNg";
      System.out.println(x.equals(y));
      
      # false

  charAt() -
      String x = "Start Learning";
      System.out.println(x.charAt(3));  

      # r

  endsWith() -
      String x = "Start Learning";
      System.out.println(x.endsWith("u"));
      
      # false

StringBuffer:
`````````````
    Java StringBuffer is used to create mutable string, i.e. Memory allocated to a string
is not fixed, it can change. It is Synchronous in nature i.e. Thread Safe.

Example:
````````
StringBuffer s = new StringBuffer("Happy Learning");
System.out.println(s);

# Happy Learing

s.append(" Shiffana");
System.out.println(s);

# Happy Learning Shiffana

s.insert(0,'*');
System.out.println(s);

# *Happy Learning

s.replace(0,2,"H@P");
System.out.println(s);

# H@Pppy Learning

s.delete(0,1);
System.out.println(s);

# appy Learning

System.out.println(s.reverse());
System.out.println(s.capacity());

# gninraeL yppaH
  30

StringBuilder:
``````````````
    The Java StringBuilder class is used to create mutable Strin. But, StringBuilder
class is non-synchronized i.e. it is not Thread Safe. Therefore StringBuilder is faster.
Example:
````````
StringBuilder s = new StringBuilder("Happy Learning");
System.out.println(s);

# Happy Learing

s.append(" Shiffana");
System.out.println(s);

# Happy Learning Shiffana

s.insert(0,'*');
System.out.println(s);

# *Happy Learning

s.replace(0,2,"H@P");
System.out.println(s);

# H@Pppy Learning

s.delete(0,1);
System.out.println(s);

# appy Learning

System.out.println(s.reverse());
System.out.println(s.capacity());

# gninraeL yppaH
  30

Difference Between StringBuffer and StringBuilder:
```````````````````````````````````````````````````
 - String Buffer can be accessed by multiple threads at a time
 - Slower as compared to StringBuilder  

 - Stringbuilder can be accessed by single thread at a time
 - Faster than StringBuffer

----------------------------------------------------------------------------------------------------------------------------------- 

(15) Java Classes And Objects:-
*******************************
    Java is an Object Oriented and Class based programming language.
    - A Class is a blueprint which includes all the data. It describes the state and 
behaviour of a specific object.
    - An Object is an instance of class which contains variables and methods.
For example:
    Phone is a Class and Rotary Phone, Touch Phone and Cellular Phone are the 
Object of the Class

Attributes:
```````````
    In computing, an attribute is a specification that defines a property of an object,
element, ot file. It may also refer to or set the specific value for a given instance of such.

   Class -                   Object - 
      Student         Student s = new Student();
       Id
       First name
       Last name
       Address
       Contact Number
       Grade

There are two types of Attributes:
 - Built-in Class Attributes
 - Attributes defined by Users

Java Naming Conventions:
`````````````````````````
1. Class Name - It should start with uppercase letter and it should be a noun.

2. Interface Name - It should start with uppercase letter and it should be an adjective.

3. Method Name - It should start with lowercase letter and it should be a verb

4. Variable Name - It should start with lowercase letter.

5. Constant Name - It should start with uppercase letter.

Types of Variables:
```````````````````
Local Variables - Local variables are declared within the method of a class.

Instance Variables - Instance variable are declared in a class but outsid a method, 
|                                                             constructor or any block.
                                                            
Class Variable - Class / static variable has only one copy that is shared by all the 
|                                                          different objects of a class.

Example:
````````
//Class
class Demo
{
  //Method inside a class
  void printMessage()
  {
    System.out.println("Welcome to the Class");
  }
}
public class Defclass
{
  public static void main(String[] args)
  {
    //Creatin an Object of a class
    Demo d = new Demo();
    d.printMessage();
  }
}

# Welcome to the Class

----------------------------------------------------------------------------------------------------------------------------------- 

(16) Java Constructors:-
************************
      Constructor is used in the creation of an object.
      It is the block of code used to initialize an object.
      Constructor must have the same name as the class it is in and it does not have any return type
      Constructor gets executed when an object of a class is being created
      Constructor are of two types
       - default constructor
       - parameterized constructor

Difference Between Constructor and Method:
``````````````````````````````````````````
|          Constructor         |             Method         |        
|-----------------------------------------------------------|
| Constructor must not have return type
| Constructor name must be same as the class name
| Constructor is used to initialize the state of an 
|      object
|Constructor is invoked implicity
|
|

*/


/*

``````````````````````
Syntax:
```````

Example:
````````

public class Learning 
{
  public static void main(String[] args) 
  {
    System.out.println("Hello World");
  }
}



Method Overloading:
```````````````````
    A class may define multiple methods with the same name and return type, but different number of arguments
or arguments of different data types. This is called Method Overloading.

*/
public class Learning 
{
  public static void main(String[] args) 
  {
    StringBuffer s = new StringBuffer("Happy Learning");
    System.out.println(s.reverse());
System.out.println(s.capacity());
  }
}
