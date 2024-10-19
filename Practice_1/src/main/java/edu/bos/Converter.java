package edu.bos;

/*
    @author Безушко Владіслав 443В ск
    @project Practice 1
    @class Converter
    @since 04.09.24
*/
public class Converter {
    public static String convertArabicToRoman(int num) {
        if (num < 1 || num > 3999) {
            return null;
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }
}
