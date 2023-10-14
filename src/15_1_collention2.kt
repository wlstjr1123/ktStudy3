// 빈 배열 선언하기 ( arrayOfNulls() )

fun main(args:Array<String>):Unit {
//    var array = arrayOfNulls<Int>(3) // Int형의 값을 담을 수 있는 크기가 3인 빈 배열 선언
    var array = arrayOfNulls<Any>(3) // 모든 데이터 타입을 담을 수 있는 빈 배열 선언

    println("${array[0]}")
    array[0] = 11
    array[1] = ""
    array[2] = false

    println("${array[0]} .. ${array[1]} .. ${array[2]}")

    var array2 = Array<String>(3, {""}) // 빈 문자열이 들어있는 크기가 3인 String 타입의 배열 선언
    println("${array2[0]} .. ${array2[1]} .. ${array2[2]}")
    array2[0] = "하이!!"
    array2[1] = "안녕하세요!!"
    array2[2] = "코틀린"
    println("${array2[0]} .. ${array2[1]} .. ${array2[2]}")
}