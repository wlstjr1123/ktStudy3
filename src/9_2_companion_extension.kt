// 동반자 객체의 확장함수 : companion 키워드를 이용해서 확장함수를 사용하기

// 동반자 객체의 확장함수 형식
/*
    // 동반자 객체는 클래스 이름만으로 접근가능하지만
    // 확장함수에서는 클래스 이름만 적을경우 동반자 객체가 아닌 클래스 자체의 멤버함수가
    // 추가되기 때문에 반드시 Companion 키워드를 사용해야 한다.
    fun 클래스이름.Companoin.함수이름()
 */


class Aaa {
    companion object{ }
}

fun Aaa.Companion.a() = Aaa() // 동반자 객체에 a()함수를 주입

fun main(args:Array<String>):Unit {
    val obj = Aaa.a() // Aaa의 동반자 객체에 있는 a()함수를 호출
}