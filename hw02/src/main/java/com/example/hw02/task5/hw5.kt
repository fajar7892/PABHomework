package com.example.hw02.task5

fun main() {
    print("Assignment score: ")
    val assignment = readln().toInt()

    print("Exam score: ")
    val exam = readln().toInt()

    // Pembagian desimal dengan pembagi Double
    val average = (assignment + exam) / 2.0

    // Ekspresi if untuk menentukan status
    val status = if (average >= 60) {
        "Pass"
    } else {
        "Needs improvement"
    }

    println("Average: $average")
    println("Status: $status")
}