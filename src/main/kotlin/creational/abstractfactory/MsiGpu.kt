package creational.abstractfactory

class MsiGpu: GPU {
    override fun assemble(): GPU {
        println("GPU: ${this::class.simpleName}")
        return this
    }
}