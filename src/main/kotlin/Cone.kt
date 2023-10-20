import kotlin.math.sqrt

class Cone(length: Double, height: Double): Shape(), ThreeDimensional{
    override val length = length
    val height = height
    override val type: String
        get() = "Cone"

    override fun getSize(): String {
        return String.format("%.3f, %.3f", length, height)
    }

    override fun volume(): Double {
        return (Math.PI) * (length * length) * (height / 3)
    }

    override fun surfaceArea(): Double {
        return Math.PI * length * (length + sqrt((height * height)+ (length * length)))
    }
}