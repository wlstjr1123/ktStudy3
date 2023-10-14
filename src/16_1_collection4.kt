fun main(args:Array<String>):Unit {
    val arrayList: ArrayList<String> = ArrayList()
    arrayList.add("Hello")
    arrayList.add("Kotlin")

    println("${arrayList[0]}, ${arrayList[1]}")
    arrayList.set(1, "World")
    println("${arrayList[0]}, ${arrayList[1]}")
}