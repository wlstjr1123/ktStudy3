// 확장 프로퍼티(Extension Property)

// 확장 프로퍼티에는 field가 존재하지 않는다. 즉, field 식별자는 사용 불가하다.
val String.isLarge: Boolean
    get() = this.length >= 5

fun main(args:Array<String>):Unit {
    println("12421asdfe".isLarge)
    println("20불".isLarge)
}