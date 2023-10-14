// 같은 이름의 추상함수, 일반함수를 이용하는 방법

interface Interface3 {
    fun funcA() {
        println("Interface3의 funcA() 호출.....")
    }
}

abstract class Parent2 {
    abstract fun funcA()
}

class Child2: Parent2(), Interface3 {
    override fun funcA() {
        println("Child2의 funcA() 호출 .....")
    }

    fun funcB() {
        super.funcA() // Interface3의 funcA()를 의미
    }
}

fun main(args:Array<String>) {
    val obj = Child2()
    obj.funcA()
    obj.funcB()
}