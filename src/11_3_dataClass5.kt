// 데이터 클래스에서 제공하는 componentN() 함수
// 데이터의 클래스의 프로퍼티에 값을 가져올 때 프로퍼티의 이름을 사용하는 경우가 있고,
// componentN() 함수를 이용할 수도 있다.

// componentN() 함수는 component1(), component2() ...식으로 사용하는데,
// 주 생성자의 프로퍼티가 2개인 경우에는 component1(), component2() 함수가 자동으로 만들어 진다.
// 주 생성자의 프로퍼티가 3개인 경우에는 component1(), component2(), component3() 함수가 자동으로 만들어 진다.

data class Car(val name:String, val speed: Int)

fun main(args:Array<String>):Unit {
    var car = Car("카1", 200)

    println(car.name)
    println(car.speed)

    println(car.component1())
    println(car.component2())
}