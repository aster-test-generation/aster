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
public class Aster_IcTuple_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOuterClassIndex_KQfL0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        int actualResult = icTuple.outerClassIndex();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNestedExplicitFlagSet_PmUH0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.nestedExplicitFlagSet();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSimpleClassNameIndex_KIzW0() {
		IcTuple icTuple = new IcTuple("Class1", 1, "Class2", "method1", 0, 1, 2, 3);
		int result = icTuple.simpleClassNameIndex();
		assertEquals(0, result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_zWYU0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 2, 3, 4, 5);
        assertEquals(17 + "C".hashCode() + "C2".hashCode() + "N".hashCode(), icTuple.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullValues_AiBH1() {
        IcTuple icTuple = new IcTuple(null, 0, null, null, 0, 0, 0, 0);
        assertEquals(17, icTuple.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPredicted_xWjg0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean predicted = icTuple.predicted();
        assertTrue(predicted);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAnonymous_ZOQH0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple.isAnonymous();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_RBMS0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        assertEquals("IcTuple (C in C2)", icTuple.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentValues_Pzua3() {
        IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
        IcTuple icTuple2 = new IcTuple("C", 2, "C2", "N", 1, 1, 1, 1);
        boolean result = icTuple1.equals(icTuple2);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOuterClassString_jGdj0() {
        IcTuple icTuple = new IcTuple("C", 0, "C2", "N", 0, 0, 0, 0);
        String actualResult = icTuple.outerClassString();
        String expectedResult = "C";
        assertEquals(expectedResult, actualResult);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithNullC_SXPi1() {
        IcTuple icTuple = new IcTuple(null, 1, "C2", "N", 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "N";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithNullN_fVyC5() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", null, 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "C2";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithEmptyN_FnPz6() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "", 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "C2";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithZeroCIndex_BnYU7() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 0, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "C2";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithNegativeCIndex_JnHt8() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", -1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "C2";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithZeroC2Index_uMkH9() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 0, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "C2";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithNegativeC2Index_wThc10() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, -1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "C2";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithZeroNIndex_jvVN11() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 0, 1);
        String actual = icTuple.simpleClassName();
        String expected = "C2";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testThisClassIndex_buLe0() {
		IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 2, 3, 4, 5);
		int actual = icTuple.thisClassIndex();
		int expected = 2;
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameWithNullN_fVyC5_fid1() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", null, 1, 1, 1, 1);
        String actual = icTuple.simpleClassName();
        String expected = "C2";
    assertNull(expected);
    }
}