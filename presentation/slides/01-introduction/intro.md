![001](/img/001.jpg)

<!-- .slide: class="is-welcome img-center" -->


---

### Welcome!

* Personal introduction.
    * Name, company
    * Experience
    * Why Kotlin?

---

### Rules of engagement

* Training hours
* Lunches
* Phones
* Training material
* Evaluation

Have fun!

---

### Agenda

<div class="flex">
  <div class="col">	
    <ol>
      <li>Introduction</li>
      <li>Basics</li>
      <li>Functions</li>
      <li>Classes, objects and interfaces</li>    
      <li>Programming with lambdas</li>
      <li>The Kotlin type system</li>     
     </ol>  
    </div>
</div>

---

### 1. Introduction

<!-- .slide: class="is-module" -->

---


### First taste

![002](/img/002.png)

---

### What?

* Concise, safe, pragmatic, focused on interoperability with Java code.
* Server-side, Android apps, iOS, anywhere Java runs. 
* Kotlin can be compiled to JavaScript.
* Works great with all existing Java libraries and frameworks.

---

### History
<div class="flex">
  <div class="col">	
    <ul>
        <li>Developed by Jetbrains</li>
        <li>Named after an island</li>
        <li>Why?</li>
        <ul>
            <li>language needed for development of IDEA</li>
            <li>Java</li>
            <ul>
                <li>is verbose</li>
                <li>releases slowly</li>
            </ul>
            <li>envious of C#</li>
            <li>create own language!</li>
        </ul>
    <li>Requirements</li>
    <ul>
        <li>static typing</li>
        <li>compatibility with Java</li>
        <li>tooling quality</li>
        <li>easy to learn and reason about</li>
    </ul>
    </ul>
  </div>
  <div class="col">
    <img src="/img/003.png" style="margin-left:20px">
  </div>
</div>



---

### History

* Development started in 2010
* Kotlin releases
    * [1.0 - February 2016](https://blog.jetbrains.com/kotlin/2016/02/kotlin-1-0-released-pragmatic-language-for-jvm-and-android/)
    * [1.1 - March 2017](https://blog.jetbrains.com/kotlin/2017/03/kotlin-1-1/)
        * targets JS, coroutines (experimental)
    * [1.2 - November 2017](https://blog.jetbrains.com/kotlin/2017/11/kotlin-1-2-released/)
        * multiplatform
    * [1.3 - October 2018](https://blog.jetbrains.com/kotlin/2017/11/kotlin-1-3/)
        * coroutines (stable), native support
    * [1.4 - August 2020](https://blog.jetbrains.com/kotlin/2020/08/kotlin-1-4-released-with-a-focus-on-quality-and-performance/)
        * improves performance and quality of Kotlin and its tooling
    * [1.5 - May 2021](https://blog.jetbrains.com/kotlin/2021/05/kotlin-1-5-0-released/)
        * Language features
        * platform improvements
        * **New release cadence!**

<!-- Notes
A multiplatform project allows you to build multiple tiers of your application – backend, frontend and Android app – from the same codebase. Such a project contains both common modules, which contain platform-independent code, as well as platform-specific modules, which contain code for a specific platform (JVM or JS) and can use platform-specific libraries. To call platform-specific code from a common module, you can specify expected declarations – declarations for which all platform-specific modules need to provide actual implementations.
-->


---

### Main traits

* Statically typed
* Strong type inference
* Imperative, functional and object-oriented style
    * function is "first class citizen"
* Null safety
    * bye bye `NullPointerException`!
* Immutability
* Free and open source, Apache 2 license.

---

### Philosophy

* Pragmatic
* Concise
* Safe
    * Type safe
    * Null safe 
* Interoperable
* Fun!

---

### Inspired by...

* FORTRAN: FORmula TRANslation (1957)
* LISP: LISt Processor (1958)
* ALGOL: ALGOrithmic Language (1958)
* COBOL: COmmon Business-Oriented Language (1959)
* BASIC: Beginners’ All-purpose Symbolic Instruction Code (1964)
* Pascal (1970)
* C (1972)
* Smalltalk (1972)
* C++: A Better C with Objects (1983)
* Python: Friendly and Flexible (1990)
* Haskell: Pure Functional Programming (1990)
* Java: Virtual Machines and Garbage Collection (1995)
* JavaScript: Java in Name Only (1995)
* C#: Java for .NET (2000)
* Scala: SCALAble (2003)
* Groovy: A Dynamic JVM Language (2007)

---

### Build

* Demo

![004](/img/004.png)

---

### Java versions

* Which versions of JVM does Kotlin target?

>"Kotlin lets you choose the version of JVM for execution. By default, the Kotlin/JVM compiler produces Java 8 compatible bytecode. If you want to make use of optimizations available in newer versions of Java, you can explicitly specify the target Java version from 6 to 16. Note that in this case the resulting bytecode might not run on lower versions"

Source: [kotlinlang.org](https://kotlinlang.org/docs/reference/faq.html#which-versions-of-jvm-does-kotlin-target)

---

### Kotlin multiplatform

![005](/img/005.png)

Source: [https://touchlab.co/kotlin-multiplatform/](https://touchlab.co/kotlin-multiplatform/)

---

### Kotlin multiplatform

> "Multiplatform is a compile-time construct. It is a way to represent “shared” code but have it be able to compile down and deploy to multiple platforms. JVM, JS, and Native are the broad targets." 
- Kotlin/JS [demo](https://github.com/sajanssens/kotlinjs-confexplorer )
<!-- (taken from https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/01_Introduction) -->
- Full stack JS/JVM [demo](https://github.com/sajanssens/jvm-js-fullstack) <!-- (taken from https://play.kotlinlang.org/hands-on/Full%20Stack%20Web%20App%20with%20Kotlin%20Multiplatform) -->
- Taken from https://play.kotlinlang.org/hands-on/

---

### Tooling

* IDEA
* REPL
* Playground [http://try.kotl.in](http://try.kotl.in)
* Java-to-Kotlin converter
* ...

---

### Book

![006](/img/006.png)

* Book [https://www.manning.com/books/kotlin-in-action](https://www.manning.com/books/kotlin-in-action) 
    * Chapter 1-6
* Code [https://github.com/Kotlin/kotlin-in-action](https://github.com/Kotlin/kotlin-in-action) 

---

### Other learning resources

* Kotlin lang
    * [https://kotlinlang.org/](https://kotlinlang.org/) 
    * [https://kotlinlang.org/docs/reference/](https://kotlinlang.org/docs/reference/)
    * [https://kotlinlang.org/docs/tutorials/koans.html](https://kotlinlang.org/docs/tutorials/koans.html)
* Atomic Kotlin
    * [https://www.atomickotlin.com/](https://www.atomickotlin.com/)
* Coursera: Kotlin for Java developers
    * [https://www.coursera.org/learn/kotlin-for-java-developers/](https://www.coursera.org)
* Code wars
    * [https://www.codewars.com/](https://www.codewars.com/)

---

![007](/img/007.png)