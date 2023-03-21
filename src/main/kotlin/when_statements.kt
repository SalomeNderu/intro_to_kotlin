fun main(args: Array<String>) {
    println("Enter floornumber")
    var floornumber:Int = readLine()!!.toInt()
    when (floornumber){
        1-> println("Go To First Floor")
        2-> println("Go To Second Floor")
        3-> println("Go To Third Floor")
        4-> println("Go To Fourth Floor")

        else-> println("Floor not available")
    }
}