package creational.abstractfactory

class AsusGpuManufacturer: Company() {
    override fun createGPU(): GPU {
        return AsusGpu()
    }

    override fun createMonitor(): Monitor {
        return AsusMonitor()
    }
}