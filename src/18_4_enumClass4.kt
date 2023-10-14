enum class Direction5(var num:Int, var str:String) {
    NORTH(1, "북"), SOUTH(2, "남"), EAST(3, "동"), WEST(4, "서")
}

fun main(args:Array<String>):Unit {
    val direction: Direction5 = Direction5.SOUTH

    println("${direction.num}, ${direction.str}")

    direction.str = "남쪽"
    direction.num = 100
    println("${direction.num}, ${direction.str}")
}