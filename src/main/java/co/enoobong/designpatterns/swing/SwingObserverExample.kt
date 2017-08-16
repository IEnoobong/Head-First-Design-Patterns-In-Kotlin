package co.enoobong.designpatterns.swing

import java.awt.BorderLayout
import javax.swing.JButton
import javax.swing.JFrame

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
object SwingObserverExample {


    @JvmStatic fun main(args: Array<String>) {
        val example = SwingObserverExample
        example.go()
    }


    private fun go() {
        val frame = JFrame()
        val button = JButton("Should I do it?")

        //Without lamdas
//        button.addActionListener(AngelListener())
//        button.addActionListener(DevilListener())

        //With lambdas
        button.addActionListener { println("Don't do it, you might regret it!") }
        button.addActionListener { println("Come on, do it!") }
        frame.contentPane.add(BorderLayout.CENTER, button)

        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 300)
        frame.isVisible = true
    }

    //<editor-fold defaultstate="collapsed" desc="Unused in favour of lamdas">
//    inner class AngelListener: ActionListener{
//        override fun actionPerformed(e: ActionEvent?) {
//            println("Don't do it, you might regret it!")
//        }
//    }
//
//    inner class DevilListener: ActionListener{
//        override fun actionPerformed(e: ActionEvent?) {
//            println("Come on, do it!")
//        }
//
//    }
    //</editor-fold>
}