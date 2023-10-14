// 고차 함수(High-Order Function, 고계 함수) : 매개변수를 함수로 전달 받거나, 리턴 값이
// 함수인 함수를 의미한다.

/*
    일반 함수의 정의
    fun aa (x: Int, y: Int):Int {
        return x * y
    }

    고차 함수의 정의
    fun bb(x: Int, y:(Int) -> Int) {
        val result = y(100)
        println("x: $x, result: $result")
    }

    고차함수 호출
    bb(100, { x -> x * x })

 */

fun highTest(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("결과값은 $result 이다.")
}

fun main(args:Array<String>):Unit {
    // 고차함수의 매개변수가 함수인 경우에는 () 생략할 수 있다.
    highTest( { x, y -> x * y } )
    highTest { x, x2 -> x + x2 }
}