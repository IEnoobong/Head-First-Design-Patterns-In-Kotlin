package co.enoobong.designpatterns.pizzafm


/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
abstract class Pizza {
    lateinit var name: String
    lateinit var dough: String
    lateinit var sauce: String
    val toppings = ArrayList<String>()

    fun prepare() {
        System.out.println("Prepare " + name)
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        toppings.forEach { println("  " + it) }
    }

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    internal open fun cut() {
        println("Cut the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }


    override fun toString(): String {
        val display = StringBuilder()
        display.append("---- $name ----\n")
        display.append(dough + "\n")
        display.append(sauce + "\n")
        toppings.forEach { display.append(it + "\n") }

        return display.toString()
    }

}