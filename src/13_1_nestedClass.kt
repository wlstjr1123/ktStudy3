// 중첩클래스 : 클래스 안에 클래스

class Outer {
    var num:Int = 100

    fun outerfun() {
        println("outerfun.....")
    }

    class Nested {
        fun greeting() = println("안녕하세요!!")
        // Nested 클래스에서 Outer 클래스에 있는 멤버에 기본적으로 접근이 불가능하다.
//        fun nestedfun() = println(num) // 에러 발생
    }
}

fun main(args:Array<String>):Unit {
    val obj:Outer.Nested = Outer.Nested()
    obj.greeting()
}