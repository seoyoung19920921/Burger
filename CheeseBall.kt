class CheeseBall(name: String, price: Int) :  Food(name, price) {

    override fun displayInfo() {
        super.displayInfo()
        println("동글동글해")
    }
}