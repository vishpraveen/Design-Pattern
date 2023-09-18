package creational.abstractfactory

abstract class Company {
    fun manufactureGPU():GPU {
        val gpu = createGPU()
        gpu.assemble()
        return gpu
    }

    fun manufactureMonitor(): Monitor {
        val monitor = createMonitor()
        monitor.assembleMonitor()
        return monitor
    }

    abstract fun createGPU(): GPU
    abstract fun createMonitor(): Monitor
}