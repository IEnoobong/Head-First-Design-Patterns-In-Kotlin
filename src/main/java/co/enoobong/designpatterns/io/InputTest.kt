package co.enoobong.designpatterns.io

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.IOException

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
object InputTest {

    @JvmStatic fun main(args: Array<String>){
        try {
            val inputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream("test.txt")))

            for (c in inputStream.lines){
                print(c.toChar())
            }
        } catch (e: IOException){
            e.printStackTrace()
        }
    }


}

val LowerCaseInputStream.lines: Iterator<Int>
    get() = object : Iterator<Int> {
        var line = this@lines.read()
        override fun next(): Int {
            if (line == -1)
                throw NoSuchElementException()
            val result = line
            line = this@lines.read()
            return result
        }

        override fun hasNext() = line != -1
    }
