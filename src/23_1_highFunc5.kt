// 고차함수에서 매개변수와 리턴값에 람다함수를 많이 이용한다.
// 람다함수 이외에도 함수 참조나 익명 함수를 이용할 수도 있다.

// 함수 참조 연산자 ::를 이용

fun main(args:Array<String>):Unit {
    cc { it * 100 } // 람다 함수를 이용

    // 함수 참조를 이용한 고차함수 호출
    cc(::ccFun) // 함수 참조 호출
}

fun cc(funParam: (x: Int) -> Int) {
    println("${funParam(100)}")
}

fun ccFun(x:Int):Int {
    return x * 100
}