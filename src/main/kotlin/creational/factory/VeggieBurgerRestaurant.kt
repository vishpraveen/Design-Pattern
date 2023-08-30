package creational.factory

import creational.factory.burgers.Burger
import creational.factory.burgers.VeggieBurger

class VeggieBurgerRestaurant: Restaurant() {
    override fun createBurger(): Burger {
        return VeggieBurger(productId = 1, combo = "", addOns = "")
    }
}