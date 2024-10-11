/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Hex_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeHexNullInput_UzWd3() {
    char[] data = null;
    byte[] out = new byte[3];
    int outOffset = 0;
    try {
        Hex.decodeHex(data, out, outOffset);
        assert false;
    } catch (DecoderException e) {
        assert e.getMessage().equals("Odd number of characters.");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeHex_gHVk0() {
    byte[] data = new byte[] {1, 2, 3};
    char[] result = Hex.encodeHex(data, 0, data.length, true);
    String expected = "0102";
    assert Arrays.equals(expected.toCharArray(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeHex_AcEA0() {
    byte[] data = new byte[] {0x12, 0x34, 0x56, 0x78};
    char[] result = Hex.encodeHex(data, 0, data.length, true);
    String expected = "12345678";
    for (int i = 0; i < result.length; i++) {
        if (i %3 == 0) {
            assertEquals(expected.charAt(i /3), result[i]);
        }
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexToLowercase_vCPw0() {
        char[] expected = "0123456789abcdef".toCharArray();
        char[] actual = Hex.encodeHex(new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, true);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexUppercase_vrJq1() {
        char[] expected = "0123456789ABCDEF".toCharArray();
        char[] actual = Hex.encodeHex(new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, false);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToDigitInvalidCharacter_uOWH1() {
    try {
        Hex.toDigit('f', 0);
        assert false;
    } catch (DecoderException e) {
        assert e.getMessage().equals("Illegal hexadecimal character f at index 0");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeHex_HUHx0() {
    Hex hex = new Hex();
    ByteBuffer data = ByteBuffer.wrap(new byte[] {1, 2, 3});
    char[] result = hex.encodeHex(data, true);
    char[] expected = new char[] {'1', '2', '3'};
    assert Arrays.equals(result, expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutParams_cBEv2() {
        Hex hex = new Hex();
        String result = hex.toString();
        assert result.contains("[charsetName=null]");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_BxMK0() {
        Hex hex = new Hex();
        ByteBuffer data = ByteBuffer.wrap(new byte[] {1, 2, 3});
        char[] result = hex.encodeHex(data);
        assert result.length == 6;
        assert result[0] == '1';
        assert result[1] == '2';
        assert result[2] == '3';
        assert result[3] == '0';
        assert result[4] == '0';
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeHex_qcTL0_PQhU0() {
    Hex hex = new Hex();
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    char[] expected = new char[] {'1', '2', '3', '4', '5'};
    char[] result = hex.encodeHex(data);
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeString_hilJ0_seRB0() {
    Hex hex = new Hex(Charset.forName("UTF-8"));
    Object object = "Hello";
    try {
        Object result = hex.encode(object);
        byte[] bytes = (byte[]) result;
        assertEquals("Hello".getBytes(), bytes);
    } catch (EncoderException e) {
        fail("Unexpected exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeHex_RwWF0_wbIl0() {
    char[] data = new char[]{'1', '2', '3', '4', '5', '6'};
    byte[] expected = new byte[]{1, 2, 3, 4, 5, 6};
    try {
        byte[] result = Hex.decodeHex(data);
        assertArrayEquals(expected, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeByteArray_EFMC1_ZjlH0() {
    Hex hex = new Hex();
    try {
        byte[] result = hex.decodeHex(new char[] {(char) 0x45, (char) 0x46, (char) 0x4d, (char) 0x43, (char) 0x31});
        assertArrayEquals(new byte[] {1, 2, 3}, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeString_tZsi0_WitW0() {
    Hex hex = new Hex(Charset.forName("UTF-8"));
    try {
        String result = (String) hex.decode("Hello");
        assertEquals("Hello", result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeCharArray_Udez3_GZxW0() {
    Hex hex = new Hex();
    try {
        String result = (String) hex.decode(new char[] {'H', 'e', 'l', 'l', 'o'});
        assertEquals("Hello", result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeByteBuffer_XmFd2_ecem0() {
    Hex hex = new Hex();
    ByteBuffer buffer = ByteBuffer.wrap(new byte[] {1, 2, 3});
    try {
        byte[] result = (byte[]) hex.decode(buffer);
        assertArrayEquals(new byte[] {1, 2, 3}, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_FcRP0_ybqH0() {
    Hex hex = new Hex(Charset.forName("UTF-8"));
    byte[] array = new byte[] {(byte)0x48, (byte)0x65, (byte)0x78};
    try {
        byte[] result = hex.decode(array);
        assert result.length == 3;
        assert result[0] == (byte)0x48;
        assert result[1] == (byte)0x65;
        assert result[2] == (byte)0x78;
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeHex_uvce0_TCsf0() {
    String data = "0123456789abcdef";
    byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f};
    try {
        byte[] result = Hex.decodeHex(data);
        assertArrayEquals(expected, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeHex_AcEA0_fid1() {
    byte[] data = new byte[] {0x12, 0x34, 0x56, 0x78};
    char[] result = Hex.encodeHex(data, 0, data.length, true);
    String expected = "12345678";
    for (int i = 0; i < result.length; i++) {
        if (i % 2 == 0) {
            assertEquals(expected.charAt(i / 2), result[i]);
        }
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeHex_biop0_fid1() {
    Hex hex = new Hex();
    byte[] data = new byte[] {1, 2, 3};
    char[] out = new char[6];
    int outOffset = 0;
    hex.encodeHex(data, 0, data.length, true, out, outOffset);
    String expected = "010203";
    String actual = new String(out, 0, outOffset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_Wype0_fid1() {
        Hex hex = new Hex();
        assertEquals(null, hex.getCharset());
    }
}