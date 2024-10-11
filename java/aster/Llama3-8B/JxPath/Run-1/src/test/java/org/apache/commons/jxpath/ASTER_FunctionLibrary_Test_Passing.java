/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FunctionLibrary_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithInvalidNamespace_vSmw1() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Function function = functionLibrary.getFunction("invalidNamespace", "name", new Object[0]);
        Assertions.assertNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithValidNamespaceAndInvalidName_uhCy2() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Function function = functionLibrary.getFunction("namespace", "invalidName", new Object[0]);
        Assertions.assertNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithNoFunctionsForNamespace_LfRb4() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Function function = functionLibrary.getFunction("namespace", "name", new Object[0]);
        Assertions.assertNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_XlPv0() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set expected = new HashSet();
        Set actual = functionLibrary.getUsedNamespaces();
        assertEquals(expected, actual);
    }
}