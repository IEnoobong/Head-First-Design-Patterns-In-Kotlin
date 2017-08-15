package co.enoobong.designpatterns.swing

import java.awt.BorderLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class SwingObserverExample {

    companion object {
        @JvmStatic fun main(args: Array<String>){
            val example = SwingObserverExample()
            example.go()
        }
    }

    fun go(){
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
    class AngelListener: ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            e?.equals(ActionEvent.ACTION_PERFORMED)
            println("Don't do it, you might regret it!")
        }
    }

    class DevilListener: ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            println("Come on, do it!")
        }

    }
    //</editor-fold>
}