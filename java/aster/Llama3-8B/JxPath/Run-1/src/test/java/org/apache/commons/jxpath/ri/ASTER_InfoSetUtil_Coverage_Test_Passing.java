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

public class Aster_InfoSetUtil_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberInstanceOfNumber_LwYL0() {
        Number number = new Integer(1);
        assertEquals(number, InfoSetUtil.number(number));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberInstanceOfString_ytSB3() {
        String stringObject = "1.0";
        assertEquals(new Double(1.0), InfoSetUtil.number(stringObject));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberInstanceOfStringValue_WxNL7() {
        String stringValue = "1.0";
        assertEquals(new Double(1.0), InfoSetUtil.number(stringValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueNumber_HSSe0() {
        assertEquals(1.0, InfoSetUtil.doubleValue(1), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueBooleanTrue_XNKn1() {
        assertEquals(0.0, InfoSetUtil.doubleValue(true), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueBooleanFalse_maAK2() {
        assertEquals(1.0, InfoSetUtil.doubleValue(false), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueString_imBJ3() {
        assertEquals(1.0, InfoSetUtil.doubleValue("1"), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueStringEmpty_XTRP4() {
        assertEquals(0.0, InfoSetUtil.doubleValue(""), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValue_NumberValueNotZeroNorNaN_fqSk0() {
        assertEquals(true, InfoSetUtil.booleanValue(new Double(1.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValue_NumberValueZero_GynH1() {
        assertEquals(false, InfoSetUtil.booleanValue(new Double(0.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValue_NumberValueNegativeZero_BISH2() {
        assertEquals(false, InfoSetUtil.booleanValue(new Double(-0.0)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValue_NumberValueNaN_YXsK3() {
        assertEquals(false, InfoSetUtil.booleanValue(Double.NaN));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValue_BooleanValueTrue_Hjwu4() {
        assertEquals(true, InfoSetUtil.booleanValue(Boolean.TRUE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValue_BooleanValueFalse_BJbt5() {
        assertEquals(false, InfoSetUtil.booleanValue(Boolean.FALSE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValue_StringValueNotEmpty_shhN7() {
        assertEquals(true, InfoSetUtil.booleanValue("test"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValue_StringValueEmpty_xcVU8() {
        assertEquals(false, InfoSetUtil.booleanValue(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberInstanceOfStringNumberFormatException_YdTu4_HVwV0() {
        String stringObject = "abc";
        assertEquals("abc", InfoSetUtil.stringValue(stringObject));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberInstanceOfStringValueNumberFormatException_bcmt8_uVqn1() {
        String stringValue = "abc";
        assertEquals("abc", InfoSetUtil.stringValue(stringValue));
    }
}