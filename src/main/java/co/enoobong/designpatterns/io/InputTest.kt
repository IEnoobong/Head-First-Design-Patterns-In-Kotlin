package co.enoobong.designpatterns.io

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.IOException

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
object InputTest {

    @JvmStatic
    fun main(args: Array<String>) {

        try {
            val inputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream("test.txt")))

            inputStream.reader().forEachLine { print(it) }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }


}
