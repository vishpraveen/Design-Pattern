package creational.abstractfactory

class MsiGpu: Component {
    override fun assemble(): Component {
        println("GPU: ${this::class.simpleName}")
        return this
    }
}