/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.beans.PropertyDescriptor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathBasicBeanInfo_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringDynamic_WslV0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
        String result = beanInfo.toString();
        System.out.println(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsNull_mliM0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        assertNotNull(propertyDescriptors);
        assertArrayEquals(new PropertyDescriptor[0], propertyDescriptors);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptor_brNn0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
        PropertyDescriptor propertyDescriptor = beanInfo.getPropertyDescriptor("propertyName");
        assertNull(propertyDescriptor);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorNullProperty_dJii2() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
        PropertyDescriptor propertyDescriptor = beanInfo.getPropertyDescriptor(null);
        assertNull(propertyDescriptor);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorEmptyProperty_tiXk3() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
        PropertyDescriptor propertyDescriptor = beanInfo.getPropertyDescriptor("");
        assertNull(propertyDescriptor);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorNonExistingProperty_BNHJ4() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
        PropertyDescriptor propertyDescriptor = beanInfo.getPropertyDescriptor("nonExistingProperty");
        assertNull(propertyDescriptor);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors_JwUn7() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        assertNotNull(propertyDescriptors);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsNull_mliM0_1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        assertNotNull(propertyDescriptors);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsNull_mliM0_2() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        assertArrayEquals(new PropertyDescriptor[0], propertyDescriptors);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsEmpty_kEnc9_fid1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        assertEquals(50, propertyDescriptors.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyDescriptorMapNull_ETtK6_rGsc1() {
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
    assertFalse(beanInfo.isDynamic());
}
}