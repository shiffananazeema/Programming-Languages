import Foundation

//1. Compare two strings
let str1 = "Hello, world!"
let str2 = "I love Swift."
let str3 = "Hello, world!"

// compare str1 and str2
print(str1 == str2)

// compare str1 and str3
print(str1 == str3)

//2. Join Two Strings

// var greet = "Hello, "
// var name = "Shiffana"

// // using the append() method
// greet.append(name)
// print(greet)

// // using + operator
// var result = greet + name
// print(result)

// //using =+ operator
// greet +=  name
// print(greet)

//3. Length of the String
let message = "Hello, World!"

// // count length of a string
// print(message.count) 

// //Other Built-in functions
// print(message.isEmpty)

let myName = "shiffana nazeema"
print(myName.capitalized)
print(myName.uppercased())
print(myName.lowercased())
print(myName.hasPrefix("s"))
print(myName.hasSuffix("a"))

// print("Enter your favorite programming language:")
// let name = readLine()

// print("Your favorite programming language is \(name!).")

// print("Enter Your Age")
// var age = readLine()
// print("Your Age is \(age!)")

// print("Enter your name : ")
// if let input = readLine() {
//     print("Hello \(input)!")
// }

// program to check if a number is positive, zero, or negative
let num = -3

let result = (num == 0) ? "Zero" : ((num > 0) ? "Positive" : "Negative")

print("The number is \(result).")


// for i in stride(from: 1, to: 100, by: 2) {
//     print(i)
// }

// program to display numbers

var i = 1, n = 5

// repeat...while loop from 1 to 5
repeat {
  
  print(i)

  i = i + 1

} while (i <= n)


// // Swift program to display 7 days of 2 weeks

// // outer loop
// for week in 1...2 {
//   print("Week: \(week)")

// // inner loop
//     for day in 1...7 {
//       print("  Day:  \(day)")
  
//    }

// // line break after iteration of outer loop
//    print("")
// }

var num1 = [1,2,3]
num1[0] = 0
print(num1)

var num2 = [0,1,2,3]
num2.remove(at: 0)
print(num2)

// let other = ["Dad","Mom","Bro","Sis","Me"]
// other.shuffled()
// print(other)
