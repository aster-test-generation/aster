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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ClassFunctions_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_vvzl0_1() {
        ClassFunctions classFunctions = new ClassFunctions(null, "testNamespace");
        Set<String> usedNamespaces = classFunctions.getUsedNamespaces();
        assertEquals(1, usedNamespaces.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_vvzl0_2() {
        ClassFunctions classFunctions = new ClassFunctions(null, "testNamespace");
        Set<String> usedNamespaces = classFunctions.getUsedNamespaces();
        assertTrue(usedNamespaces.contains("testNamespace"));
    }
}