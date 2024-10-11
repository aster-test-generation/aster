/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointer_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_UuRU0() throws Exception {
        QName expected = new QName("expected");
        Locale locale = new Locale("en", "US");
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(BeanPointer.class, false);
        Object bean = new Object();
        BeanPointer beanPointer = new BeanPointer(new QName("name"), bean, beanInfo, locale);
        QName actual = beanPointer.getName();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameParentSameNameSameBeanSameIndexSameBeanSameLocaleSameBeanInfoDifferentBeanInfo_QpKS14() throws Exception {
    BeanPointer beanPointer1 = new BeanPointer(null, null, null, new JXPathBasicBeanInfo(null, false));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNotNullParent_OpqZ1() throws Exception {
        BeanPointer beanPointer = new BeanPointer(new DOMNodePointer(null, null, null), null, null, null);
        assertEquals("/null", beanPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNumberBean_UiLx3() throws Exception {
        BeanPointer beanPointer = new BeanPointer(null, 10, new JXPathBasicBeanInfo(null, false), null);
        assertEquals("10", beanPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNumberBeanWithDecimal_LhYt4() throws Exception {
        BeanPointer beanPointer = new BeanPointer(null, 10.5, new JXPathBasicBeanInfo(null, false), null);
        assertEquals("10.5", beanPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathBooleanBean_GkDR5() throws Exception {
        BeanPointer beanPointer = new BeanPointer(null, true, new JXPathBasicBeanInfo(null, false), null);
        assertEquals("true()", beanPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathStringBean_HnTL6() throws Exception {
        BeanPointer beanPointer = new BeanPointer(null, "test", new JXPathBasicBeanInfo(null, false), null);
        assertEquals("'test'", beanPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathOtherBean_NtdO7() throws Exception {
        BeanPointer beanPointer = new BeanPointer(null, new Object(), new JXPathBasicBeanInfo(null, false), null);
        assertEquals("/", beanPointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_CYQY0() throws Exception {
        QName name = new QName("name");
        Object bean = "bean";
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, true);
        Locale locale = Locale.US;
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals(bean, beanPointer.getBaseValue());
    }
}