/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Utils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16_InvalidInput_MXlt1() {
        byte b = -1;
        try {
            Utils.digit16(b);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Invalid URL encoding: not a valid digit (radix 16): -1", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16_ValidInput_6_kbMF10() {
        byte b = 6;
        int expected = 6;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_0_ICRJ0() {
        int b = 0;
        char expected = '0';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_1_euQZ1() {
        int b = 1;
        char expected = '1';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_2_hCqo2() {
        int b = 2;
        char expected = '2';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_3_KFZv3() {
        int b = 3;
        char expected = '3';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_4_IQMh4() {
        int b = 4;
        char expected = '4';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_5_TMgk5() {
        int b = 5;
        char expected = '5';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_6_jQKp6() {
        int b = 6;
        char expected = '6';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_7_gQaZ7() {
        int b = 7;
        char expected = '7';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_8_oFBW8() {
        int b = 8;
        char expected = '8';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_9_tnbG9() {
        int b = 9;
        char expected = '9';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_10_DWtK10() {
        int b = 10;
        char expected = 'A';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_11_YWkj11() {
        int b = 11;
        char expected = 'B';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_12_RzPs12() {
        int b = 12;
        char expected = 'C';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_13_riai13() {
        int b = 13;
        char expected = 'D';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_14_LmjO14() {
        int b = 14;
        char expected = 'E';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_15_HNOR15() {
        int b = 15;
        char expected = 'F';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_16_QhMC16() {
        int b = 16;
        char expected = '0';
        char actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_17_Hbai17() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16_ValidInput_3_XOax7_zaUA0() {
        byte b = 51;
        int expected = 51;
        int actual = Utils.hexDigit(b);
        assertEquals(expected, actual);
    }
}