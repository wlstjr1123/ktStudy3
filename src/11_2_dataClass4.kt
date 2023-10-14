class Teacher(val name:String, val age:Int)

data class Teacher2(var name:String, val age:Int) {
    val email:String = "test@test.com"
}

fun main(args:Array<String>):Unit {
    var teacher = Teacher("홍길동", 55)
    println(teacher.toString())

    // 데이터 클래스의 toString()함수는 객체가 가지고 있는 값을 반환한다.
    // 이 때의 값은 주 생성자의 프로퍼티 값만을 반환한다.
    // 클래스 내부에 있는 프로퍼티 값은 출력하지 않는다.

    // toString() 함수는 일반적으로 디버깅시에 로그 출력용을 많이 사용한다.
    // 객체의 데이터가 정상적으로 대입됬는지 확인하는 용도
    var teacher2 = Teacher2("홍길북", 33);
    println(teacher2.toString())
}