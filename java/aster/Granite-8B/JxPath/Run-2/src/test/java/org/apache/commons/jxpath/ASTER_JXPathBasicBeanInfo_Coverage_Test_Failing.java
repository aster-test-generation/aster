/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.beans.PropertyDescriptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathBasicBeanInfo_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyDescriptor1_wgNH0() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(null, false);
        String propertyName = "";
        PropertyDescriptor result = jXPathBasicBeanInfo.getPropertyDescriptor(propertyName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_Sjxb0() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(null, false);
        jXPathBasicBeanInfo.toString();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_ksar1() {
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(null, true);
        jXPathBasicBeanInfo.toString();
    }
}