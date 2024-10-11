/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.functions.ConstructorFunction;
import org.apache.commons.jxpath.functions.MethodFunction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PackageFunctions_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_ExistentFunction_haMy7() {
        PackageFunctions packageFunctions = new PackageFunctions("", "");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[0]);
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_MethodFunction_KaFI8() {
        PackageFunctions packageFunctions = new PackageFunctions("", "");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[0]);
        assertTrue(function instanceof MethodFunction);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_ConstructorFunction_FRoE9() {
        PackageFunctions packageFunctions = new PackageFunctions("", "");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[0]);
        assertTrue(function instanceof ConstructorFunction);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_MethodFunctionWithParameters_jiBx10() {
        PackageFunctions packageFunctions = new PackageFunctions("", "");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[1]);
        assertTrue(function instanceof MethodFunction);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_ConstructorFunctionWithParameters_fLSW11() {
        PackageFunctions packageFunctions = new PackageFunctions("", "");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[1]);
        assertTrue(function instanceof ConstructorFunction);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_MethodFunctionWithDifferentParameters_VWUu12() {
        PackageFunctions packageFunctions = new PackageFunctions("", "");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[2]);
        assertTrue(function instanceof MethodFunction);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_ConstructorFunctionWithDifferentParameters_iQcr13() {
        PackageFunctions packageFunctions = new PackageFunctions("", "");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[2]);
        assertTrue(function instanceof ConstructorFunction);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_empty_wTdA0() {
        PackageFunctions packageFunctions = new PackageFunctions("", "");
        Set<String> usedNamespaces = packageFunctions.getUsedNamespaces();
        assertTrue(usedNamespaces.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_null_AVgZ3() {
        PackageFunctions packageFunctions = new PackageFunctions("", null);
        Set<String> usedNamespaces = packageFunctions.getUsedNamespaces();
        assertTrue(usedNamespaces.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_invalidInput_NifK6() {
        PackageFunctions packageFunctions = new PackageFunctions("", "invalid");
        Set<String> usedNamespaces = packageFunctions.getUsedNamespaces();
        assertTrue(usedNamespaces.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_multiple_CDny2_GnMc0_1() {
        PackageFunctions packageFunctions = new PackageFunctions("namespace1", "namespace2");
        Set<String> usedNamespaces = packageFunctions.getUsedNamespaces();
        assertEquals(2, usedNamespaces.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_multiple_CDny2_GnMc0_2_fid3() {
        PackageFunctions packageFunctions = new PackageFunctions("namespace1", "namespace2");
        Set<String> usedNamespaces = packageFunctions.getUsedNamespaces();
        assertTrue(usedNamespaces.contains("namespace1"));
    }
}