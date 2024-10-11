/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointer_Test_Passing {
    private Object bean;
    private QName name;
    private DOMNodePointer parent;
    private JXPathBasicBeanInfo beanInfo;
    private Locale locale;
    BeanPointer beanpointer;
    BeanPointer otherBeanPointer;
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;
    @Mock
    private JXPathIntrospector jXPathIntrospector;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_StringBean() throws Exception {
        name = new QName("test");
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.US;
        bean = "testString";
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("'testString'", beanpointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_NullBean() throws Exception {
        name = new QName("test");
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.US;
        bean = "testString";
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        bean = null;
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("null()", beanpointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_BooleanBean() throws Exception {
        name = new QName("test");
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.US;
        bean = "testString";
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        bean = true;
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("true()", beanpointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_NumberBean() throws Exception {
        name = new QName("test");
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.US;
        bean = "testString";
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        bean = 10.0;
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("10", beanpointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_Default() throws Exception {
        name = new QName("test");
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.US;
        bean = "testString";
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        bean = new Object();
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("/", beanpointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_jcvV0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        Object bean = new Object();
        QName name = new QName("qualifiedName");
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        QName result = beanPointer.getName();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        Locale locale = Locale.US;
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        int length = beanpointer.getLength();
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_AceR0() {
        Locale locale = new Locale("en", "US");
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        QName name = new QName("prefix", "localName");
        Object bean = new Object();
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        name = new QName("test");
        locale = Locale.US;
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        Object result = beanpointer.getBaseValue();
        assertEquals(bean, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        Locale locale = Locale.US;
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        assertFalse(beanpointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_CVxF0() {
        QName name = new QName("qualifiedName");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertFalse(beanPointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNullValue_OQJm0() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), null, new JXPathBasicBeanInfo(Object.class, true), Locale.US);
        assertTrue(beanPointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafAtomicValue_eomQ1() {
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(bean.getClass(), true);
        BeanPointer beanPointer = new BeanPointer(new QName("name"), bean, beanInfo, Locale.US);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNonAtomicValue_isAn2() {
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(bean.getClass());
        BeanPointer beanPointer = new BeanPointer(new QName("name"), bean, beanInfo, Locale.US);
        assertFalse(beanPointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_NameNotNull_EYjg0() {
        QName name = new QName("qualifiedName");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = Locale.US;
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertNotEquals(0, beanPointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_NameNull_ijbj1() {
        QName name = null;
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = Locale.US;
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals(0, beanPointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_withNullBean_Kmpq1() {
        QName name = new QName("prefix", "localName");
        Object bean = null;
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("null()", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_withNumberBean_LtYY2() {
        QName name = new QName("prefix", "localName");
        Object bean = new Integer(10);
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("10", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_withBooleanBean_true_DQWC3() {
        QName name = new QName("prefix", "localName");
        Object bean = Boolean.TRUE;
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("true()", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_withBooleanBean_false_mvtI4() {
        QName name = new QName("prefix", "localName");
        Object bean = Boolean.FALSE;
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("false()", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_withStringBean_SeLw5() {
        QName name = new QName("prefix", "localName");
        Object bean = "string";
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("'string'", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_withObjectBean_dsOk6() {
        QName name = new QName("prefix", "localName");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("/", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_withDecimalNumberBean_nHOh7() {
        QName name = new QName("prefix", "localName");
        Object bean = new Double(10.0);
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        Locale locale = new Locale("en", "US");
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertEquals("10", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_nKoQ0() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertTrue(beanPointer.equals(beanPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_yxIT1() {
        Object obj = new Object();
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertFalse(beanPointer.equals(obj));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_WxOd2() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertFalse(beanPointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameName_cOhI6() {
        QName name = new QName("name");
        BeanPointer beanPointer1 = new BeanPointer(name, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        BeanPointer beanPointer2 = new BeanPointer(name, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_sdiF7() {
        QName name1 = new QName("name1");
        QName name2 = new QName("name2");
        BeanPointer beanPointer1 = new BeanPointer(name1, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        BeanPointer beanPointer2 = new BeanPointer(name2, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertFalse(beanPointer1.equals(beanPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullName_wSKU8() {
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        BeanPointer beanPointer2 = new BeanPointer(null, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertFalse(beanPointer1.equals(beanPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameIndex_VoxX9() {
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        BeanPointer beanPointer2 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertFalse(beanPointer1.equals(beanPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentIndex_zygu10() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameBean_RdaQ11() {
        Object bean = new Object();
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), bean, new JXPathBasicBeanInfo(Object.class), Locale.US);
        BeanPointer beanPointer2 = new BeanPointer(new QName("name"), bean, new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertTrue(beanPointer1.equals(beanPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_BYep0() throws Exception {
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(Object.class);
        Locale locale = Locale.US;
        BeanPointer beanpointer = new BeanPointer(name, bean, jXPathBasicBeanInfo, locale);
        PropertyPointer propertyPointer = beanpointer.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ReturnsFalse_SDgE0() throws Exception {
        bean = new Object();
        name = new QName("qualifiedName");
        parent = null;
        beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        locale = new Locale("en", "US");
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        otherBeanPointer = new BeanPointer(name, bean, beanInfo, locale);
        assertFalse(beanpointer.equals(new Object()));
    }
}