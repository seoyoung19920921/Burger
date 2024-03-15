class Fanta(name: String, price: Int) : Food(name, price) {

    override fun displayInfo() {
        super.displayInfo()
        println("파인애플이야 오렌지야")
    }
}