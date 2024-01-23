package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void testRomanNumerals1(){
        final RomanNumeralsConverter numberConverter= new RomanNumeralsConverter();
        final String output = numberConverter.convert(1);
        Assertions.assertEquals("I", output);
    }

    @Test
    public void testRomanNumerals5(){
        final RomanNumeralsConverter numberConverter= new RomanNumeralsConverter();
        final String output = numberConverter.convert(5);
        Assertions.assertEquals("V", output);
    }

    @Test
    public void testRomanNumerals4(){
        final RomanNumeralsConverter numberConverter= new RomanNumeralsConverter();
        final String output = numberConverter.convert(4);
        Assertions.assertEquals("IV", output);
    }

    @Test
    public void testRomanNumerals6(){
        final RomanNumeralsConverter numberConverter= new RomanNumeralsConverter();
        final String output = numberConverter.convert(6);
        Assertions.assertEquals("VI", output);
    }
}
