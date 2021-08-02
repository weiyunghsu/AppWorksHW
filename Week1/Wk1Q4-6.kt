open class Human(val name: String, val mana: Int) {
    open fun attack() {
        println("<the name passed in> use Fist Attack!")
    }
}
class Mage : Human {
    constructor(name: String, mana: Int) : super(name, mana)
    override fun attack() {
        println("<the name passed in> use Fireball!")
    }
}
fun main(args: Array<String>) {
    val human = Human("ABC", 5)
    val mage = Mage("abc", 3)
    println("Question4")
    human.attack()
    println("Question5")
    mage.attack()
    println("Question6")
    println("Check mana!")
    if (human.mana > 0) {
        println("You can attack!")
    }
    else {
        println("You lose.")
    }
}



