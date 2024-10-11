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
public class Aster_CPUTF8_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_Hgba2_NrSM0() {
    CPUTF8 cpuTF8 = new CPUTF8("utf8", 1);
    Object obj = new Object();
    boolean result = cpuTF8.equals(obj);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_XfSO3_ZvoI0() {
    CPUTF8 cpuTF8 = new CPUTF8("utf8", 1);
    CPUTF8 other = new CPUTF8("other", 2);
    boolean result = cpuTF8.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_gGnf1_MuvZ1() {
    CPUTF8 cpuTF8 = new CPUTF8("utf8", 0);
    String result = cpuTF8.toString();
    assertEquals("UTF-8:utf8", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndex_ecCy0_KVYn0() {
    CPUTF8 cpuTF8 = new CPUTF8("test");
    cpuTF8.setGlobalIndex(1);
    assertEquals(1, cpuTF8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWhenNotComputed_lxlA0_ffVp1() {
    CPUTF8 cpuTF8 = new CPUTF8("", 0);
    int result = cpuTF8.hashCode();
    assertEquals(31, result);
}
}