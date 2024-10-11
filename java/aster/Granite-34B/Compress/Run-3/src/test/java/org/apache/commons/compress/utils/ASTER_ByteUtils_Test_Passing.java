/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ByteUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian_jxVI0() {
		byte[] bytes = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
		int off = 0;
		int length = 4;
		long expected = 0x04030201L;
		long actual =ByteUtils.fromLittleEndian(bytes, off, length);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndianWithOffset_xQPp1() {
		byte[] bytes = new byte[] {0x00, 0x01, 0x02, 0x03, 0x04, 0x05};
		int off = 1;
		int length = 4;
		long expected = 0x04030201L;
		long actual =ByteUtils.fromLittleEndian(bytes, off, length);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndianWithMaxOffset_Puqr2() {
		byte[] bytes = new byte[] {0x00, 0x00, 0x00, 0x00, 0x01};
		int off = 3;
		int length = 2;
		long expected = 0x0001L;
		long actual =ByteUtils.fromLittleEndian(bytes, off, length);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndianWithZeroLength_sUTi3() {
		byte[] bytes = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
		int off = 0;
		int length = 0;
		long expected = 0L;
		long actual =ByteUtils.fromLittleEndian(bytes, off, length);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndianWithNegativeLength_hovR4() {
		byte[] bytes = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
		int off = 0;
		int length = -1;
		long expected = 0L;
		long actual =ByteUtils.fromLittleEndian(bytes, off, length);
		assertEquals(expected, actual);
	}
}