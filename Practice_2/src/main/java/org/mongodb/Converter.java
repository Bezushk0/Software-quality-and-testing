package org.mongodb;

import java.util.regex.Pattern;

/*
    @author Безушко Владіслав 443В ск
    @project Practice 2
    @class Converter
    @since 15.09.24
*/

public class Converter {
    private static final String ROMAN_REGEX = "^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
    private static final Pattern ROMAN_PATTERN = Pattern.compile(ROMAN_REGEX);

    public static int convertRomanToArabic(String roman) {
        if (!validateRoman(roman)) {
            throw new IllegalArgumentException("Invalid roman");
        }

        int total = 0;
        int prevValue = 0;

        for (char c : roman.toCharArray()) {
            int value = romanCharToInt(c);
            if (value > prevValue) {
                total += value - 2 * prevValue;
            } else {
                total += value;
            }
            prevValue = value;
        }
        return total;
    }

    public static boolean validateRoman(String roman) {
        if (roman == null || roman.isEmpty()) {
            return false;
        }
        if (!roman.equals(roman.toUpperCase())) {
            return false;
        }
        return ROMAN_PATTERN.matcher(roman).matches();
    }

    private static int romanCharToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}


