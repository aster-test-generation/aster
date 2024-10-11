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
    public void testCountInvokeInterfaceArgs_ppBi0() {
        String descriptor = "Ljava/lang/Object;";
        int expected = 1;
        int actual = SegmentUtils.countInvokeInterfaceArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountInvokeInterfaceArgsWithMultipleInterfaces_yhPw1() {
        String descriptor = "Ljava/lang/Object;Ljava/lang/Comparable;";
        int expected = 2;
        int actual = SegmentUtils.countInvokeInterfaceArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountInvokeInterfaceArgsWithNoInterfaces_iXQL2() {
        String descriptor = "Ljava/lang/Object;";
        int expected = 0;
        int actual = SegmentUtils.countInvokeInterfaceArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountInvokeInterfaceArgsWithInvalidDescriptor_Vemb3() {
        String descriptor = "Ljava/lang/Object;Ljava/lang/Comparable;";
        int expected = 0;
        int actual = SegmentUtils.countInvokeInterfaceArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountInvokeInterfaceArgsWithNullDescriptor_IoUB4() {
        String descriptor = null;
        int expected = 0;
        int actual = SegmentUtils.countInvokeInterfaceArgs(descriptor);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_emptyDescriptor_SRVW0() {
    int result = SegmentUtils.countArgs("");
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_singleArgument_oWjG1() {
    int result = SegmentUtils.countArgs("(I)V");
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_multipleArguments_qKKS2() {
    int result = SegmentUtils.countArgs("(IJLjava/lang/String;)V");
    assertEquals(3, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_arrayArguments_sSLT3() {
    int result = SegmentUtils.countArgs("([I[J[Ljava/lang/String;)V");
    assertEquals(3, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_primitiveArguments_BLhA4() {
    int result = SegmentUtils.countArgs("(IJZBSC)V");
    assertEquals(5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_referenceArguments_Idxf5() {
    int result = SegmentUtils.countArgs("(Ljava/lang/String;Ljava/lang/Object;)V");
    assertEquals(2, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_nullDescriptor_joVt6() {
    int result = SegmentUtils.countArgs(null);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_emptyArray_invp0() {
    long[] flags = new long[0];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleFlag_kRMr1() {
    long[] flags = new long[1];
    flags[0] = 1 << 16;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_emptyArray_ypvb0() {
    int[] flags = new int[0];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleFlag_wjTW1() {
    int[] flags = new int[1];
    flags[0] = 1 << 16;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleFlags_vdCg2() {
    int[] flags = new int[3];
    flags[0] = 1 << 16;
    flags[1] = 1 << 17;
    flags[2] = 1 << 18;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(3, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_emptyArray_zFkd0() {
    long[][] flags = new long[0][0];
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_singleElement_QAiV1() {
    long[][] flags = new long[1][1];
    flags[0][0] = 1 << 16;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_multipleElements_yTOO2() {
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
public void testCountBit16_nullArray_cjxw3() {
    long[][] flags = null;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(0, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_allOnes_ZppP4() {
    long[][] flags = new long[2][2];
    flags[0][0] = -1;
    flags[0][1] = -1;
    flags[1][0] = -1;
    flags[1][1] = -1;
    int count = SegmentUtils.countBit16(flags);
    assertEquals(16, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountBit16_allZeros_REle5() {
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
public void testCountArgs1_AWPd0() {
    String descriptor = "()V";
    int widthOfLongsAndDoubles = 1;
    int expected = 0;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs2_timr1() {
    String descriptor = "(I)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 1;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs3_exna2() {
    String descriptor = "(II)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 2;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs4_Busl3() {
    String descriptor = "(III)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 3;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs5_zMHE4() {
    String descriptor = "(IIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 4;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs6_VcNA5() {
    String descriptor = "(IIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 5;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs7_jXbo6() {
    String descriptor = "(IIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 6;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs8_KcuQ7() {
    String descriptor = "(IIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 7;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs9_VTqo8() {
    String descriptor = "(IIIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 8;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs10_NibO9() {
    String descriptor = "(IIIIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 9;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs11_kGXx10() {
    String descriptor = "(IIIIIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 10;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs12_LACX11() {
    String descriptor = "(IIIIIIIIIII)V";
    int widthOfLongsAndDoubles = 1;
    int expected = 11;
    int actual = SegmentUtils.countArgs(descriptor, widthOfLongsAndDoubles);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs13_giYp12() {
}
}