package creational.abstractfactory

class AsusMonitor: Monitor {
    override fun assembleMonitor(): Monitor {
        println("Monitor: ${this::class.simpleName}")
        return this
    }
}