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
public class Aster_CPString_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithInvalidUTF8_zwyx5() {
    CPUTF8 utf8 = new CPUTF8("");
    CPString string = new CPString(utf8, 0);
    assertEquals("String: ", string.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithInvalidUTF8_zwyx5_fid2() {
    CPUTF8 utf8 = new CPUTF8(null);
    CPString string = new CPString(utf8, 0);
    assertEquals("String: null", string.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_JnDY0_LPXD0_fid2() {
    CPUTF8 utf8 = new CPUTF8("hello", 0);
    CPString string = new CPString(utf8, 0);
    int expectedHashCode = 1;
    int actualHashCode = string.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithInvalidGlobalIndex_ystt4_Losr0_fid2() {
    CPUTF8 utf8 = new CPUTF8("hello", -1);
    CPString string = new CPString(utf8, -1);
    assertEquals("String: hello", string.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_fILz0_gyfK0_fid2() {
    CPUTF8 utf8 = new CPUTF8(new String("hello"));
    CPString string = new CPString(utf8, 0);
    assertEquals("String: hello", string.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_2_Nsvg1_RRce0_fid2() {
    CPUTF8 utf8 = new CPUTF8("hello", 1);
    CPString string = new CPString(utf8, 1);
    int expectedHashCode = 31;
    int actualHashCode = string.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithNullString_Wlev3_vqgC0_fid2() {
    CPUTF8 utf8 = new CPUTF8("", 0);
    CPString string = new CPString(utf8, 0);
    assertEquals("String: null", string.toString());
}
}