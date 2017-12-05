package adventOfCode2017

import java.io.File

/**
 * Created by davidtran on 2017-12-02.
 */

fun main(args: Array<String>) {
    val file = File("src/adventOfCode2017/2.txt")
    var checksum = 0
    var lines:List<String> = file.readLines()
    for(line in lines){
        var list: List<String> = line.split("\t")
        loop@ for(i in 0..list.size-2) {
            for(j in i+1..list.size-1) {
                var first = Integer.parseInt(list[i])
                var second = Integer.parseInt(list[j])
                if(first%second == 0) {
                    checksum += first/second
                    break@loop
                }
                else if (second%first == 0) {
                    checksum += second/first
                    break@loop
                }
            }
        }
    }
    println("Checksum: " + checksum)
}