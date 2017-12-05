package adventOfCode2017

import java.io.File

/**
 * Created by davidtran on 2017-12-04.
 */
fun main(args: Array<String>) {
    val file = File("src/adventOfCode2017/4a.txt")
    var lines:List<String> = file.readLines()
    var num = 0
    var total = 0

    file.forEachLine {
        total++
        var list: List<String> = it.split(" ")
        var list2:List<String> = list.distinct()

        if(list.equals(list2)) {
            num++
        }
    }

    println("TOTAL: ${total}")
    println("VALID: ${num}")


}