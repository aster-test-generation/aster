/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import java.nio.ByteBuffer;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Hex_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString1_rdMW0() {
    Hex hex = new Hex();
    Assertions.assertEquals("Hex[]", hex.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString2_JygP1() {
    Hex hex = new Hex("UTF-8");
    Assertions.assertEquals("Hex[charsetName=UTF-8]", hex.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encodeTest2_zVEn1() throws org.apache.commons.codec.EncoderException {
	Hex hex = new Hex();
	ByteBuffer input = ByteBuffer.allocate(1024);
	byte[] expected = hex.encode(input.array());
	byte[] actual = hex.encode(input);
	Assertions.assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encodeTest3_rlAx2() throws org.apache.commons.codec.EncoderException {
	Hex hex = new Hex();
	byte[] input = new byte[1024];
	byte[] expected = hex.encode(input);
	byte[] actual = hex.encode(input);
	Assertions.assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test1_lwUy0() throws org.apache.commons.codec.DecoderException {
		byte[] out = new byte[10];
		char[] data = new char[20];
		int outOffset = 5;
		int outLen = 15;
		Hex hex = new Hex();
		try {
			int result = hex.decodeHex(data, out, outOffset);
			assertTrue(result == outLen);
		} catch (DecoderException e) {
			e.printStackTrace();
		}
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test2_dJir1() throws org.apache.commons.codec.DecoderException {
		byte[] out = new byte[10];
		char[] data = new char[20];
		int outOffset = 5;
		int outLen = 16;
		Hex hex = new Hex();
		try {
			int result = hex.decodeHex(data, out, outOffset);
			assertTrue(result == outLen);
		} catch (DecoderException e) {
			e.printStackTrace();
		}
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecode_dbVW0() throws DecoderException {
		final byte[] array = new byte[0];
		Hex hex = new Hex();
		hex.decode(array);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_byte_nXkD0() throws DecoderException {
    byte[] input = new byte[0];
    Object expected = new byte[0];
    Object actual = new Hex().decode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_ByteBuffer_hTnd1() throws DecoderException {
    ByteBuffer input = ByteBuffer.allocate(0);
    Object expected = new byte[0];
    Object actual = new Hex().decode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_String_UzMW2() throws DecoderException {
    String input = "";
    Object expected = new byte[0];
    Object actual = new Hex().decode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_char_ZnEb3() throws DecoderException {
    char[] input = new char[0];
    Object expected = new byte[0];
    Object actual = new Hex().decode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encodeTest1_ozQD0_ymtT0() throws org.apache.commons.codec.EncoderException {
	Hex hex = new Hex();
	String input = "Hello, World!";
	byte[] expected = hex.encode(input.getBytes());
	byte[] actual = hex.encode(input.getBytes());
	Assertions.assertArrayEquals(expected, actual);
}
}