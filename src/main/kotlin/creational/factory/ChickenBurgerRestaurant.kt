package creational.factory

import creational.factory.burgers.Burger
import creational.factory.burgers.ChickenBurger

class ChickenBurgerRestaurant: Restaurant() {
    override fun createBurger(): Burger {
        return ChickenBurger(productId = 1, angus = "", addOns = "")
    }
}