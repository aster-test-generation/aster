/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPointer_Test_Passing {
@Mock
    private QName name;
@InjectMocks
    private NullPointer nullPointer;
@Mock
    private NodePointer parentMock;
@Mock
    private JXPathContext contextMock;
@Mock
    private NodePointer createdNodePointerMock;
@Mock
    private NodePointer valuePointerMock;
@Mock
    private JXPathContext context;
@Mock
    private NodePointer nodePointer;
@Mock
    private NodePointer createdChildNodePointer;
@Mock
    private Locale locale;
@Mock
    private DOMNodePointer parent;
    private String id;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_ReturnsTrue() throws Exception {
        // Initialize NullPointer with a mocked QName
        nullPointer = new NullPointer(name, Locale.getDefault());
        assertTrue(nullPointer.equals(nullPointer), "Should return true when comparing the same object.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_ReturnsFalse() throws Exception {
        // Initialize NullPointer with a mocked QName
        nullPointer = new NullPointer(name, Locale.getDefault());
        assertFalse(nullPointer.equals(null), "Should return false when comparing to null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ReturnsFalse() throws Exception {
        // Initialize NullPointer with a mocked QName
        nullPointer = new NullPointer(name, Locale.getDefault());
        Object differentObject = new Object();
        assertFalse(nullPointer.equals(differentObject), "Should return false when comparing to a different class.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameName_ReturnsTrue() throws Exception {
        // Initialize NullPointer with a mocked QName
        nullPointer = new NullPointer(name, Locale.getDefault());
        NullPointer anotherNullPointer = new NullPointer(name, Locale.getDefault());
        when(name.equals(any())).thenReturn(true);
        assertTrue(nullPointer.equals(anotherNullPointer), "Should return true when names are the same.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_ReturnsFalse() throws Exception {
        // Initialize NullPointer with a mocked QName
        nullPointer = new NullPointer(name, Locale.getDefault());
        QName differentName = mock(QName.class);
        NullPointer anotherNullPointer = new NullPointer(differentName, Locale.getDefault());
        when(name.equals(differentName)).thenReturn(false);
        assertFalse(nullPointer.equals(anotherNullPointer), "Should return false when names are different.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_wiIu0() {
        QName qName = new QName("test");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer = new NullPointer(qName, locale);
        assertTrue(nullPointer.equals(nullPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_WIeH1() {
        QName qName = new QName("test");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer = new NullPointer(qName, locale);
        Object other = new Object();
        assertFalse(nullPointer.equals(other));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_oQap2() {
        QName qName = new QName("test");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer = new NullPointer(qName, locale);
        assertFalse(nullPointer.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_nxNa3() {
        QName qName1 = new QName("test1");
        QName qName2 = new QName("test2");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer1 = new NullPointer(qName1, locale);
        NullPointer nullPointer2 = new NullPointer(qName2, locale);
        assertFalse(nullPointer1.equals(nullPointer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameNameDifferentLocale_gnAk4() {
        QName qName = new QName("test");
        Locale locale1 = new Locale("en", "US");
        Locale locale2 = new Locale("fr", "FR");
        NullPointer nullPointer1 = new NullPointer(qName, locale1);
        NullPointer nullPointer2 = new NullPointer(qName, locale2);
        assertTrue(nullPointer1.equals(nullPointer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameNameSameLocale_ZWBY5() {
        QName qName = new QName("test");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer1 = new NullPointer(qName, locale);
        NullPointer nullPointer2 = new NullPointer(qName, locale);
        assertTrue(nullPointer1.equals(nullPointer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_1() throws Exception {
        // Initialize NullPointer with a mock parent
        QName name = new QName("mockName");
        Locale locale = Locale.getDefault();
        nullPointer = new NullPointer(parentMock, name);
        // Setup mocks
        when(parentMock.createPath(contextMock, "testValue")).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Execute the method to test
        NodePointer result = nullPointer.createPath(contextMock, "testValue");
        // Verify interactions
        verify(parentMock).createPath(contextMock, "testValue");
        verify(createdNodePointerMock).getValuePointer();
        // Assertions
        assertNotNull(result, "Result should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_2() throws Exception {
        // Initialize NullPointer with a mock parent
        QName name = new QName("mockName");
        Locale locale = Locale.getDefault();
        nullPointer = new NullPointer(parentMock, name);
        // Setup mocks
        when(parentMock.createPath(contextMock, "testValue")).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Execute the method to test
        NodePointer result = nullPointer.createPath(contextMock, "testValue");
        // Verify interactions
        verify(parentMock).createPath(contextMock, "testValue");
        verify(createdNodePointerMock).getValuePointer();
        // Assertions
        assertEquals(valuePointerMock, result, "Result should be the value pointer returned by parent's createPath method");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithNullParent_cqMJ1_1() {
        QName qName = new QName("testName");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer = new NullPointer(locale, "id");
        JXPathContext context = JXPathContext.newContext(new Object());
        Object value = new Object();
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            nullPointer.createPath(context, value);
        });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_1() throws Exception {
        // Setup the NullPointer with a mock QName and Locale
        nullPointer = new NullPointer(name, Locale.getDefault());
        // Setup the behavior of the nodePointer mock
        when(nodePointer.createChild(any(JXPathContext.class), any(QName.class), anyInt())).thenReturn(createdChildNodePointer);
        // Arrange
        int index = 0;
        when(nullPointer.createPath(context)).thenReturn(nodePointer);
        // Act
        NodePointer result = nullPointer.createChild(context, name, index);
        // Assert
        verify(nodePointer).createChild(context, name, index);
        assertNotNull(result, "The result should not be null.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_2() throws Exception {
        // Setup the NullPointer with a mock QName and Locale
        nullPointer = new NullPointer(name, Locale.getDefault());
        // Setup the behavior of the nodePointer mock
        when(nodePointer.createChild(any(JXPathContext.class), any(QName.class), anyInt())).thenReturn(createdChildNodePointer);
        // Arrange
        int index = 0;
        when(nullPointer.createPath(context)).thenReturn(nodePointer);
        // Act
        NodePointer result = nullPointer.createChild(context, name, index);
        // Assert
        verify(nodePointer).createChild(context, name, index);
        assertEquals(createdChildNodePointer, result, "The created child node pointer should be returned.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_jxHc0() {
    Locale locale = new Locale("en", "US");
    QName name = new QName("testName");
    NullPointer nullPointer = new NullPointer(locale, "testId");
    JXPathContext context = JXPathContext.newContext(new Object());
    int index = 0;
    NodePointer result = nullPointer.createChild(context, name, index);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() {
        // As NullPointer's isCollection method does not depend on the constructor parameters,
        // we can instantiate it with any arbitrary values.
        nullPointer = new NullPointer(new Locale("en"), "testId");
        // The isCollection method should always return false as per the current implementation.
        assertFalse(nullPointer.isCollection(), "isCollection should return false for NullPointer instances.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionReturnsFalse_zEdi0() {
    Locale locale = new Locale("en", "US");
    QName name = new QName("testName");
    NullPointer nullPointer = new NullPointer(name, locale);
    assertFalse(nullPointer.isCollection());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNonNullParent_1() throws Exception {
        // Initialize NullPointer with a mock parent and a QName
        QName qName = new QName("testNamespace", "testName");
        nullPointer = new NullPointer(parentMock, qName);
        // Setup mocks
        when(parentMock.createPath(contextMock)).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Execute
        NodePointer result = nullPointer.createPath(contextMock);
        // Verify
        verify(parentMock).createPath(contextMock);
        verify(createdNodePointerMock).getValuePointer();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNonNullParent_2() throws Exception {
        // Initialize NullPointer with a mock parent and a QName
        QName qName = new QName("testNamespace", "testName");
        nullPointer = new NullPointer(parentMock, qName);
        // Setup mocks
        when(parentMock.createPath(contextMock)).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Execute
        NodePointer result = nullPointer.createPath(contextMock);
        // Verify
        verify(parentMock).createPath(contextMock);
        verify(createdNodePointerMock).getValuePointer();
        assertEquals(valuePointerMock, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNullParent_ThrowsException_1() {
        // Initialize NullPointer with a mock parent and a QName
        QName qName = new QName("testNamespace", "testName");
        nullPointer = new NullPointer(parentMock, qName);
        // Setup mocks
        when(parentMock.createPath(contextMock)).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Setup NullPointer with null parent
        nullPointer = new NullPointer(new Locale("en"), "id");
        // Execute and Verify
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            nullPointer.createPath(contextMock);
        });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithNullParent_uwmz1() {
    QName qName = new QName("testNamespace", "testName");
    Locale locale = new Locale("en", "US");
    NullPointer nullPointer = new NullPointer(qName, locale);
    JXPathContext context = JXPathContext.newContext(null);
    assertThrows(UnsupportedOperationException.class, () -> {
        nullPointer.createPath(context);
    });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WithNameMock_ReturnsMockedHashCode() {
        nullPointer = new NullPointer(name, null);
        // Arrange
        int expectedHashCode = 42;
        when(name.hashCode()).thenReturn(expectedHashCode);
        // Act
        int actualHashCode = nullPointer.hashCode();
        // Assert
        assertEquals(expectedHashCode, actualHashCode, "The hash code should match the mocked hash code.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNonNullName_aLaZ0() {
        QName name = new QName("testName");
        NullPointer nullPointer = new NullPointer(name, Locale.getDefault());
        int expectedHashCode = name.hashCode();
        assertEquals(expectedHashCode, nullPointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullName_QIeW1() {
        NullPointer nullPointer = new NullPointer((QName) null, Locale.getDefault());
        assertEquals(0, nullPointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        // Mock the behavior of QName methods if required
        when(name.getName()).thenReturn("mockedName");
        // Initialize NullPointer with mocked QName
        nullPointer = new NullPointer(name, null);
        QName result = nullPointer.getName();
        assertEquals(name, result, "The getName method should return the mocked QName object.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_RQhv0() {
        QName qName = new QName("testPrefix", "testLocalName");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer = new NullPointer(qName, locale);
        QName result = nullPointer.getName();
        assertEquals("testLocalName", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer() throws Exception {
        // Assuming NullPointer can be instantiated with minimal parameters for the purpose of this test
        QName name = new QName("testNamespace", "testName");
        Locale locale = Locale.ENGLISH;
        nullPointer = new NullPointer(name, locale);
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertTrue(propertyPointer instanceof NullPropertyPointer, "The returned object should be an instance of NullPropertyPointer");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyPointer_MQYs0() {
    Locale locale = new Locale("en");
    QName name = new QName("testName");
    NullPointer nullPointer = new NullPointer(name, locale);
    PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
    assertTrue(propertyPointer instanceof NullPropertyPointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_CQFR0() {
    Locale locale = new Locale("en", "US");
    QName name = new QName("testName");
    NullPointer nullPointer = new NullPointer(locale, "testId");
    JXPathContext context = JXPathContext.newContext(new Object());
    int index = 0;
    Object value = new Object();
    NodePointer result = nullPointer.createChild(context, name, index, value);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullId_irLz0() {
        NullPointer np = new NullPointer(new Locale("en", "US"), "123");
        String result = np.asPath();
        assertEquals("id(123)", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullParent_qFXa1() {
        NullPointer np = new NullPointer(new QName("testName"), new Locale("en", "US"));
        String result = np.asPath();
        assertEquals("null()", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() throws Exception {
        // Assuming the simplest constructor is used for setup
        nullPointer = new NullPointer(new Locale("en"), "testId");
        // Since getLength is expected to always return 0, we assert this behavior
        assertEquals(0, nullPointer.getLength(), "The length should always be 0 for NullPointer instances.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthReturnsZero_xanJ0() {
    Locale locale = new Locale("en");
    QName name = new QName("testName");
    NullPointer nullPointer = new NullPointer(name, locale);
    assertEquals(0, nullPointer.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() throws Exception {
        // Assuming we are using the constructor that takes a QName and a Locale
        QName qName = new QName("testNamespace", "testLocalName");
        Locale locale = Locale.ENGLISH;
        nullPointer = new NullPointer(qName, locale);
        // Since getBaseValue is expected to always return null, we assert that.
        assertNull(nullPointer.getBaseValue(), "The base value should be null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBaseValueReturnsNull_YVKZ0() {
    Locale locale = new Locale("en");
    QName name = new QName("testName");
    NullPointer nullPointer = new NullPointer(name, locale);
    assertNull(nullPointer.getBaseValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual() throws Exception {
        // Since NullPointer does not have complex dependencies and the method returns a constant,
        // we can instantiate it directly without mocks.
        nullPointer = new NullPointer(Locale.getDefault(), "testId");
        // The isActual method should always return false, as per the implementation in NullPointer.
        assertFalse(nullPointer.isActual(), "isActual should always return false for NullPointer instances");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActualReturnsFalse_IhxZ0() {
    Locale locale = new Locale("en", "US");
    QName qName = new QName("testNamespace", "testLocalName");
    NullPointer nullPointer = new NullPointer(qName, locale);
    assertFalse(nullPointer.isActual());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() throws Exception {
        // Since NullPointer does not have complex dependencies and isLeaf() does not interact with other objects,
        // we can instantiate it directly without mocks.
        nullPointer = new NullPointer(new Locale("en"), "testId");
        // Act
        boolean result = nullPointer.isLeaf();
        // Assert
        assertTrue(result, "isLeaf should always return true for NullPointer");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLeafReturnsTrue_qYpM0() {
    Locale locale = new Locale("en");
    QName qName = new QName("testName");
    NullPointer nullPointer = new NullPointer(qName, locale);
    assertTrue(nullPointer.isLeaf());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_y_cPYh0() throws Exception {
    NullPointer nullPointer = new NullPointer(name, Locale.getDefault());
    when(nodePointer.createChild(any(JXPathContext.class), any(QName.class), anyInt(), any())).thenReturn(createdChildNodePointer);
    when(nullPointer.createPath(context)).thenReturn(nodePointer);
    QName childName = new QName("childName");
    int index = 0;
    Object value = new Object();
    NodePointer result = nullPointer.createChild(context, childName, index, value);
    verify(nullPointer, times(1)).createPath(context);
    verify(nodePointer, times(1)).createChild(context, childName, index, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithNullParent_MkYU0_1() {
    QName name = new QName("mockName");
    Locale locale = Locale.getDefault();
    DOMNodePointer parentMock = mock(DOMNodePointer.class);
    NullPointer nullPointer = new NullPointer(parentMock, name);
    JXPathContext contextMock = mock(JXPathContext.class);
    DOMNodePointer createdNodePointerMock = mock(DOMNodePointer.class);
    NodePointer valuePointerMock = mock(NodePointer.class);
    when(parentMock.createPath(contextMock, "testValue")).thenReturn(createdNodePointerMock);
    when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
    Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
        nullPointer.createPath(contextMock, "testValue");
    });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithNonNullParent_YVPk0_DpSm0() {
    QName qName = new QName("testNamespace", "testName");
    Locale locale = new Locale("en", "US");
    DOMNodePointer domNodePointer = new DOMNodePointer(null, locale);
    NullPointer nullPointer = new NullPointer(domNodePointer, qName);
    JXPathContext context = JXPathContext.newContext(null);
    NodePointer result = nullPointer.createPath(context);
    assertNotNull(result, "Expected non-null result when parent is not null");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_WithNullName_ReturnsZero_nPFk0() {
    QName nullQName = null;
    Locale nullLocale = null;
    NullPointer nullPointerWithNullName = new NullPointer(nullQName, nullLocale);
    int actualHashCode = nullPointerWithNullName.hashCode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNonNullId_oKwH0() throws Exception {
    Locale locale = Locale.getDefault();
    DOMNodePointer parent = new DOMNodePointer(null, locale);
    NullPointer nullPointer = new NullPointer(parent, new QName("test"));
    Field idField = NullPointer.class.getDeclaredField("id");
    idField.setAccessible(true);
    idField.set(nullPointer, "123");
    String result = nullPointer.asPath();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild() throws Exception {
        // Setup the NullPointer with a mock QName and Locale
        nullPointer = new NullPointer(name, Locale.getDefault());
        // Setup the behavior of the nodePointer mock
        when(nodePointer.createChild(any(JXPathContext.class), any(QName.class), anyInt())).thenReturn(createdChildNodePointer);
        // Arrange
        int index = 0;
        when(nullPointer.createPath(context)).thenReturn(nodePointer);
        // Act
        NodePointer result = nullPointer.createChild(context, name, index);
        // Assert
        assertNotNull(result, "The result should not be null.");
        assertEquals(createdChildNodePointer, result, "The created child node pointer should be returned.");
        verify(nodePointer).createChild(context, name, index);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath() throws Exception {
        // Initialize NullPointer with a mock parent
        QName name = new QName("mockName");
        Locale locale = Locale.getDefault();
        nullPointer = new NullPointer(parentMock, name);
        // Setup mocks
        when(parentMock.createPath(contextMock, "testValue")).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Execute the method to test
        NodePointer result = nullPointer.createPath(contextMock, "testValue");
        // Verify interactions
        verify(parentMock).createPath(contextMock, "testValue");
        verify(createdNodePointerMock).getValuePointer();
        // Assertions
        assertNotNull(result, "Result should not be null");
        assertEquals(valuePointerMock, result, "Result should be the value pointer returned by parent's createPath method");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithNullParent_cqMJ1() {
        QName qName = new QName("testName");
        Locale locale = new Locale("en", "US");
        NullPointer nullPointer = new NullPointer(locale, "id");
        JXPathContext context = JXPathContext.newContext(new Object());
        Object value = new Object();
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            nullPointer.createPath(context, value);
        });
        assertEquals("Cannot create the root object: /", exception.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNonNullParent() throws Exception {
        // Initialize NullPointer with a mock parent and a QName
        QName qName = new QName("testNamespace", "testName");
        nullPointer = new NullPointer(parentMock, qName);
        // Setup mocks
        when(parentMock.createPath(contextMock)).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Execute
        NodePointer result = nullPointer.createPath(contextMock);
        // Verify
        verify(parentMock).createPath(contextMock);
        verify(createdNodePointerMock).getValuePointer();
        assertNotNull(result);
        assertEquals(valuePointerMock, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNullParent_ThrowsException() {
        // Initialize NullPointer with a mock parent and a QName
        QName qName = new QName("testNamespace", "testName");
        nullPointer = new NullPointer(parentMock, qName);
        // Setup mocks
        when(parentMock.createPath(contextMock)).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Setup NullPointer with null parent
        nullPointer = new NullPointer(new Locale("en"), "id");
        // Execute and Verify
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            nullPointer.createPath(contextMock);
        });
        assertTrue(exception.getMessage().contains("Cannot create the root object"));
    }
}