/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryCodec_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_WhenArgumentByteArray_ThenReturnAsciiChars_NXVE1() throws org.apache.commons.codec.EncoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] raw = {0, 1, 2, 3};
        Object result = binaryCodec.encode(raw);
        assert (result.equals("010203"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii1_dXTr0() {
    byte[] ascii = new byte[] {'1', '0', '1', '0', '1', '0', '1', '0'};
    byte[] expected = new byte[] {5};
    assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii4_mEMQ3() {
    byte[] ascii = new byte[] {'1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0'};
    byte[] expected = new byte[] {5, 5};
    assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_1_pbcA0() throws org.apache.commons.codec.DecoderException {
	BinaryCodec binaryCodec = new BinaryCodec();
	Object expected = new byte[0];
	Object actual = binaryCodec.decode(null);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_2_aVxq1() throws org.apache.commons.codec.DecoderException {
	BinaryCodec binaryCodec = new BinaryCodec();
	byte[] ascii = new byte[0];
	Object expected = new byte[0];
	Object actual = binaryCodec.decode(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_3_ONxs2() throws org.apache.commons.codec.DecoderException {
	BinaryCodec binaryCodec = new BinaryCodec();
	char[] ascii = new char[0];
	Object expected = new byte[0];
	Object actual = binaryCodec.decode(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_4_ofjY3() throws org.apache.commons.codec.DecoderException {
	BinaryCodec binaryCodec = new BinaryCodec();
	String ascii = "";
	Object expected = new byte[0];
	Object actual = binaryCodec.decode(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_6_haon5() throws org.apache.commons.codec.DecoderException {
	BinaryCodec binaryCodec = new BinaryCodec();
	byte[] ascii = new byte[] { 0 };
	Object expected = new byte[] { 0 };
	Object actual = binaryCodec.decode(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_7_DeVM6() throws org.apache.commons.codec.DecoderException {
	BinaryCodec binaryCodec = new BinaryCodec();
	char[] ascii = new char[] { 0 };
	Object expected = new byte[] { 0 };
	Object actual = binaryCodec.decode(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_8_xXLC7() throws org.apache.commons.codec.DecoderException {
	BinaryCodec binaryCodec = new BinaryCodec();
	String ascii = "0";
	Object expected = new byte[] { 0 };
	Object actual = binaryCodec.decode(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_9_cWjX8() throws org.apache.commons.codec.DecoderException {
	BinaryCodec binaryCodec = new BinaryCodec();
	byte[] ascii = new byte[] { 0, 1 };
	Object expected = new byte[] { 0, 1 };
	Object actual = binaryCodec.decode(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_fromAscii_null_fqbP0_GJSM0() {
	char[] ascii = null;
	byte[] expected = new byte[0];
	byte[] actual = BinaryCodec.fromAscii(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_fromAscii_empty_tsmL1_hwDn0() {
	char[] ascii = new char[0];
	byte[] expected = new byte[0];
	byte[] actual = BinaryCodec.fromAscii(ascii);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_fromAscii_with1_wUsF2_oajz0() {
	char[] ascii = {'1', '0', '1', '0', '1', '0', '1', '0'};
	byte[] expected = {4};
	byte[] actual = BinaryCodec.fromAscii(ascii);
	assertEquals(expected[0], actual[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromAscii4_mEMQ3_fid2() {
    byte[] ascii = new byte[] {'1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0'};
    byte[] expected = new byte[] {5,-86};
    assertArrayEquals(expected, BinaryCodec.fromAscii(ascii));
}
}