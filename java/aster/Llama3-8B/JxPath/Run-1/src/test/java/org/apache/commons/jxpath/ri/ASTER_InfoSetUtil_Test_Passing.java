/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_InfoSetUtil_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberNumber_shTp0() {
        assertEquals(5, InfoSetUtil.number(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberBooleanFalse_jdWT2() {
        assertEquals(0.0, InfoSetUtil.number(false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberStringDouble_iGLK3() {
        assertEquals(5.5, InfoSetUtil.number("5.5"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberStringInt_pske4() {
        assertEquals(5.0, InfoSetUtil.number("5.0"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueNumber_hqXd0() {
        double result = InfoSetUtil.doubleValue(10);
        assertEquals(10.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueBooleanTrue_atuk1() {
        double result = InfoSetUtil.doubleValue(true);
        assertEquals(0.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueBooleanFalse_gLDb2() {
        double result = InfoSetUtil.doubleValue(false);
        assertEquals(1.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueStringEmpty_Tyws3() {
        double result = InfoSetUtil.doubleValue("");
        assertEquals(0.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueStringValid_PRxv4() {
        double result = InfoSetUtil.doubleValue("10.5");
        assertEquals(10.5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueStringInvalid_ouCe5() {
        double result = InfoSetUtil.doubleValue("abc");
        assertEquals(Double.NaN, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueObject_tsFu8() {
        double result = InfoSetUtil.doubleValue(new Object());
        assertEquals(Double.NaN, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumberTrue_jLXw0() {
        assertEquals(true, InfoSetUtil.booleanValue(new Double(1.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumberFalse_QGXu1() {
        assertEquals(false, InfoSetUtil.booleanValue(new Double(0.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumberNegativeZero_QVTa3() {
        assertEquals(false, InfoSetUtil.booleanValue(new Double(-0.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumberNaN_wkny4() {
        assertEquals(false, InfoSetUtil.booleanValue(Double.NaN));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueBooleanTrue_AIvO5() {
        assertEquals(true, InfoSetUtil.booleanValue(Boolean.TRUE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueBooleanFalse_tcJy6() {
        assertEquals(false, InfoSetUtil.booleanValue(Boolean.FALSE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueString_TcHs8() {
        assertEquals(true, InfoSetUtil.booleanValue("hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueStringEmpty_rUsm9() {
        assertEquals(false, InfoSetUtil.booleanValue(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNull_AGna12() {
        assertEquals(false, InfoSetUtil.booleanValue(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueOtherObject_OgxT13() {
        assertEquals(true, InfoSetUtil.booleanValue(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueString_KPTD0() {
        assertEquals("hello", InfoSetUtil.stringValue("hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_wpTX1_1() {
        assertEquals("123", InfoSetUtil.stringValue(123));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_wpTX1_2() {
        assertEquals("123.456", InfoSetUtil.stringValue(123.456));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueBoolean_djSW2_1() {
        assertEquals("true", InfoSetUtil.stringValue(true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueBoolean_djSW2_2() {
        assertEquals("false", InfoSetUtil.stringValue(false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNull_gZaJ3() {
        assertEquals("", InfoSetUtil.stringValue(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberStringNotANumber_BcyO5_CTQW1() {
        assertEquals("abc", InfoSetUtil.stringValue("abc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberObject_CCQa8_cWww0() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_wpTX1() {
        assertEquals("123", InfoSetUtil.stringValue(123));
        assertEquals("123.456", InfoSetUtil.stringValue(123.456));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueBoolean_djSW2() {
        assertEquals("true", InfoSetUtil.stringValue(true));
        assertEquals("false", InfoSetUtil.stringValue(false));
    }
}