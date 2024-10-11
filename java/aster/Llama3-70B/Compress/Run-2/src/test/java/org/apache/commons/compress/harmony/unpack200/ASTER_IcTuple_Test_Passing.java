/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IcTuple_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOuterClassIndex_EyWf0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals(4, icTuple.outerClassIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOuterIsAnonymous_tFCX0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    boolean result = icTuple.outerIsAnonymous();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedExplicitFlagSet_true_Tbev0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 0x0001, "C2", "N", 1, 2, 3, 4);
    assertTrue(icTuple.nestedExplicitFlagSet());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedExplicitFlagSet_false_qVCx1() throws Exception {
    IcTuple icTuple = new IcTuple("C", 0x0000, "C2", "N", 1, 2, 3, 4);
    assertFalse(icTuple.nestedExplicitFlagSet());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSimpleClassNameIndex_pRqP0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals(4, icTuple.simpleClassNameIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_WhenAllFieldsAreNotNull_ThenReturnCorrectHashCode_lOaN0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    int result = icTuple.hashCode();
    assertEquals(17 + "C".hashCode() + "C2".hashCode() + "N".hashCode(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_WhenAllFieldsAreNull_ThenReturn17_ViOe1() throws Exception {
    IcTuple icTuple = new IcTuple(null, 1, null, null, 1, 2, 3, 4);
    int result = icTuple.hashCode();
    assertEquals(17, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAnonymous_HoCW0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    boolean result = icTuple.isAnonymous();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullSafeEqualsBothNull_yMqq0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertTrue(icTuple.nullSafeEquals(null, null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullSafeEqualsOneNull_JURS1() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertFalse(icTuple.nullSafeEquals("stringOne", null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullSafeEqualsBothNotNull_pxvP2() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertTrue(icTuple.nullSafeEquals("stringOne", "stringOne"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetC2_tAts0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals("C2", icTuple.getC2());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_wllW0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertTrue(icTuple.equals(icTuple));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_BkDs1() throws Exception {
    Object obj = new Object();
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertFalse(icTuple.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_sPEd2() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertFalse(icTuple.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_tgkl3() throws Exception {
    IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    IcTuple icTuple2 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertTrue(icTuple1.equals(icTuple2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentC_mbdr4() throws Exception {
    IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    IcTuple icTuple2 = new IcTuple("D", 1, "C2", "N", 1, 2, 3, 4);
    assertFalse(icTuple1.equals(icTuple2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentC2_uVPe5() throws Exception {
    IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    IcTuple icTuple2 = new IcTuple("C", 1, "D2", "N", 1, 2, 3, 4);
    assertFalse(icTuple1.equals(icTuple2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSimpleClassName_xMvZ0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals("expectedSimpleClassName", icTuple.simpleClassName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsMember_UgcV0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    boolean result = icTuple.isMember();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetC_XcFL0() throws Exception {
    IcTuple icTuple = new IcTuple("CValue", 1, "C2Value", "NValue", 1, 2, 3, 4);
    assertEquals("CValue", icTuple.getC());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_BWLC0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals("IcTuple (" + icTuple.getClass().getSimpleName() + " in " + icTuple.getClass().getDeclaringClass().getSimpleName() + ")", icTuple.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOuterClassString_rYjm0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals("expectedString", icTuple.outerClassString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetN_pmJc0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals("N", icTuple.getN());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testThisClassIndex_PredictedTrue_vwSC0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals(1, icTuple.thisClassIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testThisClassIndex_PredictedFalse_rorR1() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals(-1, icTuple.thisClassIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetF_tNuH0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 10, "C2", "N", 1, 2, 3, 4);
    assertEquals(10, icTuple.getF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTupleIndex_gpDm0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 2, 3, 4, 5);
    assertEquals(5, icTuple.getTupleIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInnerBreakAtDollar1_jCpS0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    String[] result = icTuple.innerBreakAtDollar("Hello$World");
    assertArrayEquals(new String[]{"Hello", "World"}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInnerBreakAtDollar2_lcos1() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    String[] result = icTuple.innerBreakAtDollar("HelloWorld");
    assertArrayEquals(new String[]{"HelloWorld"}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInnerBreakAtDollar3_aLgW2() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    String[] result = icTuple.innerBreakAtDollar("Hello$World$Java");
    assertArrayEquals(new String[]{"Hello", "World", "Java"}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInnerBreakAtDollar4_veDV3() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    String[] result = icTuple.innerBreakAtDollar("");
    assertArrayEquals(new String[]{}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testThisClassString_PredictedTrue_nCJi0() throws Exception {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertEquals("C", icTuple.thisClassString());
}
}