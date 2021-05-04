package ru.nifontbus.firstkotlin

fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    a.forEach { e -> println(e) }

    println(a.map { e -> e * 2 })

    println(a.filter { e -> e % 2 == 0 })

    println(a.reduce { sum, e -> sum + e })
    println(a.sum())

    val b = a.sortedByDescending { it }
    println(b)
    println(a)

    println(a.any { it > 10 }) // false
    println(a.all { it < 10 }) // true

    val numbers = listOf(1, -3, 4, -7, 5, 7, -11)
    val (positive, negative) = numbers.partition { it > 0 }
    println("+: $positive")
    println("-: $negative")

    val res = listOf("ccc", "ba", "ad", "a", "b").groupBy { it.length }
    println(res) // HashMap или LinkedHashMap

}