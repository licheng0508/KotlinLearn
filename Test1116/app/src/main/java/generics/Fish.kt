package generics

data class Fish (var  name: String)

fun fishExampless() {
    val fish = Fish("splashy")
    myWith(fish.name) {
        println(capitalize())
    }
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun main() {
//    fishExampless()

    val fish2 = Fish("splashy").apply {
        name = "sharky"
    }
    println(fish2.name)
}

