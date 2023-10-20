class Sphere(length: Double): Shape(), ThreeDimensional {
    override val length = length
    override val type: String
        get() = "Sphere"

    override fun getSize(): String {
        return String.format("%.3f", length)
    }

    override fun volume(): Double {
        return (4.0/3) * Math.PI * (length*length*length)
    }

    override fun surfaceArea(): Double {
        return 4 * (Math.PI) * (length * length)
    }
}