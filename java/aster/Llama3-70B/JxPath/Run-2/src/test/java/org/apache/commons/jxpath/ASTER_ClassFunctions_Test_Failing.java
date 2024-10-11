/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ClassFunctions_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_ConstructorLookup_LZSv2() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, "namespace");
        assertNotNull(classFunctions.getFunction("namespace", "new", new Object[]{}));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_StaticMethodLookup_eZZk3() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, "namespace");
        assertNotNull(classFunctions.getFunction("namespace", "methodName", new Object[]{}));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_NullParameters_ryPz6() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, "namespace");
        assertNotNull(classFunctions.getFunction("namespace", "methodName", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_NonNullParameters_hnYd8() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, "namespace");
        assertNotNull(classFunctions.getFunction("namespace", "methodName", new Object[]{"param1", "param2"}));
    }
}