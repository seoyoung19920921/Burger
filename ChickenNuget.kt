class ChickenNuget(name: String, price: Int) :  Food(name, price) {

    override fun displayInfo() {
        super.displayInfo()
        println("한입에 쏙")
    }
}