/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Collections;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackageFunctions_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_ParametersNull_TSlX0() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = null;
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_ParametersEmptyArray_GjZP1() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[0];
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_TargetNotNull_cKWh2() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[] {new Object()};
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_TargetInstanceOfCollection_UCYe6() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[] {new ArrayList()};
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunction_TargetGetPointers_jITU5_GwhR0() {
    PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
    Set<String> usedNamespaces = packageFunctions.getUsedNamespaces();
    assertEquals(Collections.singleton("namespace"), usedNamespaces);
}
}