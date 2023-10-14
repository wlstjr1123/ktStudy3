// lateinit : 프로퍼티의 초기화를 유예하는 기능의 키워드

// 클래스의 프로퍼티는 선언과 동시에 초기화하거나
// init 블럭 안에서 초기화를 하기도 한다.

// 이러한 강제성은 사용상 불편한 점이 많다.

class Point(val x:Int, val y:Int) {

}

class Rectangle {
    var p1:Point = Point(10, 10)
    lateinit var p2:Point // 초기화 하지않아도 에러가 나지 않음
    // lateinit은 var 프로퍼티에만 붙일 수 있다.

    val width:Int get() = p2.x - p1.x
    val height:Int get() = p2.y - p1.y

    val size get() = width * height


}

fun main(args:Array<String>):Unit {
    val rectangle = Rectangle()
    rectangle.p1 = Point(4, 2)
    rectangle.p2 = Point(10, 10)

    println("가로: ${rectangle.width}")
    println("세로: ${rectangle.height}")
    println("넓이: ${rectangle.size}")
}