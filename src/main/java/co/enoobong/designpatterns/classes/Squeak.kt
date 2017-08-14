package co.enoobong.designpatterns.classes

import co.enoobong.designpatterns.interfaces.QuackBehaviour

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class Squeak : QuackBehaviour {

    override fun quack() {
        println("Squeak")
    }
}