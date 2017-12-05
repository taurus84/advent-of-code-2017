package adventOfCode2017

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.io.File

/**
 * Created by davidtran on 2017-12-04.
 */
fun main(args: Array<String>) {
    val file = File("src/adventOfCode2017/4a.txt")
    var total = 0
    file.forEachLine {
        var list: List<String> = it.split(" ")
        var list2:ArrayList<List<Char>> = ArrayList()
        println(list)
        for(index in 0..list.size-1) {
            list2.add(list[index].toCharArray().sorted())
        }
        var list3 = list2.distinct()

        if(list2.equals(list3)) {
            total++
        }
    }
    println("TOTAL: ${total}")
}