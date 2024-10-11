/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_InfoSetUtil_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_Number_oONe2() {
        Number number = new Double(1.0);
        double result = InfoSetUtil.doubleValue(number);
        assertEquals(1.0, result, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_Boolean_WDtd3() {
        Boolean bool = new Boolean(true);
        double result = InfoSetUtil.doubleValue(bool);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_String_EPRS4() {
        String str = "1.0";
        double result = InfoSetUtil.doubleValue(str);
        assertEquals(1.0, result, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_number_object_VwSc0() {
        Object object = new Object();
        Number result = InfoSetUtil.number(object);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_number_boolean_EVsw1() {
        Boolean object = new Boolean(true);
        Number result = InfoSetUtil.number(object);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_number_string_EjOA2() {
        String object = new String("123");
        Number result = InfoSetUtil.number(object);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_number_number_fGfn5() {
        Number object = new Double(123.45);
        Number result = InfoSetUtil.number(object);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_number_zero_lsqZ6() {
        Number result = InfoSetUtil.number(new Boolean(false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_number_notANumber_zASI7() {
        Number result = InfoSetUtil.number(new String("abc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_number_null_gGwq8() {
        Number result = InfoSetUtil.number(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_stringValue_001_MgmI0() {
        Object object = new String("test");
        String result = InfoSetUtil.stringValue(object);
        assertEquals("test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_stringValue_002_PQsT1() {
        Object object = new Double(1.23);
        String result = InfoSetUtil.stringValue(object);
        assertEquals("1.23", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_stringValue_003_kXhm2() {
        Object object = new Boolean(true);
        String result = InfoSetUtil.stringValue(object);
        assertEquals("true", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_12_cmPJ11() {
        Object object = new String();
        boolean actualValue = InfoSetUtil.booleanValue(object);
        boolean expectedValue = false;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_stringValue_004_Mpla3_OaVF0() {
        Object object = mock(NodePointer.class);
        String result = InfoSetUtil.stringValue(object);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_2_JeSi1_shas0() {
        Object object = new Boolean(true);
        boolean actualValue = InfoSetUtil.booleanValue(object);
        boolean expectedValue = true;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_1_xjsM0_tIlf0() {
        Object object = new Double(0.0);
        boolean actualValue = InfoSetUtil.booleanValue(object);
        boolean expectedValue = false;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_5_HIdm4_RRYE0() {
        Object object = new Object();
        boolean actualValue = InfoSetUtil.booleanValue(object);
        boolean expectedValue = true;
        assertEquals(expectedValue, actualValue);
    }
}