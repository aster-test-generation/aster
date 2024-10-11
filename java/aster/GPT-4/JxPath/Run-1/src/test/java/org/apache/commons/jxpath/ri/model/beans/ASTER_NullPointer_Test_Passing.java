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
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPointer_Test_Passing {
private String id;
private QName name;
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
    private NodePointer mockedNodePointer;
@Mock
    private NodePointer nodePointerMock;
@Mock
    private NodePointer mockNodePointer;
private QName childName;
private Object value;
private int index;
@Mock
    private DOMNodePointer parent;
@InjectMocks
    private NullPointer nullPointerWithId;
private NullPointer nullPointerWithoutId;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_ReturnsTrue() {
        name = new QName("testName");
        nullPointer = new NullPointer(name, null);
        assertTrue(nullPointer.equals(nullPointer), "Should return true when comparing the same object.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_ReturnsFalse() {
        name = new QName("testName");
        nullPointer = new NullPointer(name, null);
        assertFalse(nullPointer.equals(null), "Should return false when comparing to null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ReturnsFalse() {
        name = new QName("testName");
        nullPointer = new NullPointer(name, null);
        Object otherObject = new Object();
        assertFalse(nullPointer.equals(otherObject), "Should return false when comparing to an object of a different class.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameName_ReturnsTrue() {
        name = new QName("testName");
        nullPointer = new NullPointer(name, null);
        QName anotherName = new QName("testName");
        NullPointer anotherNullPointer = new NullPointer(anotherName, null);
        assertTrue(nullPointer.equals(anotherNullPointer), "Should return true when names are equal.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_ReturnsFalse() {
        name = new QName("testName");
        nullPointer = new NullPointer(name, null);
        QName differentName = new QName("differentName");
        NullPointer differentNullPointer = new NullPointer(differentName, null);
        assertFalse(nullPointer.equals(differentNullPointer), "Should return false when names are different.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNonNullParent() throws Exception {
        // Initialize NullPointer with a mock parent
        nullPointer = new NullPointer(parentMock, new QName("testNamespace", "testName"));
        // Arrange
        Object value = new Object();
        when(parentMock.createPath(contextMock, value)).thenReturn(createdNodePointerMock);
        when(createdNodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Act
        NodePointer result = nullPointer.createPath(contextMock, value);
        // Assert
        verify(parentMock, times(1)).createPath(contextMock, value);
        verify(createdNodePointerMock, times(1)).getValuePointer();
        assertEquals(valuePointerMock, result, "The returned NodePointer should be the value pointer from the parent's created path.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNullParent_ThrowsUnsupportedOperationException_1() {
        // Initialize NullPointer with a mock parent
        nullPointer = new NullPointer(parentMock, new QName("testNamespace", "testName"));
        // Arrange
        NullPointer nullPointerWithNullParent = new NullPointer(null, new QName("testNamespace", "testName"));
        Object value = new Object();
        // Act & Assert
        UnsupportedOperationException exception = assertThrows(
            UnsupportedOperationException.class,
            () -> nullPointerWithNullParent.createPath(contextMock, value),
            "Expected createPath to throw, but it did not"
        );}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNonNullParent_ReturnsValuePointer() throws Exception {
        // Initialize NullPointer with a mock DOMNodePointer and a QName
        QName name = new QName("testName");
        nullPointer = new NullPointer(parentMock, name);
        // Setup the mocks
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNonNullParent_ReturnsValuePointer_fid1() throws Exception {
        // Initialize NullPointer with a mock DOMNodePointer and a QName
        QName name = new QName("testName");
        nullPointer = new NullPointer(parentMock, name);
        // Setup the mocks
        when(parentMock.createPath(contextMock)).thenReturn(nodePointerMock);
        when(nodePointerMock.getValuePointer()).thenReturn(valuePointerMock);
        // Execute
        NodePointer result = nullPointer.createPath(contextMock);
        // Verify
        verify(parentMock).createPath(contextMock);
        verify(nodePointerMock).getValuePointer();
        // Assert
        assertEquals(valuePointerMock, result, "Expected value pointer returned from parent's createPath method.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithNullParent_fQad1_1() {
    QName qName = new QName("testNamespace");
    Locale locale = new Locale("en", "US");
    NullPointer nullPointer = new NullPointer(qName, locale);
    JXPathContext context = JXPathContext.newContext(new Object());
    Object value = new Object();
    Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
        nullPointer.createPath(context, value);
    });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionReturnsFalse_zBKP0() {
        NullPointer nullPointer = new NullPointer(new QName("testName"), Locale.getDefault());
        assertFalse(nullPointer.isCollection());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        name = mock(QName.class);
        nullPointer = new NullPointer(name, Locale.getDefault());
        when(name.getName()).thenReturn("expectedName");
        QName result = nullPointer.getName();
        assertEquals("expectedName", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer() throws Exception {
        // Assuming QName and Locale are not the focus of the test and can be instantiated directly.
        QName name = new QName("testNamespace", "testName");
        Locale locale = Locale.ENGLISH;
        nullPointer = new NullPointer(name, locale);
        // Act
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        // Assert
        assertTrue(propertyPointer instanceof NullPropertyPointer, "The returned object should be an instance of NullPropertyPointer");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_UrGU0() {
    QName qName = new QName("testName");
    Locale locale = new Locale("en", "US");
    NullPointer nullPointer = new NullPointer(qName, locale);
    QName result = nullPointer.getName();
    assertEquals("testName", result.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_fRmZ0() {
        QName qName = new QName("name");
        Locale locale = new Locale("en", "US");
        NullPointer pointer = new NullPointer(qName, locale);
        assertTrue(pointer.equals(pointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_VKPL1() {
        QName qName = new QName("name");
        Locale locale = new Locale("en", "US");
        NullPointer pointer = new NullPointer(qName, locale);
        Object other = new Object();
        assertFalse(pointer.equals(other));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_pMgc2() {
        QName qName = new QName("name");
        Locale locale = new Locale("en", "US");
        NullPointer pointer = new NullPointer(qName, locale);
        assertFalse(pointer.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_EqualObjects_DTjG3() {
        QName qName1 = new QName("name");
        Locale locale1 = new Locale("en", "US");
        NullPointer pointer1 = new NullPointer(qName1, locale1);
        QName qName2 = new QName("name");
        Locale locale2 = new Locale("en", "US");
        NullPointer pointer2 = new NullPointer(qName2, locale2);
        assertTrue(pointer1.equals(pointer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentNames_WAWs4() {
        QName qName1 = new QName("name1");
        Locale locale1 = new Locale("en", "US");
        NullPointer pointer1 = new NullPointer(qName1, locale1);
        QName qName2 = new QName("name2");
        Locale locale2 = new Locale("en", "US");
        NullPointer pointer2 = new NullPointer(qName2, locale2);
        assertFalse(pointer1.equals(pointer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNonNullName_ncYP0() {
        QName qName = new QName("testName");
        NullPointer nullPointer = new NullPointer(qName, Locale.getDefault());
        int expectedHashCode = qName.hashCode();
        assertEquals(expectedHashCode, nullPointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullName_jbdz1() {
        NullPointer nullPointer = new NullPointer((QName) null, Locale.getDefault());
        assertEquals(0, nullPointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyPointer_GiWN0() {
    QName qName = new QName("testNamespace", "testLocalName");
    Locale locale = new Locale("en", "US");
    NullPointer nullPointer = new NullPointer(qName, locale);
    PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
    assertTrue(propertyPointer instanceof NullPropertyPointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithId() throws Exception {
        // Setup for NullPointer with an ID
        nullPointerWithId = new NullPointer(new Locale("en"), "123");
        // Setup for NullPointer without an ID and with a mocked parent
        QName name = new QName("testName");
        nullPointerWithoutId = new NullPointer(parent, name);
        // Mocking parent's asPath method
        when(parent.asPath()).thenReturn("parentPath()");
        String result = nullPointerWithId.asPath();
        assertEquals("id(123)", result, "The asPath method should return the correct ID path.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithoutIdWithoutParent() throws Exception {
        // Setup for NullPointer with an ID
        nullPointerWithId = new NullPointer(new Locale("en"), "123");
        // Setup for NullPointer without an ID and with a mocked parent
        QName name = new QName("testName");
        nullPointerWithoutId = new NullPointer(parent, name);
        // Mocking parent's asPath method
        when(parent.asPath()).thenReturn("parentPath()");
        NullPointer nullPointer = new NullPointer(new QName("test"), new Locale("en"));
        String result = nullPointer.asPath();
        assertEquals("null()", result, "The asPath method should return 'null()' when both ID and parent are null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() throws Exception {
        // Assuming the simplest constructor is used for NullPointer
        nullPointer = new NullPointer(new Locale("en"), "testId");
        // Since getBaseValue is expected to always return null, we assert that.
        assertNull(nullPointer.getBaseValue(), "The base value should be null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthReturnsZero_Yuke0() {
    Locale locale = new Locale("en", "US");
    QName qName = new QName("testName");
    NullPointer nullPointer = new NullPointer(qName, locale);
    int length = nullPointer.getLength();
    assertEquals(0, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual() throws Exception {
        // Since NullPointer's isActual method does not depend on its constructor parameters,
        // we can instantiate it with any values. Here, using simple values for demonstration.
        nullPointer = new NullPointer(new Locale("en"), "testId");
        // The isActual method of NullPointer is expected to always return false.
        assertFalse(nullPointer.isActual(), "isActual should always return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullId_GdJx0() {
        NullPointer np = new NullPointer(new Locale("en", "US"), "123");
        assertEquals("id(123)", np.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullIdAndNullParent_ylAh1() {
        NullPointer np = new NullPointer(new QName("test"), new Locale("en", "US"));
        assertEquals("null()", np.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() throws Exception {
        // As NullPointer does not depend on external inputs for isLeaf, we can instantiate it directly.
        nullPointer = new NullPointer(new Locale("en"), "testId");
        // Assert that isLeaf always returns true.
        assertTrue(nullPointer.isLeaf(), "isLeaf should always return true for NullPointer");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBaseValueReturnsNull_UFPk0() {
    Locale locale = new Locale("en", "US");
    QName qName = new QName("testName");
    NullPointer nullPointer = new NullPointer(qName, locale);
    Object result = nullPointer.getBaseValue();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLeafReturnsTrue_wcRP0() {
    Locale locale = new Locale("en");
    QName name = new QName("testName");
    NullPointer nullPointer = new NullPointer(name, locale);
    assertTrue(nullPointer.isLeaf());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActualReturnsFalse_JAEf0() {
    Locale locale = new Locale("en", "US");
    QName qName = new QName("testName");
    NullPointer nullPointer = new NullPointer(qName, locale);
    assertFalse(nullPointer.isActual());
}
@Test
    public void testCreatePathWithNullParent_fURQ1_kgKo0() {
        assertThrows(UnsupportedOperationException.class, () -> {
            QName qName = new QName("testName");
            Locale locale = new Locale("en", "US");
            NullPointer nullPointer = new NullPointer(qName, locale);
            JXPathContext context = JXPathContext.newContext(new Object());
            nullPointer.createPath(context);
        });
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_WithNullName_HFYI0() throws Exception {
    QName name = null;
    Locale locale = new Locale(""); // Using an empty locale instead of null
    NullPointer nullPointer = new NullPointer(name, locale);
    int result = nullPointer.hashCode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollection_ucDO0() throws Exception {
    QName name = new QName("qualifiedName");
    Locale locale = new Locale("en");
    NullPointer nullPointer = new NullPointer(name, locale);
    assertFalse(nullPointer.isCollection(), "Expected isCollection to return false");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_WSWW0() throws Exception {
    QName qName = new QName("");
    Locale locale = new Locale("");
    NullPointer nullPointer = new NullPointer(qName, locale);
    int length = nullPointer.getLength();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WithNullParent_ThrowsUnsupportedOperationException() {
        // Initialize NullPointer with a mock parent
        nullPointer = new NullPointer(parentMock, new QName("testNamespace", "testName"));
        // Arrange
        NullPointer nullPointerWithNullParent = new NullPointer(null, new QName("testNamespace", "testName"));
        Object value = new Object();
        // Act & Assert
        UnsupportedOperationException exception = assertThrows(
            UnsupportedOperationException.class,
            () -> nullPointerWithNullParent.createPath(contextMock, value),
            "Expected createPath to throw, but it did not"
        );
        assertTrue(exception.getMessage().contains("Cannot create the root object"), "Unexpected exception message");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithNullParent_fQad1() {
    QName qName = new QName("testNamespace");
    Locale locale = new Locale("en", "US");
    NullPointer nullPointer = new NullPointer(qName, locale);
    JXPathContext context = JXPathContext.newContext(new Object());
    Object value = new Object();
    Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
        nullPointer.createPath(context, value);
    });
    assertTrue(exception.getMessage().contains("Cannot create the root object"));
}
}