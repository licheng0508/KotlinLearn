package com.example.test1116
import kotlin.math.PI

class TowerTank (override  var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {

    override var volume: Int
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override  val shape = "cylinder"
}

fun buildAquarium() {
    val myAquarium = Aquarium(length = 25, width = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

}

fun makeFish() {

    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

class MyList<T> {
    fun get(pos: Int): T {
        TODO("implement")
    }
    fun  addItem(item: T) {}
}

fun main() {

}
