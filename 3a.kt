package adventOfCode2017
import kotlin.math.sqrt

/**
 * Created by davidtran on 2017-12-04.
 */
//puzzle input = 277678

fun main(args: Array<String>) {
    val puzzleInput:Double = 66.0
    var sideLength = sqrt(puzzleInput).toInt()
    if(sqrt(puzzleInput)%1 != 0.0 || sqrt(puzzleInput)%2 == 0.0) {  //check so input is not an odd round number
        if(sideLength%2 == 0) sideLength +=1 else sideLength += 2   // round up to odd number
    }
    val distanceToOutCenter = (sideLength-1)/2
    var diff = sideLength*sideLength - puzzleInput                  //number of steps backwards
    print(Math.abs(diff%(sideLength-1) - distanceToOutCenter).toInt() + (sideLength -1)/2)      //either the x or y will "go max steps"

}
