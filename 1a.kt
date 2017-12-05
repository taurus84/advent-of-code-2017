package adventOfCode2017

import java.io.File

/**
 * Created by davidtran on 2017-12-01.
 */
fun main(args: Array<String>) {

    val file = File("src/adventOfCode2017/1a.txt")
    var numbers:String = file.readText()
    var sum = 0
    for(x in 0..numbers.length-2) {
        if(numbers[x] == numbers[x+1]) {
            sum += numbers[x].toString().toInt()
        }
    }

    if(numbers.last() == numbers.first()) {
        sum += numbers.last().toString().toInt()
    }

    println(sum)


}