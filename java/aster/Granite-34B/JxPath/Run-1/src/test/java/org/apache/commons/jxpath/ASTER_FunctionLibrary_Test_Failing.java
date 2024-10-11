/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FunctionLibrary_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_DeKn0_2_fid2() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertTrue(usedNamespaces.size() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_DeKn0() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> usedNamespaces = functionLibrary.getUsedNamespaces();
        assertNotNull(usedNamespaces);
        assertTrue(usedNamespaces.size() > 0);
    }
}