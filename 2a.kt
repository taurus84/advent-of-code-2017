package adventOfCode2017

import x
import java.io.File

/**
 * Created by davidtran on 2017-12-02.
 */

fun main(args: Array<String>) {
    val file = File("src/adventOfCode2017/2.txt")
    var checksum = 0
    var lines:List<String> = file.readLines()
    for(line in lines){
        var min = Integer.MAX_VALUE
        var max = Integer.MIN_VALUE
        var list: List<String> = line.split("\t")
        for(x in list) {
            var value = Integer.parseInt(x)
            max = if(value > max) value else max
            min = if(value < min) value else min
        }
        checksum += max - min
    }
    println("Checksum: " + checksum)
}