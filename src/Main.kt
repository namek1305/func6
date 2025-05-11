// Практическая работа №1: Создание класса
class Words() {
    init {
        println("Класс Words был создан!")
    }
}

// Практическая работа №2: Работа с классом
class Message(val username: String) {
    fun introduce() {
        println("Привет, меня зовут $username")
    }
}

// Практическая работа №3: ООП
open class Animal(open var food: String, open var location: String) {
    open fun makeNoise() {
        println("Животное издаёт звук")
    }
    open fun eat() {
        println("Животное ест $food")
    }
    open fun sleep() {
        println("Животное спит")
    }
}
class Dog(override var food: String, override var location: String, val breed: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Собака гавкает")
    }
}
class Cat(override var food: String, override var location: String, val color: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Кошка мяукает")
    }
}

class Horse(override var food: String, override var location: String, val speed: Int) : Animal(food, location) {
    override fun makeNoise() {
        println("Лошадь фыркает")
    }
}
class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("Обслуживание животного:")
        println("Питание: ${animal.food}")
        println("Местонахождение: ${animal.location}")
    }
}

fun main() {
    // Практическая работа №1
    val words1 = Words()
    val words2 = Words()

    // Практическая работа №2
    val message = Message("Никита")
    message.introduce()

    // Практическая работа №3
    val veterinarian = Veterinarian()
    val animals = arrayOf(
        Dog("собачий корм", "будка", "доберман"),
        Cat("кошачий корм", "диван", "черный"),
        Horse("лошадиный корм", "стойло", 90)
    )

    for (animal in animals) {
        veterinarian.treatAnimal(animal)
        animal.makeNoise()
        animal.eat()
        animal.sleep()
        println()
    }
}