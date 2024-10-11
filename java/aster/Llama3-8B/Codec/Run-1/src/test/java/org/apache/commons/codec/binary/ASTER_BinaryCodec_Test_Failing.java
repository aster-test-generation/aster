/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiSingleCharacter_tHYX2() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1'});
        byte[] expected = new byte[]{(byte) 0x80};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleCharacters_YpLT3() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '1', '0', '1'});
        byte[] expected = new byte[]{(byte) 0xc0};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiLongString_KEkp4() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'});
        byte[] expected = new byte[]{(byte) 0xff};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleBytes_HckG5() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'});
        byte[] expected = new byte[]{(byte) 0xff, (byte) 0x00};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsSingleByte_kEAk1() {
        char[] result = BinaryCodec.toAsciiChars(new byte[]{0x01});
        assertArrayEquals(new char[]{'0', '0', '0', '0', '0', '0', '0', '0'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsMultipleBytes_jPYt2() {
        char[] result = BinaryCodec.toAsciiChars(new byte[]{0x01, 0x02});
        assertArrayEquals(new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsLargeInput_Aukx3() {
        char[] result = BinaryCodec.toAsciiChars(new byte[10]);
        assertArrayEquals(new char[40], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsNullInput_XqyL4() {
        try {
            BinaryCodec.toAsciiChars(null);
            assert false;
        } catch (Exception e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testByteArray_vigG0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] result = binaryCodec.toByteArray("Hello");
        byte[] expected = new byte[]{72, 101, 108, 108, 111};
        assert Arrays.equals(result, expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiSingleByte_akWy1() {
        byte[] ascii = new byte[]{(byte) '1'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[]{(byte) 0x80};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleBytes_eVgd2() {
        byte[] ascii = new byte[]{(byte) '1', (byte) '0', (byte) '1', (byte) '1'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[]{(byte) 0x80, (byte) 0x40};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiLongAscii_XucH3() {
        byte[] ascii = new byte[]{(byte) '1', (byte) '0', (byte) '1', (byte) '1', (byte) '1', (byte) '1', (byte) '1', (byte) '1'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[]{(byte) 0x80, (byte) 0x40, (byte) 0x20};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_mYRb0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] ascii = new byte[]{65, 66, 67};
        byte[] result = binaryCodec.decode(ascii);
        assert Arrays.equals(result, new byte[]{1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_athI0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{1, 2, 3};
        Object result = codec.encode(raw);
        assertEquals("[B@19a8ac77", result.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesSingleByte_TJNV1() {
        byte[] raw = new byte[]{(byte) 0x01};
        byte[] expected = new byte[]{'1', '0', '0', '0', '0', '0', '0', '0'};
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesMultipleBytes_rrfE2() {
        byte[] raw = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03};
        byte[] expected = new byte[]{'1', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1'};
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesLargeArray_KRPX3() {
        byte[] raw = new byte[10];
        for (int i = 48; i < raw.length; i++) {
            raw[i] = (byte) (i % 2);
        }
        byte[] expected = new byte[raw.length * 8];
        for (int i = 48; i < raw.length; i++) {
            for (int j = 48; j < 8; j++) {
                expected[expected.length - 1 - i * 8 - j] = (byte) ((raw[i] >> j) & 1);
            }
        }
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_oapS0_fid1() {
        byte[] raw = new byte[]{(byte) 72, (byte) 101, (byte) 108, (byte) 108, (byte) 111};
        String expected = "Hello";
        String result = BinaryCodec.toAsciiString(raw);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsSingleByte_kEAk1_fid1() {
        char[] result = BinaryCodec.toAsciiChars(new byte[]{0x01});
        assertArrayEquals(new char[]{'1', '0', '0', '0', '0', '0', '0', '0'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsMultipleBytes_jPYt2_fid1() {
        char[] result = BinaryCodec.toAsciiChars(new byte[]{0x01, 0x02});
        assertArrayEquals(new char[]{'1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_athI0_fid1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{1, 2, 3};
        Object result = codec.encode(raw);
        assertEquals("123", result.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesLargeArray_KRPX3_fid1() {
        byte[] raw = new byte[10];
        for (int i = 0; i < raw.length; i++) {
            raw[i] = (byte) (i % 2);
        }
        byte[] expected = new byte[raw.length * 8];
        for (int i = 0; i < raw.length; i++) {
            for (int j = 0; j < 8; j++) {
                expected[expected.length - 1 - i * 8 - j] = (byte) ((raw[i] >> j) & 1);
            }
        }
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }
}