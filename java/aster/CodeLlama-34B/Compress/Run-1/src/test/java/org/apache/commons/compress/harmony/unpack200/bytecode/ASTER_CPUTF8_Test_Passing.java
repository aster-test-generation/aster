/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPUTF8_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_EmptyStringWithGlobalIndex_bXxK4() {
    CPUTF8 cputf8 = new CPUTF8("", 1);
    assertEquals("UTF-8:", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexZero_SfCe5() {
    CPUTF8 cputf8 = new CPUTF8("hello", 0);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexNegative_ODfT6() {
    CPUTF8 cputf8 = new CPUTF8("hello", -1);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexOutOfBounds_qYpw7() {
    CPUTF8 cputf8 = new CPUTF8("hello", 10);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexOutOfBoundsNegative_rQqV8() {
    CPUTF8 cputf8 = new CPUTF8("hello", -10);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexOutOfBoundsPositive_hzUd9() {
    CPUTF8 cputf8 = new CPUTF8("hello", 100);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexOutOfBoundsNegativePositive_uGRm10() {
    CPUTF8 cputf8 = new CPUTF8("hello", -100);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexOutOfBoundsPositiveNegative_kDAe11() {
    CPUTF8 cputf8 = new CPUTF8("hello", 1000);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexOutOfBoundsNegativePositiveNegative_QiKJ12() {
    CPUTF8 cputf8 = new CPUTF8("hello", -1000);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexOutOfBoundsPositiveNegativePositive_iJOa13() {
    CPUTF8 cputf8 = new CPUTF8("hello", 10000);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NonEmptyStringWithGlobalIndexOutOfBoundsNegativePositiveNegativePositive_qpvH14() {
    CPUTF8 cputf8 = new CPUTF8("hello", -10000);
    assertEquals("UTF-8:hello", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndex_yqbs0() {
    CPUTF8 cputf8 = new CPUTF8("utf8", 0);
    cputf8.setGlobalIndex(1);
    assertEquals(1, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithNegativeIndex_NpAU1() {
    CPUTF8 cputf8 = new CPUTF8("utf8", 0);
    cputf8.setGlobalIndex(-1);
    assertEquals(-1, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithMaxValue_dDAq2() {
    CPUTF8 cputf8 = new CPUTF8("utf8", 0);
    cputf8.setGlobalIndex(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithMinValue_HyTN3() {
    CPUTF8 cputf8 = new CPUTF8("utf8", 0);
    cputf8.setGlobalIndex(Integer.MIN_VALUE);
    assertEquals(Integer.MIN_VALUE, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithZero_LgeN4() {
    CPUTF8 cputf8 = new CPUTF8("utf8", 0);
    cputf8.setGlobalIndex(0);
    assertEquals(0, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithNullString_zEAZ5() {
    CPUTF8 cputf8 = new CPUTF8("", 0);
    cputf8.setGlobalIndex(1);
    assertEquals(1, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithInvalidString_nLsi7() {
    CPUTF8 cputf8 = new CPUTF8("invalid", 0);
    cputf8.setGlobalIndex(1);
    assertEquals(1, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithInvalidIndex_XPuO8() {
    CPUTF8 cputf8 = new CPUTF8("utf8", 0);
    cputf8.setGlobalIndex(Integer.MAX_VALUE + 1);
    assertEquals(Integer.MAX_VALUE + 1, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithNegativeIndexAndInvalidString_LcDP9() {
    CPUTF8 cputf8 = new CPUTF8("invalid", 0);
    cputf8.setGlobalIndex(-1);
    assertEquals(-1, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithMaxValueAndInvalidString_ibZB10() {
    CPUTF8 cputf8 = new CPUTF8("invalid", 0);
    cputf8.setGlobalIndex(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithMinValueAndInvalidString_oada11() {
    CPUTF8 cputf8 = new CPUTF8("invalid", 0);
    cputf8.setGlobalIndex(Integer.MIN_VALUE);
    assertEquals(Integer.MIN_VALUE, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithZeroAndInvalidString_KrXS12() {
    CPUTF8 cputf8 = new CPUTF8("invalid", 0);
    cputf8.setGlobalIndex(0);
    assertEquals(0, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_Bxam1_UJHO0() {
    CPUTF8 cpUTF8 = new CPUTF8("test", 0);
    CPUTF8 other = new CPUTF8("test", 0);
    assertTrue(cpUTF8.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnderlyingString_EmptyString_rUFK0_ORKc0() {
    CPUTF8 cputf8 = new CPUTF8("", 0);
    String result = cputf8.underlyingString();
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnderlyingString_NonEmptyString_dHbo1_SeNr0() {
    CPUTF8 cputf8 = new CPUTF8("hello", 0);
    String result = cputf8.underlyingString();
    assertEquals("hello", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_TDak0_mJqN0() {
    CPUTF8 cputf8 = new CPUTF8("test", 0);
    int expectedHashCode = 31 + "test".hashCode();
    int actualHashCode = cputf8.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_2_KwHz1_XDqo0() {
    CPUTF8 cputf8 = new CPUTF8("test", 1);
    int expectedHashCode = 31 + "test".hashCode();
    int actualHashCode = cputf8.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnderlyingString_NonEmptyStringWithGlobalIndex_vEhQ2_tHmA0() {
    CPUTF8 cputf8 = new CPUTF8("hello", 1);
    String result = cputf8.underlyingString();
    assertEquals("hello", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_DifferentString_sIUe3_xsqN0() {
    CPUTF8 cpUTF8 = new CPUTF8("test");
    CPUTF8 other = new CPUTF8("test2", 0);
    assertFalse(cpUTF8.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_DifferentGlobalIndex_TsuV2_Ytvt0() {
    CPUTF8 cpUTF8 = new CPUTF8("test", 1);
    CPUTF8 other = new CPUTF8("test", 2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_EmptyString_eeCq0_iIZn0() {
    CPUTF8 cputf8 = new CPUTF8("", 0);
    assertEquals("UTF-8:", cputf8.toString());
}
}