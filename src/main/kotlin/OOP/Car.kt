package OOP

class Car(owner:String, type:String, colour:String){
    init {
        println("Owner is $owner")
        println("Car type is $type")
        println("Car is $colour")
    }
}

fun main(args: Array<String>) {
    var car_one = Car("Nderuh", "Jeep", "Blue")
    var car_two = Car("Peter", "Honda", "Grey")
    var car_three = Car("Mikaela", "V8", "Black")
}