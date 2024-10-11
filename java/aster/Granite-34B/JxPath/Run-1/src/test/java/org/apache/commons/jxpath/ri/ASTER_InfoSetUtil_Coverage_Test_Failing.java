/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_InfoSetUtil_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_4_UoNK3() {
        Object object = new String();
        boolean actualValue = InfoSetUtil.booleanValue(object);
        boolean expectedValue = true;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_Pointer_uPKk5_LXOG0() {
        Pointer pointer = mock(Pointer.class);
        double result = InfoSetUtil.doubleValue(pointer);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_1_xjsM0_tIlf0_fid2() {
        Object object = new Double(0.0);
        boolean actualValue = InfoSetUtil.booleanValue(object);
        boolean expectedValue = true;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_booleanValue_10_qDrj9_duqb0_fid2() {
        Object object = new Boolean(true);
        boolean actualValue = InfoSetUtil.booleanValue(object);
        boolean expectedValue = false;
        assertEquals(expectedValue, actualValue);
    }
}