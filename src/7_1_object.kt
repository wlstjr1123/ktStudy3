// 자바 싱글톤 패턴을 간단하게 object로 해결할 수 있다.
// object : 프로그램 전체에서 공유 가능한 유일한 객체를 만들 떄 사용한다.

// object로 선언된 객체는 open 키워드를 붙일 수 없다.

object Man {
    var name:String = ""
    var age: Int = 0
    fun info()
    {
        println(name)
        println(age)
    }
}

fun main(args:Array<String>) {
    // Man 식별자를 이용해서 멤버함수에 바로 접근
    Man.name = "홍길동"
    Man.age = 34
    Man.info()


}
