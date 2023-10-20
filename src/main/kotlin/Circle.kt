class Circle(length: Double): Shape(), TwoDimensional {
    override val length = length
    override val type: String
        get() = "Circle"

    override fun getSize(): String {
        return String.format("%.3f", length)
    }

    override fun area(): Double {
        return Math.PI * (length * length)
    }

    override fun perimeter(): Double {
        return Math.PI * (length * 2)
    }
}