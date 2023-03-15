fun main(args: Array<String>) {
    println("Enter Number to select plan")
    var number:Int = readLine()!!.toInt()
    if (number == 0){
        print("0:Sh20=1 GB for 1hr")
    }
    else if (number == 1){
        print("1:Data Deals")
    }
    else if (number == 2){
        print("2:Daily Bundles")
    }
    else if (number == 3){
        print("3:Weekly Bundles")
    }
    else if (number == 4){
        print("4:GO MONTHLY")
    }
    else{
        print("Invalid Character")
    }
}