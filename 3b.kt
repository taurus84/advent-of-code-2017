package adventOfCode2017

/**
 * Created by davidtran on 2017-12-03.
 */

val RIGHT:Int = 0
val UP:Int = 1
val LEFT:Int = 2
val DOWN:Int = 3
var grid = Array(20, {IntArray(20)})
var direction = RIGHT
var index = 0
var xPos = 10
var yPos = 10

fun main(args: Array<String>) {
    grid[xPos][yPos] = 1

    //index represents direction, value represents number of steps in that direction
    val stepsArray = arrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20)

    loop@while (stepsArray[index] != 20) {
        direction = index % 4
        for (x in 1..stepsArray[index++]) {
            when(direction) {
                RIGHT -> println("Direction: RIGHT")
                UP -> println("Direction: UP")
                LEFT -> println("Direction: LEFT")
                DOWN -> println("Direction: DOWN")
            }
            goToNextPosition(direction)
            var sum = countAdjacent()
            if (sum > 277678) {
                println("Answer is: ${sum} at position ${xPos},${yPos}")
                break@loop
            }
            grid[xPos][yPos] = sum

        }
    }
}

fun countAdjacent():Int {
    return  grid[xPos-1][yPos+1] + grid[xPos][yPos+1] + grid[xPos+1][yPos+1] +
            grid[xPos-1][yPos]   + /*own position*/   + grid[xPos+1][yPos] +
            grid[xPos-1][yPos-1] + grid[xPos][yPos-1] + grid[xPos+1][yPos-1]
}

fun goToNextPosition(direction:Int):Unit {
    when(direction) {
        RIGHT  -> xPos++
        UP     -> yPos++
        LEFT   -> xPos--
        DOWN   -> yPos--
    }
}