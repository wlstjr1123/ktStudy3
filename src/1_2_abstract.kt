// 추상 클래스는 그 자체로는 객체를 생성할 수 없다.
// 추상 클래스는 선언부에 open 키워드를 명시하지 않아도 다른 클래스가 상속 할 수 있다.
abstract class Super3 // 추상클래스는 open 키워드가 기본적으로 설정 되어 있다.
{
    val aa: Int = 100
    abstract val bb: Int

    fun myFunc1() {}

    abstract fun myFunc2() // 추상함수도 선언부에 open 키워드가 생략되어 있다.
}

class Sub3: Super3() {
    override val bb: Int = 200 // 프로퍼티 재정의

    override fun myFunc2() { // 함수 재정의
    }

}

fun main(args:Array<String>):Unit {
//    val obj1 = Super3() // 추상클래스를 객체화 할 수 없음
    val obj = Sub3()

}