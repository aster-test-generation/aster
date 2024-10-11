/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.beans.PropertyDescriptor;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathBasicBeanInfo_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsWithNullPropertyDescriptors_RRGs0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        assertNotNull(descriptors);
        assertEquals(0, descriptors.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsWithInterfaceClass_KHbe1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Runnable.class);
        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        assertNotNull(descriptors);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsWithNullPropertyDescriptors_RRGs0_1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        assertNotNull(descriptors);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsWithNullPropertyDescriptors_RRGs0_2() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        assertEquals(0, descriptors.length);}
}