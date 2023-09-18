package creational.abstractfactory

class AsusGpu: Component {
    override fun assemble(): Component {
        println("GPU: ${this::class.simpleName}")
        return this
    }
}