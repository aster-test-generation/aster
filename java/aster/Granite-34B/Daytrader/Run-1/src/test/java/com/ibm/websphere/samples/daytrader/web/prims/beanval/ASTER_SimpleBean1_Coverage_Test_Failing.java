/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.validation.ConstraintViolation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SimpleBean1_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatConstraintViolations1_VoaK0() throws Exception {
        SimpleBean1 simpleBean1 = new SimpleBean1();
        Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<ConstraintViolation<SimpleBean1>>();
        String result = simpleBean1.formatConstraintViolations(cvSet);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDescTest1_CLtH0_QCpt0() {
        SimpleBean1 simpleBean1 = null;
        try {
            simpleBean1 = new SimpleBean1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String actual = simpleBean1.getDesc();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_OgxY0_yXEp0() throws Exception {
        SimpleBean1 simple = new SimpleBean1();
        assertEquals("iMin:0 iMax:0 iMinArray:0 iMaxArray:0 pattern:null setToFail:null", simple.toString());
    }
}