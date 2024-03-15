class ChickenBurger(name: String, price: Int) :  Food(name, price) {

    override fun displayInfo() {
        super.displayInfo()
        println("치킨은 기본이지!")
    }
}