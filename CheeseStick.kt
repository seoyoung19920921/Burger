class CheeseStick(name: String, price: Int) :  Food(name, price) {

    override fun displayInfo() {
        super.displayInfo()
        println("롯데리아가 짱이어요")
    }
}