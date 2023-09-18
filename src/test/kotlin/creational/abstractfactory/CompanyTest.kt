package creational.abstractfactory

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class CompanyTest {
    @Test
    fun `Test AsusGpu Creation`() {
        val asus: Company = AsusGpuManufacturer()
        assertTrue(
            actual = asus.manufactureGPU() is AsusGpu,
            message = String.format(MESSAGE, AsusGpu::class.simpleName)
        )
    }

    @Test
    fun `Test MsiGpu Creation`() {
        val msi: Company = MsiGpuManufacturer()
        assertTrue(
            actual = msi.manufactureGPU() is MsiGpu,
            message = String.format(MESSAGE, MsiGpu::class.simpleName)
        )
    }

    @Test
    fun `Test AsusMonitor Creation`() {
        val asus: Company = AsusGpuManufacturer()
        assertTrue(
            actual = asus.manufactureMonitor() is AsusMonitor,
            message = String.format(MESSAGE, AsusMonitor::class.simpleName)
        )
    }

    @Test
    fun `Test MsiMonitor Creation`() {
        val msi: Company = MsiGpuManufacturer()
        assertTrue(
            actual = msi.manufactureMonitor() is MsiMonitor,
            message = String.format(MESSAGE, MsiMonitor::class.simpleName)
        )
    }

    private companion object {
        const val MESSAGE = "object is instance of %s"
    }
}