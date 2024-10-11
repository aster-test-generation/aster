/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Nysiis_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrict_qwCd0() {
        Nysiis nysiis = new Nysiis();
        boolean strict = nysiis.isStrict();
        assertFalse(strict);
        Nysiis nysiisStrict = new Nysiis(true);
        boolean strict2 = nysiisStrict.isStrict();
        assertTrue(strict2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1() {
        String result = new Nysiis().nysiis("Test");
        assertEquals("Tst", result);
        result = new Nysiis().nysiis("Hello");
        assertEquals("Hll", result);
        result = new Nysiis().nysiis("World");
        assertEquals("Wrd", result);
        result = new Nysiis().nysiis("Science");
        assertEquals("Sci", result);
        result = new Nysiis().nysiis("Programming");
        assertEquals("Prgrmmg", result);
        result = new Nysiis().nysiis("Java");
        assertEquals("J", result);
        result = new Nysiis().nysiis("Python");
        assertEquals("Pythn", result);
        result = new Nysiis().nysiis("JavaScript");
        assertEquals("JScpt", result);
        result = new Nysiis().nysiis("Ruby");
        assertEquals("Rby", result);
        result = new Nysiis().nysiis("PHP");
        assertEquals("Php", result);
        result = new Nysiis().nysiis("C++");
        assertEquals("C", result);
        result = new Nysiis().nysiis("Swift");
        assertEquals("Swft", result);
        result = new Nysiis().nysiis("Rust");
        assertEquals("Rst", result);
        result = new Nysiis().nysiis("Kotlin");
        assertEquals("Ktln", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringParameter_QwYU0_fid1() {
        Nysiis nysiis = new Nysiis();
        String input = "Hello";
        String expectedOutput = "HLL";
        String actualOutput = nysiis.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_gsBd0_fid1() {
        Nysiis nysiis = new Nysiis();
        String input = "example";
        String expected = "EXAMPL";
        String actual = nysiis.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrict_qwCd0_1_fid2() {
        Nysiis nysiis = new Nysiis();
        boolean strict = nysiis.isStrict();
        Nysiis nysiisStrict = new Nysiis(true);
        boolean strict2 = nysiisStrict.isStrict();
        assertFalse(strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_1_fid2() {
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
        assertEquals("Tst", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_2_fid2() {
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
        assertEquals("Hll", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_3_fid2() {
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
        assertEquals("Wrd", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_4_fid2() {
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
        assertEquals("Sci", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_5_fid2() {
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
        assertEquals("Prgrmmg", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_6() {
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
        assertEquals("J", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_7_fid2() {
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
        assertEquals("Pythn", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_8_fid2() {
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
        assertEquals("JScpt", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_9_fid2() {
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
        assertEquals("Rby", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_10_fid2() {
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
        assertEquals("Php", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_11() {
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
        assertEquals("C", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_12_fid2() {
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
        assertEquals("Swft", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_13_fid2() {
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
        assertEquals("Rst", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_aJmw1_14_fid2() {
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
        assertEquals("Ktln", result);
    }
}