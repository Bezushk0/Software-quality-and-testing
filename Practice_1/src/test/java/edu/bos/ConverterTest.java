package edu.bos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class ConverterTest {

    @Test
    public void convertArabicToRoman() {
        Assert.assertEquals("MMMDCCXLIX", Converter.convertArabicToRoman(3749));
        Assert.assertEquals("LVIII", Converter.convertArabicToRoman(58));
        Assert.assertEquals("MCMXCIV", Converter.convertArabicToRoman(1994));
        Assert.assertEquals("I", Converter.convertArabicToRoman(1));
        Assert.assertEquals("IV", Converter.convertArabicToRoman(4));
        Assert.assertEquals("XL", Converter.convertArabicToRoman(40));
        Assert.assertEquals("XC", Converter.convertArabicToRoman(90));
        Assert.assertEquals("CD", Converter.convertArabicToRoman(400));
        Assert.assertEquals("CM", Converter.convertArabicToRoman(900));
        Assert.assertEquals("MMXX", Converter.convertArabicToRoman(2020));
        Assert.assertEquals("CXXIII", Converter.convertArabicToRoman(123));
        Assert.assertEquals("DCCC", Converter.convertArabicToRoman(800));
        Assert.assertEquals("MCC", Converter.convertArabicToRoman(1200));
        Assert.assertEquals("CCCLXXXVIII", Converter.convertArabicToRoman(388));
        Assert.assertEquals("XCV", Converter.convertArabicToRoman(95));
        Assert.assertEquals("CC", Converter.convertArabicToRoman(200));
        Assert.assertEquals("CCC", Converter.convertArabicToRoman(300));
        Assert.assertEquals("MMMCMXC", Converter.convertArabicToRoman(3990));
        Assert.assertEquals("MMMCM", Converter.convertArabicToRoman(3900));
        Assert.assertEquals("MMMCCXX", Converter.convertArabicToRoman(3220));
        Assert.assertEquals("DCCCXCV", Converter.convertArabicToRoman(895));
        Assert.assertEquals("CXLV", Converter.convertArabicToRoman(145));
        Assert.assertEquals("CLX", Converter.convertArabicToRoman(160));
        Assert.assertEquals("DCCCXL", Converter.convertArabicToRoman(840));
        Assert.assertEquals("MMDCCLXXVII", Converter.convertArabicToRoman(2777));
        Assert.assertEquals("DLV", Converter.convertArabicToRoman(555));
        Assert.assertEquals("XLV", Converter.convertArabicToRoman(45));
        Assert.assertEquals("XCVI", Converter.convertArabicToRoman(96));
        Assert.assertEquals("CCCLXXX", Converter.convertArabicToRoman(380));
        Assert.assertEquals("MDCLXVI", Converter.convertArabicToRoman(1666));
        Assert.assertEquals("MMDCC", Converter.convertArabicToRoman(2700));
        Assert.assertEquals("CXXIV", Converter.convertArabicToRoman(124));
    }

    @Test
    public void whenNumberIsLessThan_1ThenReturnNull() {
        assertNull(Converter.convertArabicToRoman(0));
        assertNull(Converter.convertArabicToRoman(-1));
    }

    @Test
    public void whenNumberIsGreaterThan_3999ThenReturnNull() {
        assertNull(Converter.convertArabicToRoman(4001));
        assertNull(Converter.convertArabicToRoman(5000));
    }
}