/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BeanPointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLeaf_withAtomicBeanInfo_UXvP0() {
    JXPathIntrospector jXPathIntrospector = mock(JXPathIntrospector.class);
    JXPathBasicBeanInfo beanInfo = mock(JXPathBasicBeanInfo.class);
    when(beanInfo.isAtomic()).thenReturn(true);
    when(jXPathIntrospector.getBeanInfo(any(Class.class))).thenReturn(beanInfo);
    QName name = new QName("test");
    BeanPointer beanPointer = new BeanPointer(name, new Object(), beanInfo, Locale.US);
    boolean result = beanPointer.isLeaf();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_ReturnsFalse_oGSW1() {
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en"));
        Object obj = new Object();
        assert !beanPointer1.equals(obj);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NameIsNull_TWxa2() {
        BeanPointer beanPointer1 = new BeanPointer(null, new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en"));
        BeanPointer beanPointer2 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en"));
        assert !beanPointer1.equals(beanPointer2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BeanIsNumber_WlEd5() {
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), 1, new JXPathBasicBeanInfo(Number.class), new Locale("en"));
        BeanPointer beanPointer2 = new BeanPointer(new QName("name"), 1, new JXPathBasicBeanInfo(Number.class), new Locale("en"));
        assert beanPointer1.equals(beanPointer2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BeanIsString_jQPh6() {
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), "str", new JXPathBasicBeanInfo(String.class), new Locale("en"));
        BeanPointer beanPointer2 = new BeanPointer(new QName("name"), "str", new JXPathBasicBeanInfo(String.class), new Locale("en"));
        assert beanPointer1.equals(beanPointer2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BeanIsBoolean_HuPk7() {
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), true, new JXPathBasicBeanInfo(Boolean.class), new Locale("en"));
        BeanPointer beanPointer2 = new BeanPointer(new QName("name"), true, new JXPathBasicBeanInfo(Boolean.class), new Locale("en"));
        assert beanPointer1.equals(beanPointer2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BeanIsNotPrimitive_cgHq8() {
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en"));
        BeanPointer beanPointer2 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en"));
        assert !beanPointer1.equals(beanPointer2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_IndexEquals_qaAe4_mYrt0_fid2() {
    BeanPointer beanPointer1 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en"));
    BeanPointer beanPointer2 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en"));
}
}