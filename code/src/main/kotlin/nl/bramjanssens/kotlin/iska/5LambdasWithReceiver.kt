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

    val reversedAndCapped2 = buildString {
        it.append("retsek ellej naj")
        it.reverse()
        it.capEachWord()
    }
    println(reversedAndCapped2)

    val reversedAndCapped3 = buildStringImpr {
        append("ytinummoc avaj")
        reverse()
        capEachWord()
    }
    println(reversedAndCapped3)

    // TODO
    //  - Create your own "language elements" = DSL!
    //  - e.g.: I created my own forEach
    forEach(persons) {
        // we can access all members of Person here
        inc()
        println(toString())
    }

    forEach((-2..3).toList()) {
        // we can access all members of Int here
        val posneg = if (this.compareTo(0) == 1) "positive" else "negative"
        println("Number $this is $posneg.")
    }

}

fun buildString(body: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    body(sb) // call lambda WITH sb as param
    return sb.toString()
}

fun buildStringImpr(body: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    body(sb) // call lambda WITH sb as param
    return sb.toString()
}

private fun StringBuilder.capEachWord() {
    val sj = StringJoiner(" ")

    val wordsCapped = split(" ").map { it.first().uppercase() + it.substring(1 until it.length) }
    wordsCapped.forEach { sj.add(it) }

    clear()
    append(sj.toString())
}

fun <T> forEach(items: List<T>, body: T.() -> Unit) {
    for (item in items) {
        body(item)
    }
}
