package creational.abstractfactory

import org.junit.jupiter.api.Test

class CompanyTest {
    @Test
    fun `Test AsusGpu Creation`() {
        val asus: Company = AsusGpuManufacturer()
        asus.manufactureGPU()
    }

    @Test
    fun `Test MsiGpu Creation`() {
        val msi: Company = MsiGpuManufacturer()
        msi.manufactureGPU()
    }

    @Test
    fun `Test AsusMonitor Creation`() {
        val asus: Company = AsusGpuManufacturer()
        asus.manufactureMonitor()
    }

    @Test
    fun `Test MsiMonitor Creation`() {
        val msi: Company = MsiGpuManufacturer()
        msi.manufactureMonitor()
    }
}