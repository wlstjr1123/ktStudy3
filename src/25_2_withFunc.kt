// with 함수 : run 함수와 사용목적이 같다.

fun main(args:Array<String>):Unit {
    val a = 3
    val b = 7

//    (a*b - b*b).run{
//        println(this)
//        println(-this)
//    }

    with(a*b - b*b){
        println(this)
        println(-this)
    }

    val person = Person25_1()

    with(person) {
        this.name = "홍길동"
        this.age = 17
        println("$name $age")
    }
}