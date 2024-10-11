/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.JXPathException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MethodLookupUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NullParameters_KqAF0() {
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", null);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_EmptyParameters_eeol1() {
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", new Object[]{});
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_FirstParameterNull_ttwS2() {
        Object[] parameters = {null, 1};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NoMatchType_IGYG3() {
        Object[] parameters = {new Object(), 1};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_ExactMatch_Yigd4() throws NoSuchMethodException {
        Object[] parameters = {"test", 0, 2};
        Method expected = String.class.getMethod("substring", int.class, int.class);
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_ExactMatchSingleParameter_hcsu5() throws NoSuchMethodException {
        Object[] parameters = {"test", 4};
        Method expected = String.class.getMethod("substring", int.class);
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NullInParameters_pLzI6() {
        Object[] parameters = {"test", null};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NoSuchMethod_tYFy7() {
        Object[] parameters = {"test", "dummy"};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_AmbiguousCall_aZxt8() {
        Object[] parameters = {new Integer(1), 1};
        try {
            MethodLookupUtils.lookupMethod(Integer.class, "valueOf", parameters);
            fail("Expected an JXPathException to be thrown");
        } catch (JXPathException e) {
            assertEquals("Ambiguous method call: valueOf", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_StaticMethod_rftW9() {
        Object[] parameters = {Math.class, 0.0};
        Method result = MethodLookupUtils.lookupMethod(Math.class, "abs", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_DifferentTypeMatch_BQtE10() throws NoSuchMethodException {
        Object[] parameters = {"test", new Integer(0)};
        Method expected = String.class.getMethod("charAt", int.class);
        Method result = MethodLookupUtils.lookupMethod(String.class, "charAt", parameters);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MatchWithSuperType_mpUt11() throws NoSuchMethodException {
        Object[] parameters = {"test", new Object()};
        Method result = MethodLookupUtils.lookupMethod(String.class, "equals", parameters);
        Method expected = String.class.getMethod("equals", Object.class);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MatchWithInterface_LzNF12() throws NoSuchMethodException {
        Object[] parameters = {new Integer(0), new Double(0.0)};
        Method result = MethodLookupUtils.lookupMethod(Integer.class, "compareTo", parameters);
        Method expected = Integer.class.getMethod("compareTo", Integer.class);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_NullTypeInParameters_MNBj13() {
        Object[] parameters = {"test", null, 2};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_InvalidMethodName_Ibii14() {
        Object[] parameters = {"test", 0, 2};
        Method result = MethodLookupUtils.lookupMethod(String.class, "nonExistentMethod", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_ValidMethodWithWrongParameterCount_uySi15() {
        Object[] parameters = {"test", 0};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_ValidMethodWithWrongParameterType_LmFA16() {
        Object[] parameters = {"test", "wrongType"};
        Method result = MethodLookupUtils.lookupMethod(String.class, "substring", parameters);
        assertNull(result);
    }
}