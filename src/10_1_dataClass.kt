// 데이타 클래스(dataClass) : 내부에 특별한 로직이 있는 함수가 없이 데이터만을 포함할 수 있는 클래스
// 데이터 클래스를 흔히 VO 클래스라고도 한다.
// VO(Value-Object) : 여러 개의 데이터를 묶어서 사용하기 위한 목적으로 만든 클래스

// 코틀린에서는 이런 클래스들을 조금 더 편리하게 사용할 수 있도록 데이터클래스를 제공한다.
// 데이터 클래스는 data 예약어(키워드)를 이용해서 선언한 클래스이다.

/*
    데이터 클래스 선언 형식
    data class User(val name: String, val age:Int)

    일반 클래스와 비교
    - data 키워드 사용
    - 주 생성자를 선언
    - 주 생성자의 매개 변수는 최소 하나 이상이어야 한다.
    - 모든 주 생성자의 매개 변수는 var 또는 val로 선언해야 한다.
    - abstract, open, sealed, inner 등의 예약어를 사용할 수 없다.
 */

// ** 에러의 경우
//data class User() // 주 생성자의 매개 변수가 없다.
//data class User2(name:String)   // 매개 변수에 val/var 선언이 안되어 있음
//data abstract class User3(val name:String, val age:Int) // abstract 키워드 사용
//data class User4(val name:String, id:Int) // id에 var/val 선언이 안되어 있음

/*
    데이터 클래스의 함수

    - 데이터 클래스는 클래스 내에 데이터와 관련된 다양한 함수를 제공을 한다.
    - 따라서, 개발자가 클래스 내에선언하지 않아도 자동으로 다음과 같은 함수를 제공받는다.

    - equals() / hashCode / toString()
    - componentN()
    - copy()
 */

class Product(val name:String, val price:Int)

data class User(val name:String, val age:Int)

fun main(args:Array<String>):Unit {
    // 일반 클래스의 equals()함수는 객체를 비교하고, 데이터는 비교하지 않는다.
    var prod1 = Product("상품1", 10000)
    var prod2 = Product("상품1", 10000)
    // 객체와 객체를 비교
    println(prod1.equals(prod2))

    // 데이터 클래스의 equals()함수는 객체를 비교하지 않고 객체의 데이터를 비교한다.
    val user1 = User("홍길동", 50)
    val user2 = User("홍길동", 50)
    // 데이터 클래스는 데이터와 데이터를 비교
    println(user1.equals(user2))

    val user3 = User("홍길동", 40)
    println(user1.equals(user3))
}