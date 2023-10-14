// inner Class(내부 클래스)

class Outer2 {
    var num:Int = 100
    fun outerfun() = println("Outerfun의 outerfun()... ...")

    inner class Nested {
        val name: String = "홍길동"
        fun myFunc() {
            println("Nested의 myFunc()... ...")
            num = 200 // inner덕분에 내부클래스의 상위클래스의 프로퍼티에 접근이 가능해짐
            outerfun()
        }
    }

    fun createNested(): Nested {
        return Nested()
    }
}

fun main(args:Array<String>):Unit {
    val obj: Outer2.Nested = Outer2().Nested() // inner클래스를 객체로 만드려면 상위 클래스를 생성하고 그다음 Nested객체를 생성 해줘야 한다.
    val obj2: Outer2.Nested = Outer2().createNested()
    println(obj.name)
    println(obj2.name)
    obj.myFunc()
    obj2.myFunc()
}