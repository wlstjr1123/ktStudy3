// 펄티링 함수 : filter()
// 컬렉션 타입의 데이터 중 조건에 맞는 데이터만을 추출해주는 함수

fun main(args: Array<String>): Unit {
    val li = listOf<Int>(11, 9, 8, 13, 30)

//    val listData = ArrayList<Int>()

//    for (i in li) {
//        if (i > 10) listData.add(i)
//    }
    // filter()함수를 적용
    // filter()함수는 컬렉션 타입의 데이터를 차례로 판단해서 조건에 맞는 데이터만 추출한다.
    val listData = li.filter { it > 10} // 필터가 데이터를 순서대로 검사하면서 변수에 조건에 맞는 데이터를 넣는다

    for(i in listData) {
        println(i)
    }
}