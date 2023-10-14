fun main(args:Array<String>):Unit {
    val immutableMap = mapOf<String, String>(Pair("one", "hello"), Pair("two", "kotlin"))
    println("${immutableMap.get("one")}, ${immutableMap.get("two")}")

    val immtableMap2 = mapOf<String, String>("one" to "hi", "two" to "kotlin")
    println("${immtableMap2.get("one")}, ${immtableMap2.get("two")}")
//    immtableMap2.set("one", "asd") // set은 사용불가

    val mutableMap = mutableMapOf<String, String>()
    // put()함수를 이용해서 추가
    mutableMap.put("a", "analog")
    mutableMap.put("d", "digital")
    println("${mutableMap.get("a")}, ${mutableMap.get("d")}")
    mutableMap.set("d", "digital life")
    mutableMap.set("a", "analog life")
    mutableMap.set("c", "c life")
    println("${mutableMap.get("a")}, ${mutableMap.get("d")}, ${mutableMap.get("c")}")
}