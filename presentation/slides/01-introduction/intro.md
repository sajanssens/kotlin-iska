### ISKA - Cool features in...

![001](/img/001.jpg)
<!-- .slide: class="is-welcome img-center" -->

---

### Welcome!

![bj](/img/bj.png)

Quick introduction...

---

### Starring...

![jj](/img/jj.jpg)<BR>
Jan-Jelle Kester

---

### Topics

1. Introduction Kotlin
   1. Background                      <!-- .element: class="fragment" -->
   2. Main traits                     <!-- .element: class="fragment" -->
   3. First taste                     <!-- .element: class="fragment" -->
2. Features                           <!-- .element: class="fragment" -->
   1. Some misc language features     <!-- .element: class="fragment" -->
   2. Generics                        <!-- .element: class="fragment" -->
       - Type erasure?
       - Inline functions!
   3. Lambda's                        <!-- .element: class="fragment" -->
   4. DSL's                           <!-- .element: class="fragment" -->
   5. Sequences                       <!-- .element: class="fragment" -->
   6. Coroutines                      <!-- .element: class="fragment" -->

Have fun!                             <!-- .element: class="fragment" -->

<!-- .slide: class="is-module" -->

---

### 1. Introduction

<!-- .slide: class="is-module" -->

---

### Background

<div class="flex">
  <div class="col">	
    <ul>
        <li>Released 2014 by Jetbrains</li>        
        <li>Named after an island</li>
        <li>Why?</li>
        <ul>
            <li>IDEA written in Java</li>
            <li>Java</li>
            <ul>
                <li>is verbose</li>
                <li>releases slowly</li>
                <li>has great legacy</li>
            </ul>
            <li>new language needed</li>
            <li>envious of C#</li>
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
    <img src="/img/003.png">
  </div>
</div>

---

### Philosophy

* Concise
* Safe
    * Type safe
    * Null safe
* Pragmatic
* Interoperable
* Fun 😊!

---

### Characteristics

* Works great with all existing Java libraries and frameworks.
* Server-side, Android apps, iOS, anywhere Java runs.
* Can be compiled to class (v8+), JavaScript, native.

---

### Main traits

* Statically typed
* Strong type inference
* Immutability
* Null safety
    * bye bye `NullPointerException`!
* Imperative, functional and object-oriented style
    * function is "first class citizen"
* Free and open source, Apache 2 license.

---

### History

* Development started in 2010
* Releases
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
        * Language features, platform improvements
        * **New release cadence**
    * [1.6 - November 2021](https://blog.jetbrains.com/kotlin/2021/11/kotlin-1-6-0-is-released/)
        * Language features, platform improvements
        * [Kover](https://blog.jetbrains.com/kotlin/2021/11/kotlin-1-6-0-is-released/#kover)

---

![007](/img/007.png)
<!-- .slide: class="img-center" -->

---

### First taste

