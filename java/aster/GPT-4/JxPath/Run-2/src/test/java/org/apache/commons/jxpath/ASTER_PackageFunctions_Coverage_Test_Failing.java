/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackageFunctions_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNullParameters_Fhvm1() {
        PackageFunctions pf = new PackageFunctions("com.example.", "http://example.com");
        Function result = pf.getFunction("http://example.com", "methodName", null);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithCollection_JbKA4() {
        Collection<Object> collection = Arrays.asList(new Object());
        PackageFunctions pf = new PackageFunctions("com.example.", "http://example.com");
        Function result = pf.getFunction("http://example.com", "methodName", new Object[]{collection});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithEmptyCollection_mWma5() {
        Collection<Object> collection = new ArrayList<>();
        PackageFunctions pf = new PackageFunctions("com.example.", "http://example.com");
        Function result = pf.getFunction("http://example.com", "methodName", new Object[]{collection});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithPointer_eLdp6() {
        Pointer pointer = mock(Pointer.class);
        when(pointer.getValue()).thenReturn(new Object());
        Collection<Object> collection = Arrays.asList(pointer);
        PackageFunctions pf = new PackageFunctions("com.example.", "http://example.com");
        Function result = pf.getFunction("http://example.com", "methodName", new Object[]{collection});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionInvalidFullName_PNlh7() {
        PackageFunctions pf = new PackageFunctions("com.example.", "http://example.com");
        Function result = pf.getFunction("http://example.com", "methodName", new Object[]{new Object()});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionStaticMethodNotFound_iwCc11() {
        PackageFunctions pf = new PackageFunctions("com.example.", "http://example.com");
        Function result = pf.getFunction("http://example.com", "SomeClass.nonExistentMethod", new Object[]{});
        assertNull(result);
    }
}