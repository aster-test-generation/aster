/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_0_UZdK0() {
		final String descriptor = "";
		int expected = 0;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_1_wsJP1() {
		final String descriptor = "(I)V";
		int expected = 1;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_2_YuBK2() {
		final String descriptor = "(II)V";
		int expected = 2;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_3_NNOt3() {
		final String descriptor = "(III)V";
		int expected = 3;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_4_fggW4() {
		final String descriptor = "(IIII)V";
		int expected = 4;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_5_qGmO5() {
		final String descriptor = "(IIIII)V";
		int expected = 5;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_6_JfrI6() {
		final String descriptor = "(IIIIII)V";
		int expected = 6;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_7_OSCI7() {
		final String descriptor = "(IIIIIII)V";
		int expected = 7;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_8_bbig8() {
		final String descriptor = "(IIIIIIII)V";
		int expected = 8;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_9_xKIr9() {
		final String descriptor = "(IIIIIIIII)V";
		int expected = 9;
		int actual =SegmentUtils.countArgs(descriptor);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_1_FKjV0() {
		long[] flags = {0, 0, 0};
		int expected = 0;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_2_jRth1() {
		long[] flags = {0, 1 << 16, 0};
		int expected = 1;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_1_LXFa0() {
		int[] flags = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768};
		int expected = 1;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_2_EXCO1() {
		int[] flags = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768};
		int expected = 2;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_1_gdMU0() {
		long[][] flags = new long[][]{{0x1234567890abcdefL, 0xfedcba0987654321L}};
		int expected = 1;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_2_LYEU1() {
		long[][] flags = new long[][]{{0x1234567890abcdefL, 0xfedcba0987654321L}, {0x1234567890abcdefL, 0xfedcba0987654321L}};
		int expected = 2;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_3_uXHr2() {
		long[][] flags = new long[][]{{0x1234567890abcdefL, 0xfedcba0987654321L}, {0x1234567890abcdefL, 0xfedcba0987654321L}, {0x1234567890abcdefL, 0xfedcba0987654321L}};
		int expected = 3;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_0_bQfV0() {
		String descriptor = "";
		int widthOfLongsAndDoubles = 0;
		int expected = 0;
		int actual =SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_1_GvDw1() {
		String descriptor = "()";
		int widthOfLongsAndDoubles = 0;
		int expected = 0;
		int actual =SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_2_BXJe2() {
		String descriptor = "(I)V";
		int widthOfLongsAndDoubles = 0;
		int expected = 1;
		int actual =SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
		assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountArgs_3_AQmP3() {
		String descriptor = "(II)V";
		int widthOfLongsAndDoubles = 2;
		int expected = 3;
		int actual =SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
		assertEquals(expected, actual);
	}
}