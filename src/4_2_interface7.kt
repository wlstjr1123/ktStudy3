// 인터페이스의 get, set함수에 field를 사용할 수 없지만, 로직을 추가해서 사용할 수 있다.

interface InterfaceTest {
    var data1: Int

    var data2: Int
        get() = 0
        set(value) {
            if (value > 0)
                multi(value)
        }

    val data3: Boolean
        get() {
            return data1 > 0
        }

    fun multi(arg: Int) {
        data1 = arg * arg
    }
}

class InterfaceDemo: InterfaceTest {
    override var data1: Int = 0

}

fun main(args:Array<String>):Unit {
    val obj = InterfaceDemo()
    println("data1:${obj.data1}")
    println("data2:${obj.data2}")
    println("data3:${obj.data3}")

    obj.data1 = 10
    println("data1:${obj.data1}")
    obj.data2 = 3
    println("data2:${obj.data2}")
    println("data1:${obj.data1}")
    println("data3:${obj.data3}")
}