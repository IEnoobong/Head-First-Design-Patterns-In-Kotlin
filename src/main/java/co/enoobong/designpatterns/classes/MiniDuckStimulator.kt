package co.enoobong.designpatterns.classes

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
object MiniDuckStimulator {


    @JvmStatic fun main(args: Array<String>) {
        MallardDuck().apply {
            display()
            performFly()
            performQuack()
        }

        ModelDuck().apply {
            display()
            performFly()
            performQuack()
            flyBehaviour = FlyRocketPowered()
            performFly()
        }
    }

}