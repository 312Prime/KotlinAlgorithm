package com.example.kotlinalgorithm

import java.io.*

fun main() {
    val inputFile = File("app/src/main/java/com/example/kotlinalgorithm/input.txt")

    val lines = mutableListOf<String>()
    BufferedReader(FileReader(inputFile)).lines().forEach { lines.add(it) }

    fun solution(inputs: Array<String>) {
        val (N, cTime) = inputs[0].split(" ").map { it.toInt() }

        val resultArray = mutableListOf<Pair<Int, Int>>()
        for (i in 1 .. N) {
            val values = inputs[i].split(" ")
            val pair = Pair(values[0].toInt(), values[1].toInt())
            resultArray.add(pair)
        }

        resultArray.sortBy { it.first }

        var curTime = 0
        for (person in resultArray) {
            if (curTime < person.first) curTime = person.first
            curTime += person.second
            curTime += cTime
        }
        print(curTime)
    }

    solution(
        lines[0].split(", ").toTypedArray()
    ).also { print(it) }
    println()
}