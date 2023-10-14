// 델리게이션(Delegation) : 대리인
// ex ) a -> b : a가 b에게 일을 위임 => a : 위임자(Delegator), b: 대리자,대행자(Delegatee)(a를 대신해서 일을함)

// ex) data -> a, b, c 로직이 있음 => data가 직접 처리하지 않고 a, b, c에게 일을 시킴

// 대리인(대행자) 객체
class Delegatee {
    fun output(str:String) {
        println("대리인 : $str")
    }
}

// 위임자 객체
class Delegator {
    val agent: Delegatee = Delegatee()

    fun outPut(str: String) {
        agent.output(str)
    }
}

fun main(args:Array<String>):Unit {
    val delegator:Delegator = Delegator()
    delegator.outPut("안녕하세요!!! 반갑습니다!!!")
}
