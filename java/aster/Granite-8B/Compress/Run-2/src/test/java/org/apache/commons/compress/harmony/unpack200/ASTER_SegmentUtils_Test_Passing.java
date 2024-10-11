/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountInvokeInterfaceArgs_qHoz0() {
        String descriptor = "()V";
        int expected = 0;
        int actual = SegmentUtils.countInvokeInterfaceArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountArgs_USgP0() {
        String descriptor = "()V";
        int expected = 0;
        int actual = SegmentUtils.countArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountArgs_EwQH1() {
        String descriptor = "()I";
        int expected = 0;
        int actual = SegmentUtils.countArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountArgs_UlGG2() {
        String descriptor = "(I)V";
        int expected = 1;
        int actual = SegmentUtils.countArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountArgs_kELE3() {
        String descriptor = "(II)V";
        int expected = 2;
        int actual = SegmentUtils.countArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountArgs_GjTd4() {
        String descriptor = "(III)V";
        int expected = 3;
        int actual = SegmentUtils.countArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountArgs_mKBx5() {
        String descriptor = "(IIII)V";
        int expected = 4;
        int actual = SegmentUtils.countArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16_Vvul0() {
        long[] flags = {1L << 16, 0L, 1L << 15, 1L << 16};
        int expectedCount = 2;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals(expectedCount, actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithEmptyArray_date1() {
        long[] flags = {};
        int expectedCount = 0;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals(expectedCount, actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithAllZeros_POVv2() {
        long[] flags = {0L, 0L, 0L, 0L};
        int expectedCount = 0;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals(expectedCount, actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithEmptyArray_TwKx1() {
        int[] flags = {};
        int expectedCount = 0;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals(expectedCount, actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithAllBitsSet_SLgt2() {
        int[] flags = {65535, 65535, 65535, 65535, 65535, 65535, 65535, 65535};
        int expectedCount =0;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals(expectedCount, actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16_BPMb0() {
        long[][] flags = new long[2][2];
        flags[0][0] = 1L << 16;
        flags[0][1] = 1L << 16;
        flags[1][0] = 1L << 16;
        flags[1][1] = 1L << 16;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(4, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithEmptyFlags_CxJs1() {
        long[][] flags = new long[0][0];
        int count = SegmentUtils.countBit16(flags);
        assertEquals(0, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSet_FCuZ2() {
        long[][] flags = new long[2][2];
        int count = SegmentUtils.countBit16(flags);
        assertEquals(0, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtFirstColumn_itCv3() {
        long[][] flags = new long[2][2];
        flags[0][0] = 0;
        flags[0][1] = 1L << 16;
        flags[1][0] = 0;
        flags[1][1] = 1L << 16;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(2, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtSecondColumn_ELwR2() {
        long[][] flags = new long[2][2];
        flags[0][0] = 1L << 16;
        flags[0][1] = 0;
        flags[1][0] = 1L << 16;
        flags[1][1] = 0;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(2, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16_Vvul0_NoLi0() {
        long[] flags = {1L << 16, 0L, 1L << 15, 1L << 16};
        int expectedCount = 2;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals((int) expectedCount, actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithAllZeros_POVv2_RSjt0() {
        long[] flags = {0L, 0L, 0L, 0L};
        int expectedCount = 0;
        int actualCount = SegmentUtils.countBit16(flags);
        assertEquals((short) expectedCount, (short) actualCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountBit16WithFlagsNotSetAtFirstColumn_itCv3_gELc0() {
        long[][] flags = new long[2][2];
        flags[0][0] = 0L;
        flags[0][1] = 1L << 16;
        flags[1][0] = 0L;
        flags[1][1] = 1L << 16;
        int count = SegmentUtils.countBit16(flags);
        assertEquals(2, count);
    }
}