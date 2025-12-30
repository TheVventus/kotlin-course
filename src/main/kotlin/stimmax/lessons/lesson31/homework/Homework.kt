package org.example.stimmax.lessons.lesson31.homework

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals


class PhoneNumberFormatter {

    fun formatPhoneNumber(input: String): String {
        val digits = input.replace("\\D".toRegex(), "")

        if (digits.length != 10 && digits.length != 11) {
            throw IllegalArgumentException("Невалидная длина номера")
        }

        val normalizedDigits = if (digits.length == 11) {
            if (digits.startsWith("7") || digits.startsWith("8")) {
                digits.substring(1)
            } else {
                throw IllegalArgumentException("Невалидный код страны")
            }
        } else {
            digits
        }

        val code = normalizedDigits.substring(0, 3)
        val part1 = normalizedDigits.substring(3, 6)
        val part2 = normalizedDigits.substring(6, 8)
        val part3 = normalizedDigits.substring(8, 10)

        return "+7 ($code) $part1-$part2-$part3"
    }
}


class PhoneNumberFormatterTest {

    @ParameterizedTest
    @MethodSource("validPhones")
    fun formatValidPhonesTest(source: String, expected: String) {
        val formatter = PhoneNumberFormatter()
        val actual = formatter.formatPhoneNumber(source)
        assertEquals(expected, actual)
    }

    @ParameterizedTest
    @ValueSource(strings = ["12345", "+1 (922) 941-11-11"])
    fun invalidPhoneTest(source: String) {
        val formatter = PhoneNumberFormatter()
        assertThrows(IllegalArgumentException::class.java) {
            formatter.formatPhoneNumber(source)
        }
    }


    companion object {

        @JvmStatic
        fun validPhones() = listOf<Any>(
            arrayOf("8 (922) 941-11-11", "+7 (922) 941-11-11"),
            arrayOf("79229411111", "+7 (922) 941-11-11"),
            arrayOf("+7 922 941 11 11", "+7 (922) 941-11-11"),
            arrayOf("9229411111", "+7 (922) 941-11-11"),
            arrayOf("abc +7 922 941 11 11", "+7 (922) 941-11-11"),
        )
    }
}