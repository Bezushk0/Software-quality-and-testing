package org.mongodb;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {

    @Test
    void whenRomanIsNullThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic(null); // null
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanIsEmptyThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic(""); // Порожня строка
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanContainsDigitsThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("IX2"); // Наявність цифр
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanContainsInvalidLettersThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("IXA"); // Наявність недопустимих літер
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanIsLowercaseThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("ix"); // Мале "ix" має викликати помилку
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanContainsSpecialCharactersThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("№%;?%!(.)"); // Наявність спеціальних символів
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanContainsCyrillicThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("ІІ"); // Наявність кирилиці
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanIsIncorrectlyWrittenThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("IIXII"); // Неправильне написання
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanHasExcessiveRepetitionThenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("IIII"); // Неправильна послідовність
        });
        assertEquals("Invalid roman", exception.getMessage());
    }

    @Test
    void whenRomanIsValidThenReturnsCorrectValue() {
        assertEquals(1994, Converter.convertRomanToArabic("MCMXCIV")); // Перевірка на коректність
    }
}
