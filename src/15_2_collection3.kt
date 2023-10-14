// List, Set, Map

// List : 순서가 있는 데이터의 집합, 데이터의 중복을 허용함
// Set(집합) : 순서가 없고, 중복을 허용하지 않는다.
// Map : 키와 값으로 이루어지는 데이터의 집합, 순서가 없고, 키의 중복은 허용하지 않는다

// 클래스도 가변(mutable)클래스와 불변(immutable)클래스가 있다.
// Kotlin.collection.List 인터페이스 표현되는 경우(immutable)
// size(), get()함수만 제공 (데이터를 추가 변경할수 없기 때문에)

// Kotlin.collection.MutableList 인터페이스로 표현되는 경우(mutable)
// - size(), add(), set(), get()

// Set, Map 역시 List와 마찬가지로 MutableSet, Set, MutableMap, Map 이 있다.

// List/MutableList 에 값을 할당할 때 listOf()/mutableListOf() 함수를 사용

// Set/MutableSet에 값을 할당할 때 setOf()/mutableSetOf() 함수를 사용

// Map/MutableMap에 값을 할당할 때 mapOf()/mutableMapOf() 함수를 사용

fun main(args:Array<String>):Unit {
    val immutableList:List<String> = listOf("Hi", "world")
    println("${immutableList.get(0)}, ${immutableList.get(1)}")

    val mutableList:MutableList<String> = mutableListOf("Hi", "Kotlin")
    mutableList.add("김길동")
    mutableList.set(1, "강길동")
    println("${mutableList.get(0)}, ${mutableList.get(1)}, ${mutableList.get(2)}")
}