// 데이터 클래스에서 제공하는 copy함수 : 이름 그래도 객체를 복사해서 다른 객체를 만들어주는 함수
// 객체의 일부분의 데이터만 변경해서 다른 객체를 만들 떄 유용하게 사용

data class Product2(val name:String, val price:Int)

fun main(args:Array<String>):Unit {
    var prod = Product2(price = 10000, name = "상품1")
    println(prod.toString())

    var prod2 = prod.copy(name="상품2")
    println(prod2.toString())

}