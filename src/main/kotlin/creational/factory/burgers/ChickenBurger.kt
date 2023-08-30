package creational.factory.burgers

data class ChickenBurger(
    override val productId: Int,
    val angus: String,
    override val addOns: String
): Burger {

    override fun prepare(): ChickenBurger {
        return this
    }
}
