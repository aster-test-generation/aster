/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BinaryCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_LIAP0() throws Exception {
        byte[] raw = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "0123456789";
        String actual = BinaryCodec.toAsciiString(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayWithNullInput_yRAj0() throws Exception {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] expected = new byte[0];
        byte[] actual = binaryCodec.toByteArray(null);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayWithNonEmptyInput_ijUI1() throws Exception {
        BinaryCodec binaryCodec = new BinaryCodec();
        String ascii = "Hello, World!";
        byte[] expected = new byte[]{72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
        byte[] actual = binaryCodec.toByteArray(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_vPkW0() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] ascii = new byte[]{65, 66, 67};
        byte[] expected = new byte[]{65, 66, 67};
        byte[] actual = codec.decode(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEncode_SuER0() throws Exception {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] raw = new byte[]{0, 1, 2, 3};
        byte[] expected = new byte[]{48, 49, 50, 51};
        byte[] actual = binaryCodec.encode(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNullArray_IslC0() throws Exception {
        byte[] array = null;
        boolean expected = true;
        boolean actual = BinaryCodec.isEmpty(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithEmptyArray_qpza1() throws Exception {
        byte[] array = new byte[0];
        boolean expected = true;
        boolean actual = BinaryCodec.isEmpty(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNonEmptyArray_PGKU2() throws Exception {
        byte[] array = new byte[]{1, 2, 3};
        boolean expected = false;
        boolean actual = BinaryCodec.isEmpty(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidInput_cQyx1() throws Exception {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object invalidInput = "invalid input";
        try {
            binaryCodec.encode(invalidInput);
        } catch (EncoderException e) {
            assertEquals("argument not a byte array", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithEmptyArray_VdPz0() throws Exception {
        char[] ascii = new char[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithOddNumberOfBits_tkWT3() throws Exception {
        char[] ascii = new char[]{'1', '0', '1', '0', '1'};
        byte[] expected = new byte[]{26};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithNullArray_frhl5() throws Exception {
        char[] ascii = null;
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithEmptyArray_nACj0() throws Exception {
        byte[] ascii = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithSingleBitSet_dKwt1() throws Exception {
        byte[] ascii = new byte[]{'1'};
        byte[] expected = new byte[]{(byte) 0x80};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithMultipleBitsSet_cSKg2() throws Exception {
        byte[] ascii = new byte[]{'1', '1', '0', '0'};
        byte[] expected = new byte[]{(byte) 0xcc};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithMultipleGroupsOfBitsSet_NrtG3() throws Exception {
        byte[] ascii = new byte[]{'1', '1', '0', '0', '1', '1', '0', '0'};
        byte[] expected = new byte[]{(byte) 0xcc, (byte) 0xcc};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithOddNumberOfBits_ushK4() throws Exception {
        byte[] ascii = new byte[]{'1', '1', '0', '0', '1'};
        byte[] expected = new byte[]{(byte) 0xcc, (byte) 0x03};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyArray_UYng0() throws Exception {
        byte[] raw = new byte[0];
        char[] expected = new char[0];
        char[] actual = BinaryCodec.toAsciiChars(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSingleBitSet_LxRB1() throws Exception {
        byte[] raw = new byte[]{(byte) 0x80};
        char[] expected = new char[]{'1', '0', '0', '0', '0', '0', '0', '0'};
        char[] actual = BinaryCodec.toAsciiChars(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleBitSets_fABI2() throws Exception {
        byte[] raw = new byte[]{(byte) 0xFF};
        char[] expected = new char[]{'1', '1', '1', '1', '1', '1', '1', '1'};
        char[] actual = BinaryCodec.toAsciiChars(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRandomBitPattern_bSCw3() throws Exception {
        byte[] raw = new byte[]{(byte) 0xAB};
        char[] expected = new char[]{'1', '0', '1', '0', '1', '0', '1', '0'};
        char[] actual = BinaryCodec.toAsciiChars(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLargeArray_dRBF4() throws Exception {
        byte[] raw = new byte[1000];
        for (int i = 0; i < raw.length; i++) {
            raw[i] = (byte) (Math.random() * 256);
        }
        char[] expected = new char[raw.length * 8];
        for (int i = 0; i < raw.length; i++) {
            for (int j = 0; j < 8; j++) {
                if ((raw[i] & (1 << j)) == 0) {
                    expected[i * 8 + j] = '0';
                } else {
                    expected[i * 8 + j] = '1';
                }
            }
        }
        char[] actual = BinaryCodec.toAsciiChars(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_AvsD0() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = {0x48, 0x65, 0x6C, 0x6C, 0x6F};
        byte[] expectedOutput = {0x48, 0x65, 0x6C, 0x6C, 0x6F};
        byte[] actualOutput = (byte[]) codec.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharArray_UuJn1() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        char[] input = {'H', 'e', 'l', 'l', 'o'};
        byte[] expectedOutput = {0x48, 0x65, 0x6C, 0x6C, 0x6F};
        byte[] actualOutput = (byte[]) codec.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_JjjO2() throws Exception {
        BinaryCodec codec = new BinaryCodec();
        String input = "Hello";
        byte[] expectedOutput = {0x48, 0x65, 0x6C, 0x6C, 0x6F};
        byte[] actualOutput = (byte[]) codec.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToAsciiBytes1_Mcuj0() throws Exception {
        byte[] raw = new byte[1];
        byte[] expected = new byte[8];
        expected[0] = '0';
        expected[1] = '0';
        expected[2] = '0';
        expected[3] = '0';
        expected[4] = '0';
        expected[5] = '0';
        expected[6] = '0';
        expected[7] = '0';
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToAsciiBytes2_TMRg1() throws Exception {
        byte[] raw = new byte[1];
        raw[0] = -1;
        byte[] expected = new byte[8];
        expected[0] = '1';
        expected[1] = '1';
        expected[2] = '1';
        expected[3] = '1';
        expected[4] = '1';
        expected[5] = '1';
        expected[6] = '1';
        expected[7] = '1';
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToAsciiBytes3_bdPj2() throws Exception {
        byte[] raw = new byte[2];
        raw[0] = -1;
        raw[1] = -1;
        byte[] expected = new byte[16];
        expected[0] = '1';
        expected[1] = '1';
        expected[2] = '1';
        expected[3] = '1';
        expected[4] = '1';
        expected[5] = '1';
        expected[6] = '1';
        expected[7] = '1';
        expected[8] = '1';
        expected[9] = '1';
        expected[10] = '1';
        expected[11] = '1';
        expected[12] = '1';
        expected[13] = '1';
        expected[14] = '1';
        expected[15] = '1';
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToAsciiBytes4_PNco3() throws Exception {
        byte[] raw = new byte[2];
        raw[0] = 0;
        raw[1] = 0;
        byte[] expected = new byte[16];
        expected[0] = '0';
        expected[1] = '0';
        expected[2] = '0';
        expected[3] = '0';
        expected[4] = '0';
        expected[5] = '0';
        expected[6] = '0';
        expected[7] = '0';
        expected[8] = '0';
        expected[9] = '0';
        expected[10] = '0';
        expected[11] = '0';
        expected[12] = '0';
        expected[13] = '0';
        expected[14] = '0';
        expected[15] = '0';
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToAsciiBytes5_YnLE4() throws Exception {
        byte[] raw = new byte[2];
        raw[0] = 1;
        raw[1] = 1;
        byte[] expected = new byte[16];
        expected[0] = '0';
        expected[1] = '0';
        expected[2] = '0';
        expected[3] = '0';
        expected[4] = '0';
        expected[5] = '0';
        expected[6] = '0';
        expected[7] = '0';
        expected[8] = '0';
        expected[9] = '0';
        expected[10] = '0';
        expected[11] = '0';
        expected[12] = '0';
        expected[13] = '0';
        expected[14] = '0';
        expected[15] = '1';
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertEquals(expected, actual);
    }
}