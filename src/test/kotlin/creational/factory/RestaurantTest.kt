package creational.factory

import creational.factory.burgers.ChickenBurger
import creational.factory.burgers.VeggieBurger
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class RestaurantTest {

    @Test
    fun createVeggieBurger() {
        val veggieRestaurant: Restaurant = VeggieBurgerRestaurant()
        val burger = veggieRestaurant.orderBurger()
        println("burger is of type Veggie ${(burger is VeggieBurger)}")
        assertTrue("burger is of type Veggie") {(burger is VeggieBurger)}
    }
    @Test
    fun createChickenBurger() {
        val chickenRestaurant: Restaurant = ChickenBurgerRestaurant()
        val chickenBurger = chickenRestaurant.orderBurger()
        println("burger is of type Chicken ${(chickenBurger is ChickenBurger)}")
        assertTrue("burger is of type Chicken ") {(chickenBurger is ChickenBurger)}
    }
}