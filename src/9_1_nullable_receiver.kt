// Nullable Receiver

// ?(nullable 연산자 : null값을 저장할 수 있는 변수를 저장할 때 사용하는 연산자)

fun String?.isNumber2() {
    if (this == null) {
        println("문자열이 null 입니다...")
    }
}

// isNumber2 확장 함수의 리시버 타입이 Nullable이기 떄문에, null 값을 갖더라도 isNumber2() 확장
// 함수를 호출 할 수 있다.
fun main(args:Array<String>):Unit {
    val empty: String? = null
    empty.isNumber2()
}