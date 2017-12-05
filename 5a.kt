package adventOfCode2017

import java.io.File

/**
 * Created by davidtran on 2017-12-05.
 */
fun main(args: Array<String>) {
    val file = File("src/adventOfCode2017/5.txt")
    var lines:List<String> = file.readLines()
    var instructions:IntArray = IntArray(lines.size)
    for(x in 0..lines.size-1) {
        instructions[x] = Integer.parseInt(lines[x])
    }

    var listSize = instructions.size   //1003
    var index = 0
    var jumps = 0
    var nbrOfSteps = 0


    while(index < listSize) {
        jumps++
        nbrOfSteps = instructions[index]++
        index += nbrOfSteps
    }
    println("Jumps made: ${jumps}")
}