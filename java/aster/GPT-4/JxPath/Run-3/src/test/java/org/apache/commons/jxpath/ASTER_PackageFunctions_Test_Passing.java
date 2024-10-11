/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
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
    public void testGetFunctionWithDifferentNamespace_CLIk0() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Function result = packageFunctions.getFunction("http://another.com", "someMethod", new Object[]{});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithNullParameters_ATer1() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Function result = packageFunctions.getFunction("http://example.com", "someMethod", null);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithEmptyParameters_sSJV2() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Function result = packageFunctions.getFunction("http://example.com", "someMethod", new Object[]{});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithValidMethod_cYOg3() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {new Object()};
        Function result = packageFunctions.getFunction("http://example.com", "toString", parameters);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithCollection_bYJB5() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Collection collection = new ArrayList();
        collection.add(new Object());
        Object[] parameters = {collection};
        Function result = packageFunctions.getFunction("http://example.com", "toString", parameters);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithEmptyCollection_OeNy6() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Collection collection = new ArrayList();
        Object[] parameters = {collection};
        Function result = packageFunctions.getFunction("http://example.com", "someMethod", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithInvalidClassName_sooU8() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {new Object()};
        Function result = packageFunctions.getFunction("http://example.com", "invalidMethod", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithConstructor_VVeO9() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {10};
        Function result = packageFunctions.getFunction("http://example.com", "com.example.SomeClass.new", parameters);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithStaticMethod_mnVq10() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {10};
        Function result = packageFunctions.getFunction("http://example.com", "com.example.SomeClass.staticMethod", parameters);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithNonExistentConstructor_NBpj11() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {10};
        Function result = packageFunctions.getFunction("http://example.com", "com.example.NonExistent.new", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithNonExistentStaticMethod_yjCx12() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {10};
        Function result = packageFunctions.getFunction("http://example.com", "com.example.NonExistent.staticMethod", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithInvalidMethodLookup_dyTY13() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {new Object()};
        Function result = packageFunctions.getFunction("http://example.com", "nonExistentMethod", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithInvalidConstructorLookup_mvSW14() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {new Object()};
        Function result = packageFunctions.getFunction("http://example.com", "com.example.SomeClass.new", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithValidStaticMethodLookup_lVfA15() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {10};
        Function result = packageFunctions.getFunction("http://example.com", "com.example.SomeClass.validStaticMethod", parameters);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithInvalidStaticMethodLookup_wRZw16() {
        PackageFunctions packageFunctions = new PackageFunctions("com.example.", "http://example.com");
        Object[] parameters = {10};
        Function result = packageFunctions.getFunction("http://example.com", "com.example.SomeClass.invalidStaticMethod", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUsedNamespaces_aacB0() {
    PackageFunctions packageFunctions = new PackageFunctions("ClassPrefix", "com.example.namespace");
    Set<String> expectedNamespaces = Collections.singleton("com.example.namespace");
    assertEquals(expectedNamespaces, packageFunctions.getUsedNamespaces());
}
}