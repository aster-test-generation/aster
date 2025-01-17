/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BinaryCodec_Test_Failing {
    private BinaryCodec binaryCodec;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_singleChar_wSZV2_1() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'0'});
        assertEquals(1, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_singleChar_wSZV2_2() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1'});
        assertEquals(1, result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArrayWithOnlyOnes_cdOI5() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{0x01, 0x01, 0x01, 0x01};
        Object encoded = codec.encode(raw);
        assertEquals("00000001000000010000000100000001", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArrayWithMixOfZeroesAndOnes_XPmx6() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{0x01, 0x00, 0x01, 0x00};
        Object encoded = codec.encode(raw);
        assertEquals("01000100", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_multipleBytes_XoLQ2() {
        byte[] raw = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03};
        byte[] expected = new byte[]{'0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1'};
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_invalid_XEUP4() {
        byte[] raw = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
        byte[] expected = new byte[]{'0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1'};
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_MultipleBytes_oXRA2_iAPr0() {
        byte[] ascii = new byte[]{'1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] expected = new byte[]{(byte) 0b00000001, (byte) 0b00000010, (byte) 0b00000100, (byte) 0b00001000, (byte) 0b00010000, (byte) 0b00100000, (byte) 0b01000000, (byte) 0b10000000};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_ifHo0_fid1() {
        byte[] raw = new byte[]{0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A};
        String expected = "abcdefghijklmnopqrstuvwxyz";
        String actual = BinaryCodec.toAsciiString(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_singleChar_wSZV2() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1'});
        assertEquals(1, result.length);
        assertEquals(1, result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_multipleChars_Coza3() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '0', '1', '0', '1', '0', '1', '0'});
        assertEquals(4, result.length);
        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
        assertEquals(1, result[2]);
        assertEquals(0, result[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_invalidChars_rCqQ4() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'});
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_invalidLength_tSef5() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '0', '1', '0', '1', '0', '1', '0', '1'});
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_SingleByte_IgAT1() {
        byte[] ascii = new byte[]{'1'};
        byte[] expected = new byte[]{0b00000001};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_SmMC1() {
        byte[] ascii = new byte[]{0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x30};
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x00};
        byte[] actual = binaryCodec.decode(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmpty_HVoF2() {
        byte[] ascii = new byte[]{};
        byte[] expected = new byte[]{};
        byte[] actual = binaryCodec.decode(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_LGGx3() {
        byte[] ascii = null;
        byte[] expected = null;
        byte[] actual = binaryCodec.decode(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalid_SssP4() {
        byte[] ascii = new byte[]{0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x30, 0x31};
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x00, 0x01};
        byte[] actual = binaryCodec.decode(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalid2_njmR5() {
        byte[] ascii = new byte[]{0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x30, 0x31, 0x32};
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x00, 0x01, 0x02};
        byte[] actual = binaryCodec.decode(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalid3_hobM6() {
        byte[] ascii = new byte[]{0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x30, 0x31, 0x32, 0x33};
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x00, 0x01, 0x02, 0x03};
        byte[] actual = binaryCodec.decode(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_byteArray_AJih1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] ascii = new byte[]{0x01, 0x02, 0x03, 0x04};
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04};
        assertArrayEquals(expected, codec.decode(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArray_thjE0() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{0x01, 0x02, 0x03, 0x04};
        Object encoded = codec.encode(raw);
        assertEquals(new String(raw), encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_emptyByteArray_fmYJ3() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[0];
        Object encoded = codec.encode(raw);
        assertEquals(new String(raw), encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArrayWithOnlyZeroes_jysQ4() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{0x00, 0x00, 0x00, 0x00};
        Object encoded = codec.encode(raw);
        assertEquals(new String(raw), encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArrayWithOnlyOnes_cdOI5_fid1() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{0x01, 0x01, 0x01, 0x01};
        Object encoded = codec.encode(raw);
        assertEquals(new String(raw), encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArrayWithMixOfZeroesAndOnes_XPmx6_fid1() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{0x01, 0x00, 0x01, 0x00};
        Object encoded = codec.encode(raw);
        assertEquals(new String(raw), encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_null_JufU3() {
        byte[] raw = null;
        byte[] expected = null;
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_singleChar_wSZV2_1_fid3() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1'});
        assertEquals(1, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_multipleChars_Coza3_1_fid3() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '0', '1', '0', '1', '0', '1', '0'});
        assertEquals(4, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_multipleChars_Coza3_2() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '0', '1', '0', '1', '0', '1', '0'});
        assertEquals(1, result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_multipleChars_Coza3_3() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '0', '1', '0', '1', '0', '1', '0'});
        assertEquals(0, result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_multipleChars_Coza3_4() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '0', '1', '0', '1', '0', '1', '0'});
        assertEquals(1, result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_multipleChars_Coza3_5() {
        byte[] result = BinaryCodec.fromAscii(new char[]{'1', '0', '1', '0', '1', '0', '1', '0'});
        assertEquals(0, result[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_null_mEOo0_CCag0_fid3() {
        byte[] result = BinaryCodec.toAsciiBytes(null);
        assertNull(result);
    }
}