/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.beans.PropertyDescriptor;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathBasicBeanInfo_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringDynamic_MARp1_fid2() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, false);
        String result = beanInfo.toString();
        assert result.contains("dynamic");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringAtomicDynamic_fVSz2_fid2() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, true);
        String result = beanInfo.toString();
        assert result.contains("atomic");
        assert result.contains("dynamic");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptor1_BxZm0_fid2() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(String.class, true);
        PropertyDescriptor propertyDescriptor = jXPathBasicBeanInfo.getPropertyDescriptor("propertyName");
        assertNotNull(propertyDescriptor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptor2_hWvm1_fid2() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(String.class);
        PropertyDescriptor propertyDescriptor = jXPathBasicBeanInfo.getPropertyDescriptor("propertyName");
        assertNotNull(propertyDescriptor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptor3_IYPk2_fid2() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(String.class, String.class);
        PropertyDescriptor propertyDescriptor = jXPathBasicBeanInfo.getPropertyDescriptor("propertyName");
        assertNotNull(propertyDescriptor);
    }
}