package creational.factory

import creational.factory.burgers.Burger

abstract class Restaurant {
    fun orderBurger(): Burger? {
        val burger = createBurger()
        return burger?.prepare()
    }

    abstract fun createBurger(): Burger?
}