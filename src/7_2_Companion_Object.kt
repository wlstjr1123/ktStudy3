// 동반자 객체 (Companion Object)
// 객체 공유

// Person 클래스는 동반자 객체로 인식된다.
// 코틀린에는 static 키워드가 없다. 대신 Companion object를 이용한다.
//// 동반자 객체는 클래스당 하나만 존재한다.
class Person private constructor() {

    companion object {  // 동반자 객체를 선언 (자바의 static 키워드를 붙인것과 같다)
        fun create():Person {
            cnt += 1
            return Person()
        }

        var cnt = 0
            private set
    }


}

fun main(args:Array<String>):Unit {
    val aa = Person.Companion.create()
    val bb = Person.create() // Companion이 생략된 상태
    val cc = Person.create()

    println(Person.cnt)
}