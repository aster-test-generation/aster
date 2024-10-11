/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_InfoSetUtil_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithStringObject_PtfD2() {
        String object = new String();
        Number result = InfoSetUtil.number(object);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithStringValue_SIuM5() {
        String value = new String();
        Number result = InfoSetUtil.number(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithNull_mjRx7() {
        Number result = InfoSetUtil.number(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueNumber_wxrt0() {
        Number object = new Double(1.0);
        boolean expected = true;
        boolean actual = InfoSetUtil.booleanValue(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueBoolean_QwQC1() {
        Boolean object = Boolean.TRUE;
        boolean expected = true;
        boolean actual = InfoSetUtil.booleanValue(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueString_PcBV3() {
        String object = "test";
        boolean expected = true;
        boolean actual = InfoSetUtil.booleanValue(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBooleanValueObject_UvTj7() {
        Object object = new Object();
        boolean expected = true;
        boolean actual = InfoSetUtil.booleanValue(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue_String_ZVkW0() {
        String object = "test";
        String expected = "test";
        String actual = InfoSetUtil.stringValue(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue_Number_PmIT1() {
        Number object = 123;
        String expected = "123";
        String actual = InfoSetUtil.stringValue(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue_Boolean_yphr2() {
        Boolean object = true;
        String expected = "true";
        String actual = InfoSetUtil.stringValue(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue_Null_KOff3() {
        Object object = null;
        String expected = "";
        String actual = InfoSetUtil.stringValue(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue_OtherObject_pjjF6() {
        Object object = new Object();
        String expected = "java.lang.Object@";
        String actual = InfoSetUtil.stringValue(object);
        assertTrue(actual.startsWith(expected));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithBooleanObject_yBcN1_VYqp0() {
        Boolean object = new Boolean(false);
        Number result = InfoSetUtil.number(object);
        assertEquals(0, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithBooleanObject_yBcN1_ufVd1() {
        Boolean object = new Boolean(true);
        Number result = InfoSetUtil.number(object);
        assertEquals(1, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithBooleanObject_yBcN1_IoMh2() {
        Boolean object = null;
        Number result = InfoSetUtil.number(object);
        assertEquals(0, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithNumberObject_QbAr0_NHch0() {
        Number object = new Double(0);
        assertEquals("0", InfoSetUtil.stringValue(object));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_ItDS6_dFAY4() {
        Number object = mock(Number.class);
        when(object.byteValue()).thenReturn((byte) 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_ItDS6_JQEl5() {
        Number object = mock(Number.class);
        when(object.shortValue()).thenReturn((short) 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_ItDS6_bizu6() {
        Number object = mock(Number.class);
        when(object.intValue()).thenReturn(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_ItDS6_onWz7() {
        Number object = mock(Number.class);
        when(object.floatValue()).thenReturn(0.0f);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueNumber_ItDS6_wRBG8() {
        Number object = mock(Number.class);
        when(object.doubleValue()).thenReturn(0.0);
    }
}