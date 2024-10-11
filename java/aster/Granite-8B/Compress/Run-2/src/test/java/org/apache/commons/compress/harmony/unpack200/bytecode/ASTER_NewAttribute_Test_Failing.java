/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NewAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStartPCs_QyxB0_NZQb0() {
        CPUTF8 cPUTF8 = new CPUTF8("string");
        NewAttribute newAttribute = new NewAttribute(cPUTF8, 0);
        int[] startPCs = newAttribute.getStartPCs();
        assertNotNull(startPCs);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolveWithValidClassConstantPool_PpWx0_PjzA0() {
    CPUTF8 utf8 = new CPUTF8("valid_attribute_name");
    ClassConstantPool pool = new ClassConstantPool();
    NewAttribute attribute = new NewAttribute(utf8, 0);
    attribute.resolve(pool);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolveWithInvalidClassConstantPool_qdTM1_SFpk0() {
    CPUTF8 utf8 = new CPUTF8("invalid_attribute_name");
    ClassConstantPool pool = new ClassConstantPool();
    NewAttribute attribute = new NewAttribute(utf8, 0);
    attribute.resolve(pool);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolveWithNullClassConstantPool_nezy2_sKNg0() {
    CPUTF8 utf8 = new CPUTF8("null_attribute_name");
    ClassConstantPool pool = null;
    NewAttribute attribute = new NewAttribute(utf8, 0);
    attribute.resolve(pool);
}
}