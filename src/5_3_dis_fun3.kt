// 인터페이스에 같은 이름의 일반함수가 여러 개일 경우에 이용방법
// 인터페이스 함수는 반드시 일반함수라도 재정의 해줘야 한다

interface Interface4 {
    fun funcA() {
        println("Interface4의 funcA()호출......")
    }
}

interface Interface5 {
    fun funcA() {
        println("Interface5의 funcA()호출......")
    }
}

class Child3: Interface4, Interface5 {
    override fun funcA() {
        super<Interface5>.funcA()
//        super<Interface4>.funcA()
    }

    fun funcB() {
        super<Interface4>.funcA()
    }
}

fun main(args:Array<String>):Unit {
    val obj = Child3()
    obj.funcA()
    obj.funcB()
}