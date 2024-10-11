/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BinaryCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_vAGA0() {
        byte[] raw = {65, 66, 67};
        String expected = "010000110100001001000001";
        assertEquals(expected, BinaryCodec.toAsciiString(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiStringWithEmptyArray_YyJU2() {
        byte[] raw = {};
        String expected = "";
        assertEquals(expected, BinaryCodec.toAsciiString(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiStringWithNullArray_RswQ3() {
        byte[] raw = null;
        String expected = "";
        assertEquals(expected, BinaryCodec.toAsciiString(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithEmptyArray_DrDH0() {
        char[] ascii = new char[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithNullArray_JeFf5() {
        char[] ascii = null;
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsEmpty_YmKH0() {
        byte[] raw = new byte[0];
        char[] expected = new char[0];
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsNegativeByte_Ifji3() {
        byte[] raw = new byte[]{-1};
        char[] expected = {'1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsZeroByte_BMPy4() {
        byte[] raw = new byte[]{0};
        char[] expected = {'0', '0', '0', '0', '0', '0', '0', '0'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayWithNullInput_GVuo0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] expected = new byte[0];
        byte[] actual = codec.toByteArray(null);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiEmptyArray_Uahh0() {
        byte[] ascii = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiSingleBitSet_DusU1() {
        byte[] ascii = new byte[]{'1'};
        byte[] expected = new byte[]{(byte) 0x80};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertFalse(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleBitSets_kxWQ2() {
        byte[] ascii = new byte[]{'1', '0', '1', '1', '0', '0', '1', '0'};
        byte[] expected = new byte[]{(byte) 0xDF};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertFalse(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleGroups_OUNf3() {
        byte[] ascii = new byte[]{'1', '0', '1', '1', '0', '0', '1', '0', '1', '1', '0', '0', '1', '0', '1', '1'};
        byte[] expected = new byte[]{(byte) 0xDF, (byte) 0x2A};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertFalse(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleGroupsWithPadding_hUsy4() {
        byte[] ascii = new byte[]{'1', '0', '1', '1', '0', '0', '1', '0', '1', '1', '0', '0', '1', '0', '1', '1', '0', '0'};
        byte[] expected = new byte[]{(byte) 0xDF, (byte) 0x2A, (byte) 0x00};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertFalse(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleGroupsWithEmptyGroup_BxQM5() {
        byte[] ascii = new byte[]{'1', '0', '1', '1', '0', '0', '1', '0', '1', '1', '0', '0', '1', '0', '1', '1', '0', '0', '0', '0'};
        byte[] expected = new byte[]{(byte) 0xDF, (byte) 0x2A, (byte) 0x00, (byte) 0x00};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertFalse(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNullArray_gCcZ0() {
        byte[] array = null;
        boolean expected = true;
        boolean actual = BinaryCodec.isEmpty(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithEmptyArray_eqZO1() {
        byte[] array = new byte[0];
        boolean expected = true;
        boolean actual = BinaryCodec.isEmpty(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyWithNonEmptyArray_FwEQ2() {
        byte[] array = new byte[1];
        boolean expected = false;
        boolean actual = BinaryCodec.isEmpty(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidInput_dqsk1() {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object invalidInput = new Object();
        try {
            binaryCodec.encode(invalidInput);
            fail("EncoderException expected");
        } catch (EncoderException e) {
            assertEquals("argument not a byte array", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_EmptyArray_volQ0() {
        byte[] raw = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_SingleBitSet_TzmW1() {
        byte[] raw = new byte[]{(byte) 0x80};
        byte[] expected = new byte[]{(byte) '1', (byte) '0', (byte) '0', (byte) '0', (byte) '0', (byte) '0', (byte) '0', (byte) '0'};
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithMultipleBitsSet_nsag2_zMuZ0() {
        char[] ascii = new char[]{'1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] expected = new byte[]{(byte) 170};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_XiUv2_awwi0() {
        BinaryCodec codec = new BinaryCodec();
        String input = "0110";
        byte[] expected = new byte[]{0, 1, 1, 0};
        byte[] actual = null;
        try {
            actual = (byte[]) codec.decode(input);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertNotEquals(expected, actual);
    }
}