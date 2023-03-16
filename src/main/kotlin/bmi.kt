fun main(args: Array<String>) {
    println("Enter your weight")
    var weight:Int = readLine()!!.toInt()
    println("Enter your height")
    var height:Float = readLine()!!.toFloat()

    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")}
    else if (bmi <= 29){
        println("Normal weight")}
    else if (bmi <= 34){
        println("Overweight")}
    else {
        println("Obese")
    }
}