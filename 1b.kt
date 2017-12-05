package adventOfCode2017

import java.io.File
import java.util.*
import javax.xml.stream.events.Characters

/**
 * Created by davidtran on 2017-12-01.
 */

fun getMatchIndex(size:Int, index:Int):Int = (index + size/2) % size

fun main(args: Array<String>) {
    val file = File("src/adventOfCode2017/1a.txt")
    var numbers:String = file.readText()
    val stringLength:Int = numbers.length
    var sum = 0

    for(x in 0..numbers.length-1) {
        if(numbers[x] == numbers[getMatchIndex(stringLength, x)]) {
            sum += numbers[x].toString().toInt()
//            sum += Character.getNumericValue(numbers[x])
        }
    }
    println(sum)
}
