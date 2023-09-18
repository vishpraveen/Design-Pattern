package creational.abstractfactory

abstract class Company {
    fun manufactureGPU():Component {
        val gpu = createGPU()
        gpu.assemble()
        return gpu
    }

    fun manufactureMonitor(): Component {
        val monitor = createMonitor()
        monitor.assemble()
        return monitor
    }

    abstract fun createGPU(): Component
    abstract fun createMonitor(): Component
}