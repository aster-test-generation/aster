/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointer_Test_Passing {
private QName name;
private Object bean;
private JXPathBasicBeanInfo beanInfo;
private Locale locale;
private DOMNodePointer parent;
private BeanPointer beanPointer;
@Mock
    private JXPathBasicBeanInfo beanInfoMock;
@Mock
    private DOMNodePointer domNodePointerMock;
@Mock
    private QName qNameMock;
@Mock
    private Object beanMock;
private QName qName;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private JXPathIntrospector jXPathIntrospector;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_ReturnsTrue() {
        name = new QName("testName");
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.getDefault();
        parent = mock(DOMNodePointer.class);
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        assertTrue(beanPointer.equals(beanPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_ReturnsFalse() {
        name = new QName("testName");
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.getDefault();
        parent = mock(DOMNodePointer.class);
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        assertFalse(beanPointer.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ReturnsFalse() {
        name = new QName("testName");
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.getDefault();
        parent = mock(DOMNodePointer.class);
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        Object differentObject = new Object();
        assertFalse(beanPointer.equals(differentObject));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentParent_ReturnsFalse() {
        name = new QName("testName");
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.getDefault();
        parent = mock(DOMNodePointer.class);
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        DOMNodePointer differentParent = mock(DOMNodePointer.class);
        BeanPointer differentBeanPointer = new BeanPointer(differentParent, name, bean, beanInfo);
        assertFalse(beanPointer.equals(differentBeanPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameParentDifferentName_ReturnsFalse() {
        name = new QName("testName");
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.getDefault();
        parent = mock(DOMNodePointer.class);
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        QName differentName = new QName("differentName");
        BeanPointer differentBeanPointer = new BeanPointer(parent, differentName, bean, beanInfo);
        assertFalse(beanPointer.equals(differentBeanPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameParentSameNameSameBean_ReturnsTrue() {
        name = new QName("testName");
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.getDefault();
        parent = mock(DOMNodePointer.class);
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        BeanPointer sameBeanPointer = new BeanPointer(parent, name, bean, beanInfo);
        assertTrue(beanPointer.equals(sameBeanPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameParentSameNameDifferentBean_ReturnsFalse() {
        name = new QName("testName");
        bean = new Object();
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.getDefault();
        parent = mock(DOMNodePointer.class);
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        Object differentBean = new Object();
        BeanPointer differentBeanPointer = new BeanPointer(parent, name, differentBean, beanInfo);
        assertFalse(beanPointer.equals(differentBeanPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSelf_TFlu0() {
    QName qName = new QName("test");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
    assertTrue(beanPointer.equals(beanPointer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_aNss1() {
    QName qName = new QName("test");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
    assertFalse(beanPointer.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_oVEU2() {
    QName qName = new QName("test");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
    Object differentClassObject = new Object();
    assertFalse(beanPointer.equals(differentClassObject));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentName_FNaS5() {
    QName qName1 = new QName("test1");
    QName qName2 = new QName("test2");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName1, bean, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName2, bean, beanInfo, locale);
    assertFalse(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameName_JDag6() {
    QName qName = new QName("test");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean, beanInfo, locale);
    assertTrue(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentBeanPrimitive_uXma9() {
    QName qName = new QName("test");
    Integer bean1 = 1;
    Integer bean2 = 2;
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Integer.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean1, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean2, beanInfo, locale);
    assertFalse(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameBeanPrimitive_BRWs10() {
    QName qName = new QName("test");
    Integer bean = 1;
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Integer.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean, beanInfo, locale);
    assertTrue(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentBeanObject_kexF11() {
    QName qName = new QName("test");
    Object bean1 = new Object();
    Object bean2 = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean1, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean2, beanInfo, locale);
    assertFalse(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentBeanString_tjyR13() {
    QName qName = new QName("test");
    String bean1 = "Hello";
    String bean2 = "World";
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean1, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean2, beanInfo, locale);
    assertFalse(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameBeanString_JhHT14() {
    QName qName = new QName("test");
    String bean = "Hello";
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean, beanInfo, locale);
    assertTrue(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentBeanBoolean_KSCx15() {
    QName qName = new QName("test");
    Boolean bean1 = true;
    Boolean bean2 = false;
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Boolean.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean1, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean2, beanInfo, locale);
    assertFalse(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameBeanBoolean_ROfy16() {
    QName qName = new QName("test");
    Boolean bean = true;
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Boolean.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean, beanInfo, locale);
    assertTrue(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_1() throws Exception {
        // Mocking QName to return a specific name when getName is called
        when(name.getName()).thenReturn("TestName");
        // Initialize BeanPointer with mocked dependencies
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        // Act
        QName result = beanPointer.getName();
        // Assert
        assertNotNull(result, "The result should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_2() throws Exception {
        // Mocking QName to return a specific name when getName is called
        when(name.getName()).thenReturn("TestName");
        // Initialize BeanPointer with mocked dependencies
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        // Act
        QName result = beanPointer.getName();
        // Assert
        assertEquals("TestName", result.getName(), "The name should match the mocked response");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_zStk0() {
    QName qName = new QName("testName");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    DOMNodePointer domNodePointer = new DOMNodePointer(null, locale);
    BeanPointer beanPointer = new BeanPointer(domNodePointer, qName, bean, beanInfo);
    QName result = beanPointer.getName();
    assertEquals("testName", result.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_1() throws Exception {
        beanPointer = new BeanPointer(domNodePointerMock, qNameMock, beanMock, beanInfoMock);
        PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
        assertNotNull(propertyPointer, "PropertyPointer should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_2() throws Exception {
        beanPointer = new BeanPointer(domNodePointerMock, qNameMock, beanMock, beanInfoMock);
        PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
        assertTrue(propertyPointer instanceof BeanPropertyPointer, "Should return instance of BeanPropertyPointer");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyPointer_NqbF0_1() {
    QName qName = new QName("namespace", "localName");
    Object bean = new Object();
    Class clazz = Object.class;
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(clazz);
    Locale locale = new Locale("en", "US");
    BeanPointer beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
    PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
    assertNotNull(propertyPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyPointer_NqbF0_2() {
    QName qName = new QName("namespace", "localName");
    Object bean = new Object();
    Class clazz = Object.class;
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(clazz);
    Locale locale = new Locale("en", "US");
    BeanPointer beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
    PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
    assertTrue(propertyPointer instanceof BeanPropertyPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullParentReturnsStringRepresentation() throws Exception {
        bean = "Sample String";
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        when(parent.asPath()).thenReturn(null);
        assertEquals("'" + bean + "'", beanPointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullParentDelegatesToParent() throws Exception {
        bean = "Sample String";
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        when(parent.asPath()).thenReturn("/parent/path");
        assertEquals("/parent/path", beanPointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullBeanReturnsNullFunction() throws Exception {
        bean = "Sample String";
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        beanPointer = new BeanPointer(parent, name, null, beanInfo);
        assertEquals("null()", beanPointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNumberBean() throws Exception {
        bean = "Sample String";
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        beanPointer = new BeanPointer(parent, name, 123.0, beanInfo);
        assertEquals("123", beanPointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithBooleanBeanTrue() throws Exception {
        bean = "Sample String";
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        beanPointer = new BeanPointer(parent, name, true, beanInfo);
        assertEquals("true()", beanPointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithBooleanBeanFalse() throws Exception {
        bean = "Sample String";
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        beanPointer = new BeanPointer(parent, name, false, beanInfo);
        assertEquals("false()", beanPointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithStringBean() throws Exception {
        bean = "Sample String";
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        beanPointer = new BeanPointer(parent, name, "Hello World", beanInfo);
        assertEquals("'Hello World'", beanPointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNullParentAndNullBean_TZFu0() {
    QName name = new QName("test");
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPointer beanPointer = new BeanPointer(name, null, beanInfo, Locale.getDefault());
    String result = beanPointer.asPath();
    assertEquals("null()", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNullParentAndNumberBean_Fscy1() {
    QName name = new QName("test");
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPointer beanPointer = new BeanPointer(name, 123.0, beanInfo, Locale.getDefault());
    String result = beanPointer.asPath();
    assertEquals("123", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNullParentAndBooleanBeanTrue_FKFA2() {
    QName name = new QName("test");
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPointer beanPointer = new BeanPointer(name, true, beanInfo, Locale.getDefault());
    String result = beanPointer.asPath();
    assertEquals("true()", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNullParentAndBooleanBeanFalse_Zuxx3() {
    QName name = new QName("test");
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPointer beanPointer = new BeanPointer(name, false, beanInfo, Locale.getDefault());
    String result = beanPointer.asPath();
    assertEquals("false()", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNullParentAndStringBean_Lhzf4() {
    QName name = new QName("test");
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPointer beanPointer = new BeanPointer(name, "hello", beanInfo, Locale.getDefault());
    String result = beanPointer.asPath();
    assertEquals("'hello'", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNumberBeanHavingDecimal_BBGr6() {
    QName name = new QName("test");
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPointer beanPointer = new BeanPointer(name, 123.45, beanInfo, Locale.getDefault());
    String result = beanPointer.asPath();
    assertEquals("123.45", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNumberBeanInteger_ynCh7() {
    QName name = new QName("test");
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPointer beanPointer = new BeanPointer(name, 456, beanInfo, Locale.getDefault());
    String result = beanPointer.asPath();
    assertEquals("456", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() throws Exception {
        // Mocking dependencies required for BeanPointer
        QName name = new QName("testName");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        Locale locale = Locale.getDefault();
        // Initialize BeanPointer with mocked dependencies
        beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        // Call the method under test
        int length = beanPointer.getLength();
        // Assert the expected result
        assertEquals(1, length, "The length should always be 1 as per the implementation.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_SQVl0() {
    QName qName = new QName("testName");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en", "US");
    BeanPointer beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
    int expectedLength = 1;
    int actualLength = beanPointer.getLength();
    assertEquals(expectedLength, actualLength);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() throws Exception {
        bean = new Object();
        qName = new QName("testName");
        beanInfo = new JXPathBasicBeanInfo(Object.class);
        locale = Locale.getDefault();
        beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
        assertEquals(bean, beanPointer.getBaseValue(), "The getBaseValue method should return the bean object set in constructor");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBaseValue_lhat0() {
    QName qName = new QName("testName");
    Object testBean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en", "US");
    BeanPointer beanPointer = new BeanPointer(qName, testBean, beanInfo, locale);
    Object result = beanPointer.getBaseValue();
    assertEquals(testBean, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() throws Exception {
        // Initialization of mocks is handled by Mockito
        // Call the method under test
        boolean result = beanPointer.isCollection();
        // Assert the expected result
        assertFalse(result, "Expected isCollection to return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionReturnsFalse_ahyR0() {
    QName qName = new QName("testName");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
    assertFalse(beanPointer.isCollection());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithNullNode() throws Exception {
        // Setup the BeanPointer with mocked dependencies
        beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        // Setup: Return null from getNode() to simulate a leaf node
        when(beanPointer.getNode()).thenReturn(null);
        // Action: Call isLeaf()
        boolean result = beanPointer.isLeaf();
        // Assert: Expect true because the node is null
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithAtomicNode() throws Exception {
        // Setup the BeanPointer with mocked dependencies
        beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        // Setup: Return a non-null object from getNode() and mock JXPathIntrospector to return atomic bean info
        Object node = new Object();
        when(beanPointer.getNode()).thenReturn(node);
        when(JXPathIntrospector.getBeanInfo(any(Class.class))).thenReturn(beanInfo);
        when(beanInfo.isAtomic()).thenReturn(true);
        // Action: Call isLeaf()
        boolean result = beanPointer.isLeaf();
        // Assert: Expect true because the node is atomic
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithNonAtomicNode() throws Exception {
        // Setup the BeanPointer with mocked dependencies
        beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        // Setup: Return a non-null object from getNode() and mock JXPathIntrospector to return non-atomic bean info
        Object node = new Object();
        when(beanPointer.getNode()).thenReturn(node);
        when(JXPathIntrospector.getBeanInfo(any(Class.class))).thenReturn(beanInfo);
        when(beanInfo.isAtomic()).thenReturn(false);
        // Action: Call isLeaf()
        boolean result = beanPointer.isLeaf();
        // Assert: Expect false because the node is not atomic
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithNullNode_udjQ0() {
        QName name = new QName("testName");
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class);
        BeanPointer beanPointer = new BeanPointer(name, null, beanInfo, Locale.getDefault());
        assertTrue(beanPointer.isLeaf());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithAtomicNode_nveq1() {
        QName name = new QName("testName");
        String bean = "Test String";
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, true);
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, Locale.getDefault());
        assertTrue(beanPointer.isLeaf());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithNonAtomicNode_CILG2() {
        QName name = new QName("testName");
        List<String> bean = new ArrayList<>();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(List.class);
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, Locale.getDefault());
        assertFalse(beanPointer.isLeaf());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WithNameHashCode() throws Exception {
        // Setup the mocks and the object under test
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        // Setup the scenario
        int expectedHashCode = 42;
        when(name.hashCode()).thenReturn(expectedHashCode);
        // Execute the method under test
        int actualHashCode = beanPointer.hashCode();
        // Verify the result
        assertEquals(expectedHashCode, actualHashCode, "The hash code should match the mocked hash code of the name object.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WithNullName() throws Exception {
        // Setup the mocks and the object under test
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        // Setup the scenario
        when(name.hashCode()).thenReturn(0); // This line is not strictly necessary as the default return for int is 0
        beanPointer = new BeanPointer(parent, null, bean, beanInfo); // Explicitly setting name to null
        // Execute the method under test
        int actualHashCode = beanPointer.hashCode();
        // Verify the result
        assertEquals(0, actualHashCode, "The hash code should be zero when name is null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNonNullName_KTgo0() {
        QName qName = new QName("testName");
        BeanPointer beanPointer = new BeanPointer(qName, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.getDefault());
        int expectedHashCode = qName.hashCode();
        assertEquals(expectedHashCode, beanPointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullName_bxYP1() {
        BeanPointer beanPointer = new BeanPointer(null, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.getDefault());
        assertEquals(0, beanPointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentIndex_cxbH7_FYdl0() {
    QName qName = new QName("test");
    Object bean = new Object();
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    Locale locale = new Locale("en");
    BeanPointer beanPointer1 = new BeanPointer(qName, bean, beanInfo, locale);
    BeanPointer beanPointer2 = new BeanPointer(qName, bean, beanInfo, locale);
    beanPointer1.setIndex(1);
    beanPointer2.setIndex(2);
    assertFalse(beanPointer1.equals(beanPointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        // Mocking QName to return a specific name when getName is called
        when(name.getName()).thenReturn("TestName");
        // Initialize BeanPointer with mocked dependencies
        beanPointer = new BeanPointer(parent, name, bean, beanInfo);
        // Act
        QName result = beanPointer.getName();
        // Assert
        assertNotNull(result, "The result should not be null");
        assertEquals("TestName", result.getName(), "The name should match the mocked response");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer() throws Exception {
        beanPointer = new BeanPointer(domNodePointerMock, qNameMock, beanMock, beanInfoMock);
        PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
        assertNotNull(propertyPointer, "PropertyPointer should not be null");
        assertTrue(propertyPointer instanceof BeanPropertyPointer, "Should return instance of BeanPropertyPointer");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyPointer_NqbF0() {
    QName qName = new QName("namespace", "localName");
    Object bean = new Object();
    Class clazz = Object.class;
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(clazz);
    Locale locale = new Locale("en", "US");
    BeanPointer beanPointer = new BeanPointer(qName, bean, beanInfo, locale);
    PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
    assertNotNull(propertyPointer);
    assertTrue(propertyPointer instanceof BeanPropertyPointer);
}
}