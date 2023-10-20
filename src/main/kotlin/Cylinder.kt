class Cylinder(length: Double, height: Double):Shape(), ThreeDimensional{
    override val length = length
    val height = height
    override val type: String
        get() = "Cylinder"

    override fun getSize(): String {
        return String.format("%.3f, %.3f", length, height)
    }

    override fun volume(): Double {
        return Math.PI * (length * length) * height
    }

    override fun surfaceArea(): Double {
        return (2*Math.PI*length*height)+ (2 * Math.PI * (length*length))
    }
}