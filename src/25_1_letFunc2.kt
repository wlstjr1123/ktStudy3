class Person25_1() {
    var name: String? = null
    var age: Int? = null

    constructor(name: String, age: Int): this() {
        this.name = name
        this.age = age
    }
}

fun letFunc(person: Person25_1) {
    println("letFunc() : ${person.name}, ${person.age}")
}

fun main(args:Array<String>):Unit {
//    val person = Person25_1("홍길남", 25)
//    letFunc(person)

    Person25_1("홍길남", 25).let { person ->
        letFunc(person)
    }

    Person25_1("홍길남", 25).let { letFunc(it) }


}
