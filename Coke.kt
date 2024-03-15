class Coke(name: String, price: Int) :  Food(name, price) {

    override fun displayInfo() {
        super.displayInfo()
        println("코카콜라")
    }
}