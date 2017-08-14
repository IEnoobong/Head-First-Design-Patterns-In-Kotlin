package co.enoobong.designpatterns.classes

import co.enoobong.designpatterns.interfaces.FlyBehaviour
import co.enoobong.designpatterns.interfaces.QuackBehaviour

/**
 * @author Ibanga Enoobong I
 * @since 13-Aug-17.
 */
abstract class Duck {
    abstract val  flyBehaviour : FlyBehaviour

    abstract val quackBehaviour : QuackBehaviour

    abstract fun display()

    fun performFly() {
        flyBehaviour.fly()
    }

    fun performQuack(){
        quackBehaviour.quack()
    }

    fun swim(){
        println("All ducks float. Even decoys")
    }


}