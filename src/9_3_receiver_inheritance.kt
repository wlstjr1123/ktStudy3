// 리시버가 상속관계에 있을 때

open class AAA

class BBB : AAA()

fun AAA.greeting() = println("안녕하세요!!... AA 입니다")
fun BBB.greeting() = println("안녕하세요!!... BB 입니다")

// 상속관계에 있는 확장함수 경우 멤버 함수와는 다르게
// 참조 변수가 실제로 가리키는 자식타입을 따르지 않고
//// 부모 타입을 따른다. 주의가 필요하다.

fun main(args:Array<String>):Unit {
     val obj: AAA = BBB()
    obj.greeting()
    
}