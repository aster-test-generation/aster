/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16_OkXq0() {
        int[] flags = {1, 2, 4, 8, 16, 32, 64, 128};
        int expectedCount = 1;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals(expectedCount, actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithAllBitsSet_SLgt2_fid3() {
        int[] flags = {65535, 65535, 65535, 65535, 65535, 65535, 65535, 65535};
        int expectedCount = 16;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals(expectedCount, actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16_BPMb0_fid3() {
        long[][] flags = new long[2][2];
        flags[0][0] = 1L << 16;
        flags[0][1] = 1L << 16;
        flags[1][0] = 1L << 16;
        flags[1][1] = 1L << 16;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(8, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtFirstColumn_itCv3_fid3() {
        long[][] flags = new long[2][2];
        flags[0][0] = 0;
        flags[0][1] = 1L << 16;
        flags[1][0] = 0;
        flags[1][1] = 1L << 16;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(4, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtSecondColumn_ELwR4() {
        long[][] flags = new long[2][2];
        flags[0][0] = 1L << 16;
        flags[0][1] = 0;
        flags[1][0] = 1L << 16;
        flags[1][1] = 0;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(4, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtThirdColumn_dhWM5() {
        long[][] flags = new long[2][2];
        flags[0][0] = 1L << 16;
        flags[0][1] = 1L << 16;
        flags[1][0] = 1L << 16;
        flags[1][1] = 0;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(6, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16_OkXq0_vSfo0() {
        int[] flags = {1, 2, 4, 8, 16, 32, 64, 128};
        int expectedCount = 1;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals((short)expectedCount, (short)actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtFirstColumn_itCv3_gELc0_fid3() {
        long[][] flags = new long[2][2];
        flags[0][0] = 0L;
        flags[0][1] = 1L << 16;
        flags[1][0] = 0L;
        flags[1][1] = 1L << 16;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(4, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtThirdColumn_dhWM5_ZCKp0() {
        long[][] flags = new long[2][2];
        flags[0][0] = 1L << 16;
        flags[0][1] = 1L << 16;
        flags[1][0] = 1L << 16;
        flags[1][1] = 0L;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(6, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtFourthColumn_fzkU6_bUCl0() {
        long[][] flags = new long[2][2];
        flags[0][0] = 1L << 16;
        flags[0][1] = 1L << 16;
        flags[1][0] = 0L;
        flags[1][1] = 1L << 16;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(6, count);
    }
}