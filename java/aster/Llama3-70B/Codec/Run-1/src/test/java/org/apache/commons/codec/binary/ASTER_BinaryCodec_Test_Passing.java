/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_RBMv0() {
        byte[] raw = {65, 66, 67};
        String result = BinaryCodec.toAsciiString(raw);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiEmpty_DYvs1() {
        byte[] result = BinaryCodec.fromAscii(new char[0]);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiSingleByte_oSLu2() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'0', '0', '0', '0', '0', '0', '0', '0'});
        assertArrayEquals(new byte[]{0}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_EmptyArray_cWmj0() {
        byte[] raw = new byte[0];
        char[] expected = new char[0];
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_SingleByte_tmsz1() {
        byte[] raw = new byte[]{0x01};
        char[] expected = new char[]{'0', '0', '0', '0', '0', '0', '0', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_MinByte_LOeF4() {
        byte[] raw = new byte[]{0x00};
        char[] expected = new char[]{'0', '0', '0', '0', '0', '0', '0', '0'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_toByteArray_nullInput_aFus0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] result = binaryCodec.toByteArray(null);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_EmptyArray_UDgF0() {
        byte[] ascii = new byte[0];
        byte[] result = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_SingleByte_mSRC1() {
        byte[] ascii = "00000001".getBytes();
        byte[] result = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(new byte[]{1}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_MultipleBytes_Rekl2() {
        byte[] ascii = "0000000100000001".getBytes();
        byte[] result = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(new byte[]{1, 1}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_MaxBytes_gxsW3() {
        byte[] ascii = new byte[24];
        for (int i = 0; i < 24; i++) {
            ascii[i] = '1';
        }
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[3];
        expected[0] = (byte) 0xFF;
        expected[1] = (byte) 0xFF;
        expected[2] = (byte) 0xFF;
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = -127, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_MixedBytes_EsMc4() {
        byte[] ascii = "000000010000000110000001".getBytes();
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[]{1, 3, -127};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyNullArray_xxlE0() {
        byte[] array = null;
        assertTrue(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyEmptyArray_pnXA1() {
        byte[] array = new byte[0];
        assertTrue(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmptyNonEmptyArray_oJkh2() {
        byte[] array = new byte[1];
        assertFalse(BinaryCodec.isEmpty(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_HHtq0() {
        BinaryCodec codec = new BinaryCodec();
        Object result = codec.decode(null);
        assertArrayEquals(new byte[0], (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_MsQR1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] ascii = new byte[]{1, 2, 3};
        byte[] result = codec.toAsciiBytes(ascii);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_EmptyArray_bbrH0() {
        byte[] raw = new byte[0];
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_SingleByte_JjPv1() {
        byte[] raw = new byte[]{0x01};
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '1'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_MaxByte_vLtK3() {
        byte[] raw = new byte[]{(byte) 0xFF};
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(new byte[]{'1', '1', '1', '1', '1', '1', '1', '1'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_MinByte_xtPV4() {
        byte[] raw = new byte[]{(byte) 0x00};
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '0'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiNull_NhTM0_Ztju0() {
        byte[] result = BinaryCodec.toAsciiBytes(null);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiAllOnes_Yeaq5_cWgh0() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'});
        assertArrayEquals(new byte[]{(byte) 255, (byte) 255}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_MaxByte_Hexa3_LaGE0() {
        byte[] raw = new byte[]{(byte) 0xFF};
        char[] expected = new char[]{'1', '1', '1', '1', '1', '1', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiChars(raw));
    }
}