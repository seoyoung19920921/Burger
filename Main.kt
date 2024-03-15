fun main() {

    println("음식을 선택하세요:")
    println("[1] 햄버거")
    println("[2] 사이드")
    println("[3] 음료수")
    println("[0] 종료")

    when (readln().toInt()) {
        1 -> {
            println("[1] 치킨버거 [2] 치즈버거 [3]새우버거")
            val num1 = readln().toInt()
            val burgers = listOf(
                ChickenBurger("치킨버거", 6000),
                CheeseBurger("치즈버거", 5000),
                ShirimpBurger("새우버거", 7000),
            )

            if (num1 in 0..burgers.size) {
                burgers[num1 - 1].displayInfo()
            }
        }

        2 -> {
            println("[1] 치즈스틱 [2] 치킨너겟 [3] 치즈볼")
            val num2 = readln().toInt()
            val sides = listOf(
                CheeseStick("치즈스틱", 2500),
                ChickenNuget("치킨너겟", 3000),
                CheeseBall("치즈볼", 4000),

                )


            if (num2 in 0..sides.size) {
                sides[num2 - 1].displayInfo()
            }
        }

        3 -> {
            println("[1] 콜라 [2] 사이다 [3] 환타")
            val num3 = readln().toInt()
        }
    }
}