package singleton;

import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Test

class SingletonTest {

    @Test
    fun testSingletonInstance() {
        val instance = Singleton.getInstance()
        println("Instance is same")
        assertSame(instance, Singleton.getInstance(), "Instance is same")
    }
}