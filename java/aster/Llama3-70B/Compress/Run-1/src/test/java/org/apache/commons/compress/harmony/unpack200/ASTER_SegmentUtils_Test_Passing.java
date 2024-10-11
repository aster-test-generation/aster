/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_EmptyArray_xcIW0() {
    long[] flags = new long[0];
    int result = SegmentUtils.countBit16(flags);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_NoBit16_WrZM1() {
    long[] flags = new long[] {1, 2, 4, 8};
    int result = SegmentUtils.countBit16(flags);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_HasBit16_Ajxp2() {
    long[] flags = new long[] {1 << 16, 2, 4, 8, 1 << 16};
    int result = SegmentUtils.countBit16(flags);
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_EmptyArray_pTZl0() {
    int[] flags = new int[0];
    assertEquals(0, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_NoBit16_NQbz1() {
    int[] flags = new int[] {1, 2, 4, 8};
    assertEquals(0, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_EmptyArray_VMvc0() {
    long[][] flags = {};
    assertEquals(0, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_NoBit16_SDGE1() {
    long[][] flags = {{1, 2, 3}, {4, 5, 6}};
    assertEquals(0, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_SingleBit16_pFjZ2() {
    long[][] flags = {{1, 2, 65537}, {4, 5, 6}};
    assertEquals(1, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_MultipleBit16_Oemn3() {
    long[][] flags = {{1, 2, 65537}, {4, 5, 65537}, {7, 8, 65537}};
    assertEquals(3, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs1_jTrZ0() {
    assertEquals(0, SegmentUtils.countArgs("()V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs2_Tolh1() {
    assertEquals(1, SegmentUtils.countArgs("(I)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs4_QMEJ3() {
    assertEquals(2, SegmentUtils.countArgs("(II)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs7_dDKO6() {
    assertEquals(3, SegmentUtils.countArgs("(III)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs10_RIvd9() {
    assertEquals(1, SegmentUtils.countArgs("(Ljava/lang/String;)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs11_BSpZ10() {
    assertEquals(1, SegmentUtils.countArgs("([I)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs12_yXSJ11() {
    assertEquals(2, SegmentUtils.countArgs("(ILjava/lang/String;)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs13_LVXg12() {
    assertEquals(2, SegmentUtils.countArgs("(I[I)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs14_MaoN13() {
    try {
        SegmentUtils.countArgs("no arguments", 2);
        fail();
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_CANS0_fid1() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs8_wXMQ7_fid1() {
    assertEquals(4, SegmentUtils.countArgs("(IID)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs9_ScHR8_fid1() {
    assertEquals(4, SegmentUtils.countArgs("(DII)V", 2));
}
}