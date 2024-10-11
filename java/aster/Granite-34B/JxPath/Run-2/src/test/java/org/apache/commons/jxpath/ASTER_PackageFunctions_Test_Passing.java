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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PackageFunctions_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getUsedNamespaces_1_uhjp0() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Set<String> usedNamespaces = packageFunctions.getUsedNamespaces();
        assertEquals(Collections.singleton("namespace"), usedNamespaces);
    }
}