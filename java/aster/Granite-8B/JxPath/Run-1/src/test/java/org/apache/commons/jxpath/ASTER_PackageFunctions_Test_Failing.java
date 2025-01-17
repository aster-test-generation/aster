/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PackageFunctions_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidMethod_Vegp4() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "methodName", new Object[0]);
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidConstructor_oUau5() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "new", new Object[0]);
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidMethodWithParameter_RIry8() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "methodName", new Object[]{"parameter"});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidConstructorWithParameter_FQnR9() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "new", new Object[]{"parameter"});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidMethodWithMultipleParameters_xxbt12() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "methodName", new Object[]{"parameter1", "parameter2"});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidConstructorWithMultipleParameters_aAXJ13() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "new", new Object[]{"parameter1", "parameter2"});
        Assertions.assertNotNull(function);
    }
}