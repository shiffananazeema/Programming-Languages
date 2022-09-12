import Foundation

// var shoppingList = ["Carrot","Banana","Mango"]

// shoppingList.append("Tomato")
// shoppingList.insert("Maple Syrup", at: 0)
// shoppingList += ["Beans"]
// let mapleSyrup = shoppingList.remove(at: 0)


// if shoppingList.isEmpty{
//     print("There is nothing to buy")
// } else {
// print("You have to buy \(shoppingList.count) items. They are \(shoppingList)")
// }

// for item in shoppingList{
//     print(item)
// }

// for (index, value) in shoppingList.enumerated() {
//     print("Item \(index + 1): \(value)")
// }

// var shoppingList: Set = ["Carrot","Banana","Mango"]
// print("You have to buy \(shoppingList.count) items. They are \(shoppingList)")

// let things = ["pen", "pencil", "Stop"] 

// for item in things{
//     print ("Hello \(item)")
// }

// let numberOfThings = ["Pen" : 8, "Pencile" : 2]
// for (name, number) in numberOfThings {
//     print("\(name)s have \(number) things")
// }

// for index in 1...5 {
//     print("\(index) times 5 is \(index * 5)")
// }

// let base = 3
// let power = 10
// var answer = 1
// for _ in 1...power {
//     answer *= base
// }
// print("\(base) to the power of \(power) is \(answer)")

// func greet(person){
//     let greeting = "Hello, " + person + "!"
//     return greeting
// }
// print(greet(person: "Shiffana"))

// func greet(person: String) -> String{
//     return "Hello, " + person + "..."
// }
// print(greet(person: "Shiffana"))

// func greet(person: String, samePerson: Bool) -> String{
//     if samePerson{
//         return "Welcome Back," + (person) + "..."
//     }else{
//         return "Hi," + (person)
//     }
// }
// print(greet(person: "Shiffana", samePerson: true))
// print(greet(person: "Sana", samePerson: false))


// func greet(person: String){
//     print("Hello " + person)
// }
// greet(person: "Shiffana")

// func greet(person: String, samePerson: Bool){
//     if samePerson{
//         print("Welcome Back, \(person)...")
//     }else{
//         print("Hi, \(person)")
//     }
// }
// greet(person: "Shiffana", samePerson: true)
// greet(person: "Sana", samePerson: false)

// func greeting(for person: String) -> String {
//     return "Hello, " + person + "!"
// }
// print(greeting(for: "Dave"))

// func greet(person: String, from hometown: String) -> String {
//     return "Hello \(person)!  Glad you could visit from \(hometown)."
// }
// print(greet(person: "Bill", from: "Cupertino"))
//-------------------------------------------------------------------------------------
// func chooseStepFunction(backward: Bool) -> (Int) -> Int {
//     func stepForward(input: Int) -> Int { return input + 1 }
//     func stepBackward(input: Int) -> Int { return input - 1 }
//     return backward ? stepBackward : stepForward
// }
// var currentValue = -4
// let moveNearerToZero = chooseStepFunction(backward: currentValue > 0)
// while currentValue != 0 {
//     print("\(currentValue)... ")
//     currentValue = moveNearerToZero(currentValue)
// }
// print("zero!")
//---------------------------------------------------------------------------------------

// let names = ["Chris", "Anna", "Tom", "Sana", "Benjamin", "Dane"]

// func backward( s1: String, s2: String) -> Bool {
//     return s1 > s2
// }
// var reversedNames = names.sorted(by: backward)

// func forward(_ s1: String, _ s2: String) -> Bool {
//     return s1 < s2
// }
// var Names = names.sorted(by: forward)

// print(reversedNames)
// print(Names)



// let names = ["Chris", "Anna", "Tom", "Sana", "Benjamin", "Dane"]
// var reversedNames = names.sorted(by: {s1, s2 in s1 > s2})
// print(reversedNames)


// struct numbers {
//     var first: Int
//     let length: Int
// }
// var allthree = numbers(first: 0, length: 10)
// print(allthree)
// allthree.first = 6
// print(allthree)


// print("Type two input: ")

// if let input1 = readLine(), let input2 = readLine(), let value1 = Int(input1), let value2 = Int(input2) {
//     print("Sum=\(value1+value2)")
// }


// print("Enter the number")

// if let firstNumber = readLine(), let secondNumber = readLine(){
//     print("Sum = \(firstNumber+secondNumber)")
// }

// print("Enter First number")

// if let firstNumber = readLine(), let secondNumber = readLine(), let value1 = Int(firstNumber), let value2 = Int(secondNumber) {
//     print("Sum = \(value1+value2)")
// }

// func isPalindrome(_ value: String) -> Bool
// {
// return value == String(value.reversed())
// }

// print(isPalindrome("madam"))





//---------------------------------------------------------------------------------------

/* Programs
   ````````
1. Palindrome
   ``````````
func isPalindrome(_ value: String){
    if value == String(value.reversed()){
        print("This is the Palindrome")
    }else {
        print("This is not a Palindrome")
    }
}

isPalindrome("Madam")


2. Area of Rectangle
   ``````````````````
let width = 10
let height = 5

print("Area of Rectangle = \(width*height)")


3. Area of Circle
   ``````````````
let radius = 20.0, pie = 3.14
print("Area of Circle = \(pie*radius*radius)")

let radius = 20.0, pie = 3.14
var areaOfCircle = pie*radius*radius
print("Radius of the circle is \(radius)")
print("Area of the cirlce is \(areaOfCircle)")

4. Ar

*/

// func difference(x: Int) -> Int{
//     if x > 51
//     {
//         return (x - 51) * 2
//     } else {
//         return 51 - x
//     }
// }
// print(difference(x: 12))
// print(difference(x: 51))
// print(difference(x: 61))


// func make(x: Int, y: Int) -> Bool {
//     if x + y == 20 || x == 20 || y == 20
//     {
//         return true
//     }
//     else
//     {
//         return false
//     }
// }

// print(make(x: 29, y: 10))
// print(make(x: 10, y: 20))
// print(make(x: 11, y: 9))


// func make(x: Int, y: Int) -> Bool {
//     if x < 0 && y > 0
//     {
//         return true
//     } 
//     else if x > 0 && y < 0
//     {
//         return true
//     } 
//     else if x < 0 && y < 0
//     {
//         return true
//     }
//     else
//     {
//         return false
//     }
// }
// print(make(x:12, y:5))
// print(make(x:12, y:-5))
// print(make(x:-12, y:5))
// print(make(x:-12, y:-5))


// func findstring(word: String) -> String{
//     if word.hasPrefix("Is") == true{
//         return word
//     } else {
//         return "Is \(word)"
//     }
// }
// print(findstring(word: "Full"))
// print(findstring(word: "Is Full"))


// func remove(str: String, n: Int) -> String{
//     let count = str.characters.count
//     var word = str
//     let index = str.index(str.startIndex, offsetBy: n)
//     if count > 0{
//         word.remove(at: index)
//     }
//     return word
// }
// print(remove(str:"Shiffana", n: 1))
// print(remove(str:"Shiffana", n: 0))
// print(remove(str:"Shiffana", n: 4))


// var a = 25
// var b = a << 2
// print(b)

// var weekdays = [ "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday" ]
// weekdays.append(contentsOf: ["Today","Tommorow"])
// for days in weekdays{
//     print("Today is \(days)")
// }
// weekdays.remove(at: 1)
// if weekdays.isEmpty{
//     print("The days are Empty")
// } else {
//     print("There are \(weekdays.sorted()) days in a week")
// }
// 	for (index, element) in weekdays.enumerated(){
// 					print("\(index) is the position of \(element)")
// 				}

// var studentID : Set = [ 111, 112, 113, 114, 115]
// print(studentID)
// studentID.insert(111)
// print(studentID)

// let A: Set = [ 1, 2, 3, 4, 5, 7, 9 ] 
// let B: Set = [ 0, 2, 4, 6, 8 ]
// print(A.intersection(B))         []

// print(A.subtracting(B))         [5, 7, 3, 1, 9]

// print(A.symmetricDifference(B))   [8, 2, 9, 4, 5, 7, 6, 3, 1, 0]

// print(A.isSubset(of: B))
// print(A.isStrictSubset(of: B))

	// var name: [ Int: String ] = [1: "One", 2: "Two"]
	// for (key, value) in name{
	// 	print("\(key) is the key value for \(value)")
	// }
                   
// for i in 1...3 {
// 	print(i)
// 	}
	

// for i in stride(from:0, through: 10, by: 2){
//     print(i)
// }

	// var number = 1
	// repeat
	// {
	// 	print(number)
	// 	number = number + 1
	// } while (number <= 5)

// let mark  = 80
// if mark >= 80{
//     print("Very Good")
// } else if mark >= 40 {
//     print("Passed")
// } else {
//     print("Fail")
// }

// func oddEven() {
//     let num = 21
//     guard num % 2 == 0 else {
//         print("\(num) is the Odd Number")
//         return
//     }
//     print("\(num) is the Even Number")
// }
// oddEven()

// let age = 22
// 	switch age {
// 		case 0...16:
// 	    		print("Child")
// 		case 17...30:
//     			print("Young Adults")
// 		case 31...45:
//    			print("Middle-aged Adults")
// 		default:
//     			print("Old-aged Adults")
// 	}

// for i in 1...5 {
// 		if i == 3 {
// 			fallthrough
// 	}

// 	print(i)
// }

	// let num = 3
	// switch num {
	// 	case 1...3:
	// 		print("Between 1 - 3")
    //     case 4...6:
    //         print("Between 4 - 5")
    //         fallthrough
	// 	case 6...10:
	// 		print("Between 6 - 10")
	// 	default:
	// 		print("In Number")
	// }

    // let age = 22
	// switch age {
	// 	case 0...16:
	//     		print("Child")
	// 	case 17...30:
    // 			print("Young Adults")
    //             fallthrough
	// 	case 31...45:
   	// 		print("Middle-aged Adults")
	// 	default:
    // 			print("Old-aged Adults")
	// }

    // 	func sum(n1: Int, n2: Int) -> Int {
	// 	return n1 + n2
	// }
	// print("Sum = \(sum(n1: 3, n2: 2))")

    // var cities = ["Delhi","Bangalore","Hyderabad","Dehradun","Bihar"]
    // var GroupedCities = Dictionary(grouping: cities ) { $0.first! }
    // print(GroupedCities)
    
// enum weekdays {
// 	case Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
// }
// var today =  weekdays.Monday

// print("Today is \(today)")

// enum ways: String {
// 	case up = "Up"
// 	case dowm = "Down"
// 	case left = "Left"
// 	case right = "Right"	
// }
// let currentway = ways.up
// print(currentway.rawValue)

// class Samplepgm {
//    var counter: Int = 0 {
//       willSet(newTotal){
//          print("Total Counter is: \(newTotal)")
//       }
      
//       didSet {
//             print("Value is changed from \(oldValue) to \(counter)")
//       }
//    }
// }

// let NewCounter = Samplepgm()
// NewCounter.counter = 100
// NewCounter.counter = 800

// class Human {
// 	func greet() {
// 		print("Hello human!")
// 	}
// }
// var name = Human()
// name.greet()

// protocol Greet {
//   var name: String { get }
//   func message() 
// } 
// class Employee: Greet {
//   var name = "Perry"
//   func message() {
//     print("Good Morning", name)
//   }
// }
// var employee1 = Employee()
// employee1.message()

// let names = ["Anna","Murali","Sana","Guru","Maddy","Peter"]
// var upCase = names.map{ $0.uppercased() }
// print(upCase)

// var numbers = [20, 19, 7, 12].map { $0 * 3 }

// print(numbers)

// func greet(name: String) -> String{
// 	return "Hello " + name 
// }
// print(greet(name: "Sana"))


// class Bike {
//   var name: String
//   init(name: String){
//     self.name = name
//   }
// }
// var bike1 = Bike(name: "BMX Bike")
// print("Name: \(bike1.name)")

// class Person {
// 	var name: String
	
// 	init(name: String) {
// 		self.name = name
// 	}
// }
// var person1 = Person(name: "Sana")
// print(person1)

// struct defineClass{
// 	var name: String
	
// 	init(name: String) {
// 		self.name = name
// 	}
// }
// var name1 = defineClass(name: "Sana")
// var name2 = name1
// name2.name = "Peter"
// print(name1.name)
// print(name2.name)


// var weekdays = [ "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday" ]
// weekdays.insert("Today", at: 1)
// print(weekdays)
// weekdays.append("Tomorrow")
// print(weekdays)

// for week in 1...2{
// 	print("Week:  \(week)")
// 	for day in 1...7{
// 		print("Days: \(day)")
		
// 	}
// }
	// class Bike{
	// 	var name: String
	//  	var gear: Int
	// 	init(name: String, gear: Int){
	// 		self.name = name
	// 		self.gear = gear
	// 	}
	// }
	// var bike1 = Bike(name: "KTM", gear: 5)
	// print("Name :\(bike1.name) have \(bike1.gear) Gears it it")


// class living {
// 	var age = 22
// 	init() {
// 		print("Initializer")
		
// 	}
// }
// let person = living()
// print("the age is \(person.age)")

// func nameOf ( name: String = "Sana") {
// 	print("Hi \(name)")
// }
// nameOf()

// class account {
// 	var accno: Int = 234
// 	func accountdetails{
// 		print("Account details \(accno)")
// 	}
// }
// extension account {

	
// }

// func palindrome(_ value: String) -> Bool {
// 	return value == String(value.reversed())
// }
// var check = palindrome("madona")
// print(check)

// func testFunction() {
// 	let someValue:Int! = 0
// 	guard let temp = someValue else {
// 		return
// 	}
// 	print("It has some value \(temp)")
// }

// testFunction()

// func sum(of a: Int, and b: Int) {
//   print("Sum:", a + b)
// }

// sum(of: 2, and: 3)

// func string(word: String) -> String {
// 	if word.hasPrefix("Is") == true{
// 		return word
// 	} else {
// 		return "Is \(word)"
// 	}
// }
// print(string(word: "Is man"))
// print(string(word: "man"))

// Create an Array with three elements
// var myArray = ["Swift", "Objective-C", "PHP"]
// // Iterate over Array elements. Display element and it's index
// for (index, element) in myArray.enumerated() {
//     print("Element \(element) is at index \(index)")
// }

// var a = readLine()!
// var b = readLine()!
// var c = a + b
// print(c)