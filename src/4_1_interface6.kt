// 인터페이스와 프로퍼티

/*
    인터페이스에 프로퍼티를 정의할 떄 규칙

    1. 추상형(추상 프로퍼티)으로 선언한다.
    2. 추상형이 아니라면 get(), set()함수를 반드시 선언해야 한다.
    3. 추상형이 아니고 var인 경우에는 get(), set() 함수를 반드시 선언해야 한다.
    4. 추상형이 아니고 val인 경우에는 get() 함ㅅ를 반드시 선언해야 한다.
    5. 인터페이스의 프로퍼티로 사용하기 위해서 get(), set()함수에 field를 사용할 수 없다.
 */

interface MyInterfaceTest {
    var aa: Int // 추상형

//    val bb:String = "Hello World" // get, set이 없기 때문에 에러

//    val cc: String
//        get() = field // get, set 함수에 field 사용했기 때문에 에러

//    var dd:String
//        get() = "Hello World" // set함수가 없기 때문에 에러

    val ee: String
        get() = "Hello World" // val은 get만 가능하기에 에러가 나지 않는다.

    var ff: String
        get() = "Hi World"
        set(value) {}       // var는 get, set함수가 모두 있기 때문에 에러가 나지 않는다.
}