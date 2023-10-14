// 확장함수(Extension Function) : 상속하지 않고 클래스 외부에서 멤버함수를 추가하는 기능

// String 클래스는 open 키워드가 붙어있지 않는다. 따라서, 상속을 받을 수 없다.
//// 맴버함수를 추가할 수 가 없다.
//// 코틀린 내장된 클래스는 사용자가 마음대로 멤버함수를 추가 할 수 없다.

// 확장함수를 이용하면 상속 없이 클래스 외부에서 멤버함수를 추가할 수 있다.

// 문자열이 숫자로만 이루어져 있는지 판단하는 함수

/* 확장 함수 형식

    fun 함수를 주입할 클래스명.함수명

    여기서 함수를 주입할 클래스를 리시버(receiver)타입이라고 한다.

    리시버 타입의 멤버 함수(프로퍼티)에 접근하려면 this키워드를 이용한다.
    단, 멤버가 private, protected인 경우에는 접근이 불가

    아래에 있는 isNumber()함수는 String 클래스에 있는 함수가 아니라
    주입한 함수 이다.

    따라서, isNumber()함수가 마치 String 클래스에 있는 것처럼 사용할 수 있다.

    여기서, 이러한 isNumber()함수를 확장함수라고 한다.

    ** 만일 주입한 함수명과 멤버 함수명이 같을 경우에는
    주입한 함수(확장 함수)는 감춰지게 된다. 즉, 함수 호출시에 멤머 함수만 호출된다.

        오류가 나지 않기 때문에 혼란스러울 수 있다.

 */

fun String.isNumber():Boolean {
    var i = 0
    while (i < this.length) {
        if (('0' <= this[i] && this[i] <= '9'))    // 유니코드로 숫자인지를 판별
            return false
        i += 1
    }
    return true
}

fun main(args:Array<String>):Unit {
    println("012124324231234".isNumber())
    println("1000달러".isNumber())
}