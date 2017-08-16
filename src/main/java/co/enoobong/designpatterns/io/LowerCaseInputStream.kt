package co.enoobong.designpatterns.io

import java.io.FilterInputStream
import java.io.IOException
import java.io.InputStream

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class LowerCaseInputStream(inputStream: InputStream) : FilterInputStream(inputStream) {

    //TODO I know there's a way to achieve this with extensions not just sure how
    fun InputStream.toLowerChar(): Int{
        val c = this@toLowerChar.read()
        return if (c == -1) c else Character.toLowerCase(c.toChar()).toInt()
    }

    @Throws(IOException::class)
    override fun read(): Int {
        val c = super.read()
        return if (c == -1) c else Character.toLowerCase(c.toChar()).toInt()
    }


    @Throws(IOException::class)
    override fun read(b: ByteArray, offset: Int, len: Int): Int {
        val result = super.read(b, offset, len)
        for (i in offset until offset + result) {
            b[i] = Character.toLowerCase(b[i].toChar()).toByte()
        }
        return result
    }

}