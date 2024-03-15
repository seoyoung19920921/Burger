class CheeseBurger(name: String, price: Int) : Food(name, price) {

    override fun displayInfo() {
        super.displayInfo()
        println("치즈의 풍미를 느껴!")
    }
}

