package creational.abstractfactory

class MsiGpuManufacturer: Company() {
    override fun createGPU(): Component {
        return MsiGpu()
    }

    override fun createMonitor(): Component {
        return MsiMonitor()
    }
}