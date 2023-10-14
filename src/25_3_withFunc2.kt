class Product25_3 {
    var name: String? = null
    var price: Int? = null

    fun getInfo() {
        println("상품명: ${name}, 가격: ${price}")
    }
}

fun main(args:Array<String>):Unit {
    val product =  Product25_3()
    product.name = "컴퓨터"
    product.price = 800000
    product.getInfo()

    product.run {
        name = "모니터"
        price = 500000
        getInfo()
    }

    // with함수 사용
    with(product) {
        name = "책상"
        price = 300000
        getInfo()
    }
}