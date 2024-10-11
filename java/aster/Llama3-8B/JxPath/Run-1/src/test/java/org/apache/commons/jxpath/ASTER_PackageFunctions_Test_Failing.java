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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PackageFunctions_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidMethod_lAan4() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "methodName", new Object[]{});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidConstructor_UlBX5() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "new", new Object[]{});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidMethodWithParameter_WmLl8() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "methodName", new Object[]{"parameter"});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidConstructorWithParameter_rvFz9() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "new", new Object[]{"parameter"});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidMethodWithMultipleParameters_xBwb12() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "methodName", new Object[]{"parameter1", "parameter2"});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidConstructorWithMultipleParameters_oDHy13() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "new", new Object[]{"parameter1", "parameter2"});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidMethodWithCollectionParameter_sMBI16_xddO1_fid3() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "methodName", new Object[]{Collections.emptyList()});
        Assertions.assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionValidConstructorWithCollectionParameter_HbBO17_MntD1_fid3() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "new", new Object[]{Collections.emptyList()});
        Assertions.assertNotNull(function);
    }
}