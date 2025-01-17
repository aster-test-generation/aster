/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BinaryCodec_Test_Passing {
    private BinaryCodec binaryCodec;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_ifHo0() {
        byte[] raw = new byte[]{0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A};
        String expected = "0111101001111001011110000111011101110110011101010111010001110011011100100111000101110000011011110110111001101101011011000110101101101010011010010110100001100111011001100110010101100100011000110110001001100001";
        String actual = BinaryCodec.toAsciiString(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_empty_yTVY1() {
        byte[] result = BinaryCodec.fromAscii(new char[0]);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_multipleChars_Coza3_1() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '0', '1', '0', '1', '0', '1', '0'});
        assertEquals(1, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_empty_mYVi0() {
        byte[] raw = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_singleByte_iRtv1() {
        byte[] raw = new byte[]{(byte) 0x01};
        byte[] expected = new byte[]{'0', '0', '0', '0', '0', '0', '0', '1'};
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_null_mEOo0_CCag0() {
        byte[] result = BinaryCodec.toAsciiBytes(null);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_empty_zwap0() {
        byte[] raw = new byte[0];
        char[] expected = new char[0];
        char[] actual = BinaryCodec.toAsciiChars(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_singleByte_mkWF1() {
        byte[] raw = new byte[]{0x01};
        char[] expected = new char[]{'0', '0', '0', '0', '0', '0', '0', '1'};
        char[] actual = BinaryCodec.toAsciiChars(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_null_AoNY0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray(null);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_empty_nSEW1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_EmptyArray_RIPx0() {
        byte[] ascii = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_Null_VVat4() {
        byte[] ascii = null;
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_NullArray_fKGT0() {
        byte[] array = null;
        assertTrue(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_EmptyArray_KXGn1() {
        byte[] array = new byte[0];
        assertTrue(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_NonEmptyArray_fkRf2() {
        byte[] array = new byte[]{1, 2, 3};
        assertFalse(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_JErb0() {
        binaryCodec = new BinaryCodec();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_nonByteArray_eRRV1() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        String raw = "hello";
        try {
            codec.encode(raw);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("argument not a byte array", e.getMessage());
        }
    }
}