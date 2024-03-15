class ShirimpBurger(name: String, price: Int) :  Food(name, price) {

    override fun displayInfo() {
        super.displayInfo()
        println("오동통한 새우!")
    }
}