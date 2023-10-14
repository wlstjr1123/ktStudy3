// 자바의 List, Set, Map 이용
// 코틀린에서도 자바의 List, Set, Map을 사용할 수 있다.

//import java.util.ArrayList
//import java.util.HashSet

fun main(args:Array<String>):Unit {
//    val hashSet = hashSetOf(1, 2, 3) // Kotlin.collection에 있는 코틀린의 hashSet
    val list:ArrayList<String> = ArrayList()
    list.add("Hello")
    list.add("World")
    println("${list.get(0)}, ${list.get(1)}")

    val map:HashMap<String, String> = HashMap()
    map.put("first", "Hi")
    map.put("second", "Kotlin")
    println("${map["first"]}, ${map.get("second")}")

    val set:HashSet<String> = HashSet()
    set.add("hi")
    set.add("goodmorning")
    set.add("goodmorning")
    set.add("Kotlin")

    println("${set.size}, ${set.elementAt(0)}, ${set.elementAt(1)}")
}