/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_byteArray_YHrI0() throws EncoderException {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    Object encoded = codec.encode(raw);
    assertEquals(new byte[] { 0x30, 0x31, 0x32, 0x33 }, encoded);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEmpty_nullArray_oJRI0() throws Exception {
    assertTrue(BinaryCodec.isEmpty(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEmpty_emptyArray_Zfnw1() throws Exception {
    assertTrue(BinaryCodec.isEmpty(new byte[0]));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_empty_ljYT0() throws Exception {
    byte[] expected = new byte[0];
    byte[] actual = BinaryCodec.fromAscii(new char[0]);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_singleChar_UOTP1() throws Exception {
    byte[] expected = new byte[] { 0x01 };
    byte[] actual = BinaryCodec.fromAscii(new char[] { '1' });
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_invalidChar_zaGT4() throws Exception {
    byte[] expected = new byte[0];
    byte[] actual = BinaryCodec.fromAscii(new char[] { 'a' });
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_invalidLength_ngMf5() throws Exception {
    byte[] expected = new byte[0];
    byte[] actual = BinaryCodec.fromAscii(new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9' });
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_empty_VOod0() throws Exception {
    byte[] ascii = new byte[0];
    byte[] expected = new byte[0];
    byte[] actual = BinaryCodec.fromAscii(ascii);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_singleByte_nWtI1() throws Exception {
    byte[] ascii = new byte[] { '1' };
    byte[] expected = new byte[] { 0b00000001 };
    byte[] actual = BinaryCodec.fromAscii(ascii);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_invalidInput_xEFl3() throws Exception {
    byte[] ascii = new byte[] { 'a', 'b', 'c' };
    byte[] expected = new byte[0];
    byte[] actual = BinaryCodec.fromAscii(ascii);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii_nullInput_mAEU4() throws Exception {
    byte[] ascii = null;
    byte[] expected = new byte[0];
    byte[] actual = BinaryCodec.fromAscii(ascii);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_Nflk0() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] ascii = new byte[] { 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x30 };
    byte[] expected = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x00 };
    byte[] actual = codec.decode(ascii);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_ByteArray_SErC1() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] ascii = new byte[] { 0x01, 0x02, 0x03 };
    Object result = codec.decode(ascii);
    assertEquals(new byte[] { 0x01, 0x02, 0x03 }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_CharArray_LbVV2() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    char[] ascii = new char[] { 'a', 'b', 'c' };
    Object result = codec.decode(ascii);
    assertEquals(new byte[] { 0x61, 0x62, 0x63 }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_String_cvYy3() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    String ascii = "abc";
    Object result = codec.decode(ascii);
    assertEquals(new byte[] { 0x61, 0x62, 0x63 }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiChars_empty_gidB0() throws Exception {
    byte[] raw = new byte[0];
    char[] expected = new char[0];
    char[] actual = BinaryCodec.toAsciiChars(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiChars_singleByte_hqOw1() throws Exception {
    byte[] raw = new byte[] { (byte) 0x01 };
    char[] expected = new char[] { '0', '0', '0', '0', '0', '0', '0', '1' };
    char[] actual = BinaryCodec.toAsciiChars(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiChars_multipleBytes_ZtIH2() throws Exception {
    byte[] raw = new byte[] { (byte) 0x01, (byte) 0x02, (byte) 0x03 };
    char[] expected = new char[] { '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1' };
    char[] actual = BinaryCodec.toAsciiChars(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiChars_null_qKBp3() throws Exception {
    byte[] raw = null;
    char[] expected = null;
    char[] actual = BinaryCodec.toAsciiChars(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiChars_invalid_vYwh4() throws Exception {
    byte[] raw = new byte[] { (byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04 };
    char[] expected = new char[] { '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1' };
    char[] actual = BinaryCodec.toAsciiChars(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToByteArray_Null_jyup0() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] result = codec.toByteArray(null);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToByteArray_Empty_JhkL1() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] result = codec.toByteArray("");
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiBytes_empty_XFlL0() throws Exception {
    byte[] raw = new byte[0];
    byte[] expected = new byte[0];
    byte[] actual = BinaryCodec.toAsciiBytes(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiBytes_singleByte_CFDE1() throws Exception {
    byte[] raw = new byte[] { (byte) 0x01 };
    byte[] expected = new byte[] { '0', '0', '0', '0', '0', '0', '0', '1' };
    byte[] actual = BinaryCodec.toAsciiBytes(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiBytes_multipleBytes_kbfY2() throws Exception {
    byte[] raw = new byte[] { (byte) 0x01, (byte) 0x02, (byte) 0x03 };
    byte[] expected = new byte[] { '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1' };
    byte[] actual = BinaryCodec.toAsciiBytes(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiBytes_null_aiKK3() throws Exception {
    byte[] raw = null;
    byte[] expected = null;
    byte[] actual = BinaryCodec.toAsciiBytes(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiBytes_invalid_qkPx4() throws Exception {
    byte[] raw = new byte[] { (byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04 };
    byte[] expected = new byte[] { '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1' };
    byte[] actual = BinaryCodec.toAsciiBytes(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_null_kYVc0() throws Exception {
        assertEquals("", BinaryCodec.toAsciiString(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_empty_YvKY1() throws Exception {
        assertEquals("", BinaryCodec.toAsciiString(new byte[0]));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_singleByte_AQDG2() throws Exception {
        byte[] raw = new byte[] { 0x01 };
        assertEquals("00000001", BinaryCodec.toAsciiString(raw));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_multipleBytes_OVVm3() throws Exception {
        byte[] raw = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05 };
        assertEquals("0000000100000010000000110000001100000011000000110000001100000011", BinaryCodec.toAsciiString(raw));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_zorE0() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a };
    byte[] expected = new byte[] { 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39 };
    byte[] actual = codec.encode(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithEmptyArray_iAfO1() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = new byte[] {};
    byte[] expected = new byte[] {};
    byte[] actual = codec.encode(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNullArray_IGnZ2() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = null;
    byte[] expected = new byte[] {};
    byte[] actual = codec.encode(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithInvalidArray_CblL3() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b };
    byte[] expected = new byte[] { 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39 };
    byte[] actual = codec.encode(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNegativeArray_UPRq4() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = new byte[] { -0x01, -0x02, -0x03, -0x04, -0x05, -0x06, -0x07, -0x08, -0x09, -0x0a };
    byte[] expected = new byte[] { 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39 };
    byte[] actual = codec.encode(raw);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithLargeArray_ikNJ5() throws Exception {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10 };
    byte[] expected = new byte[] { 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3a, 0x3b, 0x3c, 0x3d, 0x3e, 0x3f };
    byte[] actual = codec.encode(raw);
    assertArrayEquals(expected, actual);
}
}