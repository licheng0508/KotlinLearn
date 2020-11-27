package generics

fun labels() {
    outerLoop@ for (i in 1..100) {
        println("$i ")
        for (j in 1..100) {
            if (i > 10) break@outerLoop
        }
    }
}

fun main() {

//    labels()
}

