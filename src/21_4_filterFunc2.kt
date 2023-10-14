fun main(args:Array<String>):Unit {
    val map = mapOf<String, Int>("a" to 100, "b" to 200)
    val result = map.filter {entry -> entry.value > 100 }

    // Map은 키와 값으로 이루어진 데이터기 때문에 Map.Entry 타입으로 값이 전달된다.
    // 람다함수에서는 true가 되는 데이터만 반환한다.
    for (i in result) {
        println(i)
    }
}