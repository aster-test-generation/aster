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
    public void testNumberWithStringObject_nFeN4() {
        String str = "123";
        Number result = InfoSetUtil.number(str);
        assertEquals(result, Double.valueOf(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_object_Number_vmha0() {
        Number number = new Integer(1);
        boolean actual = InfoSetUtil.booleanValue(number);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_object_Boolean_AEQx1() {
        Boolean booleanValue = new Boolean(true);
        boolean actual = InfoSetUtil.booleanValue(booleanValue);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_object_String_sNbx3() {
        String str = "test";
        boolean actual = InfoSetUtil.booleanValue(str);
        boolean expected = str.length() != 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_object_Object_NTnI5() {
        Object object = new Object();
        boolean actual = InfoSetUtil.booleanValue(object);
        boolean expected = object != null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_Boolean_JTBL3() {
        Boolean bool = new Boolean(true);
        double result = InfoSetUtil.doubleValue(bool);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_stringValue_String_iTIT0() {
        String object = "test";
        String result = InfoSetUtil.stringValue(object);
        assertEquals("test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_stringValue_Boolean_TGxB2() {
        Boolean object = true;
        String result = InfoSetUtil.stringValue(object);
        assertEquals("true", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_stringValue_Null_jrVK3() {
        Object object = null;
        String result = InfoSetUtil.stringValue(object);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_String_Tnal4_fid1() {
        String str = "123";
        double result = InfoSetUtil.doubleValue(str);
        assertEquals(0.0, result, 123.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_Number_SStA2_DWFs0() {
        Number number = new Double(0.0);
        double result = InfoSetUtil.doubleValue(number);
        assertEquals(0.0, result, 0.0);
    }
}