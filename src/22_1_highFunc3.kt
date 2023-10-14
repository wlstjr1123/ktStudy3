// filter() 함수의 내부
/*
    inline fun UntArray.filter(
        predicate: (Int) -> Boolean
    ):List<Int>
 */

fun aaa(num: Int, y:(Int) -> Int, z:(Int) -> Boolean) {

}

fun main(args:Array<String>):Unit {
    val array = arrayOf(100, 1, 22, 33, 5, 9, 200)
    array.filter{ x -> x > 10 }.forEach { x -> println(x) }

    aaa(100, {it * it}, {it > 100})
    aaa(100, {it * it}) {it > 100}

    // () 밖에 작설할 수 있는 함수 타입은 맨 마지막 인수만 가능하다.
//    aaa(100) {it * it} {it > 100} // 에러
}