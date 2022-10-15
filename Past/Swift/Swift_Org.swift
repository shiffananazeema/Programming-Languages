/*
         Swift
         `````
 - New Programming language for iOS, macOS, watchOS and tvOS app Development.
 - It is a type-safe Language. 
 - It doesn't require Semicolons (;), you can use it if you wish
---------------------------------------------------------------------------------------------------------

    1. Constants and Variables
    2. Type Annotations
    3. Printing
    4. Type Safety and Type Inference
    5. Type Aliases
    6. Optionals
    7. Error Handling
    8. Assertions and Preconditions
    9. Terminology
   10. Assignment Operator
   11. Arithmetic Operators
   12. Comparison Operators
   13. Ternary Conditional Operator
   14. Nil-Coalescing Operator
   15. Range Operators
   16. Logical Operators
   17. Arrays
   18. Sets

---------------------------------------------------------------------------------------------------------

1. Constants and Variables
   ```````````````````````
    - Constants with "let" keyword and Variables with "var" keyword
Eg: 
   let maximumNumberofLoginAttempts = 10
   var currentLoginAttempt = 0

    - Multiple values in single line.
Eg:
   var x = 0, y = 1, z = 2

    - Changing the value in variable
Eg:
   var friendlyWelcome = "Hello!"
   friendlyWelcome = "Bonjour!"

Note:
`````
    If a stored value in your code won't change, always declare it as a 
constant with the let keyword. Use variables only for storing values that
need to be able to change.
---------------------------------------------------------------------------------------------------------

2. Type Annotations
   ````````````````
    - Declaring the Kind/Type of the value to be stored in the constant or variable.
Eg:
   var welcomeMessage: String
   welcomeMessage = "Hello"

    - Multiple values in single line.
Eg:
   var red, green, blue: Double

Note:
`````
    In the welcomeMessage example above, no initial value is provided, and 
so the type of the welcomeMessage variable is specified with a type annotation 
rather than being inferred from an initial value.
---------------------------------------------------------------------------------------------------------

3. Printing 
   ````````
    print(friendlyWelcome)

String Interpolation:-
````````````````````
    print("The current value of friendlyWelcome is \(friendlyWelcome)")
    # The current value of friendlyWelcome is Bonjour!
---------------------------------------------------------------------------------------------------------

4. Type Safety and Type Inference
   ``````````````````````````````
    - Type checking helps to avoid errors while working with different types of values.
    - It doesn't mean you have to specify every constant and variables.
    - If you don't specify the type of the value, Swift use type inference to work out the appropriate type.
    - Type inference enables a compiler to deduce the type of a particular expression automatically when it compiles the code.
Eg:
   let number = 10 - Int
   let pi = 3.14159 - Double (If you didn't declare the float it will automatically take it as a double)
---------------------------------------------------------------------------------------------------------

5. Type Aliases
   ````````````
    - It define an alternative name for an existing type.
Eg:
   typealias EmployeeName = String
   let name:String = "Alex"   
   let name:EmployeeName = "Alex"  
---------------------------------------------------------------------------------------------------------

6. Optionals
   `````````
    - Optionals is used in situations where a value may be absent.
    - Optional represents two possibilities - Either there is a value and you can unwarap the 
|                                                optional to access that value, or there isn't a value at all.
Eg:
   var someValue:Int?
   var someAnotherValue:Int!
   print(someValue)                # nil
   print(someAnotherValue)         # nil

   let someValue:Int? = 5
   print(someValue)                # Optional(5) 
   print(someValue!)               # 5

   let someValue:Int! = 5
   print(someValue)                # 5

   let possibleString: String? = "An optional string."
   let forcedString: String = possibleString! // requires an exclamation point

   let assumedString: String! = "An implicitly unwrapped optional string."
   let implicitString: String = assumedString // no need for an exclamation point
---------------------------------------------------------------------------------------------------------

7. Error Handling
   ``````````````
    - Error Handling is used to respond to error conditions your program may encounter during execution.
Eg:
   func canThrowAnError() throws {
    // this function may or may not throw an error
   }

   do {
    try canThrowAnError()
    // no error was thrown
   } catch {
    // an error was thrown
   }
---------------------------------------------------------------------------------------------------------

8. Assertions and Preconditions
   ````````````````````````````
    - Assertions help you find mistakes and incorrect assumptions during development, 
|                                             and preconditions help you detect issues in production.
    - Assertions are checked only in debug builds, but preconditions are checked in both debug and production builds.

Eg:
   let age = -3
   assert(age >= 0, "A person's age can't be less than zero.")
   // This assertion fails because -3 isn't >= 0.

   if age > 10 {
       print("You can ride the roller-coaster or the ferris wheel.")
   } else if age >= 0 {
       print("You can ride the ferris wheel.")
   } else {
       assertionFailure("A person's age can't be less than zero.")
   } 

   
   // In the implementation of a subscript...
   precondition(index > 0, "Index must be greater than zero.")
---------------------------------------------------------------------------------------------------------

9. Terminology
   ```````````
    - Operators are unary, binary, or ternary
    - Unary operators operate on a single target (such as -a).
    - Binary operators operate on two targets (such as 2 + 3).
    - Ternary operators operate on three targets (a ? b : c).
---------------------------------------------------------------------------------------------------------

10. Assignment Operator
    ````````````````````
    - The assignment operator (a = b) initializes or updates the value of a with the value of b.
Eg:
    let b = 10
    var a = 5
    a = b
    // a is now equal to 10
---------------------------------------------------------------------------------------------------------

11. Arithmetic Operators
    ````````````````````
    - Addition (+)
    - Subtraction (-)
    - Multiplication (*)
    - Division (/)
Eg:
   1 + 2       // equals 3
   5 - 3       // equals 2
   2 * 3       // equals 6
   10.0 / 2.5  // equals 4.0

   "hello, " + "world"  // equals "hello, world"
---------------------------------------------------------------------------------------------------------

12. Comparison Operators
    ````````````````````
    - Equal to (a == b)
    - Not equal to (a != b)
    - Greater than (a > b)
    - Less than (a < b)
    - Greater than or equal to (a >= b)
    - Less than or equal to (a <= b)
Eg: 
   1 == 1   // true because 1 is equal to 1
   2 != 1   // true because 2 isn't equal to 1
   2 > 1    // true because 2 is greater than 1
   1 < 2    // true because 1 is less than 2
   1 >= 1   // true because 1 is greater than or equal to 1
   2 <= 1   // false because 2 isn't less than or equal to 1


   let name = "world"
   if name == "world" {
       print("hello, world")
   } else {
       print("I'm sorry \(name), but I don't recognize you")
   }
   // Prints "hello, world", because name is indeed equal to "world".
---------------------------------------------------------------------------------------------------------

13. Ternary Conditional Operator
    ````````````````````````````
    - question ? answer1 : answer2
    - if question {
         answer1
      } else {
         answer2
      }
Eg:
   let contentHeight = 40
   let hasHeader = true
   let rowHeight: Int
   if hasHeader {
       rowHeight = contentHeight + 50
   } else {
       rowHeight = contentHeight + 20
   }
   // rowHeight is equal to 90
---------------------------------------------------------------------------------------------------------

14. Nil-Coalescing Operator
    ```````````````````````
    - The nil-coalescing operator (a ?? b) unwraps an optional a if it contains a value,
|                                                            or returns a default value b if a is nil. 
    - The expression a is always of an optional type. The expression b must match the type that’s stored inside a.
Eg:
   a != nil ? a! : b
   
   let defaultColorName = "red"
   var userDefinedColorName: String?   // defaults to nil
   var colorNameToUse = userDefinedColorName ?? defaultColorName
   // userDefinedColorName is nil, so colorNameToUse is set to the default of "red"
---------------------------------------------------------------------------------------------------------

15. Range Operators
    ```````````````
    - Swift includes several range operators, which are shortcuts for expressing a range of values.

    - The closed range operator (a...b) defines a range that runs from a to b, and includes the values a and b. 
Eg:
   for index in 1...5 {
       print("\(index) times 5 is \(index * 5)")
   }
   // 1 times 5 is 5
   // 2 times 5 is 10
   // 3 times 5 is 15
   // 4 times 5 is 20
   // 5 times 5 is 25

    - The half-open range operator (a..<b) defines a range that runs from a to b, but doesn’t include b. 
Eg:
   let names = ["Anna", "Alex", "Brian", "Jack"]
   let count = names.count
   for i in 0..<count {
       print("Person \(i + 1) is called \(names[i])")
   }
   // Person 1 is called Anna
   // Person 2 is called Alex
   // Person 3 is called Brian
   // Person 4 is called Jack
---------------------------------------------------------------------------------------------------------

16. Logical Operators
    `````````````````
    - Logical operators modify or combine the Boolean logic values true and false. 
    - Logical NOT (!a)
    - Logical AND (a && b)
    - Logical OR (a || b)

    - The logical NOT operator (!a) inverts a Boolean value so that true becomes false, and false becomes true.
Eg:
   let allowedEntry = false
   if !allowedEntry {
       print("ACCESS DENIED")
   }
   // Prints "ACCESS DENIED"

    - The logical AND operator (a && b) creates logical expressions where both values must be true
|                                                                    for the overall expression to also be true.
Eg:
   let enteredDoorCode = true
   let passedRetinaScan = false
   if enteredDoorCode && passedRetinaScan {
       print("Welcome!")
   } else {
       print("ACCESS DENIED")
   }
   // Prints "ACCESS DENIED"

    - The logical OR operator (a || b) is an infix operator made from two adjacent pipe characters.
Eg:
   let hasDoorKey = false
   let knowsOverridePassword = true
   if hasDoorKey || knowsOverridePassword {
       print("Welcome!")
   } else {
       print("ACCESS DENIED")
   }
   // Prints "Welcome!"

Combining Logical Operators
````````````````````````````
   if enteredDoorCode && passedRetinaScan || hasDoorKey || knowsOverridePassword {
       print("Welcome!")
   } else {
       print("ACCESS DENIED")
   }
   // Prints "Welcome!"
---------------------------------------------------------------------------------------------------------

17. Arrays
    ``````
    - An array stores values of the same type in an ordered list.
var shoppingList = ["Carrot","Banana","Mango"]

shoppingList.append("Tomato")
shoppingList.insert("Maple Syrup", at: 0)
shoppingList += ["Beans"]
let mapleSyrup = shoppingList.remove(at: 0)


if shoppingList.isEmpty{
    print("There is nothing to buy")
} else {
print("You have to buy \(shoppingList.count) items. They are \(shoppingList)")
}

for item in shoppingList{
    print(item)
}

for (index, value) in shoppingList.enumerated() {
    print("Item \(index + 1): \(value)")
}
---------------------------------------------------------------------------------------------------------

18. Sets
    ````
    - A set stores distinct values of the same type in a collection with no defined ordering. 

    let oddDigits: Set = [1, 3, 5, 7, 9]
    let evenDigits: Set = [0, 2, 4, 6, 8]
    let singleDigitPrimeNumbers: Set = [2, 3, 5, 7]

    oddDigits.union(evenDigits).sorted()
    // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    oddDigits.intersection(evenDigits).sorted()
    // []
    oddDigits.subtracting(singleDigitPrimeNumbers).sorted()
    // [1, 9]
    oddDigits.symmetricDifference(singleDigitPrimeNumbers).sorted()
    // [1, 2, 9]
*/

 - Can't do it anymore. Practise 