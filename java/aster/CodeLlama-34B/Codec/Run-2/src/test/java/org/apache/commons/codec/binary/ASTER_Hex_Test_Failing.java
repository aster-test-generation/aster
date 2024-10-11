/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Hex_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_validData_zzUs2() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] result = Hex.encodeHex(data);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_upperCase_njqi3() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] result = Hex.encodeHex(data, false);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_lowerCase_AddF4() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] result = Hex.encodeHex(data, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_SOoC0() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] actual = Hex.encodeHex(data, dataOffset, dataLen, toLowerCase);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithUpperCase_Ixgy1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = false;
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] actual = Hex.encodeHex(data, dataOffset, dataLen, toLowerCase);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithOffset_qXxb2() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        int dataOffset = 2;
        int dataLen = data.length - dataOffset;
        boolean toLowerCase = true;
        char[] expected = new char[]{'2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] actual = Hex.encodeHex(data, dataOffset, dataLen, toLowerCase);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLength_dgox3() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        int dataOffset = 0;
        int dataLen = 5;
        boolean toLowerCase = true;
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] actual = Hex.encodeHex(data, dataOffset, dataLen, toLowerCase);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_Oahg0() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A'};
        char[] actual = Hex.encodeHex(data, 0, data.length, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithOffset_TfEe1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B'};
        char[] actual = Hex.encodeHex(data, 2, 5, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLowerCase_wbLt2() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a'};
        char[] actual = Hex.encodeHex(data, 0, data.length, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_lMix0_1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] expectedLowerCase = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] expectedUpperCase = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] actualLowerCase = Hex.encodeHex(data, true);
        char[] actualUpperCase = Hex.encodeHex(data, false);
        assertArrayEquals(expectedLowerCase, actualLowerCase);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_lMix0_2() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] expectedLowerCase = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] expectedUpperCase = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] actualLowerCase = Hex.encodeHex(data, true);
        char[] actualUpperCase = Hex.encodeHex(data, false);
        assertArrayEquals(expectedUpperCase, actualUpperCase);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexInvalid_YoIj1() {
        char[] data = "68656c6c6f20776f726c64".toCharArray();
        try {
            Hex.decodeHex(data);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Illegal hexadecimal character: 'g'", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_RAxM0_1() {
        ByteBuffer data = ByteBuffer.wrap("hello".getBytes());
        char[] expected = "68656c6c6f".toCharArray();
        char[] actual = Hex.encodeHex(data, true);
        data = ByteBuffer.wrap("HELLO".getBytes());
        expected = "48454c4c4f".toCharArray();
        actual = Hex.encodeHex(data, false);
        data = ByteBuffer.wrap(new byte[0]);
        expected = "".toCharArray();
        actual = Hex.encodeHex(data, true);
        data = null;
        expected = "".toCharArray();
        actual = Hex.encodeHex(data, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_RAxM0_2() {
        ByteBuffer data = ByteBuffer.wrap("hello".getBytes());
        char[] expected = "68656c6c6f".toCharArray();
        char[] actual = Hex.encodeHex(data, true);
        assertArrayEquals(expected, actual);
        data = ByteBuffer.wrap("HELLO".getBytes());
        expected = "48454c4c4f".toCharArray();
        actual = Hex.encodeHex(data, false);
        assertArrayEquals(expected, actual);
        data = ByteBuffer.wrap(new byte[0]);
        expected = "".toCharArray();
        actual = Hex.encodeHex(data, true);
        assertArrayEquals(expected, actual);
        data = null;
        expected = "".toCharArray();
        actual = Hex.encodeHex(data, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_SQFN0() throws DecoderException {
        Hex hex = new Hex();
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 0x01);
        buffer.put((byte) 0x02);
        buffer.put((byte) 0x03);
        buffer.put((byte) 0x04);
        buffer.put((byte) 0x05);
        buffer.put((byte) 0x06);
        buffer.put((byte) 0x07);
        buffer.put((byte) 0x08);
        buffer.put((byte) 0x09);
        buffer.put((byte) 0x0A);
        buffer.flip();
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        byte[] actual = hex.decode(buffer);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithNullBuffer_TuOW2() {
        ByteBuffer data = null;
        String expected = "";
        String actual = Hex.encodeHexString(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithCharset_gyGn0() {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        String expected = "org.apache.commons.codec.binary.Hex@4ac98c27[charsetName=UTF-8]";
        String actual = hex.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithCharsetName_KPDm1() {
        Hex hex = new Hex("UTF-8");
        String expected = "org.apache.commons.codec.binary.Hex@2c57583b[charsetName=UTF-8]";
        String actual = hex.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexInvalidCharacter_NZiB3_fid1() {
        char[] data = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        byte[] out = new byte[data.length / 2];
        int outOffset = 0;
        try {
            Hex.decodeHex(data, out, outOffset);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Invalid character 'G' found at index 15", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithOffset_TfEe1_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A'};
        char[] actual = Hex.encodeHex(data, 2, 5, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithNullData_zwhH5() {
        byte[] data = null;
        char[] expected = null;
        char[] actual = Hex.encodeHex(data, 0, 0, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithNegativeOffset_kEDG6_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] expected = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A'};
        char[] actual = Hex.encodeHex(data, -1, data.length, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_abAR0_fid1() {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        byte[] expectedOutput = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35};
        byte[] actualOutput = hex.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_sHzs1_fid1() {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        byte[] expectedOutput = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35};
        byte[] actualOutput = hex.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetName_oOwE2_fid1() {
        Hex hex = new Hex("UTF-8");
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        byte[] expectedOutput = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35};
        byte[] actualOutput = hex.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexString1_bGSA0_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        String expected = "0102030405060708090A";
        String actual = Hex.encodeHexString(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexString2_rBmF1_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        String expected = "0102030405060708090A0B0C0D0E0F";
        String actual = Hex.encodeHexString(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexString3_Pejl2_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10};
        String expected = "0102030405060708090A0B0C0D0E0F10";
        String actual = Hex.encodeHexString(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexString_Sowj0_fid1() {
        ByteBuffer data = ByteBuffer.allocate(10);
        data.put((byte) 0x01);
        data.put((byte) 0x02);
        data.put((byte) 0x03);
        data.put((byte) 0x04);
        data.put((byte) 0x05);
        data.put((byte) 0x06);
        data.put((byte) 0x07);
        data.put((byte) 0x08);
        data.put((byte) 0x09);
        data.put((byte) 0x0A);
        data.flip();
        String expected = "0102030405060708090A";
        String actual = Hex.encodeHexString(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithNullBuffer_TuOW2_fid1() {
        ByteBuffer data = null;
        String expected = null;
        String actual = Hex.encodeHexString(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithCharset_gyGn0_fid1() {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        String expected = "Hex[charsetName=UTF-8]";
        String actual = hex.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithCharsetName_KPDm1_fid1() {
        Hex hex = new Hex("UTF-8");
        String expected = "Hex[charsetName=UTF-8]";
        String actual = hex.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithDefaultCharset_JrVp2_fid1() {
        Hex hex = new Hex();
        String expected = "Hex[charsetName=UTF-8]";
        String actual = hex.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_UOIc0_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        char[] out = new char[dataLen * 2];
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals("0102030405060708090A", new String(out));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithOffset_JLHr2_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        int dataOffset = 2;
        int dataLen = data.length - dataOffset;
        boolean toLowerCase = true;
        char[] out = new char[dataLen * 2];
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals("030405060708090A", new String(out));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_3_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[2], out[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_4_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[3], out[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_5_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[4], out[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_6_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[5], out[5]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_7_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[6], out[6]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_8_fid1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[7], out[7]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_9() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[8], out[8]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_10() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[9], out[9]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_11() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[10], out[10]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_12() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[11], out[11]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_13() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[12], out[12]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_14() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[13], out[13]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_15() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[14], out[14]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0_16() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[15], out[15]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_Charset_shBl0() throws DecoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        byte[] input = "Hello World".getBytes(Charset.forName("UTF-8"));
        byte[] expected = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x57, 0x6f, 0x72, 0x6c, 0x64};
        byte[] actual = hex.decode(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_CharsetName_ApEa1() throws DecoderException {
        Hex hex = new Hex("UTF-8");
        byte[] input = "Hello World".getBytes(Charset.forName("UTF-8"));
        byte[] expected = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x57, 0x6f, 0x72, 0x6c, 0x64};
        byte[] actual = hex.decode(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_DefaultCharset_VbmJ2() throws DecoderException {
        Hex hex = new Hex();
        byte[] input = "Hello World".getBytes(Charset.defaultCharset());
        byte[] expected = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x57, 0x6f, 0x72, 0x6c, 0x64};
        byte[] actual = hex.decode(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_RFsz0_bAyS0_1() {
        ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World!".getBytes());
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] expected = new char[]{'4', '8', '6', '5', '6', 'C', '6', 'C', '6', 'F', '2', '0', '5', '7', '6', 'F', '7', '2', '6', 'C', '6', '4', '2', '1'};
        char[] actual = Hex.encodeHex(byteBuffer, toDigits);
        byteBuffer = ByteBuffer.wrap(new byte[0]);
        toDigits = new char[0];
        expected = new char[0];
        actual = Hex.encodeHex(byteBuffer, toDigits);
        byteBuffer = null;
        toDigits = null;
        expected = null;
        actual = Hex.encodeHex(byteBuffer, toDigits);
        byteBuffer = ByteBuffer.wrap("Hello World!".getBytes());
        toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        expected = new char[]{'4', '8', '6', '5', '6', 'C', '6', 'C', '6', 'F', '2', '0', '5', '7', '6', 'F', '7', '2', '6', 'C', '6', '4', '2', '1'};
        actual = Hex.encodeHex(byteBuffer, toDigits);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_RFsz0_bAyS0_3() {
        ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World!".getBytes());
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] expected = new char[]{'4', '8', '6', '5', '6', 'C', '6', 'C', '6', 'F', '2', '0', '5', '7', '6', 'F', '7', '2', '6', 'C', '6', '4', '2', '1'};
        char[] actual = Hex.encodeHex(byteBuffer, toDigits);
        byteBuffer = ByteBuffer.wrap(new byte[0]);
        toDigits = new char[0];
        expected = new char[0];
        actual = Hex.encodeHex(byteBuffer, toDigits);
        byteBuffer = null;
        toDigits = null;
        expected = null;
        actual = Hex.encodeHex(byteBuffer, toDigits);
        byteBuffer = ByteBuffer.wrap("Hello World!".getBytes());
        toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        expected = new char[]{'4', '8', '6', '5', '6', 'C', '6', 'C', '6', 'F', '2', '0', '5', '7', '6', 'F', '7', '2', '6', 'C', '6', '4', '2', '1'};
        actual = Hex.encodeHex(byteBuffer, toDigits);
        assertNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexEvenLength_xgZa0_iXSe0() {
        char[] data = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        byte[] out = new byte[data.length / 2];
        int outOffset = 0;
        try {
            int outLen = Hex.decodeHex(data, out, outOffset);
            assertEquals(outLen, data.length / 2);
            assertArrayEquals(out, new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F});
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_pXZp0_CPgS0() {
        Hex hex = new Hex();
        String input = "68656c6c6f20776f726c64";
        try {
            Object output = hex.decode(input);
            assertEquals("hello world", output);
        } catch (DecoderException e) {
            fail("DecoderException thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_IdPq1_jfvb0() {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64};
        try {
            Object output = hex.decode(input);
            assertEquals("hello world", output);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteBuffer_dJZd2_rwDV0() {
        Hex hex = new Hex();
        ByteBuffer input = ByteBuffer.wrap(new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64});
        try {
            Object output = hex.decode(input);
            assertEquals("hello world", output);
        } catch (DecoderException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_UMDM3_mlUW1() {
        Hex hex = new Hex();
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        try {
            Object output = hex.decode(input);
            assertEquals("hello world", output);
        } catch (DecoderException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_lMix0() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] expectedLowerCase = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] expectedUpperCase = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] actualLowerCase = Hex.encodeHex(data, true);
        char[] actualUpperCase = Hex.encodeHex(data, false);
        assertArrayEquals(expectedLowerCase, actualLowerCase);
        assertArrayEquals(expectedUpperCase, actualUpperCase);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_IzmB0() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        char[] toDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] out = new char[data.length * 2];
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        assertEquals(toDigits[0], out[0]);
        assertEquals(toDigits[1], out[1]);
        assertEquals(toDigits[2], out[2]);
        assertEquals(toDigits[3], out[3]);
        assertEquals(toDigits[4], out[4]);
        assertEquals(toDigits[5], out[5]);
        assertEquals(toDigits[6], out[6]);
        assertEquals(toDigits[7], out[7]);
        assertEquals(toDigits[8], out[8]);
        assertEquals(toDigits[9], out[9]);
        assertEquals(toDigits[10], out[10]);
        assertEquals(toDigits[11], out[11]);
        assertEquals(toDigits[12], out[12]);
        assertEquals(toDigits[13], out[13]);
        assertEquals(toDigits[14], out[14]);
        assertEquals(toDigits[15], out[15]);
    }
}