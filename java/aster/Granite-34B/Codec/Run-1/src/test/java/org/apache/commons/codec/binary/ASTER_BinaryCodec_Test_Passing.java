/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Test_Passing {
    private static char[] toAsciiChars(byte[] raw) {
        char[] asciiChars = new char[raw.length];
        for (int i = 0; i < raw.length; i++) {
            asciiChars[i] = (char) raw[i];
        }
        return asciiChars;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_EmptyArray_ZROl0() {
        char[] ascii = {};
        byte[] expected = {};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_NullArray_BHOo4() {
        char[] ascii = null;
        byte[] expected = {};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_EmptyArray_utEO0() {
        final byte[] raw = {};
        final char[] ascii = BinaryCodec.toAsciiChars(raw);
        assertTrue(ascii.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_OneByte_inXq1() {
        final byte[] raw = {0x00};
        final char[] ascii = BinaryCodec.toAsciiChars(raw);
        assertTrue(new String(ascii).equals("00000000"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_MaxByte_dIbp3() {
        final byte[] raw = {(byte) 0xFF};
        final char[] ascii = BinaryCodec.toAsciiChars(raw);
        assertTrue(new String(ascii).equals("11111111"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_MaxBytes_BHvE4() {
        final byte[] raw = {(byte) 0xFF, (byte) 0xFF};
        final char[] ascii = BinaryCodec.toAsciiChars(raw);
        assertTrue(new String(ascii).equals("1111111111111111"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtoByteArrayWithNullInput_vbCV0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] expected = new byte[0];
        assertArrayEquals(expected, binaryCodec.toByteArray(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtoByteArrayWithValidInput_MVBM1() {
        BinaryCodec binaryCodec = new BinaryCodec();
        String ascii = "Hello, World!";
        byte[] expected = binaryCodec.fromAscii(ascii.toCharArray());
        assertArrayEquals(expected, binaryCodec.toByteArray(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithEmptyArray_HLlY0() {
        byte[] ascii = {};
        byte[] expected = {};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithFullByte_ySpf2() {
        byte[] ascii = {'1', '1', '1', '1', '1', '1', '1', '1'};
        byte[] expected = {(byte) 255};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithPartialByte_tqdg3() {
        byte[] ascii = {'0', '1', '1', '1', '1', '1', '1', '1'};
        byte[] expected = {(byte) 127};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNullArray_DVMx0() {
        assertTrue(BinaryCodec.isEmpty(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithEmptyArray_NJLS1() {
        assertTrue(BinaryCodec.isEmpty(new byte[0]));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNonEmptyArray_Mkaz2() {
        assertFalse(BinaryCodec.isEmpty(new byte[]{0, 1, 2}));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidInput_MPpo1() {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object raw = new Object();
        try {
            binaryCodec.encode(raw);
        } catch (EncoderException e) {
            assertEquals("argument not a byte array", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithEmptyArray_zoiJ0() {
        byte[] raw = {};
        byte[] expected = {};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithSingleByte_YoSS1() {
        byte[] raw = {0x00};
        byte[] expected = {'0', '0', '0', '0', '0', '0', '0', '0'};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithFullCoverage_LrST3() {
        byte[] raw = {(byte) 0xFF};
        byte[] expected = {'1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithFullCoverageMultipleBytes_kyxw4() {
        byte[] raw = {(byte) 0xFF, (byte) 0xFF};
        byte[] expected = {'1', '1', '1', '1', '1', '1', '1', '1',
        '1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(raw));
    }
}