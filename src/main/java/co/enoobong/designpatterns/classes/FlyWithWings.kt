package co.enoobong.designpatterns.classes

import co.enoobong.designpatterns.interfaces.FlyBehaviour

/**
 * @author Ibanga Enoobong I
 * @since 13-Aug-17.
 */
class FlyWithWings : FlyBehaviour {

    override fun fly() {
        println("I'm flying!")
    }


}