/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Test_Failing {
    private static char[] toAsciiChars(byte[] raw) {
        char[] asciiChars = new char[raw.length];
        for (int i = 0; i < raw.length; i++) {
            asciiChars[i] = (char) raw[i];
        }
        return asciiChars;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_VxKK0() {
        byte[] raw = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = new String(toAsciiChars(raw));
        String actual = BinaryCodec.toAsciiString(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_SingleBit_oxIk1() {
        char[] ascii = {'0', '1'};
        byte[] expected = {0b00000001};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_MultipleBits_nMXX2() {
        char[] ascii = {'0', '1', '0', '1', '0', '1', '0', '1'};
        byte[] expected = {0b00001010};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_MultipleBytes_iiWP3() {
        char[] ascii = {'0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1'};
        byte[] expected = {0b00001010, 0b00001010};
        assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiChars_TwoBytes_vHCs2() {
        final byte[] raw = {0x00, 0x01};
        final char[] ascii = BinaryCodec.toAsciiChars(raw);
        assertTrue(new String(ascii).equals("0000000000000001"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithSingleBit_Crgs1() {
        byte[] ascii = {'0'};
        byte[] expected = {0};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithMultipleBytes_XvEs4() {
        byte[] ascii = {'1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] expected = {(byte) 210};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_xufm0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] raw = new byte[]{0, 1, 0, 1, 0, 1, 0, 1};
        byte[] expected = new byte[]{48, 49, 48, 49, 48, 49, 48, 49};
        assertArrayEquals(expected, binaryCodec.encode(raw));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_Uufc0() {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] ascii = new byte[]{65, 66, 67};
        byte[] expected = new byte[]{0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1};
        assertArrayEquals(expected, binaryCodec.decode(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_HHmc0() throws EncoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object raw = new byte[]{0, 1, 0, 1, 0, 1, 0, 1};
        Object expected = new char[]{'0', '1', '0', '1', '0', '1', '0', '1'};
        Object actual = binaryCodec.encode(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithMultipleBytes_ivJz2() {
        byte[] raw = {0x00, 0x01, 0x02, 0x03};
        byte[] expected = {'0', '0', '0', '0', '0', '0', '0', '0',
        '0', '0', '0', '0', '0', '0', '0', '1',
        '0', '0', '0', '0', '0', '0', '1', '0',
        '0', '0', '0', '0', '0', '0', '1', '1'};
        assertArrayEquals(expected, BinaryCodec.toAsciiBytes(raw));
    }
}