class Employee25_4 {
    var name: String = ""
    var age: Int = 0
    var salary: Int = 0

    override fun toString() = "$name $age $salary"
}

fun main(args:Array<String>):Unit {
    println(Employee25_4().also {
        it.name = "김말똥"
        it.age = 43
        it.salary = 3000000
//        it.toString()
    })

    val employee = Employee25_4()
    employee.name = "강길동"
    employee.age = 33
    employee.salary = 2000000

    val employee2 = employee.also {
        it.name = "고길동"
        it.age = 22
        it.salary = 3000000
    }

    println(employee)
    println(employee2)

}