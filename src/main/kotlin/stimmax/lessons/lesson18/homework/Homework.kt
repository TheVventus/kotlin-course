package org.example.stimmax.lessons.lesson18.homework

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

// Задание 1

abstract class Fridge: Powerable, Openable, TemperatureRegulatable, AutomaticShutdown, Timable, Programmable

abstract class WashingMachine: Powerable, Openable, WaterContainer, TemperatureRegulatable, WaterConnection, AutomaticShutdown, Drainable, Timable, Programmable

abstract class SmartLamp: Powerable, AutomaticShutdown, Timable, BatteryOperated, LightEmitting

abstract class SmartClock: Powerable, AutomaticShutdown, Timable, BatteryOperated, SoundEmitting, Programmable

abstract class RobotCleaner: Powerable, Openable, WaterContainer, WaterConnection, Drainable, Timable, Movable, Cleanable, Rechargeable

abstract class MechanicalClock: Powerable, Mechanical

abstract class Flashlight: Powerable, BatteryOperated, LightEmitting

abstract class CoffeeMachine: Powerable, Openable, WaterContainer, TemperatureRegulatable, WaterConnection, AutomaticShutdown, Timable, Programmable

abstract class SmartSpeaker: Powerable, AutomaticShutdown, Timable, BatteryOperated, SoundEmitting, Programmable

// Задание 2
abstract class Computer(): Powerable {

    private var isPower: Boolean = false

    override fun powerOn() {
        isPower = true
        println("Включен")
    }

    override fun powerOff() {
        isPower = false
        println("Выключен")
    }
}

// Задание 3
abstract class Program: Computer(), Programmable {

    override fun programAction(action: String) {
        println("Действие программы")
    }
    override fun execute() {
        println("Выполнение программы")
    }
}