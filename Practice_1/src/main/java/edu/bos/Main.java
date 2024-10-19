package edu.bos;

/*
    @author Безушко Владіслав 443В ск
    @project Practice 1
    @class Main
    @since 04.09.24
*/

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        int num = 1994;
        String roman = converter.convertArabicToRoman(num);
        System.out.println("Roman numeral for " + num + " is: " + roman);
    }
}