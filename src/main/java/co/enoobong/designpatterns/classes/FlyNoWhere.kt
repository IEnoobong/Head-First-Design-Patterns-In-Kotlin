package co.enoobong.designpatterns.classes

import co.enoobong.designpatterns.interfaces.FlyBehaviour

/**
 * @author Ibanga Enoobong I
 * @since 13-Aug-17.
 */
class FlyNoWhere : FlyBehaviour {

    override fun fly(){
        println("I can't fly")
    }
}