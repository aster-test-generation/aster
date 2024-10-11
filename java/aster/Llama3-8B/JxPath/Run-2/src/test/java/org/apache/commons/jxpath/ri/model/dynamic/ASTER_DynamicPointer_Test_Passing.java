/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPointer_Test_Passing {
@Mock
    private PageContextHandler pageContextHandler;
@Mock
    private Locale locale;
@Mock
    private QName name;
@Mock
    private Object bean;
@Mock
    private PageContextHandler handler;
private DynamicPointer dynamicpointer;
@Mock
    private PropertyPointer propertyPointer;
@Mock
    private DynamicPointer parent;
@Mock
    private Object node;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDynamicPropertyDeclarationSupported_AMmJ0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        Locale locale = new Locale("en", "US");
        QName qName = new QName("testName");
        Object bean = new Object();
        DynamicPointer dynamicPointer = new DynamicPointer(qName, bean, pageContextHandler, locale);
        boolean result = dynamicPointer.isDynamicPropertyDeclarationSupported();
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() throws Exception {
        dynamicpointer = new DynamicPointer(name, bean, handler, locale);
        // Test with same object
        // Test with different object
        DynamicPointer other = new DynamicPointer(name, bean, handler, locale);
        // Test with different bean
        other = new DynamicPointer(name, new Object(), handler, locale);
        // Test with different name
        other = new DynamicPointer(new QName("newName"), bean, handler, locale);
        // Test with null bean
        other = new DynamicPointer(name, null, handler, locale);
        // Test with null name
        other = new DynamicPointer(null, bean, handler, locale);
        assertEquals(dynamicpointer, dynamicpointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2() throws Exception {
        dynamicpointer = new DynamicPointer(name, bean, handler, locale);
        // Test with same object
        // Test with different object
        DynamicPointer other = new DynamicPointer(name, bean, handler, locale);
        // Test with different bean
        other = new DynamicPointer(name, new Object(), handler, locale);
        // Test with different name
        other = new DynamicPointer(new QName("newName"), bean, handler, locale);
        // Test with null bean
        other = new DynamicPointer(name, null, handler, locale);
        // Test with null name
        other = new DynamicPointer(null, bean, handler, locale);
        assertNotEquals(dynamicpointer, other);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_xnch0() {
    DynamicPointer dp = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("locale"));
    boolean result = dp.equals(dp);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_Gdlg1() {
    DynamicPointer dp = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("locale"));
    boolean result = dp.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_cQKg2() {
    DynamicPointer dp = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("locale"));
    boolean result = dp.equals(new Object());
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentName_iNHy4() {
    DynamicPointer dp1 = new DynamicPointer(new QName("name1"), new Object(), new PageContextHandler(), new Locale("locale"));
    DynamicPointer dp2 = new DynamicPointer(new QName("name2"), new Object(), new PageContextHandler(), new Locale("locale"));
    boolean result = dp1.equals(dp2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_EGtS0() {
        QName qName = new QName("name", "localName");
        Object bean = new Object();
        PageContextHandler handler = new PageContextHandler();
        Locale locale = new Locale("en", "US");
        DynamicPointer dynamicPointer = new DynamicPointer(qName, bean, handler, locale);
        boolean result = dynamicPointer.isCollection();
        assert (!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithBeanAndName_riuc0() {
    QName name = new QName("prefix", "localName");
    Object bean = new Object();
    PageContextHandler handler = new PageContextHandler();
    Locale locale = Locale.US;
    DynamicPointer dynamicPointer = new DynamicPointer(name, bean, handler, locale);
    int hashCode = dynamicPointer.hashCode();
    assertEquals(hashCode, System.identityHashCode(bean) + (name != null ? name.hashCode() : 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithoutName_JUeN1() {
    QName name = null;
    Object bean = new Object();
    PageContextHandler handler = new PageContextHandler();
    Locale locale = Locale.US;
    DynamicPointer dynamicPointer = new DynamicPointer(name, bean, handler, locale);
    int hashCode = dynamicPointer.hashCode();
    assertEquals(hashCode, System.identityHashCode(bean));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_ffnL0() {
        QName name = new QName("qualifiedName");
        PageContextHandler handler = new PageContextHandler();
        Locale locale = new Locale("en", "US");
        Object bean = new Object();
        DynamicPointer dynamicPointer = new DynamicPointer(null, bean, handler, locale);
        NodeIterator result = dynamicPointer.attributeIterator(name);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIteratorWithParent_XEcH1() {
        QName name = new QName("qualifiedName");
        PageContextHandler handler = new PageContextHandler();
        Locale locale = new Locale("en", "US");
        Object bean = new Object();
        DynamicPointer parent = new DynamicPointer(null, null, handler, locale);
        DynamicPointer dynamicPointer = new DynamicPointer(parent, name, bean, handler);
        NodeIterator result = dynamicPointer.attributeIterator(name);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_eKqY0() {
        PageContextHandler handler = new PageContextHandler();
        QName name = new QName("someName");
        Object bean = new Object();
        Locale locale = new Locale("en", "US");
        DynamicPointer dynamicPointer = new DynamicPointer(name, bean, handler, locale);
        PropertyPointer propertyPointer = dynamicPointer.getPropertyPointer();
        assert propertyPointer instanceof DynamicPropertyPointer;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathNullParent_jlbi0() {
    DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("locale"));
    String result = dynamicPointer.asPath();
    Assertions.assertEquals("/", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() {
        DynamicPointer dynamicpointer = new DynamicPointer(new QName("name"), new Object(), pageContextHandler, locale);
        int expectedLength = 1;
        int actualLength = dynamicpointer.getLength();
        assertEquals(expectedLength, actualLength);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_dWzW0() {
        QName qName = new QName("name");
        Object bean = new Object();
        PageContextHandler handler = new PageContextHandler();
        Locale locale = new Locale("en", "US");
        DynamicPointer dynamicPointer = new DynamicPointer(qName, bean, handler, locale);
        int length = dynamicPointer.getLength();
        assert length == 1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception{
        dynamicpointer = new DynamicPointer(null, bean, null, null);
        // Arrange
        // Act
        Object baseValue = dynamicpointer.getBaseValue();
        // Assert
        assertEquals(bean, baseValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_phkC0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        Locale locale = new Locale("en", "US");
        QName qName = new QName("myName");
        Object bean = new Object();
        DynamicPointer dynamicPointer = new DynamicPointer(qName, bean, pageContextHandler, locale);
        assertEquals(bean, dynamicPointer.getBaseValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyPointer_iTAk0() throws Exception{
    DynamicPointer dynamicpointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("en"));
    PropertyPointer result = dynamicpointer.getPropertyPointer();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisDynamicPropertyDeclarationSupported_I_QPgb0() {
    DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), pageContextHandler, locale);
    DynamicPointer otherDynamicPointer = new DynamicPointer(new QName("name"), new Object(), pageContextHandler, locale);
    boolean result = otherDynamicPointer.isLeaf();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentBean_Usat3_LcKW0() {
    DynamicPointer dp1 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("locale"));
    DynamicPointer dp2 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("locale"));
    boolean result = dp1.equals(dp2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisCollection_E_GaGS0() throws Exception{
    QName qname = new QName("name");
    Object obj = new Object();
    PageContextHandler pageContextHandler = new PageContextHandler();
    Locale locale = new Locale("en", "US");
    DynamicPointer dynamicpointer = new DynamicPointer(qname, obj, pageContextHandler, locale);
    boolean result = dynamicpointer.isLeaf();
    Assertions.assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollection4_hHdj3_yfTa0() {
    QName qName = new QName("name", "localName");
    Object bean = new Object();
    PageContextHandler handler = new PageContextHandler();
    VariablePointer variablePointer = new VariablePointer(new QName("name"));
    DynamicPointer dynamicPointer = new DynamicPointer(null, qName, bean, handler);
    boolean result = dynamicPointer.isLeaf();
    assert (!result);
}
}