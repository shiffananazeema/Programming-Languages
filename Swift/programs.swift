// Printall the Values
// ````````````````````
// for i in 1...10{
//     print(i)
// }

// let values = [5,6,7,2,4,9,0,3,1,8]
// for value in values {
//     print(value)
// }

// Getting the value from the user
// ````````````````````````````````
// var name = readLine()
// print("Hello \(name!), Hope you are Learning Swift.")

// Sorting
// ````````
// var values = [5,6,7,2,4,9,0,3,1,8]
// let sortedvalue = values.sorted{ $0 < $1}
// print(sortedvalue)
//or
// values.sort(by: <)
// print(values)
//or
// values.sort()
// print(values)

// Odd or even
// ```````````
// var num = 5
// if num % 2 == 0 {
//     print("\(num) is Even Number")
// } else {
//     print("\(num) is Odd Number")
// }


// Palindrome
// ``````````
// var name: String = "Madam"
// if name == String(name.reversed()){
//     print("\(name) is Palindrome")
// } else {
//     print("\(name) is not Palindrome")
// }


// Reverse
// ````````
// let name: String = "shiffana"
// var reversedname = String(name.reversed())
// print(reversedname)


// Compare
// ````````
// var name1 = "Sana"
// var name2 = "sana"
// if name1 == name2{
//     print("\(name1) is equal to \(name2)")
// } else {
//     print("\(name1) is not equal to \(name2)")
// }


// Check if it is Empty
// ````````````````````
// var name = ""
// if name.isEmpty {
//     print("Name is Empty")
// } else {
//     print("The Name is \(name)")
// }


// Aritmetic Operations
// ````````````````````
// var num1 = 6
// var num2 = 4
// print( "Addition: ", num1 + num2 )
// print( "Subtraction: ", num1 - num2 )
// print( "Multiplication: ", num1 * num2 )
// print( "Division: ", num1 / num2 )
// print( "Remainder: ", num1 % num2 )

// var num1 = readLine()
// var num2 = readLine()
// let n1 = Int(num1!)
// let n2 = Int(num2!)
// print( "Addition: ", n1! + n2! )

// To find the place on the value
// ``````````````````````````````
// let names = ["Sanofer", "Sana", "Guru", "Maddy", "Peter", "Arshan"]
// for (index, element) in names.enumerated(){
//     print("\(element) is in the place \(index)")
// }


// Largest of an array
// ````````````````````
// let num = [2,5,6,3,1,8,4,9,0,7]
// let largestNumber = num.max()
// print(largestNumber!)

// Filter
// ``````
// var num = [2,5,6,3,1,8,4,9,0,7]
// var filtered = num.filter({ $0 % 2 != 0})
// print(filtered)

func fact(_ n: Int) -> Int {
    return !n < 2 ? 1 : !n*fact(!n - 1)
}
print(fact(Int(readLine()!)))