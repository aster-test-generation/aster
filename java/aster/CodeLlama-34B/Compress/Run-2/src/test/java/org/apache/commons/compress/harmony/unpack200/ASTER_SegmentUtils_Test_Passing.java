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
public void testCountInvokeInterfaceArgs_EmptyDescriptor_DFLC0() {
    int result = SegmentUtils.countInvokeInterfaceArgs("");
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_NullDescriptor_kqDH1() {
    int result = SegmentUtils.countInvokeInterfaceArgs(null);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_SingleArgument_tCmm2() {
    int result = SegmentUtils.countInvokeInterfaceArgs("(I)V");
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_MultipleArguments_BXjV3() {
    int result = SegmentUtils.countInvokeInterfaceArgs("(II)V");
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountInvokeInterfaceArgs_MultipleArgumentsWithReturnType_iLEN4() {
    int result = SegmentUtils.countInvokeInterfaceArgs("(II)I");
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_emptyDescriptor_ooZF0() {
    int result = SegmentUtils.countArgs("");
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_singleArg_sDet1() {
    int result = SegmentUtils.countArgs("(I)V");
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_multipleArgs_yadJ2() {
    int result = SegmentUtils.countArgs("(IJLjava/lang/String;)V");
    assertEquals(3, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_primitiveTypes_NZvL3() {
    int result = SegmentUtils.countArgs("(IZBCDFIJLjava/lang/String;)V");
    assertEquals(9, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_objectTypes_smoR4() {
    int result = SegmentUtils.countArgs("(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V");
    assertEquals(3, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_arrayTypes_YDqG5() {
    int result = SegmentUtils.countArgs("([I[J[Ljava/lang/String;)V");
    assertEquals(3, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_mixedTypes_UbHj6() {
    int result = SegmentUtils.countArgs("(IJLjava/lang/String;[I[J[Ljava/lang/String;)V");
    assertEquals(6, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_invalidDescriptor_BlPT7() {
    int result = SegmentUtils.countArgs("(IJLjava/lang/String;)V");
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_nullDescriptor_OfkI8() {
    int result = SegmentUtils.countArgs(null);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_emptyArray_mOOI0() {
    long[] flags = new long[0];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleFlag_AYIC1() {
    long[] flags = new long[1];
    flags[0] = 1 << 16;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleFlagZero_HzUF3() {
    long[] flags = new long[1];
    flags[0] = 0;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleFlagsZero_zyqW4() {
    long[] flags = new long[3];
    flags[0] = 0;
    flags[1] = 0;
    flags[2] = 0;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_mixedFlags_MnuT5() {
    long[] flags = new long[3];
    flags[0] = 1 << 16;
    flags[1] = 0;
    flags[2] = 1 << 18;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(2, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_emptyArray_qUwz0() {
    int[] flags = new int[0];
    assertEquals(0, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleFlag_tcSx1() {
    int[] flags = new int[1];
    flags[0] = 1 << 16;
    assertEquals(1, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleFlags_noneSet_cEWH3() {
    int[] flags = new int[3];
    flags[0] = 0;
    flags[1] = 0;
    flags[2] = 0;
    assertEquals(0, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleFlags_someSet_PJmm4() {
    int[] flags = new int[3];
    flags[0] = 1 << 16;
    flags[1] = 0;
    flags[2] = 1 << 18;
    assertEquals(2, SegmentUtils.countBit16(flags));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_emptyArray_uiYL0() {
    long[][] flags = new long[0][0];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleElement_jlBt1() {
    long[][] flags = new long[1][1];
    flags[0][0] = 1 << 16;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleElements_oWVl2() {
    long[][] flags = new long[2][2];
    flags[0][0] = 1 << 16;
    flags[0][1] = 1 << 17;
    flags[1][0] = 1 << 18;
    flags[1][1] = 1 << 19;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(4, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_nullArray_iNsG3() {
    long[][] flags = null;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleElement_zero_nnGj4() {
    long[][] flags = new long[1][1];
    flags[0][0] = 0;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleElements_zero_Ouhz5() {
    long[][] flags = new long[2][2];
    flags[0][0] = 0;
    flags[0][1] = 0;
    flags[1][0] = 0;
    flags[1][1] = 0;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs1_HcUb0() {
    String descriptor = "()V";
    int widthOfLongsAndDoubles = 1;
    int expected = 0;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs2_xzyS1() {
    String descriptor = "(I)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 1;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs3_Yjty2() {
    String descriptor = "(II)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 2;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs4_rnSJ3() {
    String descriptor = "(III)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 3;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs5_HtKI4() {
    String descriptor = "(IIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 4;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs6_hSfl5() {
    String descriptor = "(IIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 5;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs7_VSdy6() {
    String descriptor = "(IIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 6;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs8_FaiX7() {
    String descriptor = "(IIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 7;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs9_rBUx8() {
    String descriptor = "(IIIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 8;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs10_SQEs9() {
    String descriptor = "(IIIIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 9;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs11_gEXh10() {
    String descriptor = "(IIIIIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 10;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs12_zhxv11() {
    String descriptor = "(IIIIIIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 11;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs13_TQeP12() {
}
}