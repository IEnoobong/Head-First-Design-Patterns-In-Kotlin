package co.enoobong.designpatterns.pizzaaf

import kotlin.properties.Delegates


/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */

abstract class Pizza {
    internal var name: String by Delegates.notNull()

    internal var dough: Dough? = null

    internal var sauce: Sauce? = null
    internal var veggies: Array<Veggies>? = null
    internal var cheese: Cheese? = null
    internal var pepperoni: Pepperoni? = null
    internal var clam: Clams? = null

    internal abstract fun prepare()

    internal fun bake() {
        println("Bake for 25 minutes at 350")
    }

    internal fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    internal fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("---- $name ----\n")
        if (dough != null) {
            result.append(dough)
            result.append("\n")
        }
        if (sauce != null) {
            result.append(sauce)
            result.append("\n")
        }
        if (cheese != null) {
            result.append(cheese)
            result.append("\n")
        }
        if (veggies != null) {
            for (i in veggies!!.indices) {
                result.append(veggies!![i])
                if (i < veggies!!.size - 1) {
                    result.append(", ")
                }
            }
            result.append("\n")
        }
        if (clam != null) {
            result.append(clam)
            result.append("\n")
        }
        if (pepperoni != null) {
            result.append(pepperoni)
            result.append("\n")
        }
        return result.toString()
    }
}
