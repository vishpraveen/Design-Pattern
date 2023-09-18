package creational.abstractfactory

class MsiMonitor: Component {
    override fun assemble(): Component {
        println("Monitor: ${this::class.simpleName}")
        return this
    }
}