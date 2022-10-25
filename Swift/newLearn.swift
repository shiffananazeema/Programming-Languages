// Swift - Created and Used for iOS from 2014 - Chris Lattner in Apple

// Variables, Constants are used to Stored the Data 

// Variables can be changed in the middle of the program
var x = 1
x = 2
print(x) //2

print(" ")

// Constant cannot be changed anywhere once its declared its a constant value
let y = 1
// y = 2 //Error

print(" ")

// Types - DataType - Swift is a type safe language

var ti = 3 // integer
var ts = "SaNa" // string
var tf = 1.0 // float - upto 6 decimal points
var td = 2.094023940923049 // double - upto 15 decimal points
var tc = "A" // character - only one letter
var tb = true // Boolean - true or false 

var tName: String = "Sana" //Declaring a type. Swift automatically assumes the type

// Functions and Parameters
// Fucntion is a block of code that performs a specific task.
// Parameters is a value that is accepted by a function inside the ().

func addNum(a: Int, b: Int) -> Int {
    return a + b
}
func squareNum(a: Int) -> Int{
    return a*a
}
var fa = 3
var fb = 7
let sum = addNum(a: fa, b: fb)
print(sum)
let square = squareNum(a: sum)
print(square)

print(" ")

func isEven(fNum: Int) -> Bool {
    if fNum % 2 == 0{
        return true
    }
    return false
}
let result = isEven(fNum: 786)
print(result)

print(" ")

// Classes and Structs

// The Class and Struct are both same. Class will refer the data while struct makes the copy.

// class Car{ //struct Car{
//     let make: String
//     let color: String
    
//     init(color: String, make: String) {
//         self .color = color
//         self .make = make
//     }
// }
// var bmw = Car(color: "Blue", make: "BMW")
// var car1 = bmw

print(" ")

// In class car1 will refer to bmw
// In struct car1 will be the copy of the bmw 

//Inheritance
// class Vehicle{

// }
// class Car: Vehicle{
//     var color = "blue"
//     var model = ""

//     func drive(){

//     }
// }
// class BMW: Car{

// }

// Loops - Repeat the task multiple times.

let l = [1,2,3,4,5]
for thing in l {
    let result = thing * 2
    print (result)
}

print(" ")

var w = 0
while w < 3{
    print(w)
    w += 1
}

print(" ")

//Optinals and Unwrap
var name: String? = "Jeo"
name = nil

var ox: Int? = 3
var oy: Int? = 7
if let value = ox {
    if let value2 = oy {
        let result = value + value2
        print(result)
    }
}

print(" ")

// Conditionals

var mark = 60

if mark >= 90{
    print("Excellent")
} else if mark >= 70{
    print("Very Good")
} else if mark >= 60{
    print("Good")
}else if mark >= 40{
    print("Try More")
}else{
    print("Meet Me")
}

print(" ")

//Guard Statements

//The guard statement is similar to the if statement with one 
//major difference. The if statement runs when a certain condition 
//is met. However, the guard statement runs when a certain condition 
//is not met.

func gn(number: Int) -> Bool {
    guard number > 5 else{
        return false
    }
    return true
}

var text: String?
text = "Hello Sana!"

if let state = text{
    print(state)
}
func guardvalue(){
    guard let value = text else { return }
    print(value)
}
guardvalue()

print(" ")

// Protocols - Blueprint of methods, properties and other requirements functionality.
//Swift cant use the multiple inheritance so that it use the protocols

protocol CarDataSource {
    var color: String { get set }
    func drive()
    func isAllWheelDrive() -> Bool
}
class Car{

}
class BMW: Car, CarDataSource {
    var color: String
    init(color: String) {
        self.color = color
    }
    func drive() {

    }
    func isAllWheelDrive() -> Bool {
        return true
    }
}

print(" ")

// Arrays and Dictionaries

var arrayNumber: [Int] = [1, 2, 3]
var arrayString: [String] = ["Sana", "Peter", "Parker"]
var arrayAny: [Any] = [1, "sam", 2, "tom"]
print(arrayNumber)
print(arrayString)
print(arrayAny)

print(" ")

var dicCar: [String: Int] = ["BMW": 4, "Audi": 3, "Jagur": 1, "Bence":2]

for carf in dicCar{
    print(carf)
}

// for (key, value) in dicCar{
//     print(value)
// }

print(" ")