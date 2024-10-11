/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathBasicBeanInfo_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyDescriptors1_RJIW0() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(Object.class, true);
        jXPathBasicBeanInfo.getPropertyDescriptors();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyDescriptors2_PuUZ1() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(Object.class);
        jXPathBasicBeanInfo.getPropertyDescriptors();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyDescriptors3_IrES2() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(Object.class, Object.class);
        jXPathBasicBeanInfo.getPropertyDescriptors();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString12_vwZP11() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(Class.class, Class.class);
        String actual = jXPathBasicBeanInfo.toString();
    }
}