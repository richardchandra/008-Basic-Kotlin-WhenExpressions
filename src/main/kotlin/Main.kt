fun main(args: Array<String>) {
    //When expression
    //For several case
    val finalExam = 'A'
    when(finalExam){
        'A' -> {
            println("AMAZING")
        }
        'B' -> println("GOOD")
        'C' -> println("NOT BAD")
        'D' -> println("BAD")
        else -> println("FAIL")
    }

    //When Expression Multiple Option
    when(finalExam){
        'A', 'B', 'C' -> println("PASS")
        else -> println("NOT PASS")
    }

    //When Expression In
    val passingValue:Array<Char> = arrayOf('A', 'B', 'C')
    when(finalExam){
        in passingValue -> println("PASS")
        !in passingValue -> println("NOT PASS")
    }

    //When for If expression substitution
    val examValue = 90
    when{
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try again next time")
    }
}