/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FunctionLibrary_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetUsedNamespaces_Edqc0() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertNotNull(usedNamespaces);
        assertFalse(usedNamespaces.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetUsedNamespaces_Edqc0_1() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertNotNull(usedNamespaces);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetUsedNamespaces_Edqc0_2() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertFalse(usedNamespaces.isEmpty());
    }
}