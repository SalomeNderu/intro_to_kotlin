fun main(args: Array<String>) {
    println("Enter number to select plan")
    var number:Int = readLine()!!.toInt()
    when (number){
        0-> println("Sh20=1 GB for 1hr")
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("GO MONTHLY")
        else-> println("Invalid Number")
    }
}
