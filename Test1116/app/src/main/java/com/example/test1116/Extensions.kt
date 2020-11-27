package com.example.test1116

fun  String.hasSpaces() = find { it == ' ' } != null

open class AquariumPlant(val color: String, private val size: Int)

class CreenLeafyPlant(size: Int): AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")