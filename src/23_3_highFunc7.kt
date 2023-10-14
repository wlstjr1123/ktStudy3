fun main(args:Array<String>):Unit {
    fun aa(a: (Int) -> Int) {
        println("${a(100)}")
    }

    // 익명함수를 이용한 고차함수 호출
    aa(fun(x:Int):Int = x * 5)
    aa({x: Int -> x * 5})
}

/* 함수 형식 구분

    일반함수,
    익명함수,
    람다함수
 */