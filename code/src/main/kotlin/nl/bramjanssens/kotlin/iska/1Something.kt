package nl.bramjanssens.kotlin.iska

data class `1Something`(val i: Int) {
    operator fun plus(other: `1Something`): Int = i + other.i
}
