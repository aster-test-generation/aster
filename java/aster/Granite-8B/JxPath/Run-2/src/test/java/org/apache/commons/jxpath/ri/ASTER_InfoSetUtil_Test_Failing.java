/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_InfoSetUtil_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueObject_yOjk7() {
        String result = InfoSetUtil.stringValue(new Object());
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueObject_yOjk7_fid3() {
        String result = InfoSetUtil.stringValue(new Object());
        assertEquals("null", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueBooleanTrue_iSNK1_fid3() {
        Boolean bool = new Boolean(true);
        assertEquals(1.0, InfoSetUtil.doubleValue(bool), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleValueBooleanFalse_VPpq2_fid3() {
        Boolean bool = new Boolean(false);
        assertEquals(0.0, InfoSetUtil.doubleValue(bool), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue8_pUaD7_fid3() {
        Object object = new Object();
        assertEquals("java.lang.Object@", InfoSetUtil.stringValue(object));
    }
}