fun main(args: Array<String>) {
    print("Enter your age")
    var age:Int = readLine()!!.toInt()
    if (age >= 18) {
        print("Welcome to the club")
    }
    else{
        print("Sorry,we can't admit underage")
    }
}