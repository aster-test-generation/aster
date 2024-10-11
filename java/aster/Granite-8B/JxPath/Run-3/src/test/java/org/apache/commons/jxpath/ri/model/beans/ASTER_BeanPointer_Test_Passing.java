/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointer_Test_Passing {
    private Object bean;
    private QName name;
    private Locale locale;
    private VariablePointer parent;
    private KeywordVariables variables;
    private Class clazz;
    private Class dynamicPropertyHandlerClass;
    private JXPathBasicBeanInfo beanInfo;
    private BeanPointer beanpointer;
    private BeanPointer beanPointer;
    private KeywordVariables keywordVariables;
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() {
        locale = Locale.getDefault();
        parent = mock(VariablePointer.class);
        variables = mock(KeywordVariables.class);
        clazz = mock(Class.class);
        dynamicPropertyHandlerClass = mock(Class.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        bean = mock(Object.class);
        name = mock(QName.class);
        beanpointer = new BeanPointer(parent, name, bean, beanInfo);
        // Test when object is same as this
        // Test when object is not an instance of BeanPointer
        // Test when parent is not equal
        BeanPointer other = new BeanPointer(mock(VariablePointer.class), name, bean, beanInfo);
        // Test when name is not equal
        other = new BeanPointer(parent, mock(QName.class), bean, beanInfo);
        // Test when index is not equal
        other = new BeanPointer(parent, name, bean, beanInfo);
        when(beanpointer.getIndex()).thenReturn(1);
        when(other.getIndex()).thenReturn(2);
        // Test when bean is not equal
        other = new BeanPointer(parent, name, mock(Object.class), beanInfo);
        // Test when beanInfo is not equal
        other = new BeanPointer(parent, name, bean, mock(JXPathBasicBeanInfo.class));
        assertTrue(beanpointer.equals(beanpointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2() {
        locale = Locale.getDefault();
        parent = mock(VariablePointer.class);
        variables = mock(KeywordVariables.class);
        clazz = mock(Class.class);
        dynamicPropertyHandlerClass = mock(Class.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        bean = mock(Object.class);
        name = mock(QName.class);
        beanpointer = new BeanPointer(parent, name, bean, beanInfo);
        // Test when object is same as this
        // Test when object is not an instance of BeanPointer
        // Test when parent is not equal
        BeanPointer other = new BeanPointer(mock(VariablePointer.class), name, bean, beanInfo);
        // Test when name is not equal
        other = new BeanPointer(parent, mock(QName.class), bean, beanInfo);
        // Test when index is not equal
        other = new BeanPointer(parent, name, bean, beanInfo);
        when(beanpointer.getIndex()).thenReturn(1);
        when(other.getIndex()).thenReturn(2);
        // Test when bean is not equal
        other = new BeanPointer(parent, name, mock(Object.class), beanInfo);
        // Test when beanInfo is not equal
        other = new BeanPointer(parent, name, bean, mock(JXPathBasicBeanInfo.class));
        assertFalse(beanpointer.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3() {
        locale = Locale.getDefault();
        parent = mock(VariablePointer.class);
        variables = mock(KeywordVariables.class);
        clazz = mock(Class.class);
        dynamicPropertyHandlerClass = mock(Class.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        bean = mock(Object.class);
        name = mock(QName.class);
        beanpointer = new BeanPointer(parent, name, bean, beanInfo);
        // Test when object is same as this
        // Test when object is not an instance of BeanPointer
        // Test when parent is not equal
        BeanPointer other = new BeanPointer(mock(VariablePointer.class), name, bean, beanInfo);
        // Test when name is not equal
        other = new BeanPointer(parent, mock(QName.class), bean, beanInfo);
        // Test when index is not equal
        other = new BeanPointer(parent, name, bean, beanInfo);
        when(beanpointer.getIndex()).thenReturn(1);
        when(other.getIndex()).thenReturn(2);
        // Test when bean is not equal
        other = new BeanPointer(parent, name, mock(Object.class), beanInfo);
        // Test when beanInfo is not equal
        other = new BeanPointer(parent, name, bean, mock(JXPathBasicBeanInfo.class));
        assertFalse(beanpointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyPointer() throws Exception {
        beanpointer = new BeanPointer(Mockito.mock(DOMNodePointer.class), Mockito.mock(QName.class), Mockito.mock(Object.class), beanInfo);
        PropertyPointer propertyPointer = beanpointer.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_hQlv0() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Class.class), Locale.getDefault());
        assertEquals("name", beanPointer.getName().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() {
        locale = Locale.getDefault();
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(bean.getClass());
        beanPointer = new BeanPointer(new QName("name"), bean, beanInfo, locale);
        when(beanInfo.isAtomic()).thenReturn(true);
        assertEquals(1, beanPointer.getLength());
        when(beanInfo.isAtomic()).thenReturn(false);
        assertEquals(1, beanPointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_JURS1() {
        Number number = new Double(1.0);
        BeanPointer beanPointer = new BeanPointer(null, number, null, null);
        assertEquals("1.0", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath3_QDZk2() {
        Boolean bool = new Boolean(true);
        BeanPointer beanPointer = new BeanPointer(null, bool, null, null);
        assertEquals("true()", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath4_oDtn3() {
        String string = "test";
        BeanPointer beanPointer = new BeanPointer(null, string, null, null);
        assertEquals("'test'", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath5_VxYT4() {
        Locale locale = Locale.getDefault();
        BeanPointer beanPointer = new BeanPointer(null, null, null, locale);
        assertEquals("/", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath6_CUKa5() {
        Locale locale = Locale.getDefault();
        Number number = new Double(1.0);
        BeanPointer beanPointer = new BeanPointer(null, number, null, locale);
        assertEquals("1.0", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath7_GZZN6() {
        Locale locale = Locale.getDefault();
        Boolean bool = new Boolean(true);
        BeanPointer beanPointer = new BeanPointer(null, bool, null, locale);
        assertEquals("true()", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath8_kTfG7() {
        Locale locale = Locale.getDefault();
        String string = "test";
        BeanPointer beanPointer = new BeanPointer(null, string, null, locale);
        assertEquals("'test'", beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        locale = mock(Locale.class);
        keywordVariables = mock(KeywordVariables.class);
        jXPathBasicBeanInfo = mock(JXPathBasicBeanInfo.class);
        bean = mock(Object.class);
        name = mock(QName.class);
        beanpointer = new BeanPointer(name, bean, jXPathBasicBeanInfo, locale);
        when(jXPathBasicBeanInfo.isAtomic()).thenReturn(true);
        assertTrue(beanpointer.isLeaf());
        when(jXPathBasicBeanInfo.isAtomic()).thenReturn(false);
        assertFalse(beanpointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_UxcH0() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.getDefault());
        assertFalse(beanPointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf1_rvTW0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        boolean result = domNodePointer.isLeaf();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf2_jzgF1() {
        VariablePointer variablePointer = new VariablePointer(null, null);
        boolean result = variablePointer.isLeaf();
        assertTrue(result);
    }
}