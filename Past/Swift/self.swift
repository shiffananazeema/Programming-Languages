class Person {
    var firstName: String
    var lastName: String
    
    init(firstName: String, lastName: String) {
        self.firstName = firstName
        self.lastName = lastName
    }
    func getFullName() -> String{
    return firstName + " " + lastName
    }
} 
let person =  Person(firstName: "Shiffana", lastName: "Nazeema")
print("Full Name: " + person.getFullName())