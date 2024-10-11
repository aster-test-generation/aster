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
public class Aster_SegmentUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_1_qJaq0() {
		int[] flags = {1, 2, 4, 8, 16};
		int expected = 1;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCountBit16_2_vBaE1() {
		int[] flags = {1, 2, 4, 8, 16, 32};
		int expected = 1;
		int actual =SegmentUtils.countBit16(flags);
		assertEquals(expected, actual);
	}
}