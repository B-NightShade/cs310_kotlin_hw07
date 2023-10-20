class Square(length: Double): Shape(), TwoDimensional {
    override val length = length
    override val type: String
        get() = "Square"

    override fun getSize(): String {
        return String.format("%.3f", length)
    }

    override fun area(): Double {
        return length * length
    }

    override fun perimeter(): Double {
        return 4 * length
    }
}