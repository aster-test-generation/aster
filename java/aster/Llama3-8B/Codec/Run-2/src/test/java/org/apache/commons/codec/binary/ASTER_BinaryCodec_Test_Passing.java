/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryCodec_Test_Passing {
    private byte[] toAsciiBytes(final byte[] raw) {
        return null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_okad0() {
        byte[] raw = new byte[] {(byte) 0x48, (byte) 0x65, (byte) 0x6c, (byte) 0x6c, (byte) 0x6f};
        String asciiString = BinaryCodec.toAsciiString(raw);
        assertEquals("0110111101101100011011000110010101001000", asciiString);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayNullInput_kwaB0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] result = binaryCodec.toByteArray(null);
        byte[] expected = new byte[0];
        assert Arrays.equals(result, expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArrayNonNullInput_gySP1() {
        BinaryCodec binaryCodec = new BinaryCodec();
        String ascii = "Hello";
        byte[] result = binaryCodec.toByteArray(ascii);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyArray_vjXO0() {
        byte[] array = new byte[0];
        assertTrue(BinaryCodec.isEmpty(array));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullArray_sSoS1() {
        byte[] array = null;
        assertTrue(BinaryCodec.isEmpty(array));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonEmptyArray_KvWU2() {
        byte[] array = new byte[1];
        assertFalse(BinaryCodec.isEmpty(array));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_EmptyArray_ReturnsEmptyByteArray_oaoP0() {
    byte[] result = BinaryCodec.fromAscii(new char[0]);
    assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonByteArray_XgaB1() {
        BinaryCodec codec = new BinaryCodec();
        Object raw = new Object();
        try {
            codec.encode(raw);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("argument not a byte array", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiEmpty_klxB0() {
        byte[] ascii = new byte[0];
        byte[] expected = new byte[0];
        byte[] result = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsEmptyArray_KcXC0() {
        char[] result = BinaryCodec.toAsciiChars(new byte[0]);
        assertArrayEquals(new char[0], result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_zwGT1() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] ascii = new byte[] {1, 2, 3};
        Object result = binaryCodec.decode(ascii);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidType_JCwU4() {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object ascii = new Integer(1);
        assertThrows(DecoderException.class, () -> binaryCodec.decode(ascii));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesEmptyArray_AKzF0() {
        byte[] raw = new byte[0];
        byte[] expected = new byte[0];
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesNullArray_bsUE4() {
        byte[] raw = null;
        byte[] expected = new byte[0];
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_dTsX0_jAtH0() {
    BinaryCodec binaryCodec = new BinaryCodec();
    byte[] result = binaryCodec.toAsciiBytes(null);
    assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeString_NmVP3_Byde0() {
    BinaryCodec binaryCodec = new BinaryCodec();
    String ascii = "abc";
    try {
        byte[] result = binaryCodec.toAsciiBytes(ascii.getBytes());
    } catch (Exception e) {
        fail("DecoderException was expected");
    }
}
}