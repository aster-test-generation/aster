/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PackageFunctions_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_MethodFound_ReturnsMethodFunction_cbbl4() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[]{new Object()});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_TargetNullCollectionValueValue_ReturnsNull_kHsO15_ktXC1() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[]{Collections.emptyList().iterator().next()});
        Assertions.assertNull(function);
    }
}