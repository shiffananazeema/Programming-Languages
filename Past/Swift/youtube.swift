//Swift
// - Swift is the Type Safe Language

// //Simple Print
// print("Hello, World!")
// print("   ")

// //Variables - There is no need to mention the data type
// var name = "Shiffana"

// //Constsants
// let name1 = "Nazeema"

// // Integer
// let num1 = 1

// //Double
// let num2 = 1.0

// // - Cannot implement an operation between them only int-int or double-double

// //String Operation
// print("Hello \(1+2)")
// print("   ")

// //Multiline String
// print("""
// Hello \(1+2)
// """)
// print("   ")

// //Boolean Type
// let check = true
// if check{
//     print("Done")
// }
// print("   ")

// //if else if
// let num = 1
// if num == 0 {
//     print("Zero")
// }else if check{
//     print(num)
// }
// print("   ")

// //switch
// switch num {
// case 1:
//     print("One")
// default:
//     print("OK")
// }
// print("   ")

// //Array
// let nameArray = ["sana", "sam"]

// //Dictionary
// let nameDictionary = ["sana": "sana"]

// //Set
// let nameSet = Set(["sam", "sam"])

// for (namea) in nameArray{
//     print (namea)
// }
// for (index, namea) in nameArray.enumerated(){
//     print (namea, index)
// }
// print("   ")

// //tuples
// for i in 1...10{
//     switch(i % 5 == 0, i % 3 == 0){
//         case (true, true): print("FizzBuzz")
//         case (true, false): print("Fizz")
//         case (false, true): print("Fizz")
//         case (false, false): print(i)
//     }
// }
// print("   ")

// //function
// func sayHello(name: String){
//     print(name)
// }
// // _ means no name or nothing
// func sum(_ num1:Int, _ num2 : Int) -> Int {
//     return num1+num2
// }
// sayHello(name: "SaNa")
// _ = sum(1,2) //Donothing
// print("   ")

// //Different Kinds
// func sayHi(name: String){
//     let greeting = "Hello "
//     func run(){
//         print(greeting + name)
//     }
//     run()
// }
// nameArray.forEach(sayHi)

// print("   ")

// let sayHii = {(name: String) in
//     let greeting = "Hello "
//     print(greeting + name)
// }
// nameArray.forEach(sayHii)

// print("   ")

// let sayHiii:(String) -> () = { name in
//     let greeting = "Hello "
//     print(greeting + name)
// }
// nameArray.forEach(sayHiii)

// print("   ")

// let sayHiv:(String) -> () = { print("Hello \($0)")}
// nameArray.forEach(sayHiv)

// print("   ")

// nameArray.forEach{ print("Hello \($0)")}

// print("   ")

// //Object Oriented Programming
// //class
// class Person {
//     var name: String
//     init(name: String) {
//         self.name = name
//     }
//     func sayClass() {
//         print("Hello \(self.name)")
//     }
// }
// let sam = Person(name:"Sam")
// sam.sayClass()

// print("   ")

// //struct - used same as class but has so many difference
// // struct Person {
// //     var name: String
// //     init(name: String) {
// //         self.name = name
// //     }
// //     func sayClass() {
// //         print("Hello \(self.name)")
// //     }
// // }
// // let sam = Person(name:"Sam")
// // sam.sayClass()

// print("   ")

// //enum - Its Powerful than any other languages
// enum Person1 {
//     case sana
//     case notsana
//     func namee() -> String{
//         switch self{
//             case .sana: return "SANA"
//             case .notsana: return "Not SANA"
//         }
//     }
//     func sayEnum(){
//         print("Hello \(self.namee())")
//     }
// }
// let sana = Person1.sana
// sana.sayEnum()

// print("   ")


//Optionals

// import Foundation
// func sayHello(name: String?){  // or Optional<String>
// // if name != nil{
// //     print("Hello \(name!)")
// // } OR
// if let unwrap = name {
//     print("Hello \(unwrap)")
// }
// else {
//     print("You must name it")
// }
// }
// sayHello(name: "Sana")
// sayHello(name: "")
// sayHello(name: nil)

//OR

// import Foundation

// struct User{
//     var name: String?
// }
// func sayHello(user: User?){  
//     print ("Hello \(user?.name ?? "Anonymous")")
// }
// var user: User? = User(name: "Sam")
// user?.name = "SaNa"
// sayHello(user: user)
// sayHello(user: nil)


//Classes

// import Foundation

// class Circle {
//     var color: String

//     init(color: String) {
//         self.color = color
//     }

//     func draw() {
//         if self.color == "blue"{
//             print("Blue circle")
//         }else if self.color == "purple"{
//         print("Purple Circle")
//         }
//     }
// }
// let circle1 = Circle(color: "purple")
// let circle2 = Circle(color: "blue")
// circle1.draw()
// circle2.draw()


//Enum

// import Foundation

// enum CircleColor{
//     case blue
//     case purple
// }

// class Circle {
//     var color: String

//     init(color: CircleColor) {
//         self.color = color
//     }

//     func draw() {
//         if self.color == "blue"{
//             print("Blue circle")
//         }else if self.color == "purple"{
//         print("Purple Circle")
//         }
//     }
// }
// let circle1 = Circle(color: .purple)
// let circle2 = Circle(color: .blue)
// circle1.draw()
// circle2.draw()

//OR

// import Foundation

// enum CircleColor{
//     case blue
//     case purple
// }

// class Circle {
//     var color: CircleColor
//     var output: String{
//         switch color {
//         case .blue:
//             return "Blue Circle"
//         case .purple:
//             return "Purple Circle"
//         }
//     }
//     init(color: CircleColor = .purple) {
//         self.color = color
//     }

//     func draw() {
//         print(output)
//         }
//     }

// let circle1 = Circle(color: .purple)
// let circle2 = Circle(color: .blue)
// circle1.draw()
// circle2.draw()

//Struct is a a value type while class is a reference type

// Protocols Polymorphism
// import Foundation
// class Person{
//     var name: String
//     var cat: Cat?
//     init(name: String) {
//         self.name = name
//     }
// }
// class Cat{
//     var name: String
//     init(name: String) {
//         self.name = name
//     }
// }
// let person = Person(name: "Sam")
// let cat = Cat(name: "Mitten")
// print(person.name)
// print(cat.name)


// "11110000 10011111 10001101 10000110"
// .split(" ")
// .map(a => parseInt(a, 2))
// .reduce((a, c) => [[...a[0], c]], [[]])
// .map(a => new Uint8Array(a))
// .map(a => new TextDecoder().decode(a))
// .reduce((_, c) => c)