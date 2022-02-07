package nl.bramjanssens.kotlin.iska

// TODO
//  - file instead of class
//  - filename starts with number!

// TODO
//  - data class
//  - private field
//  - property
//  - var/val
//  - (non)nullable
//  - optional parameter
data class Person(var name: String = "", var age: Int? = null, private val i: Int = 0)

// TODO: first class property
val persons = listOf(
    Person("Alice"),
    Person("Bob", 29)
)

// TODO: first class function
fun main() {

    // TODO --------------
    val uk = Person(age = 42)
    uk.name = "Piet"
    println(uk)

    // TODO --------------
    val jj = Person("Jan-Jelle")
    var age = jj.name?.uppercase()
    println(age)
    age = jj.name?.uppercase() ?: "UNKNOWN"
    println(age)

    val bj = Person("Bram")
    println(bj)

    // TODO --------------
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("""The "oldest" is: $oldest.""")

    // TODO --------------
    //  - pair
    //  - infix
    //  - mapOf
    //  - destructuring
    //  - String interpolation

    val pair = 0 to Person()
    for ((i, p) in mapOf(pair, 1 to jj, 2 to bj, 3 to uk)) {
        val (n, a) = p
        println("Person (${i}) ${n} is ${a} years old.")
    }

    // TODO
    //  - class starts with a number
    //  - operator overloading
    //  - extension functions
    val s1 = `1Something`(11)
    val s2 = `1Something`(22)

    val sum = s1 + s2
    val inc = s1.inc()
    val pInc = jj.inc()
    val names = jj + bj
}

operator fun Person.plus(person: Person): String = name + person.name

fun `1Something`.inc(): Int = i + 1
fun Person.inc(): Int? = age?.plus(1)
