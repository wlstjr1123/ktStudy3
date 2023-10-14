fun main(args:Array<String>):Unit {
    // Set은 중복을 허용하지 않는다.
    val immutableSet = setOf<String>("hello", "hi", "hi", "kotlin")
    // set은 데이터 접근시 elementAy()함수를 이용한다.
    println("${immutableSet.elementAt(0)}, ${immutableSet.elementAt(1)}, ${immutableSet.elementAt(2)}")

    val mutableSet = mutableSetOf<String>()
    // Set 값을 추가시 add()함수를 이용한다.
    mutableSet.add("Hi")
    mutableSet.add("Kotlin")
    println("${mutableSet.elementAt(0)}, ${mutableSet.elementAt(1)}")
    mutableSet.remove("Hi")
    println(mutableSet)
    mutableSet.add("world")
    println(mutableSet)

    val set2: MutableSet<Int> = mutableSetOf(3, 3, 1, 2)
    set2.remove(2)
    set2.add(5)
    println(set2)

    val set3: HashSet<Int> = hashSetOf(3, 3, 1, 2)
    set3.remove(2)
    set3.add(5)
    println(set3)
}