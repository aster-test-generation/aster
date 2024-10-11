/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FunctionLibrary_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_namespace_name_parameters_gKsP0() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Function function = functionLibrary.getFunction("namespace", "name", new Object[]{});
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespacesWithNullFunctions_ttRk5_KeDj0() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        functionLibrary.addFunctions(null);
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertEquals(Collections.emptySet(), usedNamespaces);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespacesWithNullFunctions_ttRk5_KeDj0_fid2() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        functionLibrary.addFunctions(null);
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertEquals(0, usedNamespaces.size());
    }
}