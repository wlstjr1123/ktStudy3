// 코틀린에서 델리게이션 사용법

interface Output {
    fun print(arg:String)
}

class Agent:Output {
    override fun print(arg:String) {
        println("대리인 : $arg")
    }
}

// 위임자 클래스에서 대리자를 호출할 떄 by키워드를 이용한다.
class MyDelegator(agent:Agent):Output by agent

fun main(args:Array<String>):Unit {
    val agent:Agent = Agent()
    MyDelegator(agent).print("안녕하세요 반갑습니다!!")
}
