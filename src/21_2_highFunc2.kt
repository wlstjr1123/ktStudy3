fun aa(x:Int, funParam: (Int) -> Int) {
    val result = funParam(10)
    println("x: $x, result: $result")
}

fun main(args:Array<String>):Unit {
//    aa(10, { x -> x*x })
    aa(10) { x -> x*x }
}