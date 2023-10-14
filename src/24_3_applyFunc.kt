// apply() 함수 : run() 함수와 사용목적이 같다. 하지만 리턴값이 다르다(객체 리턴)

class Student24_3() {
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
    val student = Student24_3()
    student.name = "김말똥"
    student.age = 43
    student.speak()
    student.getInfo()

    val student2 = student.apply { // 같은 객체가 됨
        name = "고길동"
        age = 43
        speak()
        getInfo()
    }

    println("student name: ${student.name}, student2 name: ${student2.name}")

    student.name = "홍길북"
    student2.name = "홍길서"
    println("student name: ${student.name}, student2 name: ${student2.name}")
}