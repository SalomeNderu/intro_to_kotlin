fun main(args: Array<String>) {
    for (i in 1..100){
        if (i % 15 == 0){
            println("$i _Fizz_")
        }
        else if (i % 5 == 0){
            println("$i _Buzz_")
        }
        else if (i % 3 == 0){
            println("$i _Fizzbuzz_")
        }
        else {
            println("$i _Not divisible_")
        }
    }
}