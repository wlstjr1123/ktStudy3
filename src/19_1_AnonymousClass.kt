// 익명클래스(Anonymous Class)
// enum Class 안에 있는 열거 상수는 사실상 객체이다
// 열거 상수는 enum Class를 상속받는 서브 클래스이다.
// 그리고, 서브클래스명이 없는 익명 클래스 이기도하다.

/*
    enum Class Mode { SELECTION } // 선언했다면

    SELECTION은 Mode 클래스를 상속받는 하위 클래스이다.

    따라서,enum class Mode(val str:String) 이렇게 선언한다면
    하위 클래스는 상위 클래스의 생성자에 맞추기 떄문에
    SELECTION("pen")로 표현하는 것이다.
 */

enum class Direction7 {
    EAST {
        override val data: Int = 100

        override fun enumFunc() {
            println("EAST의 함수... ...")
        }

    },
    WEST {
        override val data: Int = 200

        override fun enumFunc() {
            println("WEST의 함수... ...")
        }

    }; // 세미콜론은 열거상수와 프로퍼티 또는 함수와 구분하기 위해 반드시 표기해야 한다.

    abstract val data: Int
    abstract fun enumFunc()
}

fun main(args:Array<String>):Unit {
    val direction: Direction7 = Direction7.WEST
    println(direction.data)
    direction.enumFunc()
}