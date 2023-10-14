fun main(args:Array<String>):Unit {
    val a = 100
    val b = 50

//    (a*b - 40 * a).run {
//        if (this > 0)
//            println(this)
//    }

    // this가 아닌 매개변수로 받는다
    (a*b - 40 * a).let {result: Int ->
        if (result > 0)
            println(result)
    }

    // 자신을 호출한 객체를 람다함수의 매개변수로 전달하는 함수
    (a*b - 40 * a).let {
        if (it > 0)
            println(it)
    }
}