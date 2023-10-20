class Cube(length: Double): Shape(), ThreeDimensional {
    override val length = length

    override val type: String
        get() = "Cube"

    override fun getSize(): String {
        return String.format("%.3f", length)
    }

    override fun volume(): Double {
        return length * length * length
    }

    override fun surfaceArea(): Double {
        return 6 * (length * length)
    }
}