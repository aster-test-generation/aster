/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InfoSetUtil_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithInteger_Bbco0() {
        assertEquals(5, InfoSetUtil.number(5).intValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithBooleanTrue_HGJP2() {
        assertEquals(1, InfoSetUtil.number(true).intValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithBooleanFalse_cswq3() {
        assertEquals(0, InfoSetUtil.number(false).intValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithStringNumeric_qjzo4() {
        assertEquals(123.45, InfoSetUtil.number("123.45").doubleValue(), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithStringNonNumeric_gmkV5() {
        assertEquals(Double.NaN, InfoSetUtil.number("abc").doubleValue(), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueWithNumber_JZNf0() {
        assertEquals(5.0, InfoSetUtil.doubleValue(5), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueWithBooleanTrue_uhvk1() {
        assertEquals(0.0, InfoSetUtil.doubleValue(true), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueWithBooleanFalse_vrZl2() {
        assertEquals(1.0, InfoSetUtil.doubleValue(false), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueWithEmptyString_uPsc3() {
        assertEquals(0.0, InfoSetUtil.doubleValue(""), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueWithStringNumber_sPIq4() {
        assertEquals(123.45, InfoSetUtil.doubleValue("123.45"), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueWithStringNonNumber_bANC5() {
        assertTrue(Double.isNaN(InfoSetUtil.doubleValue("not a number")));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithPositiveNumber_pyZj0() {
        assertTrue(InfoSetUtil.booleanValue(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithNegativeNumber_eQGZ1() {
        assertTrue(InfoSetUtil.booleanValue(-1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithZero_VrnO2() {
        assertFalse(InfoSetUtil.booleanValue(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithNegativeZero_AWrG3() {
        assertFalse(InfoSetUtil.booleanValue(-0.0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithNaN_QgaP4() {
        assertFalse(InfoSetUtil.booleanValue(Double.NaN));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithTrueBoolean_VIfW5() {
        assertTrue(InfoSetUtil.booleanValue(true));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithFalseBoolean_tBzJ6() {
        assertFalse(InfoSetUtil.booleanValue(false));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithNonEmptyString_mKJu7() {
        assertTrue(InfoSetUtil.booleanValue("test"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithEmptyString_JXLq8() {
        assertFalse(InfoSetUtil.booleanValue(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithNull_cZDk9() {
        assertFalse(InfoSetUtil.booleanValue(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueWithNonNullObject_VzkP10() {
        assertTrue(InfoSetUtil.booleanValue(new Object()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueWithNull_fqvx0() {
        assertEquals("", InfoSetUtil.stringValue(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueWithString_HnPe1() {
        assertEquals("Hello", InfoSetUtil.stringValue("Hello"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueWithInteger_QigM2() {
        assertEquals("100", InfoSetUtil.stringValue(100));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueWithDouble_fCGN3() {
        assertEquals("100.5", InfoSetUtil.stringValue(100.5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueWithLong_MYZJ4() {
        assertEquals("10000000000", InfoSetUtil.stringValue(10000000000L));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueWithBooleanTrue_BllM5() {
        assertEquals("true", InfoSetUtil.stringValue(true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueWithBooleanFalse_oRYI6() {
        assertEquals("false", InfoSetUtil.stringValue(false));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNumberWithDouble_TejG1_qKlR0() {
    assertEquals("5.5", InfoSetUtil.stringValue(5.5));
}
}