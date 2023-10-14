// Sealed 클래스 : 몇개의 타입을 하나로 묶어 주는 클래스이다.
//
//// Sealed 클래스는 enum 클래스의 사용 목적과 같다.
//// 왜 Sealed 클래스를 사용하냐면 열거형 클래스는 모든 열거 상수에 같은 형태의 데이터만을
//// 추가 할 수 있지만, Sealed 클래스는 내부의 서브클래스를 일반 클래스처럼 똑같이 사용할 수 있도록 하고있다.
//// 즉, 데이터를 서브클래스별로 다양하게 구설할 수 있다
//
//// 일반 클래스를 이용해서 내부에 서브클래스를 사용하는 것과
// sealed 클래스를 이용해서 서브클래스를 사용하는 것은 차이가 있다.

// 일반클래스는 자신을 직접 이용하는 것을 목적으로 하지만, Sealed클래스는 자신안에
// 열겨된 객체 중의 하나를 사용하는 것이 목적이기 때문에 자신의 클래스를 생성할 수 없다.

sealed class Shape {
    class Rectangle(val width: Int, val height:Int):Shape()
    class Circle(val radius: Double) : Shape() {
        var a:Int = 1;
    }
}

class Triangle(val bottom: Int, val height: Int): Shape()

fun main(args:Array<String>):Unit {
    val rec:Shape = Shape.Rectangle(10, 10)
//    val rec2:Shape = Shape() // 자신을 이용하는 목적이 아니기 때문에 에러
    val tru:Shape = Triangle(20, 10)
    val cir:Shape.Circle = Shape.Circle(10.1)

    cir.a

}