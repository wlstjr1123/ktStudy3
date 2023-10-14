// Iterator(반복자) : 컬렉션 타입의 데이터를 순회하면서 접근하는 객체(인터페이스)
// iterator() 함수를 이용해서 각 컬렉션 타입의 Iterator객체를 만들 수 있다.
// Iterator의 함수

// hasNext() : 접근할 수 있는 데이터가 있으면 true, 없으면 false를 리턴한다.
// next() : 실제 데이터를 가져올 때 사용한다.

fun main(args:Array<String>):Unit {
    // list Iterator 사용예
    val list = listOf<String>("hi", "kotlin", "hello")
    val iterator = list.iterator() // LIst의 Iterator 객체를 생성

    while(iterator.hasNext()) {
        println(iterator.next())
    }

    // Map Iterator 사용예
    val map = mapOf<String ,String>("a" to "analog", "d" to "digital")
    val mapIterator:Iterator<Map.Entry<String, String>> = map.iterator()
    while(mapIterator.hasNext()) {
        val entry = mapIterator.next()
        println("${entry.key}: ${entry.value}")
    }

    // Set Iterator 사용예
    val set = setOf<String>("hello", "World", "World")
    val setIterator = set.iterator()
    while(setIterator.hasNext()) {
        println("${setIterator.next()}")
    }

    // Array Iterator 사용예
    val array = arrayOf(10, "good", "bad")
    val arrayIterator = array.iterator()
    while(arrayIterator.hasNext()) {
        println("${arrayIterator.next()}")
    }
}