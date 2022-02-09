package nl.bramjanssens.kotlin.iska

import kotlinx.coroutines.*
import java.lang.Thread.currentThread
import kotlin.concurrent.thread

fun main() {
    println("begin ----------")
    myFirstCoroutines()
    // testHowLightCoroutinesAre()
    println("end ------------")
}

private fun myFirstCoroutines() {
    println(currentThread().name + "    Start.")

    // coroutines have to run in a context, i.e. scope
    // runBlocking creates a scope and blocks current thread:
    runBlocking { // this: CoroutineScope
        // sequentially executes the following statements:

        // coroutine 1: calling other function
        launch {                        // launch a new coroutine and continue
            delay(1000L)                // non-blocking delay for 1 second: suspendable
            println(currentThread().name + "    World")
        }

        // coroutine 2: calling my own function
        launch {                        // launch a new coroutine and continue
            delayAndPrint(2000L, "    !")  // this function must be suspendable
        }

        // main:
        println(currentThread().name + "    Hello")
    }
    // resume when all launched children complete

    println(currentThread().name + "    Done.")
}

private suspend fun delayAndPrint(ms: Long, s: String) {
    delay(ms)   // non-blocking delay for ms second: suspendable
    println(currentThread().name + s)
}

fun testHowLightCoroutinesAre() {
    val c = measure(100_000, ::coroutine)
    val t = measure(100_000, ::thread)
    println("These threads are ${(t / c).round(2)} times slower than coroutines.")
}

private fun coroutine() {
    GlobalScope.launch { /*noop*/ }
}

private fun thread() {
    thread { /*noop*/ }
}

