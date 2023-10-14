// 클래스에서 상속과 구현을 혼용

interface InterfaceAA {
    fun interfaceAA()
}

interface InterfaceBB {
    fun interfaceBB()
}

open class SuperA {
    fun superA() {
        println("superA() ....")
    }
}

class Bb : SuperA(), InterfaceAA, InterfaceBB {
    override fun interfaceAA() { println("interfaceAA()...") }

    override fun interfaceBB() { println("interfaceBB()...") }

}

fun main(args:Array<String>):Unit {
    val obj = Bb()
    obj.interfaceAA()
    obj.interfaceBB()
    obj.superA()
}