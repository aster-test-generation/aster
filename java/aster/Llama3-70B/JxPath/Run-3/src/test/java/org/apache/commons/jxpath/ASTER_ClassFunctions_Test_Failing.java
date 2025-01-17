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
    public void testGetFunction_ConstructorLookup_psJG2_fid1() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, null);
        Function function = classFunctions.getFunction(null, "new", new Object[]{});
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_StaticMethodLookup_bmoz3_fid1() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, null);
        Function function = classFunctions.getFunction(null, "testStaticMethod", new Object[]{});
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_InstanceMethodLookup_VghB4_fid1() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, null);
        Function function = classFunctions.getFunction(null, "testInstanceMethod", new Object[]{});
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_NullParameters_kZCb6_fid1() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, null);
        Function function = classFunctions.getFunction(null, "test", null);
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_EmptyParameters_UxFD7_fid1() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, null);
        Function function = classFunctions.getFunction(null, "test", new Object[]{});
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_MultipleParameters_SAvt8_fid1() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, null);
        Function function = classFunctions.getFunction(null, "test", new Object[]{"param1", "param2"});
        assertNotNull(function);
    }
}