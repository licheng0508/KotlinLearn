package example.myapp.decor

import android.os.Build
import androidx.annotation.RequiresApi

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

data class Decoration(val rocks: String) {

}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {

}

enum class Color(val  rga: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

enum class Direction(val  degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}


@RequiresApi(Build.VERSION_CODES.N)
fun main() {

//    makeDecorations()

//    println(Direction.EAST.name)
//    println(Direction.EAST.ordinal)
//    println(Direction.EAST.degrees)

//    val list = listOf(1, 5, 3, 4)
//    println(list.sum())

//    val list2 = listOf("a", "bbb", "cc")
//    for (s in list2.listIterator()) {
//        println("$s ")
//    }

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
//    println(cures.get("white spots"))
//    println(cures["red sores"])
//    print(cures["dddd"])
//    println(cures.getOrDefault("bloating", "sorry idont know"))

//    println(cures.getOrElse(key = "bloating") { "No cure for this" })

    val  inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())

}





