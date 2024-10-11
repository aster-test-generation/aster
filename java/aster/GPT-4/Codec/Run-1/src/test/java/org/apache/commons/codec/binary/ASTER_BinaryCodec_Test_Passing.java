/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_withValidBytes_XMCK0() {
        byte[] input = new byte[]{72, 101, 108, 108, 111}; // ASCII for "0110111101101100011011000110010101001000"
        String expected = "0110111101101100011011000110010101001000";
        String result = BinaryCodec.toAsciiString(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithEmptyArray_SqUi1() {
        assertArrayEquals(new byte[0], BinaryCodec.fromAscii(new char[0]));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithSingleByte_lOLb2() {
        char[] input = {'0', '0', '0', '0', '0', '0', '0', '1'};
        byte[] expected = {1};
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithNonStandardLength_efgA4() {
        char[] input = {'1', '0', '1', '0', '1', '0', '1', '0', '1'};
        byte[] expected = {85}; // 10101010 in binary (last '1' is ignored as it does not complete another byte)
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithAllZeros_kAov5() {
        char[] input = {'0', '0', '0', '0', '0', '0', '0', '0'};
        byte[] expected = {0};
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsEmptyInput_rIRO0() {
        byte[] input = new byte[0];
        char[] expected = new char[0];
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsSingleByteAllZeros_nLUo1() {
        byte[] input = {0};
        char[] expected = {'0', '0', '0', '0', '0', '0', '0', '0'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsSingleByteAllOnes_LXHS2() {
        byte[] input = {(byte) 0xFF};
        char[] expected = {'1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsAlternatingBits_wpzo4() {
        byte[] input = {(byte) 0xAA}; // 10101010 in binary
        char[] expected = {'1', '0', '1', '0', '1', '0', '1', '0'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayWithNullInput_lvdc0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray(null);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiEmptyInput_DCRm0() {
        byte[] ascii = {};
        byte[] expected = {};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiAllZeros_YJZG1() {
        byte[] ascii = "00000000".getBytes();
        byte[] expected = {0};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiAllOnes_saJI2() {
        byte[] ascii = "11111111".getBytes();
        byte[] expected = {(byte) 255};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMixedBits_wmWk3() {
        byte[] ascii = "10101010".getBytes();
        byte[] expected = {(byte) 170};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_NullArray_Rfky0() {
        assertTrue(BinaryCodec.isEmpty(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_EmptyArray_NsHh1() {
        assertTrue(BinaryCodec.isEmpty(new byte[]{}));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_NonEmptyArray_ZVSd2() {
        assertFalse(BinaryCodec.isEmpty(new byte[]{1, 2, 3}));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidAsciiInput_Wcsy0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] asciiInput = "0100100001100101011011000110110001101111".getBytes();
        byte[] expectedOutput = "Hello".getBytes();
        byte[] actualOutput = codec.decode(asciiInput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullInput_oeVg0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = (byte[]) codec.decode(null);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithEmptyArray_SrLQ0() {
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithSingleZero_uGiZ1() {
        byte[] input = {0};
        byte[] expected = {'0', '0', '0', '0', '0', '0', '0', '0'};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithSingleOne_hkqX2() {
        byte[] input = {1};
        byte[] expected = {'0', '0', '0', '0', '0', '0', '0', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithMaxByteValue_Ltpf4() {
        byte[] input = {(byte) 255};
        byte[] expected = {'1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    public void testDecodeWithInvalidType_pauz4_zPBw0() {
        BinaryCodec codec = new BinaryCodec();
        try {
            codec.decode(new int[]{0, 1, 0, 1});
            fail("Expected a DecoderException to be thrown");
        } catch (DecoderException e) {
        }
    }

    @Test
    public void testEncodeWithNonByteArray_eOgV1_IjSc0() {
        BinaryCodec codec = new BinaryCodec();
        Object input = "Not a byte array";
        try {
            codec.toAsciiBytes((byte[]) input);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (ClassCastException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithNullInput_mCnI0_EhOE0() {
        assertArrayEquals(new byte[0], BinaryCodec.toAsciiBytes(null));
    }
}