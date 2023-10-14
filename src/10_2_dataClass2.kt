data class Student(val name: String, val age:Int)

data class Employee(val name:String, val age:Int)

fun main(args:Array<String>):Unit {
    // equals()함수는 서로 다른 데이터 클래스 객체는 데이터를 비교하지 않는다.
    // 같은 데이터 클래스의 객체일 떄만 데이터를 비교한다.
    val student = Student("홍길동", 22)
    val employee = Employee("홍길동", 22)
    // 서로 다른 데이터 클래스를 비교하면 데이터가 같아도 false가 나온다.
    println(student.equals(employee))
}