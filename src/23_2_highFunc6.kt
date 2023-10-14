// 익며함수를 이용한 함수 전달

fun main(args:Array<String>):Unit {

    // 람다함수를 이용
    val lamdaFunc = { x: Int ->
        println("람다 함수....")
        x * 100
        // return x * 100 // 람다함수에서는 return을 사용할 수 없다.
        // 반환 타입을 명시할 수 없다.
    }

    println(lamdaFunc(5))

    // 익명함수 이용
    val anonyFunc = fun(a:Int): Int = a * 100

    val anonyFunc2 = fun(a:Int): Int {
        println("익명함수 ... ...")
        return a * 100
    }

    println(anonyFunc2(3))
    println(anonyFunc(7))
}