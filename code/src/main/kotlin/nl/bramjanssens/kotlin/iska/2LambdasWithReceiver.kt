package nl.bramjanssens.kotlin.iska

import java.util.*

// TODO define and call lambda
val lambda = { a: Int -> 2 * a }
val sum = lambda(21)

// TODO pass lambda as parameter and call it
fun process(action: (Int) -> Int) {
    println(action(sum))
}

fun main() {
    process(lambda)

    process({ x -> x / 2 })  // or,
    process() { x -> x / 2 } // or,
    process { x -> x / 2 }   // or,
    process { it / 2 }

    val reversedAndCapped = buildString { sb ->
        sb.append("snessnaj marb")
        sb.reverse()
        sb.capEachWord()
    }
    println(reversedAndCapped)

}

fun buildString(actions: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    actions(sb) // call lambda WITH sb as param
    return sb.toString()
}

private fun StringBuilder.capEachWord() {
    val sj = StringJoiner(" ")

    val wordsCapped = split(" ").map { it.first().uppercase() + it.substring(1 until it.length) }
    wordsCapped.forEach { sj.add(it) }

    clear()
    append(sj.toString())
}
