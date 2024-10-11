/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ClassFunctions_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_qEZA0() {
        ClassFunctions classFunctions = new ClassFunctions(Class.class, "namespace");
        Function function = classFunctions.getFunction("namespace", "name", null);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_TWno1() {
        ClassFunctions classFunctions = new ClassFunctions(Class.class, "namespace");
        Function function = classFunctions.getFunction(null, "name", null);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_TeNz3() {
        ClassFunctions classFunctions = new ClassFunctions(Class.class, "namespace");
        Function function = classFunctions.getFunction("namespace", "new", null);
        assertEquals(null, function);
    }
}