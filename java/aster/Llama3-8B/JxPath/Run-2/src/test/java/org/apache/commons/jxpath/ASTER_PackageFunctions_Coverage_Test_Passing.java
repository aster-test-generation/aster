/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackageFunctions_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNullNamespace_LYVq0() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction(null, "name", new Object[0]);
        Assertions.assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNullName_RESq1() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", null, new Object[0]);
        Assertions.assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNullParameters_aNLG2() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "name", null);
        Assertions.assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionTargetNull_Cbwv3() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[]{null});
        Assertions.assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionMethodNull_FVIP4() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "name", new Object[]{new Object()});
        Assertions.assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionConstructorNotFoundException_vgMY14() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Function function = packageFunctions.getFunction("namespace", "new", new Object[]{new Object()});
        Assertions.assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionTargetCollection_SzLT6_rHjB0_fid2() {
    PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
    Function function = packageFunctions.getFunction("namespace", "name", new Object[]{Collections.emptyList()});
    Assertions.assertNull(function);
}
}