package com.example.kotlinalgorithm

import java.io.*
import java.text.SimpleDateFormat
import java.util.Calendar

fun main() {
    val inputFile = File("app/src/main/java/com/example/kotlinalgorithm/input.txt")

    val lines = mutableListOf<String>()
    BufferedReader(FileReader(inputFile)).lines().forEach { lines.add(it) }

    fun solution(t: String, p: String): Int {
        var answer = 0
        for (i in 0..t.length - p.length) if (t.substring(i, i + p.length).toLong() <= p.toLong()) answer++
        return answer
    }

    solution(
        lines[0],
        lines[1],
    ).also { print(it) }
    println()
}