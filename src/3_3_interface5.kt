// 인터페이스를 객체의 타입으로 사용하기

interface InterfaceAAA {
    fun interfaceAAA()
}

open class SuperAA() {
    fun superAA() {
        println("superAA() ....")
    }
}

class SubAA: SuperAA(), InterfaceAAA {
    override fun interfaceAAA() { println("interfaceAAA() .... ") }

}

fun main(args:Array<String>):Unit {
    val obj1:SubAA = SubAA()
    val obj2:SuperAA = SubAA()
    val obj3:InterfaceAAA = SubAA()  // 인터페이스 타입으로 변수 선언

    obj1.superAA()
    obj1.interfaceAAA()

    obj2.superAA()
//    obj2.interfaceAAA() // 접근 불가

//    obj3.superAA() // 접근불가
    obj3.interfaceAAA()
}
