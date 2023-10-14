// Enum Class ( 열거형 클래스, 열거형 상수)

enum class Mode
{
    PEN, ERASER, SHAPE, SELECTION
}

fun main(args:Array<String>):Unit {
    val mode:Mode = Mode.PEN

    when(mode) {
        Mode.PEN -> println("펜모드")
        Mode.ERASER -> println("지우기모드")
        Mode.SHAPE -> println("도형모드")
        Mode.SELECTION -> println("선택모드")
    }
}