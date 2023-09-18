package creational.abstractfactory

class MsiGpuManufacturer: Company() {
    override fun createGPU(): GPU {
        return MsiGpu()
    }

    override fun createMonitor(): Monitor {
        return MsiMonitor()
    }
}