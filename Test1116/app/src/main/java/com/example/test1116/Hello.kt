package com.example.test1116
import java.util.*

fun add(num: Int, num2: Int): Int {
    return  num + num2
}

fun addNum(num: Int): Int {
    return  num + num
}

fun randomDay() : String {
    val  week = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturdat", "Sunday")
    return  week[Random().nextInt(week.size)]
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood(day: String) : String {
    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        else -> "nothing"
    }
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return  when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun main(args: Array<String>) {
/*
val  num = add(2,3) + addNum(2)

print("hello world! ${num}")
var isUnit = println("This is an expression")

println(isUnit)
val temp = 10
val isHot = temp > 50
println(isHot)
*/

//    var tem = 10
//    val message = "The water temp is ${ if (tem > 50) "to warm" else "ok"} "
//    println(message)

//    feedTheFish()

//    swim()
//    swim("slow")
//    swim("turle-like")

//    val day = randomDay()
//    val food = fishFood(day)
//
//    println("Today is $day and the fish eat $food")
//    println("Change water: ${shouldChangeWater(day)}")

    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//    val eager = decorations.filter { it[0] == 'p' }
//    println("eager: $eager")
//    val  filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println("filtered: $filtered")
//    val newList = filtered.toList()
//    println("new list: $newList")

//    val  lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }
//    println("lazy: $lazyMap")
//    println("------")
//    println("first: ${lazyMap.first()}")
//    println("------")
//    println("all: ${lazyMap.toList()}")

//    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
//        println("access: $it")
//        it
//    }
//    println("-----")
//    println("filtered: ${lazyMap2.toList()}")


}






