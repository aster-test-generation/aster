/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathIntrospector_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_WithExistingBeanInfo_kRDd1() {
        Class<?> beanClass = JXPathBeanInfo.class; // JXPathBeanInfo is its own BeanInfo
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertTrue(result instanceof JXPathBeanInfo);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWhenBeanIsItsOwnBeanInfo_PvqS2_1() {
        Class<?> beanClass = JXPathBeanInfo.class;
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWhenBeanIsItsOwnBeanInfo_PvqS2_2() {
        Class<?> beanClass = JXPathBeanInfo.class;
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertTrue(result instanceof JXPathBeanInfo);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterAtomicClass_rrew0_XJPD0_1() {
    Class testClass = String.class;
    JXPathIntrospector.registerAtomicClass(testClass);
    assertTrue(JXPathIntrospector.getBeanInfo(testClass) instanceof JXPathBasicBeanInfo);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterAtomicClass_rrew0_XJPD0_2() {
    Class testClass = String.class;
    JXPathIntrospector.registerAtomicClass(testClass);
    assertNotNull(JXPathIntrospector.getBeanInfo(testClass));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWhenBeanIsItsOwnBeanInfo_PvqS2() {
        Class<?> beanClass = JXPathBeanInfo.class;
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(result);
        assertTrue(result instanceof JXPathBeanInfo);
    }
}