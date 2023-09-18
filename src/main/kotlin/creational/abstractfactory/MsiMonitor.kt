package creational.abstractfactory

class MsiMonitor: Monitor {
    override fun assembleMonitor(): Monitor {
        println("Monitor: ${this::class.simpleName}")
        return this
    }
}