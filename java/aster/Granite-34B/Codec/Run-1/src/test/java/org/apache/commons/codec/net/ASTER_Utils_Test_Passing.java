/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Utils_Test_Passing {
    private static final int RADIX = 16;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16_0_EBQn0() throws DecoderException {
        final byte b = 48; // '0'
        final int expected = Character.digit((char) b, RADIX);
        final int actual = Utils.digit16(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16_A_pvVH1() throws DecoderException {
        final byte b = 65; // 'A'
        final int expected = Character.digit((char) b, RADIX);
        final int actual = Utils.digit16(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16_a_tEFs2() throws DecoderException {
        final byte b = 97; // 'a'
        final int expected = Character.digit((char) b, RADIX);
        final int actual = Utils.digit16(b);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_1() {
        assertEquals('0', Utils.hexDigit(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_2() {
        assertEquals('1', Utils.hexDigit(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_3() {
        assertEquals('2', Utils.hexDigit(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_4() {
        assertEquals('3', Utils.hexDigit(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_5() {
        assertEquals('4', Utils.hexDigit(4));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_6() {
        assertEquals('5', Utils.hexDigit(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_7() {
        assertEquals('6', Utils.hexDigit(6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_8() {
        assertEquals('7', Utils.hexDigit(7));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_9() {
        assertEquals('8', Utils.hexDigit(8));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_10() {
        assertEquals('9', Utils.hexDigit(9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_11() {
        assertEquals('A', Utils.hexDigit(10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_12() {
        assertEquals('B', Utils.hexDigit(11));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_13() {
        assertEquals('C', Utils.hexDigit(12));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_14() {
        assertEquals('D', Utils.hexDigit(13));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_15() {
        assertEquals('E', Utils.hexDigit(14));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0_16() {
        assertEquals('F', Utils.hexDigit(15));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHexDigit_hSvC0() {
        assertEquals('0', Utils.hexDigit(0));
        assertEquals('1', Utils.hexDigit(1));
        assertEquals('2', Utils.hexDigit(2));
        assertEquals('3', Utils.hexDigit(3));
        assertEquals('4', Utils.hexDigit(4));
        assertEquals('5', Utils.hexDigit(5));
        assertEquals('6', Utils.hexDigit(6));
        assertEquals('7', Utils.hexDigit(7));
        assertEquals('8', Utils.hexDigit(8));
        assertEquals('9', Utils.hexDigit(9));
        assertEquals('A', Utils.hexDigit(10));
        assertEquals('B', Utils.hexDigit(11));
        assertEquals('C', Utils.hexDigit(12));
        assertEquals('D', Utils.hexDigit(13));
        assertEquals('E', Utils.hexDigit(14));
        assertEquals('F', Utils.hexDigit(15));
    }
}