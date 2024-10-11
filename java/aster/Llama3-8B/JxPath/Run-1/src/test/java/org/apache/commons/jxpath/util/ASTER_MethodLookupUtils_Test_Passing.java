/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MethodLookupUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorExactMatch_hXrC0() {
        Constructor constructor = MethodLookupUtils.lookupConstructor(String.class, new Object[]{"hello"});
        assertEquals(Constructor.class, constructor.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorAmbiguous_XRqv3() {
        try {
            MethodLookupUtils.lookupConstructor(String.class, new Object[]{"hello", "world"});
            fail("Expected JXPathException");
        } catch (JXPathException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorAmbiguous_Ltnw3() {
        try {
            MethodLookupUtils.lookupConstructor(String.class, new Object[]{null, "hello"});
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Ambiguous constructor [null, hello]", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorEmptyParameter_utUb5() {
        Constructor constructor = MethodLookupUtils.lookupConstructor(String.class, new Object[0]);
        assertEquals(Constructor.class, constructor.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodNullParameters_tYPJ0() {
        Method method = MethodLookupUtils.lookupMethod(Class.class, "getMethod", null);
        assertNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodEmptyParameters_DEvi1() {
        Method method = MethodLookupUtils.lookupMethod(Class.class, "getMethod", new Object[0]);
        assertNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethodWithNullTargetClass_pilY5_fid1() {
        try {
            MethodLookupUtils.lookupStaticMethod(null, "methodName", new Object[]{Integer.class});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }
}