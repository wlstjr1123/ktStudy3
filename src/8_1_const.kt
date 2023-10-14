// const : 변수에 접근하는 코드를 변수에 저장된 값으로 대체시키는 기능
// 인라인 함수와 비슷한 역할

// const는 프로그램 어디서나 사용할 수 있는 변수에 붙이거나, object의 프로퍼티에 붙일 수 있다.
// const가 붙은 변수에는 리터럴로 이루어진 표현식만 저장이 가능하다.

// 코틀린에서는 리터럴만 와야 하는 곳이 몇군데 있다. 이런 곳에 const가 붙은 변수를
// 사용하면 바로 리터럴로 대체 되기 때문에 사용이 편하다.

val str = "Hello" + " Kotlin"

object AaConst {
    const val bb = "Hello"
}

fun main(args:Array<String>):Unit {
    println(str) // const가 아닌 변수는 -> println(str)
    println(AaConst.bb) // 컴파알 될때 -> println("Hello") 저장된 값으로 대체
}