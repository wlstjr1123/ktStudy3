/*
    run() 함수 사용 형태

    - 람다함수를 실행하고 그 결과를 바로 얻기 위한 목적으로 사용하는 경우

        inline fun <R> run(block: () -> R):R

    - 객체의 맴버에 접근하기 위해서 사용하는 경우
 */

fun main(args:Array<String>):Unit {
    val result = run {
        println("람다 함수 호출")
        10 * 10
    }

    println("result: $result")
}