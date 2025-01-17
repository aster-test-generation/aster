/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BinaryCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiStringWithSimpleInput_ESoh0() throws Exception {
        byte[] input = new byte[]{72, 101, 108, 108, 111}; // ASCII for "Hello"
        String expected = "Hello";
        String result = BinaryCodec.toAsciiString(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_EmptyArray_TBjP1() throws Exception {
        assertArrayEquals(new byte[0], BinaryCodec.fromAscii(new char[0]));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_AllZeros_tfoW2() throws Exception {
        char[] input = {'0', '0', '0', '0', '0', '0', '0', '0'};
        byte[] expected = {0};
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_AllOnes_BHQa3() throws Exception {
        char[] input = {'1', '1', '1', '1', '1', '1', '1', '1'};
        byte[] expected = {(byte) 255};
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_MixedValues_NpMe4() throws Exception {
        char[] input = {'1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] expected = {(byte) 170};
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_LongerSequence_yApr5() throws Exception {
        char[] input = {'1', '1', '0', '0', '1', '1', '0', '0', '1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] expected = {(byte) 204, (byte) 170};
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsWithEmptyArray_UAXD0() throws Exception {
        byte[] input = new byte[0];
        char[] expected = new char[0];
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsWithSingleZeroByte_PvRs1() throws Exception {
        byte[] input = new byte[]{0};
        char[] expected = {'0', '0', '0', '0', '0', '0', '0', '0'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsWithSingleMaxByte_xmsq2() throws Exception {
        byte[] input = new byte[]{(byte) 255};
        char[] expected = {'1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsWithAlternatingBits_jMKO3() throws Exception {
        byte[] input = new byte[]{(byte) 0xAA}; // 10101010 in binary
        char[] expected = {'1', '0', '1', '0', '1', '0', '1', '0'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsWithMultipleBytes_qpDZ4() throws Exception {
        byte[] input = new byte[]{(byte) 0xF0, (byte) 0x0F}; // 11110000 00001111 in binary
        char[] expected = {'1', '1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayWithNullInput_DHIH0() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray(null);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayWithValidInput_eanP1() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        byte[] expected = new byte[]{(byte) 'h', (byte) 'e', (byte) 'l', (byte) 'l', (byte) 'o'};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiEmpty_twos0() throws Exception {
        byte[] ascii = {};
        byte[] expected = {};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiAllZeros_uWbW1() throws Exception {
        byte[] ascii = "00000000".getBytes();
        byte[] expected = {0};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiAllOnes_HFrn2() throws Exception {
        byte[] ascii = "11111111".getBytes();
        byte[] expected = {-1}; // 0xFF in decimal is 255 which is -1 in a signed byte
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMixed_oTyb3() throws Exception {
        byte[] ascii = "01010101".getBytes();
        byte[] expected = {85}; // 0x55 in hexadecimal
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiLongerSequence_kqzn4() throws Exception {
        byte[] ascii = "1100110011001100".getBytes();
        byte[] expected = {-52, -52}; // 0xCC in hexadecimal is 204 in decimal, which is -52 in a signed byte
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNullArray_bGgE0() throws Exception {
        byte[] array = null;
        assertTrue(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithEmptyArray_yFdu1() throws Exception {
        byte[] array = new byte[0];
        assertTrue(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNonEmptyArray_EINu2() throws Exception {
        byte[] array = new byte[1];
        assertFalse(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSimpleInput_kmAz0() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{65, 66, 67}; // ASCII values for 'A', 'B', 'C'
        byte[] expectedOutput = new byte[]{'A', 'B', 'C'};
        byte[] actualOutput = codec.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidAscii_LXfj0() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = "01001000".getBytes();
        byte[] expected = {72}; // ASCII for 'H'
        byte[] result = codec.decode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullInput_ouvP0() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = (byte[]) codec.decode(null);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_fNlG1() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{'0', '1', '0', '1'};
        byte[] expected = {1, 1};
        byte[] result = (byte[]) codec.decode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharArray_LezL2() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        char[] input = new char[]{'0', '1', '0', '1'};
        byte[] expected = {1, 1};
        byte[] result = (byte[]) codec.decode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_gNgP3() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        String input = "0101";
        byte[] expected = {1, 1};
        byte[] result = (byte[]) codec.decode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidByteArray_csDf0_1() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        Object result = codec.encode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidByteArray_csDf0_2() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        Object result = codec.encode(input);
        assertTrue(result instanceof char[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidByteArray_csDf0_3() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        Object result = codec.encode(input);
        assertArrayEquals(new char[]{'0', '0', '0', '0', '0', '0', '0', '1',
        '0', '0', '0', '0', '0', '0', '1', '0',
        '0', '0', '0', '0', '0', '1', '1'}, (char[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithEmptyArray_EyCi0() throws Exception {
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithSingleZero_HIsV1() throws Exception {
        byte[] input = {0};
        byte[] expected = "00000000".getBytes();
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithSingleOne_wuOZ2() throws Exception {
        byte[] input = {1};
        byte[] expected = "00000001".getBytes();
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithMultipleBytes_GNEl3() throws Exception {
        byte[] input = {0, 1, 2, 3};
        byte[] expected = "00000000000000010000001000000011".getBytes();
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithMaxByteValue_lGFq4() throws Exception {
        byte[] input = {127, -128};
        byte[] expected = "0111111110000000".getBytes();
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }
}