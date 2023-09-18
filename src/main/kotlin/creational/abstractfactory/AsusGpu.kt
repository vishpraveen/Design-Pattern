package creational.abstractfactory

class AsusGpu: GPU {
    override fun assemble(): GPU {
        println("GPU: ${this::class.simpleName}")
        return this
    }
}