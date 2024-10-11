/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPString_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_JnDY0_LPXD0() {
    CPUTF8 utf8 = new CPUTF8("hello", 0);
    CPString string = new CPString(utf8, 0);
    int expectedHashCode = 1;
    int actualHashCode = string.hashCode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithInvalidGlobalIndex_ystt4_Losr0() {
    CPUTF8 utf8 = new CPUTF8("hello", -1);
    CPString string = new CPString(utf8, -1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_fILz0_gyfK0() {
    CPUTF8 utf8 = new CPUTF8(new String("hello"));
    CPString string = new CPString(utf8, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_2_Nsvg1_RRce0() {
    CPUTF8 utf8 = new CPUTF8("hello", 1);
    CPString string = new CPString(utf8, 1);
    int expectedHashCode =99162384;
    int actualHashCode = string.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_foLZ0_WjDf0_1() {
    CPUTF8 utf8 = new CPUTF8("test");
    CPString string = new CPString(utf8, 2);
    ClassFileEntry[] entries = string.getNestedClassFileEntries();
    assertEquals(1, entries.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_foLZ0_WjDf0_2() {
    CPUTF8 utf8 = new CPUTF8("test");
    CPString string = new CPString(utf8, 2);
    ClassFileEntry[] entries = string.getNestedClassFileEntries();
    assertEquals(utf8, entries[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithNullString_Wlev3_vqgC0() {
    CPUTF8 utf8 = new CPUTF8("", 0);
    CPString string = new CPString(utf8, 0);
    assertEquals("String: UTF-8:", string.toString());
}
}