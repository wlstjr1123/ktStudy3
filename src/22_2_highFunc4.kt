// 고차함수의 함수 반환

fun bbb(str: String):(x: Int, y: Int) -> Int {
    when(str) {
        "+" -> return {x, y -> x + y}
        "-" -> return {x, y -> x - y}
        "*" -> return {x, y -> x * y}
        "/" -> return {x, y -> x / y}
        else -> return {x, y -> x % y}
    }
}

fun main(args:Array<String>):Unit {
    val result = bbb("*")
    println("result : ${result(10, 2)}")
}