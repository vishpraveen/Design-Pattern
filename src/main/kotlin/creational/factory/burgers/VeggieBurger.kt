package creational.factory.burgers

data class VeggieBurger(
    override val productId: Int,
    val combo: String,
    override val addOns: String
): Burger {
    override fun prepare(): VeggieBurger {
        return this
    }
}
