// Array(배열) : get(), set(), size() 등의 함수를 제공

fun main(args:Array<String>):Unit {
    // arratOf()함수를 이용해서 배열을 초기화한다.
    var array = arrayOf(100, "김", true) // 여러가지 타입 적용 가능

    array[0] = 10
    array[2] = "kotlin"

    println("${array[0]}..${array[1]}..${array[2]}") // 다른 타입의 함수를 적용 가능
    println("size: ${array.size}.. ${array.get(0)}..${array.get(2)}")

    // 제네릭은 < > 안에 타입을 명시해서 사용하는 것
    var arrayInt = arrayOf<Int>(100, 200, 300)
    // arrayInt[0] = "hello" // Int제네릭으로 설정했기때문에 Int타입만 가능
    println("${arrayInt[0]}..${arrayInt[1]}")

    /*
        제네릭을 사용하지 않고 배열을 만드는 방법은 "xxxArrayOf()"형식의 함수를 이용할 수도 있다.
            intArrayOf()
            booleanArrayOf()
            byteArrayOf()
            charArrayOf()
            doubleArrayOf()
            longArrayOf()
     */

    // ArrayOf 함수는 Array 클래스 타입의 배열 객체를 반환한다.
    var arrayInt2 = intArrayOf(11, 22, 33)
    var arrayDouble = doubleArrayOf(11.1, 22.2, 33.3)

    // Array 클래스를 이용한 배열 생성하기
    var array2 = Array(3, {a -> a*100})
    println("${array2[0]}..${array2[1]}..${array2[2]}")

    /*
        위 코드에서 {a -> a*100} 일반 함수 형식으로 표현하면
        a = 매개변수, a*100은 함수안의 내용
        fun aa(a:Int):Int {
            return a*100
        }
     */

    var array4 = Array<Int>(3, {a -> a*100})

    // IntArray, ByteArray, ShortArray, longArray, CharArray, FloatArray, DoubleArray, BooleanArray
    var array5 = IntArray(3, {a -> a*100})


}