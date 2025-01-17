/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Hex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithNonNullData_aujT0() {
        byte[] data = new byte[]{0x0F, 0x1A, 0x2B, 0x3C, 0x4D, 0x5E, 0x6F};
        char[] expected = {'0', 'f', '1', 'a', '2', 'b', '3', 'c', '4', 'd', '5', 'e', '6', 'f'};
        char[] result = Hex.encodeHex(data);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexLowerCase_CVkC0() {
        byte[] data = new byte[]{0x0f, 0x1a};
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        char[] result = Hex.encodeHex(data, dataOffset, dataLen, toLowerCase);
        char[] expected = {'0', 'f', '1', 'a'};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_AllZeroesInput_Jtyh0() {
        byte[] data = new byte[]{0, 0, 0, 0};
        char[] toDigits = "0123456789ABCDEF".toCharArray();
        char[] expected = "00000000".toCharArray();
        char[] result = Hex.encodeHex(data, toDigits);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexLowerCase_CpIF0() {
        byte[] data = {0x1a, 0x2f, 0x3b};
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        char[] result = Hex.encodeHex(data, dataOffset, dataLen, toLowerCase);
        char[] expected = {'1', 'a', '2', 'f', '3', 'b'};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLowerCase_EJli0() {
        byte[] data = {0x0f, 0x1a};
        char[] expected = {'0', 'f', '1', 'a'};
        char[] result = Hex.encodeHex(data, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithUpperCase_dklP0() {
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x1a, 0x2f, 0x3e});
        String result = Hex.encodeHexString(buffer, false);
        assertEquals("1A2F3E", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithDefaultCharset_MTRm0() {
        Hex hex = new Hex();
        byte[] input = "Hello World".getBytes();
        byte[] expectedOutput = "48656c6c6f20576f726c64".getBytes();
        byte[] result = hex.encode(input);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteBuffer_EJxc0() {
        Hex hex = new Hex(StandardCharsets.UTF_8);
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x1a, 0x2b, 0x3c});
        byte[] expected = "1a2b3c".getBytes(StandardCharsets.UTF_8);
        byte[] result = hex.encode(buffer);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDigit_InvalidHexCharacter_wywu1() {
        try {
            Hex.toDigit('G', 1);
            fail("Expected a DecoderException to be thrown");
        } catch (DecoderException e) {
            assertEquals("Illegal hexadecimal character G at index 1", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_ValidInput_LhuQ0() throws DecoderException {
        char[] inputData = {'6', '1', '6', '2', '6', '3', '6', '4'};
        byte[] expectedOutput = {97, 98, 99, 100}; // corresponding ASCII values for 'abcd'
        byte[] result = Hex.decodeHex(inputData);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetName_DefaultConstructor_KrjK0() {
        Hex hex = new Hex();
        assertEquals("UTF-8", hex.getCharsetName()); // Assuming UTF-8 is the default charset
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithLowerCase_BcQp0() {
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x0F, 0x1A});
        char[] expected = {'0', 'f', '1', 'a'};
        char[] result = Hex.encodeHex(buffer, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithSimpleInput_aKzn0() {
        byte[] inputData = "hello".getBytes();
        String expectedOutput = "68656c6c6f";
        String actualOutput = Hex.encodeHexString(inputData);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexStringWithEmptyBuffer_grvX0() {
        ByteBuffer buffer = ByteBuffer.allocate(0);
        String result = Hex.encodeHexString(buffer);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_DefaultConstructor_iZkW0() {
        Hex hex = new Hex();
        String expected = "org.apache.commons.codec.binary.Hex@" + Integer.toHexString(hex.hashCode()) + "[charsetName=UTF-8]";
        assertEquals(expected, hex.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteBuffer_ZnuW1_1() {
        Hex hex = new Hex();
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x01, 0x02, 0x03, 0x04});
        Object result = hex.encode(buffer);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteBuffer_ZnuW1_2() {
        Hex hex = new Hex();
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{0x01, 0x02, 0x03, 0x04});
        Object result = hex.encode(buffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_YMns2_1() {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x05, 0x06, 0x07, 0x08};
        Object result = hex.encode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDirectBuffer_JHYP0() throws DecoderException {
        ByteBuffer buffer = ByteBuffer.allocateDirect(6);
        buffer.put(new byte[]{0x31, 0x32, 0x33, 0x34, 0x35, 0x36}); // Represents hex string "123456"
        buffer.flip(); // Reset position to zero for reading
        Hex hex = new Hex();
        byte[] decodedBytes = hex.decode(buffer);
        byte[] expectedBytes = new byte[]{18, 52, 86}; // Decimal equivalent of hex 123456
        assertArrayEquals(expectedBytes, decodedBytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_DefaultConstructor_CdsB0() {
        Hex hex = new Hex();
        Charset expectedCharset = Charset.defaultCharset();
        Charset actualCharset = hex.getCharset();
        assertEquals(expectedCharset, actualCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithEmptyBuffer_jVgr0() {
        ByteBuffer buffer = ByteBuffer.allocate(0);
        char[] result = Hex.encodeHex(buffer);
        assertArrayEquals(new char[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexLowerCase_lDqE0() {
        byte[] data = new byte[]{0x0F, 0x1A};
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        char[] out = new char[dataLen * 2];
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        char[] expectedOutput = {'0', 'f', '1', 'a'};
        assertArrayEquals(expectedOutput, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexLowerCase_fOBl0() {
        byte[] data = {0x1a, 0x2f, 0x3c};
        int dataOffset = 0;
        int dataLen = data.length;
        boolean toLowerCase = true;
        char[] out = new char[dataLen * 2];
        int outOffset = 0;
        Hex.encodeHex(data, dataOffset, dataLen, toLowerCase, out, outOffset);
        char[] expected = {'1', 'a', '2', 'f', '3', 'c'};
        assertArrayEquals(expected, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_ValidHexInput_ShouldDecodeSuccessfully_IvVy0() throws DecoderException {
        String hexString = "68656c6c6f"; // hex for "hello"
        byte[] expected = new byte[]{104, 101, 108, 108, 111}; // ASCII values for "hello"
        byte[] result = Hex.decodeHex(hexString);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidInput_tbNr0() throws DecoderException {
        Hex hex = new Hex(StandardCharsets.UTF_8);
        byte[] input = "68656c6c6f".getBytes(StandardCharsets.UTF_8); // hex for "hello"
        byte[] expected = new byte[]{104, 101, 108, 108, 111}; // ASCII values for "hello"
        byte[] result = hex.decode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_EvenLength_RtqU0_1() throws DecoderException {
        char[] data = {'a', '1', 'b', '2', 'c', '3'};
        byte[] out = new byte[3];
        int result = Hex.decodeHex(data, out, 0);
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_EvenLength_RtqU0_2() throws DecoderException {
        char[] data = {'a', '1', 'b', '2', 'c', '3'};
        byte[] out = new byte[3];
        int result = Hex.decodeHex(data, out, 0);
        assertArrayEquals(new byte[]{(byte) 0xa1, (byte) 0xb2, (byte) 0xc3}, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_ValidInputWithOffset_UcfI3_1() throws DecoderException {
        char[] data = {'a', '1', 'b', '2', 'c', '3'};
        byte[] out = new byte[4];
        int result = Hex.decodeHex(data, out, 1);
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_ValidInputWithOffset_UcfI3_2() throws DecoderException {
        char[] data = {'a', '1', 'b', '2', 'c', '3'};
        byte[] out = new byte[4];
        int result = Hex.decodeHex(data, out, 1);
        assertArrayEquals(new byte[]{0, (byte) 0xa1, (byte) 0xb2, (byte) 0xc3}, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHexWithDirectBuffer_yHwj0() {
        ByteBuffer buffer = ByteBuffer.allocateDirect(10);
        buffer.put(new byte[]{0x0A, 0x1B, 0x2C, 0x3D, 0x4E});
        buffer.flip(); // Switch to read mode
        char[] hexChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] expected = {'0', 'A', '1', 'B', '2', 'C', '3', 'D', '4', 'E'};
        char[] result = Hex.encodeHex(buffer, hexChars);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_Sqxf0() throws DecoderException {
        Hex hex = new Hex();
        String input = "48656c6c6f"; // Hexadecimal for "Hello"
        String expected = "Hello";
        String result = new String((byte[]) hex.decode(input), Charset.defaultCharset());
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithChar_BfjJ3() throws DecoderException {
        Hex hex = new Hex();
        char[] input = "48656c6c6f".toCharArray(); // Hexadecimal for "Hello"
        String expected = "Hello";
        String result = new String((byte[]) hex.decode(input), Charset.defaultCharset());
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_EvenLength_RtqU0() throws DecoderException {
        char[] data = {'a', '1', 'b', '2', 'c', '3'};
        byte[] out = new byte[3];
        int result = Hex.decodeHex(data, out, 0);
        assertEquals(3, result);
        assertArrayEquals(new byte[]{(byte) 0xa1, (byte) 0xb2, (byte) 0xc3}, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_ValidInputWithOffset_UcfI3() throws DecoderException {
        char[] data = {'a', '1', 'b', '2', 'c', '3'};
        byte[] out = new byte[4];
        int result = Hex.decodeHex(data, out, 1);
        assertEquals(3, result);
        assertArrayEquals(new byte[]{0, (byte) 0xa1, (byte) 0xb2, (byte) 0xc3}, out);
    }
}