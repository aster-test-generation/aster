/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPUTF8_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_iEpp0() throws Exception {
    CPUTF8 utf8 = new CPUTF8("testString");
    assertTrue(utf8.equals(utf8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_xydQ1() throws Exception {
    CPUTF8 utf8 = new CPUTF8("testString");
    assertFalse(utf8.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_dNMh2() throws Exception {
    CPUTF8 utf8 = new CPUTF8("testString");
    Object other = new Object();
    assertFalse(utf8.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentUTF8Value_pMBd3() throws Exception {
    CPUTF8 utf8 = new CPUTF8("testString");
    CPUTF8 other = new CPUTF8("differentString");
    assertFalse(utf8.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameUTF8Value_MbFg4() throws Exception {
    CPUTF8 utf8 = new CPUTF8("testString");
    CPUTF8 other = new CPUTF8("testString");
    assertTrue(utf8.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_FBhW0() throws Exception {
    CPUTF8 cputf8 = new CPUTF8("Hello World");
    String expected = "UTF-8:Hello World";
    assertEquals(expected, cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndex_fnSA0() throws Exception {
    CPUTF8 cpu = new CPUTF8("test", 5);
    cpu.setGlobalIndex(10);
    assertEquals(10, cpu.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnderlyingString_cDAm0() throws Exception {
    CPUTF8 cputf8 = new CPUTF8("testString");
    String result = cputf8.underlyingString();
    assertEquals("testString", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeConsistency_NbvY0() throws Exception {
        CPUTF8 cpuUtf8 = new CPUTF8("testString");
        int firstCall = cpuUtf8.hashCode();
        int secondCall = cpuUtf8.hashCode();
        assertEquals(firstCall, secondCall);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeDifferentInstances_zuvk1() throws Exception {
        CPUTF8 cpuUtf8First = new CPUTF8("testString");
        CPUTF8 cpuUtf8Second = new CPUTF8("testString");
        assertEquals(cpuUtf8First.hashCode(), cpuUtf8Second.hashCode());
    }
}