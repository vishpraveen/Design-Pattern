package creational.factory.burgers

interface Burger {
    val productId: Int
    val addOns: String

    fun prepare(): Burger
}