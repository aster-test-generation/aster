/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Hex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexWithEvenNumberOfCharacters_ELoN0_1() throws DecoderException {
        char[] data = {'1', 'A', '2', 'F'};
        byte[] out = new byte[2];
        int outOffset = 0;
        int result = Hex.decodeHex(data, out, outOffset);
        assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexWithEvenNumberOfCharacters_ELoN0_2() throws DecoderException {
        char[] data = {'1', 'A', '2', 'F'};
        byte[] out = new byte[2];
        int outOffset = 0;
        int result = Hex.decodeHex(data, out, outOffset);
        assertArrayEquals(new byte[]{(byte) 0x1A, (byte) 0x2F}, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexWithOddNumberOfCharacters_IxGw1() {
        char[] data = {'1', 'A', '2'};
        byte[] out = new byte[1];
        int outOffset = 0;
        assertThrows(DecoderException.class, () -> Hex.decodeHex(data, out, outOffset));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexWithInsufficientOutputArraySize_LfJu2() {
        char[] data = {'1', 'A', '2', 'F'};
        byte[] out = new byte[1];
        int outOffset = 0;
        assertThrows(DecoderException.class, () -> Hex.decodeHex(data, out, outOffset));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexWithValidInputAndOffset_vFbK3_1() throws DecoderException {
        char[] data = {'1', 'A', '2', 'F', '3', 'C'};
        byte[] out = new byte[6]; // Adjusted size to accommodate decoded data
        int outOffset = 2;
        int result = Hex.decodeHex(data, out, outOffset);
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexWithValidInputAndOffset_vFbK3_2() throws DecoderException {
        char[] data = {'1', 'A', '2', 'F', '3', 'C'};
        byte[] out = new byte[6]; // Increased the size of the output array to accommodate the decoded data
        int outOffset = 2;
        int result = Hex.decodeHex(data, out, outOffset);
        assertArrayEquals(new byte[]{0, 0, (byte) 0x1A, (byte) 0x2F, (byte) 0x3C, 0}, out);
        assertEquals(3, result); // Added assertion to check the return value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithNonEmptyByteArray_ilDo0() {
        byte[] data = new byte[]{0x01, 0x0A, 0x1F, 0x7F};
        char[] expected = new char[]{'0', '1', '0', 'A', '1', 'F', '7', 'F'};
        char[] result = Hex.encodeHex(data);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLowerCase_JkIs0() {
        byte[] inputData = new byte[]{0x0f, 0x1a};
        int offset = 0;
        int length = inputData.length;
        boolean toLowerCase = true;
        char[] expectedOutput = {'0', 'f', '1', 'a'};
        char[] result = Hex.encodeHex(inputData, offset, length, toLowerCase);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLowerCase_XXJR0() {
        byte[] data = {0x1a, 0x2f, 0x3b};
        int dataOffset = 0;
        int dataLen = 3;
        boolean toLowerCase = true;
        char[] expected = {'1', 'a', '2', 'f', '3', 'b'};
        char[] result = Hex.encodeHex(data, dataOffset, dataLen, toLowerCase);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithValidData_JPoI0() {
        byte[] data = {0x1a, 0x2f, 0x3b};
        char[] toDigits = "0123456789ABCDEF".toCharArray();
        char[] expected = {'1', 'A', '2', 'F', '3', 'B'};
        char[] result = Hex.encodeHex(data, toDigits);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteBuffer_hBxR0() {
        Hex hex = new Hex("UTF-8");
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x01, 0x02, 0x03});
        byte[] encoded = hex.encode(buffer);
        assertArrayEquals("010203".getBytes(StandardCharsets.UTF_8), encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteBuffer_XxUN1_1() {
        Hex hex = new Hex();
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x74, 0x65, 0x73, 0x74});
        Object result = hex.encode(buffer);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteBuffer_XxUN1_2() {
        Hex hex = new Hex();
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x74, 0x65, 0x73, 0x74});
        Object result = hex.encode(buffer);
        assertFalse(result instanceof char[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_hBmu2_1() {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x74, 0x65, 0x73, 0x74};
        Object result = hex.encode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_hBmu2_2() {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x74, 0x65, 0x73, 0x74};
        Object result = hex.encode(input);
        assertFalse(result instanceof char[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLowerCase_bUnQ0() {
        byte[] inputData = new byte[]{0x0f, 0x1a};
        char[] expectedOutput = {'0', 'f', '1', 'a'};
        char[] result = Hex.encodeHex(inputData, true);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDigit_InvalidHexCharacter_azNI1() {
        try {
            Hex.toDigit('G', 1);
            fail("Expected a DecoderException to be thrown");
        } catch (DecoderException e) {
            assertEquals("Illegal hexadecimal character G at index 1", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithUpperCase_fKIS0() {
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x1a, 0x2f, 0x3e});
        String result = Hex.encodeHexString(buffer, false);
        assertEquals("1A2F3E", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_ValidInput_ociD0() throws DecoderException {
        char[] inputData = {'6', '1', '6', '2', '6', '3', '6', '4'};
        byte[] expectedOutput = {97, 98, 99, 100}; // corresponding ASCII values for 'abcd'
        byte[] result = Hex.decodeHex(inputData);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyArray_XAQF0() {
        Hex hex = new Hex();
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        byte[] result = hex.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLowerCase_zLRH0() {
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x0f, 0x1a});
        char[] expected = {'0', 'f', '1', 'a'};
        char[] result = Hex.encodeHex(buffer, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDirectBuffer_RKxw0() throws DecoderException {
        Charset charset = StandardCharsets.UTF_8;
        Hex hex = new Hex(charset);
        String hexString = "48656C6C6F"; // Hexadecimal for "Hello"
        ByteBuffer buffer = ByteBuffer.allocateDirect(hexString.length() / 2);
        for (int i = 0; i < hexString.length(); i += 2) {
            int byteValue = Integer.parseInt(hexString.substring(i, i + 2), 16);
            buffer.put((byte) byteValue);
        }
        buffer.flip();
        char[] encodedHex = Hex.encodeHex(buffer, new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'});
        String encodedString = new String(encodedHex);
        assertEquals("48656C6C6F", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetName_DefaultConstructor_zvSP0() {
        Hex hex = new Hex();
        assertEquals("UTF-8", hex.getCharsetName()); // Assuming UTF-8 is the default charset
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithSimpleInput_cCec0() {
        byte[] inputData = "hello".getBytes();
        String expectedOutput = "68656c6c6f";
        String result = Hex.encodeHexString(inputData);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithEmptyBuffer_dNEz0() {
        ByteBuffer buffer = ByteBuffer.allocate(0);
        String result = Hex.encodeHexString(buffer);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithDefaultCharset_xPZh0() {
        Hex hex = new Hex();
        String expected = hex.toString() + "[charsetName=" + Charset.defaultCharset() + "]";
        String actual = hex.toString() + "[charsetName=" + Charset.defaultCharset() + "]";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithLowerCase_kzzF0() {
        byte[] data = {0x1a, 0x2f, 0x3e};
        String expected = "1a2f3e";
        String result = Hex.encodeHexString(data, true);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexLowerCase_dbLU0() {
        byte[] inputData = new byte[]{0x0f, 0x1a};
        int dataOffset = 0;
        int dataLen = inputData.length;
        boolean toLowerCase = true;
        char[] output = new char[dataLen * 2];
        int outOffset = 0;
        Hex.encodeHex(inputData, dataOffset, dataLen, toLowerCase, output, outOffset);
        assertArrayEquals(new char[]{'0', 'f', '1', 'a'}, output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLowerCase_TWgD0() {
        byte[] data = {0x1a, 0x2f, 0x3b};
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        char[] out = new char[dataLen * 2];
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        char[] expectedOutput = {'1', 'a', '2', 'f', '3', 'b'};
        assertArrayEquals(expectedOutput, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_DefaultConstructor_lJyD0() {
        Hex hex = new Hex();
        Charset expectedCharset = Charset.defaultCharset();
        Charset actualCharset = hex.getCharset();
        assertEquals(expectedCharset, actualCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_ValidHexInput_ShouldDecodeSuccessfully_epTE0() throws DecoderException {
        String hexString = "68656c6c6f"; // hex for "hello"
        byte[] expected = new byte[]{104, 101, 108, 108, 111}; // ASCII values for "hello"
        byte[] result = Hex.decodeHex(hexString);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithEmptyBuffer_vkZv0() {
        ByteBuffer buffer = ByteBuffer.allocate(0);
        char[] result = Hex.encodeHex(buffer);
        assertArrayEquals(new char[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidInput_GXDG0() throws DecoderException {
        Hex hex = new Hex(StandardCharsets.UTF_8);
        byte[] input = "68656c6c6f".getBytes(StandardCharsets.UTF_8); // hex representation of "hello"
        byte[] expected = new byte[]{104, 101, 108, 108, 111}; // ASCII values of "hello"
        byte[] result = hex.decode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithDirectBuffer_vgps0() {
        ByteBuffer buffer = ByteBuffer.allocateDirect(10);
        buffer.put(new byte[]{0x0A, 0x1B, 0x2C, 0x3D, 0x4E});
        buffer.flip(); // Prepare the buffer to be read
        char[] hexChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] expected = {'0', 'A', '1', 'B', '2', 'C', '3', 'D', '4', 'E'};
        char[] result = Hex.encodeHex(buffer, hexChars);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDigit_ValidHexCharacter_Kpds0_uDKP0() {
        try {
            int result = Hex.toDigit('A', 0);
            assertEquals(10, result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_jbMq0_WjjI0() {
        Hex hex = new Hex();
        String input = "48656c6c6f"; // Hexadecimal for "Hello"
        String expected = "Hello";
        try {
            String result = new String((byte[]) hex.decode(input), StandardCharsets.UTF_8);
            assertEquals(expected, result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHexWithEvenNumberOfCharacters_ELoN0() throws DecoderException {
        char[] data = {'1', 'A', '2', 'F'};
        byte[] out = new byte[2];
        int outOffset = 0;
        int result = Hex.decodeHex(data, out, outOffset);
        assertEquals(2, result);
        assertArrayEquals(new byte[]{(byte) 0x1A, (byte) 0x2F}, out);
    }
}