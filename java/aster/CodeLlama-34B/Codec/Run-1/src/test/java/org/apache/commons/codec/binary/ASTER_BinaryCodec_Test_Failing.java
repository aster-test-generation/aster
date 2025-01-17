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

public class Aster_BinaryCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_singleChar_OFXu1() {
        byte[] expected = new byte[]{0x01};
        byte[] actual = BinaryCodec.fromAscii(new char[]{'1'});
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_ASCIIString_ilGC3_2() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(0x68, result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_ASCIIString_ilGC3_3() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(0x65, result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_ASCIIString_ilGC3_4() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(0x6c, result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_ASCIIString_ilGC3_5() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(0x6c, result[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_ASCIIString_ilGC3_6() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(0x6f, result[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_xIPT0_fid1() {
        byte[] raw = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = BinaryCodec.toAsciiString(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_ASCIIString_ilGC3() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(5, result.length);
        assertEquals(0x68, result[0]);
        assertEquals(0x65, result[1]);
        assertEquals(0x6c, result[2]);
        assertEquals(0x6c, result[3]);
        assertEquals(0x6f, result[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(15, result.length);
        assertEquals(0x30, result[0]);
        assertEquals(0x42, result[1]);
        assertEquals(0x30, result[2]);
        assertEquals(0x42, result[3]);
        assertEquals(0x30, result[4]);
        assertEquals(0x42, result[5]);
        assertEquals(0x30, result[6]);
        assertEquals(0x42, result[7]);
        assertEquals(0x30, result[8]);
        assertEquals(0x42, result[9]);
        assertEquals(0x30, result[10]);
        assertEquals(0x42, result[11]);
        assertEquals(0x30, result[12]);
        assertEquals(0x42, result[13]);
        assertEquals(0x30, result[14]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_MixedString_YWGO5() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(10, result.length);
        assertEquals(0x68, result[0]);
        assertEquals(0x65, result[1]);
        assertEquals(0x6c, result[2]);
        assertEquals(0x6c, result[3]);
        assertEquals(0x6f, result[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_singleByte_xNpP1() {
        byte[] ascii = new byte[]{'1'};
        byte[] expected = new byte[]{0b00000001};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_allElementsZero_ReMA5() {
        assertTrue(BinaryCodec.isEmpty(new byte[]{0, 0, 0, 0}));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_MjQi0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A};
        byte[] expected = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39};
        byte[] actual = codec.encode(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_itnO0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] ascii = new byte[]{0x31, 0x32, 0x33, 0x34, 0x35};
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        byte[] actual = codec.decode(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeSingleAsciiInput_YtKU4() {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x31};
        byte[] expected = new byte[]{0x01};
        byte[] actual = codec.decode(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_byteArray_xrYD1() {
        byte[] ascii = new byte[]{0x01, 0x02, 0x03};
        BinaryCodec codec = new BinaryCodec();
        Object result = codec.decode(ascii);
        assertEquals(new byte[]{0x01, 0x02, 0x03}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArray_VTWj0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{0x01, 0x02, 0x03, 0x04};
        Object encoded = codec.encode(raw);
        assertEquals(new String(raw), encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_multipleBytes_SMHG2() {
        byte[] raw = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03};
        byte[] expected = new byte[]{'0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1'};
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytes_invalid_UJpm4() {
        byte[] raw = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
        byte[] expected = new byte[]{'0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1'};
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_ASCIIString_ilGC3_1_fid3() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(5, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_1_fid3() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(15, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_2() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x30, result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_3() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x42, result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_4() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x30, result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_5() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x42, result[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_6() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x30, result[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_7() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x42, result[5]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_8() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x30, result[6]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_9() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x42, result[7]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_10() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x30, result[8]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_11() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x42, result[9]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_12() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x30, result[10]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_13() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x42, result[11]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_14() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x30, result[12]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_15() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x42, result[13]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_NonASCIIString_UJHP4_16() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("");
        assertEquals(0x30, result[14]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToByteArray_MixedString_YWGO5_1() {
        BinaryCodec codec = new BinaryCodec();
        byte[] result = codec.toByteArray("hello");
        assertEquals(10, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_multipleBytes_RyyQ2_OtLj0() {
        byte[] ascii = new byte[]{'1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] expected = new byte[]{(byte) 0b00000001, (byte) 0b00000010, (byte) 0b00000100, (byte) 0b00001000, (byte) 0b00010000, (byte) 0b00100000, (byte) 0b01000000, (byte) 0b10000000};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonAsciiInput_EyeD2_YqnO0() {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{(byte) 0x80, (byte) 0x81, (byte) 0x82, (byte) 0x83, (byte) 0x84};
        byte[] expected = new byte[]{0x00, 0x00, 0x00, 0x00, 0x00};
        byte[] actual = codec.decode(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_null_HOPq0_xCJa0() {
        BinaryCodec codec = new BinaryCodec();
        Object result = codec.decode(null);
        assertEquals(new byte[0], result);
    }
}