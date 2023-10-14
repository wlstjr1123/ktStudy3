// 함수 식별

// 같은이름의 추상함수가 여러개 일 때

interface Interface1 {
    fun funcA()
}

interface Interface2 {
    fun funcA()
}

abstract class Parent1 {
    abstract fun funcA()
}

class Child: Parent1(), Interface1, Interface2 {
    override fun funcA() { // 같은 이름의 함수가 여러개이지만 상속받은 함수의 실행부분이없어 문제가 되지 않는다
        println("Childe의 funcA() 호출....")
    }

}

fun main(args: Array<String>):Unit {
    val obj = Child()
    obj.funcA()
}