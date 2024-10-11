/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsArrayZero_NullArray_OYxH2() {
    byte[] a = null;
    assertNull(ArchiveUtils.isArrayZero(a, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiBytes_nullString_IDZb2() {
    String inputString = null;
    byte[] expected = null;
    byte[] actual = ArchiveUtils.toAsciiBytes(inputString);
    assertNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSanitize_nullString_BAKl1() {
    String input = null;
    String expected = null;
    String actual = ArchiveUtils.sanitize(input);
    assertNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_nullBuffer2_Zpkv5() {
    byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
    byte[] buffer2 = null;
    assertTrue(ArchiveUtils.isEqual(buffer1, buffer2, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_bothNull_QeCC6() {
    byte[] buffer1 = null;
    byte[] buffer2 = null;
    assertTrue(ArchiveUtils.isEqual(buffer1, buffer2, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_nullBuffer1AndDifferentOffsets_vSSF9() {
    byte[] buffer1 = null;
    byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
    assertFalse(ArchiveUtils.isEqual(buffer1, 1, 4, buffer2, 2, 3, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_NullArray2_drub6() {
    byte[] buffer1 = new byte[] { 1, 2, 3, 4, 5 };
    byte[] buffer2 = null;
    assertFalse(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_nullInput_CUuz0() {
    byte[] inputBytes = null;
    String result = ArchiveUtils.toAsciiString(inputBytes);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NegativeOffset_xcEh4() {
    byte[] inputBytes = new byte[] { 65, 66, 67, 68, 69 };
    int offset = -1;
    int length = 3;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NegativeLength_EqeW5() {
    byte[] inputBytes = new byte[] { 65, 66, 67, 68, 69 };
    int offset = 0;
    int length = -1;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NullInput_fbBK7() {
    byte[] inputBytes = null;
    int offset = 0;
    int length = 0;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NullInputWithOffset_fFKq8() {
    byte[] inputBytes = null;
    int offset = 1;
    int length = 0;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NullInputWithLength_PZBQ9() {
    byte[] inputBytes = null;
    int offset = 0;
    int length = 1;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqualWithNull_DifferentOffsets_qszO3() {
    byte[] buffer1 = new byte[10];
    int offset1 = 0;
    int length1 = 10;
    byte[] buffer2 = new byte[10];
    int offset2 = 5;
    int length2 = 10;
    boolean result = ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchAsciiBuffer_NullExpected_cKcD2_zKYz0() {
    String expected = "";
    byte[] buffer = "Hello World!".getBytes();
    int offset = 0;
    int length = buffer.length;
    boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsArrayZero_NullArray_OYxH2_fid2() {
    byte[] a = null;
    assertThrows(NullPointerException.class, () -> ArchiveUtils.isArrayZero(a, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_DifferentLength_SameContent_TvVm1_fid2() {
    byte[] buffer1 = new byte[] { 1, 2, 3, 4, 5 };
    byte[] buffer2 = new byte[] { 1, 2, 3, 4, 5, 6 };
    assertTrue(ArchiveUtils.isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiBytes_nullString_IDZb2_fid2() {
    String inputString = null;
    byte[] expected = null;
    byte[] actual = ArchiveUtils.toAsciiBytes(inputString);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSanitize_nullString_BAKl1_fid2() {
    String input = null;
    String expected = null;
    String actual = ArchiveUtils.sanitize(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_nullBuffer1_lmCM4_fid2() {
    byte[] buffer1 = null;
    byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
    assertFalse(ArchiveUtils.isEqual(buffer1, buffer2, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_nullBuffer2_Zpkv5_fid2() {
    byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
    byte[] buffer2 = null;
    assertFalse(ArchiveUtils.isEqual(buffer1, buffer2, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_differentOffsets_kkvn7_fid2() {
    byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
    byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
    assertTrue(ArchiveUtils.isEqual(buffer1, 1, 4, buffer2, 2, 3, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_nullBuffer2AndDifferentOffsets_wyDT10_fid2() {
    byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
    byte[] buffer2 = null;
    assertFalse(ArchiveUtils.isEqual(buffer1, 1, 4, buffer2, 2, 3, true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchAsciiBuffer_nullExpected_fLbH5_fid2() {
    byte[] buffer = new byte[] { 0x68, 0x65, 0x6c, 0x6c, 0x6f };
    assertFalse(ArchiveUtils.matchAsciiBuffer(null, buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchAsciiBuffer_nullBuffer_HGsJ6_fid2() {
    String expected = "hello";
    assertFalse(ArchiveUtils.matchAsciiBuffer(expected, null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_NullArrays_pyBz4_fid2() {
    byte[] buffer1 = null;
    byte[] buffer2 = null;
    assertFalse(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_NullArray1_WQIg5_fid2() {
    byte[] buffer1 = null;
    byte[] buffer2 = new byte[] { 1, 2, 3, 4, 5 };
    assertFalse(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqual_NullArray2_drub6_fid2() {
    byte[] buffer1 = new byte[] { 1, 2, 3, 4, 5 };
    byte[] buffer2 = null;
    assertFalse(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NegativeOffset_xcEh4_fid2() {
    byte[] inputBytes = new byte[] { 65, 66, 67, 68, 69 };
    int offset = -1;
    int length = 3;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertEquals("ABC", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NullInput_fbBK7_fid2() {
    byte[] inputBytes = null;
    int offset = 0;
    int length = 0;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NullInputWithOffset_fFKq8_fid2() {
    byte[] inputBytes = null;
    int offset = 1;
    int length = 0;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToAsciiString_NullInputWithLength_PZBQ9_fid2() {
    byte[] inputBytes = null;
    int offset = 0;
    int length = 1;
    String result = ArchiveUtils.toAsciiString(inputBytes, offset, length);
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqualWithNull_NullBuffer1_peWX0_fid2() {
    byte[] buffer1 = null;
    int offset1 = 0;
    int length1 = 0;
    byte[] buffer2 = new byte[10];
    int offset2 = 0;
    int length2 = 10;
    boolean result = ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqualWithNull_NullBuffer2_Utra1_fid2() {
    byte[] buffer1 = new byte[10];
    int offset1 = 0;
    int length1 = 10;
    byte[] buffer2 = null;
    int offset2 = 0;
    int length2 = 0;
    boolean result = ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqualWithNull_DifferentLengths_cOsV2_fid2() {
    byte[] buffer1 = new byte[10];
    int offset1 = 0;
    int length1 = 10;
    byte[] buffer2 = new byte[10];
    int offset2 = 0;
    int length2 = 5;
    boolean result = ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqualWithNull_DifferentOffsets_qszO3_fid2() {
    byte[] buffer1 = new byte[10];
    int offset1 = 0;
    int length1 = 10;
    byte[] buffer2 = new byte[10];
    int offset2 = 5;
    int length2 = 10;
    boolean result = ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEqualWithNull_SameLengthsAndOffsets_DifferentBuffers_hKpd5_fid2() {
    byte[] buffer1 = new byte[10];
    int offset1 = 0;
    int length1 = 10;
    byte[] buffer2 = new byte[10];
    int offset2 = 0;
    int length2 = 10;
    boolean result = ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchAsciiBuffer_NullExpected_cKcD2_zKYz0_fid2() {
    String expected = null;
    byte[] buffer = "Hello World!".getBytes();
    int offset = 0;
    int length = buffer.length;
    boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length);
    assertFalse(result);
}
}