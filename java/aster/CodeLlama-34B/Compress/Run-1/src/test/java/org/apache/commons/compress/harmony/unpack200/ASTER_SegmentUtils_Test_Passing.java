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
public void testCountBit16_emptyArray_wiEe0() {
    int[] flags = new int[0];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleFlag_gloI1() {
    int[] flags = new int[1];
    flags[0] = 1 << 16;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_singleArg_xpcH1() {
    int result = SegmentUtils.countArgs("(I)V");
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_multipleArgs_wyOk2() {
    int result = SegmentUtils.countArgs("(II)V");
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_arrayArg_yxEj3() {
    int result = SegmentUtils.countArgs("([I)V");
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_objectArg_XYcV4() {
    int result = SegmentUtils.countArgs("(Ljava/lang/Object;)V");
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_primitiveAndObjectArgs_BDot5() {
    int result = SegmentUtils.countArgs("(ILjava/lang/Object;)V");
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_primitiveAndArrayArgs_YqEf6() {
    int result = SegmentUtils.countArgs("(I[I)V");
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_objectAndArrayArgs_ywFk7() {
    int result = SegmentUtils.countArgs("(Ljava/lang/Object;[I)V");
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_primitiveAndObjectAndArrayArgs_siPv8() {
    int result = SegmentUtils.countArgs("(ILjava/lang/Object;[I)V");
    assertEquals(3, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_emptyArray_eTaA0() {
    long[] flags = new long[0];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleFlag_Tusp1() {
    long[] flags = new long[1];
    flags[0] = 1 << 16;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_noFlags_MbBn4() {
    long[] flags = new long[64];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_singleArgument_Iczo2() {
    int result = SegmentUtils.countInvokeInterfaceArgs("(Ljava/lang/String;)V");
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_multipleArguments_hWrI3() {
    int result = SegmentUtils.countInvokeInterfaceArgs("(Ljava/lang/String;Ljava/lang/String;)V");
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_noArguments_NqGa4() {
    int result = SegmentUtils.countInvokeInterfaceArgs("()V");
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_emptyArray_OFzU0() {
    long[][] flags = new long[0][0];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleElement_rfKH1() {
    long[][] flags = new long[1][1];
    flags[0][0] = 1 << 16;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_noElementsSet_WlTH7() {
    long[][] flags = new long[3][3];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs1_nddl0() {
    String descriptor = "()V";
    int widthOfLongsAndDoubles = 2;
    int expected = 0;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs2_LYHq1() {
    String descriptor = "(I)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 1;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs3_dzIR2() {
    String descriptor = "(II)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 2;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs4_cctp3() {
    String descriptor = "(IJ)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 3;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs5_IIZf4() {
    String descriptor = "(IJJ)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 5;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs6_wTbZ5() {
    String descriptor = "(IJJJ)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 7;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs7_rrAQ6() {
    String descriptor = "(IJJJJ)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 9;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs8_VeED7() {
    String descriptor = "(IJJJJJ)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 11;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs9_VjcP8() {
    String descriptor = "(IJJJJJJ)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 13;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs10_BrMB9() {
    String descriptor = "(IJJJJJJJ)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 15;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs11_fwGx10() {
    String descriptor = "(IJJJJJJJJ)V";
    int widthOfLongsAndDoubles = 2;
    int expected = 17;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_emptyDescriptor_arkS0_fid1() {
    int result = SegmentUtils.countArgs("()");
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_invalidMethodDescriptor_WqBW10() {
    int result = SegmentUtils.countInvokeInterfaceArgs("(Ljava/lang/String;Ljava/lang/String;)V");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleElements_BEkY2_fid1() {
    long[][] flags = new long[2][2];
    flags[0][0] = 1 << 16;
    flags[0][1] = 1 << 17;
    flags[1][0] = 1 << 18;
    flags[1][1] = 1 << 19;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleRowMultipleColumns_kEUa4_fid1() {
    long[][] flags = new long[1][3];
    flags[0][0] = 1 << 16;
    flags[0][1] = 1 << 17;
    flags[0][2] = 1 << 18;
    int count = SegmentUtils.countBit16(flags);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleRowsMultipleColumns_cZDU6_fid1() {
    long[][] flags = new long[3][3];
    flags[0][0] = 1 << 16;
    flags[0][1] = 1 << 17;
    flags[0][2] = 1 << 18;
    flags[1][0] = 1 << 11;
    flags[1][1] = 1 << 20;
    flags[1][2] = 1 << 21;
    flags[2][0] = 1 << 22;
    flags[2][1] = 1 << 23;
    flags[2][2] = 1 << 24;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
}