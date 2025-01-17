/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathIntrospector_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_ByClass_jBZa0_UKiw0() {
        Class<?> beanClass = JXPathBasicBeanInfo.class;
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(beanClass, true);
        JXPathIntrospector.registerAtomicClass(beanClass);
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertSame(beanInfo, result);
    }
}