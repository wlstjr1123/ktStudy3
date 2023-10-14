// 클래스에서 여러 인터페이스를 구현
// 자바에서는 클래스를 상속받을 때 extends, 인터페이스를 구현할 때 implements
// 코틀린에서 구현(상속) : 을 이용 한다.
// 여려 개의 인터페이스를 구현(상속) 받을 때는
// class Aa : InterfaceA, InterfaceB

interface InterfaceA {
    fun interfaceA()
}

interface InterfaceB {
    fun interfaceB()
}

class Aa: InterfaceA, InterfaceB {
    override fun interfaceA() { println("interfaceA() ....") }

    override fun interfaceB() { println("interfaceB() ....") }

}

fun main(args: Array<String>):Unit {
    val obj = Aa()
    obj.interfaceA()
    obj.interfaceB()
}