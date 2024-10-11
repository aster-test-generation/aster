/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Collections;
import java.util.Set;
import org.apache.commons.jxpath.functions.MethodFunction;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackageFunctions_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUsedNamespaces_PovN0() {
    PackageFunctions packageFunctions = new PackageFunctions("ClassPrefix", "com.example.namespace");
    Set<String> expected = Collections.singleton("com.example.namespace");
    Set<String> actual = packageFunctions.getUsedNamespaces();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithDifferentNamespace_vLFV0() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Function result = packageFunctions.getFunction("http://wrongnamespace.com", "someMethod", new Object[]{});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithValidMethod_TjcB3() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = new Object[]{new Object()};
        Function result = packageFunctions.getFunction("http://example.com", "toString", parameters);
        assertNotNull(result);
        assertTrue(result instanceof MethodFunction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithClassNotFound_VcZB16() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = new Object[]{};
        try {
            Function result = packageFunctions.getFunction("http://example.com", "com.nonexistent.SomeClass.new", parameters);
            fail("Expected JXPathException was not thrown.");
        } catch (JXPathException ex) {
            assertNotNull(ex);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithValidMethod_TjcB3_1() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = new Object[]{new Object()};
        Function result = packageFunctions.getFunction("http://example.com", "toString", parameters);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithValidMethod_TjcB3_2() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = new Object[]{new Object()};
        Function result = packageFunctions.getFunction("http://example.com", "toString", parameters);
        assertTrue(result instanceof MethodFunction);}
}