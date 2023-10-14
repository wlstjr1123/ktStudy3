enum class Direction2(val num:Int) {
    NORTH(0), SOUTH(1), EASH(2), WEST(3)
}

fun main(args:Array<String>):Unit {
    val direction: Direction2 = Direction2.NORTH
    println(Direction2.NORTH.num) // num값 가져오기
    println(direction.num) // num값 가져오기
}