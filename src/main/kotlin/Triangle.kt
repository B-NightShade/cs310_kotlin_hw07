class Triangle(length: Double, width: Double): Shape(), TwoDimensional {
    override val length = length
    val width = width
    override val type: String
        get() = "Triangle"

    override fun getSize(): String {
        return String.format("%.3f, %.3f", length, width)
    }

    override fun area(): Double {
        return (length * width)/2
    }

    override fun perimeter(): Double {
        val c: Double = Math.sqrt((width * width)+((length * length)/4))
        return c + c + length
    }
}