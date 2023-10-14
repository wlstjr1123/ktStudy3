// 데이터 분해선언(Destructuring declarations)

data class Flower(val name:String, val price:Int)

fun main(args:Array<String>):Unit {
    var flower = Flower(price = 2000, name = "장미")

    val (name, price) = flower // 데이터 분해선언
    // val name = flower.component1()
    // val frice = flower.component2()

    println("name: $name")
    println("name: $price")
}