// 추상 클래스 (Abstract Class) : 추상 함수를 포함하는 클래스를 의미

// 추상 함수(abstract method) : 미완성 함수(실행영역이 없는 함수)
/*
    fun 함수명 () // 선언부
    {
        ...         // 실행 영역
    }
 */

abstract class AbstractClassTest { // 추상함수를 포함하는 클래스는 앞에 abstract 지정해야 한다.
    fun myFunc1() {

    }

    abstract fun myFunc2() // 추상함수는 선언부 앞에 abstract 키워드를 붙여야한다.
}

// ** 일반적으로 객체지향언어는 추상클래스와 추상함수를 모두 제공한다.
// 코틀린에서는 추상클래스, 추상함수 뿐만아니라 추상 프로퍼티도 제공한다.

abstract class AbstractClassTest2 {
    val aa: String = "Hello World!!"
    abstract val bb : String
}