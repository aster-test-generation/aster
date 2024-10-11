/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanAttributeIterator_Test_Passing {
private BeanAttributeIterator beanAttributeIterator;
@Mock
    private BeanPointer parent;
@Mock
    private QName name;
    private int position = 0;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPosition_HJOA0() throws Exception {
    QName qName = new QName("testName");
    QName beanName = new QName("beanName");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en", "US");
    DOMNodePointer domNodePointer = new DOMNodePointer(null, locale, "id");
    BeanPointer beanPointer = new BeanPointer(domNodePointer, beanName, bean, beanInfo);
    BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(beanPointer, qName);
    int expectedPosition = 0; // Assuming default position is 0 for new iterator
    int actualPosition = beanAttributeIterator.getPosition();
    assertEquals(expectedPosition, actualPosition);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_IncludeXmlLangTrue_PositionNotOne_lNGA0() throws Exception {
    BeanPointer parent = new BeanPointer(new QName("parent"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.getDefault());
    BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(parent, new QName("test"));
    Field includeXmlLangField = BeanAttributeIterator.class.getDeclaredField("includeXmlLang");
    includeXmlLangField.setAccessible(true);
    includeXmlLangField.set(beanAttributeIterator, true);
    Field positionField = BeanAttributeIterator.class.getDeclaredField("position");
    positionField.setAccessible(true);
    positionField.set(beanAttributeIterator, 2);
    NodePointer result = beanAttributeIterator.getNodePointer();
    assertNull(result, "Expected null when includeXmlLang is true and position is not one");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPosition_dNWG0() throws Exception {
    QName qName = new QName("testName");
    Locale locale = Locale.getDefault(); // Added to resolve constructor ambiguity
    DOMNodePointer domNodePointer = new DOMNodePointer(null, locale, null);
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPointer beanPointer = new BeanPointer(domNodePointer, qName, bean, beanInfo);
    BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(beanPointer, qName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionTrueIncludeXmlLang_ymco0() throws Exception {
    BeanPointer parent = mock(BeanPointer.class);
    QName name = new QName("test");
    BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(parent, name);
    Field includeXmlLangField = BeanAttributeIterator.class.getDeclaredField("includeXmlLang");
    includeXmlLangField.setAccessible(true);
    includeXmlLangField.set(beanAttributeIterator, true);
    Field positionField = BeanAttributeIterator.class.getDeclaredField("position");
    positionField.setAccessible(true);
    positionField.set(beanAttributeIterator, 1);
    NodePointer result = beanAttributeIterator.getNodePointer();
    assertTrue(result instanceof LangAttributePointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionFalseIncludeXmlLang_OaRJ0() throws Exception {
    BeanPointer parent = mock(BeanPointer.class);
    QName name = new QName("testName");
    BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(parent, name);
    Field includeXmlLangField = BeanAttributeIterator.class.getDeclaredField("includeXmlLang");
    includeXmlLangField.setAccessible(true);
    includeXmlLangField.set(beanAttributeIterator, true);
    Field positionField = BeanAttributeIterator.class.getDeclaredField("position");
    positionField.setAccessible(true);
    positionField.set(beanAttributeIterator, 0);
    boolean result = beanAttributeIterator.setPosition(1);
    assertFalse(result);
}
}