package co.enoobong.designpatterns.classes

import co.enoobong.designpatterns.interfaces.FlyBehaviour
import co.enoobong.designpatterns.interfaces.QuackBehaviour

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class MallardDuck : Duck() {
    override var flyBehaviour: FlyBehaviour = FlyWithWings()

    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() {
        println("I'm a real Mallard")
    }
}