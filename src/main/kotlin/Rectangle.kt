class Rectangle(length: Double, width: Double): Shape(), TwoDimensional {
    val width = width
    override val length = length
    override val type: String
        get() = "Rectangle"

    override fun getSize(): String {
        return String.format("%.3f, %.3f", length, width)
    }

    override fun area(): Double {
        return length * width
    }

    override fun perimeter(): Double {
        return (2 * length) + (2 * width)
    }
}