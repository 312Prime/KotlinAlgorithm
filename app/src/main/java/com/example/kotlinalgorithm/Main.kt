package com.example.kotlinalgorithm

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val inputFile = File("app/src/main/java/com/example/kotlinalgorithm/input.txt")

    val lines = mutableListOf<String>()
    BufferedReader(FileReader(inputFile)).lines().forEach { lines.add(it) }

    fun solution(s: String): String {
        var answer = ""
        var isBlank = true

        for (i in s.indices) {
            if (s[i] == ' ') {
                isBlank = true
                answer += ' '
                continue
            }
            answer += if (isBlank) s[i].toUpperCase()
            else s[i].toLowerCase()
            isBlank = false
        }

        return answer
    }

    solution(
        lines[0]
    ).also { print(it) }
    println()
}