package co.enoobong.designpatterns.classes

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
object MiniDuckStimulator {


    @JvmStatic fun main(args: Array<String>) {
        val mallard = MallardDuck()
        mallard.performQuack()
        mallard.performFly()

        val model = ModelDuck()
        model.display()
        model.performFly()
        model.flyBehaviour = FlyRocketPowered()
        model.performFly()
    }

}