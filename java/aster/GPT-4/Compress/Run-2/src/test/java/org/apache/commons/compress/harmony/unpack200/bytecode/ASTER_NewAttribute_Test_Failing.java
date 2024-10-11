/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NewAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringReturnsCorrectUnderlyingString_gxfa0_XoEg0() {
    CPUTF8 attributeName = new CPUTF8("UTF-8:TestAttribute");
    assertEquals("UTF-8:TestAttribute", attributeName.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringReturnsCorrectUnderlyingString_gxfa0_XoEg0_fid2() {
    CPUTF8 attributeName = new CPUTF8("TestAttribute");
    assertEquals("TestAttribute", attributeName.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_OneNestedEntry_sEiW1_ftiZ0_1_fid2() {
    CPUTF8 attributeName = new CPUTF8("TestAttribute", 0);
    NewAttribute attribute = new NewAttribute(attributeName, 0);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    assertEquals(2, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_OneNestedEntry_sEiW1_ftiZ0_3() {
    CPUTF8 attributeName = new CPUTF8("TestAttribute", 0);
    NewAttribute attribute = new NewAttribute(attributeName, 0);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    assertTrue(result[1] instanceof ClassFileEntry);}
}