class Cidar(name: String, price: Int) :  Food(name, price) {


    override fun displayInfo() {
        super.displayInfo()
        println("나랑드사이다?")
    }
}