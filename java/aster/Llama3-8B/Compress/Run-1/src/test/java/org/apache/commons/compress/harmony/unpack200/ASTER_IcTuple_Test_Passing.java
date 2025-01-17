/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IcTuple_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedExplicitFlagSetFalse_otzK1() {
    IcTuple icTuple = new IcTuple("C", 0, "C2", "N", 0, 0, 0, 0);
    boolean result = icTuple.nestedExplicitFlagSet();
    assert result == false;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullSafeEqualsNullNull_SouR0() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    boolean result = icTuple.nullSafeEquals(null, null);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullSafeEqualsNullString_ZwBc1() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    boolean result = icTuple.nullSafeEquals(null, "string");
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullSafeEqualsStringNull_jrpp2() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    boolean result = icTuple.nullSafeEquals("string", null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetC2_slTF0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        String result = icTuple.getC2();
        assert result.equals("C2");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_SkDm0() {
    IcTuple tuple = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    boolean result = tuple.equals(tuple);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_COgi1() {
    IcTuple tuple = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    Object obj = new Object();
    boolean result = tuple.equals(obj);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_dIki2() {
    IcTuple tuple = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    boolean result = tuple.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentTuple_VZfU3() {
    IcTuple tuple1 = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    IcTuple tuple2 = new IcTuple("D", 2, "C3", "O", 1, 1, 1, 1);
    boolean result = tuple1.equals(tuple2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameTuple_cfEI4() {
    IcTuple tuple1 = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    IcTuple tuple2 = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    boolean result = tuple1.equals(tuple2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentC_VHYs5() {
    IcTuple tuple1 = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    IcTuple tuple2 = new IcTuple("D", 1, "C2", "N", 0, 0, 0, 0);
    boolean result = tuple1.equals(tuple2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsMember_QtEA0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.isMember();
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetC_CWID0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        String result = icTuple.getC();
        assert result.equals("C");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOuterClassString_WMyz0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        String result = icTuple.outerClassString();
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetN_jhRc0() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    String result = icTuple.getN();
    assert result.equals("N");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testThisClassIndexWhenNotPredictedReturnsMinusOne_TzLI1() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    icTuple.predicted(); // assuming predicted is a method that returns false
    int result = icTuple.thisClassIndex();
    Assertions.assertEquals(-1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTupleIndex_VEZz0() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    int result = icTuple.getTupleIndex();
    assert result == 4;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testThisClassStringWhenNotPredictedReturnsC2AndN_ofqQ1() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    String result = icTuple.thisClassString();
    assertEquals("C2$N", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInnerBreakAtDollar1_KyTD0() {
    IcTuple icTuple = new IcTuple("Test", 0, "Test2", "Test3", 0, 0, 0, 0);
    String[] result = icTuple.innerBreakAtDollar("Hello$World");
    String[] expected = {"Hello", "World"};
    assert Arrays.equals(result, expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInnerBreakAtDollar2_zEPY1() {
    IcTuple icTuple = new IcTuple("Test", 0, "Test2", "Test3", 0, 0, 0, 0);
    String[] result = icTuple.innerBreakAtDollar("Hello");
    String[] expected = {"Hello"};
    assert Arrays.equals(result, expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInnerBreakAtDollar3_NoCp2() {
    IcTuple icTuple = new IcTuple("Test", 0, "Test2", "Test3", 0, 0, 0, 0);
    String[] result = icTuple.innerBreakAtDollar("$Hello");
    String[] expected = {"", "Hello"};
    assert Arrays.equals(result, expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInnerBreakAtDollar4_tfET3() {
    IcTuple icTuple = new IcTuple("Test", 0, "Test2", "Test3", 0, 0, 0, 0);
    String[] result = icTuple.innerBreakAtDollar("Hello$World$");
    String[] expected = {"Hello", "World", ""};
    assert Arrays.equals(result, expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPredictedTrue_zOab0_FMib0() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    String[] result = icTuple.innerBreakAtDollar("C$N");
    String[] expected = new String[]{"C", "N"};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPredictedOneTrue_bFdx2_AJNm0() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    String[] result = icTuple.innerBreakAtDollar("C$N");
    String[] expected = {"C", "N"};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedExplicitFlagSetTrue_YQoP0_fid2() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    boolean result = icTuple.nestedExplicitFlagSet();
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSimpleClassName_RxzT0_fid2() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    String result = icTuple.simpleClassName();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testThisClassIndexWhenPredictedReturnsCIndex_Eioc0_fid2() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    int result = icTuple.thisClassIndex();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPredictedFalse_pyXU1_kpqP0_fid2() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    String[] result = icTuple.innerBreakAtDollar("C$N");
}
}