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
    public void testGetUsedNamespaces_ycxY0() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set expected = new HashSet();
        Set actual = functionLibrary.getUsedNamespaces();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_5_PAph4() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Assertions.assertNull(functionLibrary.getFunction("namespace", "name", new Object[]{}));
    }
}