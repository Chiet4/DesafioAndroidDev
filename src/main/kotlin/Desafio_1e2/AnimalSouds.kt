package Desafio_1e2

abstract class Animal(
    var name: String
) {
    abstract fun makeSond()
}

class Dog(name: String) : Animal(name) {
    override fun makeSond() {
        println("Woof woof!!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSond() {
        println("Meow meooooooooooooowwww!!")
    }
}

fun main() {
    animalSouds()
}

fun animalSouds() {
    val animal = listOf(Dog("Pit"), Cat("Garrinha"), Cat("Rogerin"), Dog("Armando"))
    for (animal in animal) {
        animal.makeSond()
    }

}