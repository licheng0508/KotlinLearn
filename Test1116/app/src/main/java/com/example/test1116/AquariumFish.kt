package com.example.test1116

interface FishAction {
    fun eat()
}

interface FishColor{
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

//abstract class AquariumFish: FishAction {
//    abstract val color: String
//    override fun eat() = println("yum")
//}

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction, FishColor by GoldColor {
    override fun eat() {
        println("eat algae")
    }
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}