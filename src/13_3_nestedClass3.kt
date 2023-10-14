class Outer3(private  var aa:Int) {
    fun getInfo() {
        println(this.aa)
    }

    inner class Inner(private  val bb: Int) {
        fun getInfo() {
            // 내부 클래스는 기본적으로 바깥 클래스를 가리키는 참조ㅁ변수를 가지고 있다.
            // this@외부 클래스명
            this@Outer3.getInfo() // Outer3의 getInfo() 호출
            println(this.bb + this@Outer3.aa)
        }
    }
}

fun main(args:Array<String>):Unit {
    val outer3: Outer3 = Outer3(100)
    val inner: Outer3.Inner = outer3.Inner(50)
    inner.getInfo()
}