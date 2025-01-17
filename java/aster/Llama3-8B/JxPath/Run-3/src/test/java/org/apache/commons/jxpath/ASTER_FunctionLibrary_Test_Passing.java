/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FunctionLibrary_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_MkLf0() throws Exception {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> result = functionLibrary.getUsedNamespaces();
        assertEquals("Expected result", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionWithValidNamespaceAndName_Zoit0() throws Exception {
    FunctionLibrary functionLibrary = new FunctionLibrary();
    Function function = functionLibrary.getFunction("namespace", "name", new Object[0]);
    Assertions.assertNotNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionWithInvalidNamespace_tRbJ1() throws Exception {
    FunctionLibrary functionLibrary = new FunctionLibrary();
    Function function = functionLibrary.getFunction("invalidNamespace", "name", new Object[0]);
    Assertions.assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionWithValidNamespaceAndInvalidName_IBYl2() throws Exception {
    FunctionLibrary functionLibrary = new FunctionLibrary();
    Function function = functionLibrary.getFunction("namespace", "invalidName", new Object[0]);
    Assertions.assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionWithValidNamespaceAndNameAndParameters_WkyB3() throws Exception {
    FunctionLibrary functionLibrary = new FunctionLibrary();
    Object[] parameters = new Object[] { "param1", "param2" };
    Function function = functionLibrary.getFunction("namespace", "name", parameters);
    Assertions.assertNotNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionWithValidNamespaceAndNameAndNullParameters_jOnf4() throws Exception {
    FunctionLibrary functionLibrary = new FunctionLibrary();
    Object[] parameters = null;
    Function function = functionLibrary.getFunction("namespace", "name", parameters);
    Assertions.assertNull(function);
}
}