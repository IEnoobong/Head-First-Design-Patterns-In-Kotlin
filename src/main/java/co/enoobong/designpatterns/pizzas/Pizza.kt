
import java.util.ArrayList


abstract class Pizza {
    lateinit var name: String
    lateinit var dough: String
    lateinit var sauce: String
    val toppings = ArrayList<String>()

    fun prepare() {
        println("Preparing " + name)
    }

    fun bake() {
        println("Baking " + name)
    }

    fun cut() {
        println("Cutting " + name)
    }

    fun box() {
        println("Boxing " + name)
    }

    override fun toString(): String {
        // code to display pizza name and ingredients
        val display = StringBuffer()
        display.append("---- $name ----\n")
        display.append(dough + "\n")
        display.append(sauce + "\n")
        toppings.forEach { display.append(it + "\n") }
        return display.toString()
    }
}

