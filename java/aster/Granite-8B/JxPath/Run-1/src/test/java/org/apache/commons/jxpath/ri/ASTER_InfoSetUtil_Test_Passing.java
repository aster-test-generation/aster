/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_InfoSetUtil_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberNumber_kCyf0() {
        assertEquals(5, InfoSetUtil.number(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberBooleanFalse_JYkl2() {
        assertEquals(0.0, InfoSetUtil.number(false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberStringDouble_UUOO3() {
        assertEquals(5.5, InfoSetUtil.number("5.5"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueNumber_Vsxe0() {
        double result = InfoSetUtil.doubleValue(10);
        Assertions.assertEquals(10.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueBooleanTrue_eZkA1() {
        double result = InfoSetUtil.doubleValue(true);
        Assertions.assertEquals(0.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueBooleanFalse_kfkY2() {
        double result = InfoSetUtil.doubleValue(false);
        Assertions.assertEquals(1.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueString_ocgE3() {
        double result = InfoSetUtil.doubleValue("10.5");
        Assertions.assertEquals(10.5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueStringEmpty_WnoO4() {
        double result = InfoSetUtil.doubleValue("");
        Assertions.assertEquals(0.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueStringNaN_KhRi5() {
        double result = InfoSetUtil.doubleValue("abc");
        Assertions.assertEquals(Double.NaN, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueObject_XAHj8() {
        double result = InfoSetUtil.doubleValue(new Object());
        Assertions.assertEquals(Double.NaN, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumberTrue_TLqr0() {
        assertEquals(true, InfoSetUtil.booleanValue(new Double(1.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumberFalse_DVey1() {
        assertEquals(false, InfoSetUtil.booleanValue(new Double(0.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumberNegativeZero_CnQY3() {
        assertEquals(false, InfoSetUtil.booleanValue(new Double(-0.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumberNaN_BGom4() {
        assertEquals(false, InfoSetUtil.booleanValue(new Double(Double.NaN)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueBooleanTrue_eShF5() {
        assertEquals(true, InfoSetUtil.booleanValue(Boolean.TRUE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueBooleanFalse_iQVG6() {
        assertEquals(false, InfoSetUtil.booleanValue(Boolean.FALSE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueString_yKDg8() {
        assertEquals(true, InfoSetUtil.booleanValue("test"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueStringEmpty_LjhV9() {
        assertEquals(false, InfoSetUtil.booleanValue(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNull_bvmf12() {
        assertEquals(false, InfoSetUtil.booleanValue(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueOtherObject_gbuo13() {
        assertEquals(true, InfoSetUtil.booleanValue(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueString_fAqm0() {
        assertEquals("Hello", InfoSetUtil.stringValue("Hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_QvcD1_1() {
        assertEquals("10", InfoSetUtil.stringValue(10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_QvcD1_2() {
        assertEquals("10.5", InfoSetUtil.stringValue(10.5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueBoolean_VtKR2_1() {
        assertEquals("true", InfoSetUtil.stringValue(true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueBoolean_VtKR2_2() {
        assertEquals("false", InfoSetUtil.stringValue(false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNull_jzGf3() {
        assertEquals("", InfoSetUtil.stringValue(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberStringNotANumber_XUTC4_lcYX0() {
        assertEquals("abc", InfoSetUtil.stringValue("abc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_QvcD1() {
        assertEquals("10", InfoSetUtil.stringValue(10));
        assertEquals("10.5", InfoSetUtil.stringValue(10.5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueBoolean_VtKR2() {
        assertEquals("true", InfoSetUtil.stringValue(true));
        assertEquals("false", InfoSetUtil.stringValue(false));
    }
}