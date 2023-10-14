// 객체의 여러멤버(함수, 변수)에 접근할 떄에도 유용하게 사용할 수 있는 run()함수

// inline fun <T, R> T.run(block: T.() -> R:)R // API 정의

class Student24_2() {
    var name: String? = null
    var age: Int? = null
    fun speak() {
        println("hi $name")
    }

    fun getInfo() {
        println("이름 : $name, 나이: $age")
    }

}

fun main(args:Array<String>):Unit {
    val student = Student24_2()
//    student.name = "홍길동"
//    student.age = 24
//    student.speak()
//    student.getInfo()

    val runStudent = student.run {
        name = "홍길순"
        age = 28
        speak()
        getInfo()
        1
    }

    println("runStudent: $runStudent")
}