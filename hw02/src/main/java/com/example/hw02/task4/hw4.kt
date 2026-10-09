package com.example.hw02.task4

// Bagian A: Fungsi menghitung total menit belajar
fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int): Int {
    return sessions * minutesPerSession
}

// Bagian B: Fungsi menghitung total SKS
fun calculateTotalCredits(courses: Int, creditsPerCourse: Int): Int {
    return courses * creditsPerCourse
}

fun main() {
    println("Bagian A")
    val total1 = calculateStudyMinutes(3, 25)
    println("Total study time: $total1 minutes")

    val total2 = calculateStudyMinutes(4, 30)
    println("Total study time: $total2 minutes")

    println("Bagian B")
    for (course in 1..5) {
        val credits = calculateTotalCredits(course, 3)
        println("Courses: $course, total credits: $credits")
    }
}