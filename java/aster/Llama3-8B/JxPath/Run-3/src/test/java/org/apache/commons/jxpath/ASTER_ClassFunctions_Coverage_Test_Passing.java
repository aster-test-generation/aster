/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassFunctions_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionConstructorNull_ipWa1() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, "namespace");
        Function function = classFunctions.getFunction("namespace", "new", new Object[] { });
        assertNull(classFunctions.getFunction(null, "new", new Object[] { }));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionMethodNull_JSXr3() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, "namespace");
        Function function = classFunctions.getFunction("namespace", "method", new Object[] { });
        assertNull(classFunctions.getFunction("namespace", "method", null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNamespaceMismatch_vTne4() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, "namespace");
        Function function = classFunctions.getFunction("otherNamespace", "new", new Object[] { });
        assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNamespaceNull_OOrj5() {
        ClassFunctions classFunctions = new ClassFunctions(Function.class, "namespace");
        Function function = classFunctions.getFunction(null, "new", new Object[] { });
        assertNull(function);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUsedNamespaces_RNuk0_KARu0() {
    Class<?> functionClass = String.class;
    ClassFunctions classFunctions = new ClassFunctions(functionClass.getClass(), "namespace");
    Set<String> result = classFunctions.getUsedNamespaces();
    assertEquals("namespace", result.iterator().next());
}
}