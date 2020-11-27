package generics

import android.os.Parcel
import android.os.Parcelable

open class WaterSupply(var needsProcessing: Boolean)

class  TapWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water add")
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

interface  Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun <T: WaterSupply>isWaterClean(aquarium: Aquarium<WaterSupply>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

//inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R

fun genericsExample() {
//    val aquarium = Aquarium(TapWater())
//    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
//    aquarium.waterSupply.addChemicalCleaners()
//    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)

//    val aquarium3 = Aquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("waterSupply is null")
//    }

//    val aquarium4 = Aquarium(LakeWater())
//    aquarium4.waterSupply.filter()
//    aquarium4.addWater()

//    val aquarium = Aquarium(TapWater())
//    addItemTo(aquarium)

//    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
//    println(aquarium.ha)
//    isWaterClean<TapWater>(aquarium)
}

fun main() {
    genericsExample()
}
