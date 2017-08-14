package co.enoobong.designpatterns.classes

import co.enoobong.designpatterns.interfaces.FlyBehaviour

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class FlyRocketPowered : FlyBehaviour {

    override fun fly() {
        println("I'm flying with a rocket!")
    }
}