// 인터페이스는 서로 다른 인터페이스끼리 상속을 받을 수 있다.
// 이때 다중상속(여러 인터페이스를 한꺼번에 상속)받을 수 있다.

interface MyInterface2 {
    fun myFunc2()
}

interface MyInterface3 {
    fun myFunc3()
}

interface MyInterface4: MyInterface2, MyInterface3{
    fun myFunc4()
}

class Demo : MyInterface4 {
    override fun myFunc4() {

    }

    override fun myFunc2() {

    }

    override fun myFunc3() {

    }

}

class Demo2 : MyInterface2, MyInterface3 {
    override fun myFunc2() {
    }

    override fun myFunc3() {
    }
}

fun main(args:Array<String>):Unit {

}