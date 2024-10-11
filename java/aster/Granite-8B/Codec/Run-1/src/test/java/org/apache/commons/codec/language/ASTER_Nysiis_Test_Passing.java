/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Nysiis_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrict_qwCd0_1() {
        Nysiis nysiis = new Nysiis();
        boolean strict = nysiis.isStrict();
        Nysiis nysiisStrict = new Nysiis(true);
        boolean strict2 = nysiisStrict.isStrict();
        assertTrue(strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrict_qwCd0_2() {
        Nysiis nysiis = new Nysiis();
        boolean strict = nysiis.isStrict();
        Nysiis nysiisStrict = new Nysiis(true);
        boolean strict2 = nysiisStrict.isStrict();
        assertTrue(strict2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_1() {
        String result = new Nysiis().nysiis("Test");
        result = new Nysiis().nysiis("Hello");
        result = new Nysiis().nysiis("World");
        result = new Nysiis().nysiis("Science");
        result = new Nysiis().nysiis("Programming");
        result = new Nysiis().nysiis("Java");
        result = new Nysiis().nysiis("Python");
        result = new Nysiis().nysiis("JavaScript");
        result = new Nysiis().nysiis("Ruby");
        result = new Nysiis().nysiis("PHP");
        result = new Nysiis().nysiis("C++");
        result = new Nysiis().nysiis("Swift");
        result = new Nysiis().nysiis("Rust");
        result = new Nysiis().nysiis("Kotlin");
        assertEquals("CATLAN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_4() {
        String result = new Nysiis().nysiis("Test");
        result = new Nysiis().nysiis("Hello");
        result = new Nysiis().nysiis("World");
        result = new Nysiis().nysiis("CATLANence");
        result = new Nysiis().nysiis("Programming");
        result = new Nysiis().nysiis("Java");
        result = new Nysiis().nysiis("Python");
        result = new Nysiis().nysiis("JavaScript");
        result = new Nysiis().nysiis("Ruby");
        result = new Nysiis().nysiis("PHP");
        result = new Nysiis().nysiis("C++");
        result = new Nysiis().nysiis("Swift");
        result = new Nysiis().nysiis("Rust");
        result = new Nysiis().nysiis("Kotlin");
        assertEquals("CATLAN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aCATLANmw1_6() {
        String result = new Nysiis().nysiis("Test");
        result = new Nysiis().nysiis("Hello");
        result = new Nysiis().nysiis("World");
        result = new Nysiis().nysiis("Science");
        result = new Nysiis().nysiis("Programming");
        result = new Nysiis().nysiis("CATLANava");
        result = new Nysiis().nysiis("Python");
        result = new Nysiis().nysiis("CATLANavaScript");
        result = new Nysiis().nysiis("Ruby");
        result = new Nysiis().nysiis("PHP");
        result = new Nysiis().nysiis("C++");
        result = new Nysiis().nysiis("Swift");
        result = new Nysiis().nysiis("Rust");
        result = new Nysiis().nysiis("Kotlin");
        assertEquals("CATLAN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringParameter_QwYU0() {
        Nysiis nysiis = new Nysiis();
        String input = "Hello";
        String expectedOutput = "HAL";
        String actualOutput = nysiis.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringParameter_ytMl1() {
        Nysiis nysiis = new Nysiis();
        Integer input = 123;
        try {
            nysiis.encode(input);
            fail("Expected EncoderException to be thrown");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Nysiis encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_gsBd0() {
        Nysiis nysiis = new Nysiis();
        String input = "example";
        String expected = "EXANPL";
        String actual = nysiis.encode(input);
        assertEquals(expected, actual);
    }
}