fun main(args: Array<String>) {
    println("Enter your marks")
    var marks:Int = readLine()!!.toInt()

    if (marks >80){
        print("A")
        print(" _Congratulations!You are brilliant_ ")
    }
    else if (marks >=70){
        print("A-")
        print(" _Exceeded Expectations_ ")
    }
    else if (marks >=60){
        print("B")
        print(" _Met Standard expectations_ ")
    }
    else if (marks >=50){
        print("C")
        print(" _Fair Trial but You Can Do Better_ ")
    }
    else if (marks >=40){
        print("D")
        print(" _Below Expectations_ ")
    }
    else {
        print("E")
        print(" _Very poor! You have to retake the test_ ")
    }

}