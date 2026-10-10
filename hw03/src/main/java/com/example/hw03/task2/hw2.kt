package com.example.hw03.task2

open class SmartDevice(val name: String) {
    var status = "off"

    open fun turnOn() {
        status = "on"
        println("$name is ON")
    }

    open fun turnOff() {
        status = "off"
        println("$name is OFF")
    }
}

class SmartTvDevice(name: String) : SmartDevice(name) {
    // Custom setter untuk membatasi nilai 0-100 dan private set
    var speakerVolume: Int = 5
        private set(value) {
            field = value.coerceIn(0, 100)
        }

    var channelNumber: Int = 1

    override fun turnOn() {
        super.turnOn()
        println("TV: display on")
    }

    fun increaseVolume() {
        speakerVolume++
        println("Volume: $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel: $channelNumber")
    }
}

fun main() {
    val tv = SmartTvDevice("Living Room TV")

    // Pengaturan dari luar tidak dapat dikompilasi (private set):
    // tv.speakerVolume = 10

    tv.turnOn()
    tv.nextChannel()
    tv.increaseVolume()
    tv.turnOff()
}