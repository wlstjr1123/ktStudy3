/*
    람다 표현식 : 함수 프로그래밍 언어에서 코드의 간결함을 주 목적으로 한다. (함수 축약형)

    일반 함수 형식
    fun 함수이름(매개변수) { 실행 코드들 }

    일반함수의 축약형 : 람다식
    { 매개변수 -> 실햌코드들 }

    람다 함수의 규칙
    - 람다 함수는 항상 {}으로 감싸서 표현 해야 한다.
    - {}안에 -> 연산자가 있으며, ->왼쪽에는 매개변수, 오른쪽에는 실행코드들이 위치한다.
    - 매개변수 타입을 선언해야 한다. 추론 할 수 있을 떄는 생략할 수도 있다.
    - 함수의 반환값은 실행코드들에서 마지막에 표현

    예>
    일반 함수의 형식
    fun sum(x: Int, y: Int):Int {
        return x + y
    }

    람다식으로 전환하면,
    val sum = { x: Int, y: Int -> x + y }

    fun main(args: Array<String>):Unit {
        val result = sum(10, 11)
    }

    람다식은 익명함수여서 호출하여 이용할 수가 없다. 따라서,
    주로 변수에 대입을 해서 사용을 하는데, 변수를 사용하지 않고 람다 함수를 호출하려면
    다음과 같이 사용한다.

    { println("Hello") } // 람다함수를 만들자마자 호출하는 예
    run { println("Hello" } // 람다함수를 만들자마자 호출하는 예

    매개 변수가 없는 람다 함수
    val sum = { -> 100 + 100 } // 매개 변수가 없기 때문에 (->)생략 가능

    함수의 실행코드가 여러 줄일 때
    val sum = { x:Int, y:Int ->
        println("sum 호출 ...")
        x + y // 리턴 표현식
    }

    ** 함수 타입 : 매개변수의 형식과, 리턴 타입의 형식, 몇개의 매개변수를 갖는지...

    fun myFunc(x: Int, y: Int):Boolean {
        return x > y
    }

    val lamdaFunc: (Int) -> Int = { x: Int -> x * 2 }

    typealias 키워드를 이용한 타입 정의

    typealias MyType = (Int) -> Boolean
    val myFunc: MyType = { it > 10 } // it은 매개변수가 하나일때 사용할수 있는 키워드

    val lamdaFunc: (Int) -> Int = { x -> x + 10 } // 식을 it을 이용해서 표현하면
    = (다음과 같다.)
    val lamdaFunc: (Int) -> Int = { it + 10 }

    * it은 타입이 정의 되어 있는 곳에서만 사용할 수 있다.

    val lamdaFunc = { it * 10 } // 에러 발생
 */
typealias MyType = (Int) -> Boolean

fun main(args:Array<String>):Unit {
    val lamdaFunc: (Int) -> Int = { x: Int -> x * 2 }
    lamdaFunc(2);
    println(lamdaFunc(2));

    val myFunc: MyType = { it > 10 } // it은 매개변수가 하나일때 사용할수 있는 키워드
    myFunc(2)
    println(myFunc(2));

}