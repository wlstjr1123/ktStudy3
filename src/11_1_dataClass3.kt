data class Professor(val name:String, val subject:String) {
    var email: String = "aaa@aaa.net"
}

fun main(args:Array<String>):Unit {
    // 데이터 클래스의 equals()함수는 주 생성자의 매개변수 값만 비교한다.
    // 클래스 내에 있는 프로퍼티는 비교하지 않는다.
    val professor1 = Professor("홍길동", "컴퓨터공학")
    println(professor1.email)
    val professor2 = Professor("홍길동", "컴퓨터공학")
    professor2.email = "bbb@bbb.net"

    println(professor1.equals(professor2))
}