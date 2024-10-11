/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithMultipleBytes_KCfN3() {
        char[] input = {'1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0'};
        byte[] expected = {0, 0}; // 11111111 00000000 in binary
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsMultipleBytes_MOYo3() {
        byte[] input = {0, (byte) 0xFF};
        char[] expected = {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayWithNonEmptyString_Vrwg1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toAsciiBytes("hello".getBytes());
        byte[] expected = "0110100001100101011011000110110001101111".getBytes(); // Binary ASCII values for 'hello'
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleBytes_iRle4() {
        byte[] ascii = "1100110010101010".getBytes();
        byte[] expected = {(byte) 204, (byte) 170};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSimpleInput_lYxN0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x41, 0x42, 0x43}; // ASCII for 'ABC'
        byte[] expected = new byte[]{'0', '1', '0', '0', '0', '0', '0', '1',
        '0', '1', '0', '0', '0', '0', '1', '0',
        '0', '1', '0', '0', '0', '0', '1', '1'};
        byte[] result = codec.toAsciiBytes(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_Xtlg1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{'0', '1', '0', '1'};
        byte[] expected = new byte[]{'0', '1', '0', '1'};
        byte[] result = BinaryCodec.toAsciiBytes(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithMultipleBytes_zCMF3() {
        byte[] input = {1, 2, 3};
        byte[] expected = {'0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_withValidBytes_XMCK0_fid1() {
        byte[] input = new byte[]{72, 101, 108, 108, 111}; // ASCII for "Hello"
        String expected = "Hello";
        String result = BinaryCodec.toAsciiString(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithMultipleBytes_KCfN3_fid1() {
        char[] input = {'1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0'};
        byte[] expected = {-1, 0}; // 11111111 00000000 in binary
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithNonStandardLength_efgA4_fid1() {
        char[] input = {'1', '0', '1', '0', '1', '0', '1', '0', '1'};
        byte[] expected = {-86}; // 10101010 in binary (last '1' is ignored as it does not complete another byte)
        assertArrayEquals(expected, BinaryCodec.fromAscii(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsMultipleBytes_MOYo3_fid1() {
        byte[] input = {0, (byte) 0xFF};
        char[] expected = {'0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayWithNonEmptyString_Vrwg1_fid1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        byte[] expected = {104, 101, 108, 108, 111}; // ASCII values for 'hello'
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSimpleInput_lYxN0_fid1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x41, 0x42, 0x43}; // ASCII for 'ABC'
        byte[] expected = new byte[]{'A', 'B', 'C'};
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidAsciiInput_Wcsy0_fid1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] asciiInput = "0100100001100101011011000110110001101111".getBytes();
        byte[] expectedOutput = "Hello".getBytes();
        byte[] actualOutput = codec.decode(asciiInput);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_Xtlg1_fid1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{'0', '1', '0', '1'};
        byte[] expected = {1, 5}; // Assuming fromAscii method converts '0101' to {1, 5}
        byte[] result = (byte[]) codec.decode(input);
        assertArrayEquals(expected, result);
    }
}