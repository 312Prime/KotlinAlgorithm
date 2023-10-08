package com.example.kotlinalgorithm

import java.io.*
import java.text.SimpleDateFormat
import java.util.Calendar

fun main() {
    val inputFile = File("app/src/main/java/com/example/kotlinalgorithm/input.txt")

    val lines = mutableListOf<String>()
    BufferedReader(FileReader(inputFile)).lines().forEach { lines.add(it) }

    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        val map = mutableMapOf<Char, Int>()
        s.forEachIndexed { index, char ->
            answer += if (map.contains(char))  (index - map[char]!!) else -1
            map[char] = index
        }
        return answer
    }

    solution(
        lines[0],
    ).also { print(it) }
    println()
}