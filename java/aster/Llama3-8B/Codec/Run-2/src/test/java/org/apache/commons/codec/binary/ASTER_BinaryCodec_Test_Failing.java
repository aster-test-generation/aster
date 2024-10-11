/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryCodec_Test_Failing {
    private byte[] toAsciiBytes(final byte[] raw) {
        return null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_joOz0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] raw = {1, 2, 3, 4, 5};
        byte[] result = binaryCodec.encode(raw);
        byte[] expected = toAsciiBytes(raw);
        assert Arrays.equals(result, expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_FjfZ0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] ascii = {65, 66, 67};
        byte[] result = binaryCodec.decode(ascii);
        byte[] expected = {0b01000001, 0b01000010, 0b01000011};
        assert Arrays.equals(result, expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_SingleCharacter_ReturnsSingleByte_dzbu2() {
    byte[] result = BinaryCodec.fromAscii(new char[] {'a'});
    assertArrayEquals(new byte[] {(byte) 0x80}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_TwoCharacters_ReturnsTwoBytes_ioJj3() {
    byte[] result = BinaryCodec.fromAscii(new char[] {'a', 'b'});
    assertArrayEquals(new byte[] {(byte) 0x80, (byte) 0xc0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_MultipleCharacters_ReturnsMultipleBytes_drko4() {
    byte[] result = BinaryCodec.fromAscii(new char[] {'a', 'b', 'c', 'd'});
    assertArrayEquals(new byte[] {(byte) 0x80, (byte) 0xc0, (byte) 0xe0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_LongString_ReturnsCorrectBytes_KVpB5() {
    byte[] result = BinaryCodec.fromAscii(new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'});
    byte[] expected = new byte[] {(byte) 0x80, (byte) 0xc0, (byte) 0xe0, (byte) 0xf0};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_LSsv0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[] {1, 2, 3};
        Object result = codec.encode(raw);
        assertEquals("[B@3d7a62b6", result.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiSingleBit_lTMA1() {
        byte[] ascii = new byte[] {(byte) '1'};
        byte[] expected = new byte[] {(byte) 0x80};
        byte[] result = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsSingleByte_szZd1() {
        char[] result = BinaryCodec.toAsciiChars(new byte[] {0x01});
        assertArrayEquals(new char[]{'0', '0', '0', '0', '0', '0', '0', '0'}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsMultipleBytes_cbOx2() {
        char[] result = BinaryCodec.toAsciiChars(new byte[] {0x01, 0x02, 0x03});
        assertArrayEquals(new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsNullArray_cTjs3() {
        try {
            BinaryCodec.toAsciiChars(null);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsByteArrayWithNonBinaryData_ReiV4() {
        char[] result = BinaryCodec.toAsciiChars(new byte[] {0x01, 0x02, 0x03, 0x04, 0x05});
        assertArrayEquals(new char[]{'1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0'}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesSingleByte_HaYp1() {
        byte[] raw = new byte[] {0x01};
        byte[] expected = new byte[] {'1', '0', '0', '0', '0', '0', '0', '0'};
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesMultipleBytes_WEcz2() {
        byte[] raw = new byte[] {0x01, 0x02, 0x03};
        byte[] expected = new byte[] {'1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '1'};
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesLargeArray_InyH3() {
        byte[] raw = new byte[10];
        for (int i = 0; i < 10; i++) {
            raw[i] = (byte) i;
        }
        byte[] expected = new byte[40];
        for (int i = 0; i < 10; i++) {
            for (int j = 7; j >= 0; j--) {
                expected[39 - j] = (byte) ((raw[i] >> j) & 1);
            }
        }
        byte[] result = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAsciiLongAscii_HxxL3_TQLR0() {
    byte[] ascii = new byte[] {(byte) 0x82, (byte) 0x82};
    byte[] expected = new byte[] {(byte) 0xAA, (byte) 0xAA};
    byte[] result = BinaryCodec.toAsciiBytes(ascii);
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAsciiMultipleBits_BhSo2_dzQV0() {
    byte[] ascii = new byte[] {(byte) 0x0A};
    byte[] expected = new byte[] {(byte) 0xA0};
    byte[] result = BinaryCodec.toAsciiBytes(ascii);
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAsciiLongAscii2_sIkH4_GWao0() {
    byte[] ascii = new byte[] {(byte) 0x8A, (byte) 0x8A, (byte) 0x8A};
    byte[] expected = new byte[] {(byte) 0xAA, (byte) 0xAA, (byte) 0xAA};
    byte[] result = BinaryCodec.toAsciiBytes(ascii);
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_NullArray_ThrowsNullPointerException_eiBl1_yOwp0() {
    try {
        BinaryCodec.toAsciiBytes(null);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_okad0_fid1() {
        byte[] raw = new byte[] {(byte) 0x48, (byte) 0x65, (byte) 0x6c, (byte) 0x6c, (byte) 0x6f};
        String asciiString = BinaryCodec.toAsciiString(raw);
        assertEquals("Hello", asciiString);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_LSsv0_fid1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[] {1, 2, 3};
        Object result = codec.encode(raw);
        assertEquals("123", result.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsSingleByte_szZd1_fid1() {
        char[] result = BinaryCodec.toAsciiChars(new byte[] {0x01});
        assertArrayEquals(new char[]{'1', '0', '0', '0', '0', '0', '0', '0'}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiCharsMultipleBytes_cbOx2_fid1() {
        char[] result = BinaryCodec.toAsciiChars(new byte[] {0x01, 0x02, 0x03});
        assertArrayEquals(new char[]{'1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0'}, result);
    }
}