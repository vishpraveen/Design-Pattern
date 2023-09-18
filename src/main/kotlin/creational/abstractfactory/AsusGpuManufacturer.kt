package creational.abstractfactory

class AsusGpuManufacturer: Company() {
    override fun createGPU(): Component {
        return AsusGpu()
    }

    override fun createMonitor(): Component {
        return AsusMonitor()
    }
}