package creational.abstractfactory

class AsusMonitor: Component {
    override fun assemble(): Component {
        println("Monitor: ${this::class.simpleName}")
        return this
    }
}