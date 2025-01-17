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
public void testCountInvokeInterfaceArgs_ABnm0() {
    assertEquals(1, SegmentUtils.countInvokeInterfaceArgs("()V"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_ZAfE0() {
    assertEquals(1, SegmentUtils.countArgs("()"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_MultipleBit16_udLV3() {
    long[][] flags = {{1, 2, 65536}, {8, 16, 65536}, {65536, 65536, 32}};
    assertEquals(3, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs3_vLUK2() {
    assertEquals(1, SegmentUtils.countArgs("(D)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs4_yMUk3() {
    assertEquals(2, SegmentUtils.countArgs("(ID)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs5_aLDI4() {
    assertEquals(2, SegmentUtils.countArgs("(DD)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs10_sYik9() {
    assertEquals(2, SegmentUtils.countArgs("(ID[D)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs12_lahd11() {
    assertEquals(3, SegmentUtils.countArgs("(IDD[D)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs14_UnSo13() {
    assertEquals(4, SegmentUtils.countArgs("(IDDD[D)V", 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_MultipleBit16_udLV3_fid1() {
    long[][] flags = {{1, 2, 65536}, {8, 16, 65536}, {65536, 65536,42}};
    assertEquals(3, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs4_yMUk3_fid1() {
    assertEquals(2, SegmentUtils.countArgs("(ID)V",3));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_KlLj0_3() {
    assertEquals(2, SegmentUtils.countArgs("(IJ)V", 2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_KlLj0_5() {
    assertEquals(2, SegmentUtils.countArgs("([I)V", 2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_KlLj0_6() {
    assertEquals(2, SegmentUtils.countArgs("([Ljava/lang/Object;)V", 2));}
}