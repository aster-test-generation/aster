/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.apache.commons.jxpath.JXPathException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MethodLookupUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_ExactMatch_XfKU0() {
        Method result = MethodLookupUtils.lookupStaticMethod(Math.class, "abs", new Object[]{-10});
        assertNotNull(result);
        assertEquals("abs", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NullParameters_sdSB1() {
        Method result = MethodLookupUtils.lookupStaticMethod(Math.class, "random", null);
        assertNotNull(result);
        assertEquals("random", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NoMatch_KwIT2() {
        Method result = MethodLookupUtils.lookupStaticMethod(Math.class, "nonExistentMethod", new Object[]{10});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_AmbiguousMatch_hqbb3() {
        try {
            MethodLookupUtils.lookupStaticMethod(System.class, "getProperty", new Object[]{"key", "defaultValue"});
            fail("Expected an JXPathException to be thrown");
        } catch (JXPathException e) {
            assertEquals("Ambiguous method call: getProperty", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_ExactMatchWithNull_QnVs4() {
        Method result = MethodLookupUtils.lookupStaticMethod(String.class, "valueOf", new Object[]{null});
        assertNotNull(result);
        assertEquals("valueOf", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_ExactMatchWithOverloads_espG5() {
        Method result = MethodLookupUtils.lookupStaticMethod(String.class, "valueOf", new Object[]{true});
        assertNotNull(result);
        assertEquals("valueOf", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_ExactMatchWithDifferentTypes_fhkR6() {
        Method result = MethodLookupUtils.lookupStaticMethod(Double.class, "toString", new Object[]{10.5});
        assertNotNull(result);
        assertEquals("toString", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_WithSuperclassType_zczY7() {
        Method result = MethodLookupUtils.lookupStaticMethod(Integer.class, "toString", new Object[]{10});
        assertNotNull(result);
        assertEquals("toString", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_WithInterfaceType_TJZm8() {
        Method result = MethodLookupUtils.lookupStaticMethod(CharSequence.class, "chars", new Object[]{"test"});
        assertNotNull(result);
        assertEquals("chars", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_WithArrayParameter_VPGv9() {
        Method result = MethodLookupUtils.lookupStaticMethod(Arrays.class, "toString", new Object[]{new int[]{1, 2, 3}});
        assertNotNull(result);
        assertEquals("toString", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_WithPrimitiveArray_mOUa10() {
        Method result = MethodLookupUtils.lookupStaticMethod(Arrays.class, "binarySearch", new Object[]{new int[]{1, 2, 3}, 2});
        assertNotNull(result);
        assertEquals("binarySearch", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_WithCollectionParameter_zTmC11() {
        Method result = MethodLookupUtils.lookupStaticMethod(Collections.class, "sort", new Object[]{new ArrayList<>()});
        assertNotNull(result);
        assertEquals("sort", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_WithGenericType_KSKk12() {
        Method result = MethodLookupUtils.lookupStaticMethod(Collections.class, "emptyList", new Object[]{});
        assertNotNull(result);
        assertEquals("emptyList", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_WithVarArgs_wwrb13() {
        Method result = MethodLookupUtils.lookupStaticMethod(String.class, "format", new Object[]{"%s %s", "hello", "world"});
        assertNotNull(result);
        assertEquals("format", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NullParameters_fpHQ0() {
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", null);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_EmptyParameters_jFkB1() {
        Object[] parameters = {};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_FirstParameterNull_XrXl2() {
        Object[] parameters = {null};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NoMatchType_JqQK3() {
        Object[] parameters = {new Object()};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_ExactMatch_kISD4() throws NoSuchMethodException {
        Object[] parameters = {new String("example"), 0, 3};
        Method expected = String.class.getMethod("substring", int.class, int.class);
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_ExactMatchSingleParameter_ROoP5() throws NoSuchMethodException {
        Object[] parameters = {new String("example"), 0};
        Method expected = String.class.getMethod("substring", int.class);
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NullInParameters_jzul6() {
        Object[] parameters = {new String("example"), null};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_AmbiguousCall_XCLY7() {
        Object[] parameters = {new String("example"), 0, 3.0};
        try {
            MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Ambiguous method call: substring", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NoSuchMethod_kqGn8() {
        Object[] parameters = {new String("example"), "test"};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_StaticMethodExclusion_PaZt9() {
        Object[] parameters = {Math.class, 0.0};
        Method result = MethodLookupUtils.lookupMethod(Math.class, "abs", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_DifferentClass_KJLE11() {
        Object[] parameters = {new Integer(123), 0, 3};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MatchWithSuperType_vLoX12() throws NoSuchMethodException {
        Object[] parameters = {new Object(), "test"};
        Method expected = Object.class.getMethod("toString");
        Method result = MethodLookupUtils.lookupMethod(Object.class, "toString", parameters);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_InvalidMethodName_QelU13() {
        Object[] parameters = {new String("example"), 0};
        Method result = MethodLookupUtils.lookupMethod(String.class, "nonExistentMethod", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_ValidMethodWithCorrectTypes_MjUM15() throws NoSuchMethodException {
        Object[] parameters = {new String("example"), 0, 7};
        Method expected = String.class.getMethod("substring", int.class, int.class);
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_WithInheritance_ZmUH16() throws NoSuchMethodException {
        Object[] parameters = {new Throwable("error"), "error"};
        Method expected = Throwable.class.getMethod("getMessage");
        Method result = MethodLookupUtils.lookupMethod(Throwable.class, "getMessage", parameters);
        assertEquals(expected, result);
    }
}