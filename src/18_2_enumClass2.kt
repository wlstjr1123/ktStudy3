enum class Direction
{
    NORTH, SOUTH, EAST, WEST
}

fun main(args:Array<String>):Unit {
    val direction: Direction = Direction.EAST

    // Enum 클래스는 기본적으로 name, ordinal 프로퍼티를 제공한다.
    // name: 열거상수의 문자열을 표현
    // ordinal : 열거한 순서를 나타내는 인덱스 번호
    println("${direction.name}, ${direction.ordinal}")

    // Enum 클래스에서 제공하는 values(), valuesOf() 함수
    // values() : 열거한 상수를 모두 객체로 가져오는 함수
    // valuesOf() : 인수에 전달되는 문자열에 해당하는 열거 상수를 가져오는 함수

    val directions: Array<Direction> = Direction.values()
    directions.forEach { n -> println(n.name) }
//    for (n in directions) {
//        println(n.name)
//    }

    val directionValue = Direction.valueOf("SOUTH")
    println("${directionValue.name}, ${directionValue.ordinal}")
}