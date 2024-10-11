/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FunctionLibrary_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_VTdw0_1() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertNotNull(usedNamespaces);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_VTdw0_2() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertEquals(0, usedNamespaces.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_VTdw0() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertNotNull(usedNamespaces);
        assertEquals(0, usedNamespaces.size());
    }
}