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
    public void testOuterIsAnonymous_dNHZ0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.outerIsAnonymous();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNestedExplicitFlagSet2_lhIR1() {
        IcTuple icTuple = new IcTuple("C", 2, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.nestedExplicitFlagSet();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSafeEqualsWithNullStringOneAndNullStringTwo_tYyD0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.nullSafeEquals(null, null);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSafeEqualsWithNonNullStringOneAndNullStringTwo_DnNk1() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.nullSafeEquals("stringOne", null);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSafeEqualsWithNullStringOneAndNonNullStringTwo_yPXk2() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.nullSafeEquals(null, "stringTwo");
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetC2_Ftgs0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        String c2 = icTuple.getC2();
        assertEquals("C2", c2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsMember_Tcye0() {
		IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
		boolean result = icTuple.isMember();
		assertTrue(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetC_cpLW0() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    String actualC = icTuple.getC();
    String expectedC = "C";
    assertEquals(expectedC, actualC);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_JFwO0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.equals(null);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClassObject_uhmx1() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.equals(new Object());
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_eUCz2() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.equals(icTuple);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameValues_TzwJ4() {
        IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        IcTuple icTuple2 = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple1.equals(icTuple2);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentCValues_WUkw5() {
        IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        IcTuple icTuple2 = new IcTuple("C2", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple1.equals(icTuple2);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentC2Values_oPuQ7() {
        IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        IcTuple icTuple2 = new IcTuple("C", 1, "C3", "N", 1, 1, 1, 1);
        boolean result = icTuple1.equals(icTuple2);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentNValues_Ggms9() {
        IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        IcTuple icTuple2 = new IcTuple("C", 1, "C2", "N2", 1, 1, 1, 1);
        boolean result = icTuple1.equals(icTuple2);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassName_zNtq0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithEmptyC_bcuS2() {
        IcTuple icTuple = new IcTuple("", 1, "C2", "N", 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithNullC2_rQjC3() {
        IcTuple icTuple = new IcTuple("C", 1, null, "N", 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithEmptyC2_qwFH4() {
        IcTuple icTuple = new IcTuple("C", 1, "", "N", 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetF_GkrB0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        int actualF = icTuple.getF();
        assertEquals(1, actualF);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTupleIndex_BdXA0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 2, 3, 4, 5);
        int actual = icTuple.getTupleIndex();
        int expected = 5;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testThisClassString_SsnT0() {
        IcTuple icTuple = new IcTuple("class1", 1, "class2", "method1", 1, 2, 3, 4);
        String actual = icTuple.thisClassString();
        String expected = "class2$method1";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testThisClassString2_bCgn1() {
        IcTuple icTuple = new IcTuple("class3", 1, "class4", "method2", 1, 2, 3, 4);
        String actual = icTuple.thisClassString();
        String expected = "class4$method2";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInnerBreakAtDollar1_nXIV0() {
        IcTuple icTuple = new IcTuple("com.example.MyClass", 1, "com.example.MyClass2", "myMethod", 0, 1, 2, 3);
        String[] result = icTuple.innerBreakAtDollar("com.example.MyClass");
        assert result != null;
        assert result.length == 1;
        assert result[0].equals("com.example.MyClass");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInnerBreakAtDollar2_VXKW1() {
        IcTuple icTuple = new IcTuple("com.example.MyClass", 1, "com.example.MyClass2", "myMethod", 0, 1, 2, 3);
        String[] result = icTuple.innerBreakAtDollar("com.example.MyClass$InnerClass");
        assert result != null;
        assert result.length == 2;
        assert result[0].equals("com.example.MyClass");
        assert result[1].equals("InnerClass");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInnerBreakAtDollar3_kObf2() {
        IcTuple icTuple = new IcTuple("com.example.MyClass", 1, "com.example.MyClass2", "myMethod", 0, 1, 2, 3);
        String[] result = icTuple.innerBreakAtDollar("com.example.MyClass$InnerClass$InnerInnerClass");
        assert result != null;
        assert result.length == 3;
        assert result[0].equals("com.example.MyClass");
        assert result[1].equals("InnerClass");
        assert result[2].equals("InnerInnerClass");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInnerBreakAtDollar4_sMAx3() {
        IcTuple icTuple = new IcTuple("com.example.MyClass", 1, "com.example.MyClass2", "myMethod", 0, 1, 2, 3);
        String[] result = icTuple.innerBreakAtDollar("com.example.MyClass$InnerClass$InnerInnerClass$InnerInnermostClass");
        assert result != null;
        assert result.length == 4;
        assert result[0].equals("com.example.MyClass");
        assert result[1].equals("InnerClass");
        assert result[2].equals("InnerInnerClass");
        assert result[3].equals("InnerInnermostClass");
    }
@Test
@Timeout(value =-1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOuterClassIndex_KQfL0_fid1() {
        IcTuple icTuple = new IcTuple("C",-1, "C2", "N",-1,-1,-1,-1);
        int actualResult = icTuple.outerClassIndex();
        int expectedResult =-1;
        assertEquals(expectedResult, actualResult);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNestedExplicitFlagSet_PmUH0_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.nestedExplicitFlagSet();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSimpleClassNameIndex_KIzW0_fid1() {
		IcTuple icTuple = new IcTuple("Class1", 1, "Class2", "method1", 0, 1, 2, 3);
		int result = icTuple.simpleClassNameIndex();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPredicted_xWjg0_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean predicted = icTuple.predicted();
        assertFalse(predicted);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAnonymous_ZOQH0_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.isAnonymous();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_RBMS0_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        assertEquals("IcTuple (N in C2)", icTuple.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentValues_Pzua3_fid1() {
        IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        IcTuple icTuple2 = new IcTuple("C", 2, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple1.equals(icTuple2);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithEmptyN_FnPz6_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "", "", 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithZeroCIndex_BnYU7_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "N", "N", 0, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithNegativeCIndex_JnHt8_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "N", "N", -1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithZeroNIndex_uMkH9() {
        IcTuple icTuple = new IcTuple("C", 1, "N", "N", 1, 0, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithNegativeNIndex_wThc10() {
        IcTuple icTuple = new IcTuple("C", 1, "N", "N", 1, -1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithZeroNIndex_jvVN11_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "N", "N", 1, 1, 0, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testThisClassIndex_buLe0_fid1() {
		IcTuple icTuple = new IcTuple("C", 1, "C2", "N",-1, 3, 4, 5);
		int actual = icTuple.thisClassIndex();
		int expected =-1;
		assertEquals(expected, actual);
	}
}