// 객체지향 프로그램에서 프로그램 단위는 클래스, 인터페이스가 있다.
// 인터페이스는 추상함수(메소드)를 선언하는것이 주 목적이다.
// 인터페이스는 객체 생성이 불가능하다. (생성자가 없다.)
// 따라서, 클래스에서 구현(재정의)을 해서 사용해야 한다.

// 추상클래스와 인터페이스의 차이점은 우선, 클래스이냐 아니냐의 차이
// 추상클래스는 특정 객체를 정의할 목적으로 사용한다.
// (객체를 생성할 때 특정한 기능을 추상형으로 명시 해놓는다.

// 인터페이스는 객체를 정의할 목적으로 사용되는 것이 아니라 어떤 객체이든간에
// 특정 기능을 가질수 있도록 명시해 놓는다.

/* 인터페이스 형식
    interface 인터페이스명 {
        ...
    }

    인터페이스를 구현할 때 코드 형식
    class 클래스명:인터페이스    // 주의할점은 객체를 생성할 수 없기 때문에 (:)다음에 인터페이스명만 붙인다.
 */

interface MyInterface {
    var aa: String

    fun myFunc() {
        println("myFunc() ......")
    }
    fun myFunc2()
}

class MyInterfaceDemo : MyInterface {
    override var aa: String = "1"

    override fun myFunc2() {
        println("myFunc2() ......")
    }

}

fun main(args:Array<String>):Unit {
    val demoObj = MyInterfaceDemo()

    demoObj.myFunc()
    demoObj.myFunc2()
}