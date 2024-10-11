/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;
import java.util.Locale;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
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
public class Aster_ContainerPointer_Test_Failing {
@InjectMocks
    private ContainerPointer containerPointer;
@Mock
    private NodePointer pointer1;
@Mock
    private NodePointer pointer2;
private Container container;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private DocumentContainer documentContainer;
@Mock
    private DOMNodePointer domNodePointerMock;
@Mock
    private DocumentContainer documentContainerMock;
@Mock
    private NodeTest nodeTestMock;
@Mock
    private DOMNodePointer parentNode;
@Mock
    private NodePointer mockValuePointer;
@Mock
    private QName mockQName;
@Mock
    private Object mockNode;
@Mock
    private NodeIterator nodeIteratorMock;
@Mock
    private NodePointer namespacePointerMock;
@Mock
    private QName qNameMock;
@Mock
    private NodeIterator expectedNodeIteratorMock;
@Mock
    private DOMNodePointer mockParentNodePointer;
@Mock
    private DocumentContainer mockDocumentContainer;
    private NodePointer valuePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointer, documentContainer);
        Object value = new Object(); // Example value to set
        containerPointer.setValue(value);
        // Verify that the setValue method on the mocked Container object was called with the correct value
        verify(container).setValue(value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSelf_YPyq0() {
    DocumentContainer container = new DocumentContainer(null);
    ContainerPointer pointer = new ContainerPointer(container, Locale.getDefault());
    assertTrue(pointer.equals(pointer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_oDMe1() {
    DocumentContainer container = new DocumentContainer(null);
    ContainerPointer pointer = new ContainerPointer(container, Locale.getDefault());
    Object other = new Object();
    assertFalse(pointer.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_kPIQ2() {
    DocumentContainer container = new DocumentContainer(null);
    ContainerPointer pointer = new ContainerPointer(container, Locale.getDefault());
    assertFalse(pointer.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentContainer_sLMF3() {
    DocumentContainer container1 = new DocumentContainer(null);
    DocumentContainer container2 = new DocumentContainer(null);
    ContainerPointer pointer1 = new ContainerPointer(container1, Locale.getDefault());
    ContainerPointer pointer2 = new ContainerPointer(container2, Locale.getDefault());
    assertFalse(pointer1.equals(pointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameContainerDifferentLocale_eOuc4() {
    DocumentContainer container = new DocumentContainer(null);
    ContainerPointer pointer1 = new ContainerPointer(container, Locale.getDefault());
    ContainerPointer pointer2 = new ContainerPointer(container, Locale.CANADA);
    assertFalse(pointer1.equals(pointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_InitialCall_CreatesNewValuePointer_1() throws Exception {
        // Setup the container pointer with mocked parent node and container
        containerPointer = new ContainerPointer(parentNode, container);
        when(parentNode.getName()).thenReturn(mockQName);
        when(parentNode.getImmediateNode()).thenReturn(mockNode);
        when(NodePointer.newChildNodePointer(any(NodePointer.class), any(QName.class), any())).thenReturn(mockValuePointer);
        // Act
        NodePointer result = containerPointer.getImmediateValuePointer();
        // Assert
        verify(parentNode).getImmediateNode();
        verify(parentNode).getName();
        assertNotNull(result, "The result should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_InitialCall_CreatesNewValuePointer_2() throws Exception {
        // Setup the container pointer with mocked parent node and container
        containerPointer = new ContainerPointer(parentNode, container);
        when(parentNode.getName()).thenReturn(mockQName);
        when(parentNode.getImmediateNode()).thenReturn(mockNode);
        when(NodePointer.newChildNodePointer(any(NodePointer.class), any(QName.class), any())).thenReturn(mockValuePointer);
        // Act
        NodePointer result = containerPointer.getImmediateValuePointer();
        // Assert
        verify(parentNode).getImmediateNode();
        verify(parentNode).getName();
        assertEquals(mockValuePointer, result, "The returned value pointer should match the mock");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_SubsequentCalls_ReturnCachedValuePointer() throws Exception {
        // Setup the container pointer with mocked parent node and container
        containerPointer = new ContainerPointer(parentNode, container);
        when(parentNode.getName()).thenReturn(mockQName);
        when(parentNode.getImmediateNode()).thenReturn(mockNode);
        when(NodePointer.newChildNodePointer(any(NodePointer.class), any(QName.class), any())).thenReturn(mockValuePointer);
        // Call once to set the valuePointer
        containerPointer.getImmediateValuePointer();
        // Reset interactions to check for subsequent calls
        reset(parentNode);
        // Act
        NodePointer firstCallResult = containerPointer.getImmediateValuePointer();
        NodePointer secondCallResult = containerPointer.getImmediateValuePointer();
        // Assert
        assertSame(firstCallResult, secondCallResult, "Subsequent calls should return the same instance of valuePointer");
        verifyNoInteractions(parentNode); // No further interactions with the parent node should occur
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_WhenBaseValueIsCollection_ReturnsTrue() {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        Object collectionMock = mock(java.util.Collection.class);
        when(containerPointer.getBaseValue()).thenReturn(collectionMock);
        when(ValueUtils.isCollection(collectionMock)).thenReturn(true);
        // Act
        boolean result = containerPointer.isCollection();
        // Assert
        assertTrue(result, "isCollection should return true when base value is a collection");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_WhenBaseValueIsNotCollection_ReturnsFalse() {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        Object nonCollectionMock = new Object();
        when(containerPointer.getBaseValue()).thenReturn(nonCollectionMock);
        when(ValueUtils.isCollection(nonCollectionMock)).thenReturn(false);
        // Act
        boolean result = containerPointer.isCollection();
        // Assert
        assertFalse(result, "isCollection should return false when base value is not a collection");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_WhenBaseValueIsNull_ReturnsFalse() {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        when(containerPointer.getBaseValue()).thenReturn(null);
        // Act
        boolean result = containerPointer.isCollection();
        // Assert
        assertFalse(result, "isCollection should return false when base value is null");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeReturnsCorrectValue_1() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        Object expectedValue = new Object();
        when(containerPointer.getBaseValue()).thenReturn(expectedValue);
        when(containerPointer.getLength()).thenReturn(1);
        when(containerPointer.getIndex()).thenReturn(0);
        // Act
        Object result = containerPointer.getImmediateNode();
        // Assert
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeReturnsCorrectValue_2() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        Object expectedValue = new Object();
        when(containerPointer.getBaseValue()).thenReturn(expectedValue);
        when(containerPointer.getLength()).thenReturn(1);
        when(containerPointer.getIndex()).thenReturn(0);
        // Act
        Object result = containerPointer.getImmediateNode();
        // Assert
        assertEquals(expectedValue, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeReturnsNullForInvalidIndex() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        when(containerPointer.getBaseValue()).thenReturn(new Object());
        when(containerPointer.getLength()).thenReturn(1);
        when(containerPointer.getIndex()).thenReturn(-1); // Invalid index
        // Act
        Object result = containerPointer.getImmediateNode();
        // Assert
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeHandlesWholeCollection() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        Object expectedValue = new Object();
        when(containerPointer.getBaseValue()).thenReturn(expectedValue);
        when(containerPointer.getIndex()).thenReturn(ContainerPointer.WHOLE_COLLECTION);
        // Act
        Object result = containerPointer.getImmediateNode();
        // Assert
        assertEquals(expectedValue, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithEmptyCollection_KvXq0() {
        DocumentContainer docContainer = new DocumentContainer(null);
        ContainerPointer containerPointer = new ContainerPointer(docContainer, Locale.getDefault());
        assertFalse(containerPointer.isCollection());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithNonEmptyCollection_GPRG1() {
        DocumentContainer docContainer = new DocumentContainer(null);
        ContainerPointer containerPointer = new ContainerPointer(docContainer, Locale.getDefault());
        assertTrue(containerPointer.isCollection());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        // Assuming ContainerPointer has a field `index` which is needed for hashCode calculation
        // Since it's not defined in the provided code, we assume it's there and set to a default value.
        // If ContainerPointer does not have an index field, this setup needs adjustment.
        when(container.hashCode()).thenReturn(123); // Mocking hashCode of container
        // Calculate the expected hash code based on the mocked container's hash code and index.
        // Assuming `index` is a field in ContainerPointer and is initialized to 0 or some value.
        int expectedHashCode = System.identityHashCode(container) + 0; // Assuming index is 0
        // Call the actual hashCode method
        int actualHashCode = containerPointer.hashCode();
        // Verify the result
        assertEquals(expectedHashCode, actualHashCode, "The hash code calculation did not match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsContainer_eGSS0() {
    DocumentContainer documentContainer = new DocumentContainer(null);
    ContainerPointer containerPointer = new ContainerPointer(documentContainer, Locale.getDefault());
    assertTrue(containerPointer.isContainer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        QName qName = new QName("testName");
        when(domNodePointerMock.attributeIterator(qName)).thenReturn(nodeIteratorMock);
        NodeIterator result = containerPointer.attributeIterator(qName);
        verify(domNodePointerMock).attributeIterator(qName);
        assertEquals(nodeIteratorMock, result, "The returned NodeIterator should match the mock");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_WholeCollection_peAl0() {
        DocumentContainer docContainer = new DocumentContainer(null);
        ContainerPointer containerPointer = new ContainerPointer(docContainer, Locale.getDefault());
        Object result = containerPointer.getImmediateNode();
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_Znff0() {
    DocumentContainer container = new DocumentContainer(null);
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault());
    ContainerPointer containerPointer = new ContainerPointer(parent, container);
    int expectedHashCode = System.identityHashCode(container) + 0; // Assuming index is 0 as it's not defined in the provided code
    int actualHashCode = containerPointer.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        // Setup the mock behavior for the DOMNodePointer
        when(domNodePointerMock.getName()).thenReturn(qNameMock);
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        QName expected = qNameMock;
        // Act
        QName actual = containerPointer.getName();
        // Assert
        assertEquals(expected, actual, "The getName method should return the QName provided by the DOMNodePointer.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_WhenBaseValueIsNull() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        when(containerPointer.getBaseValue()).thenReturn(null);
        // Act
        int length = containerPointer.getLength();
        // Assert
        assertEquals(1, length, "Length should be 1 when base value is null");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_WhenBaseValueIsNotNull() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        Object baseValue = new Object();
        when(containerPointer.getBaseValue()).thenReturn(baseValue);
        when(ValueUtils.getLength(baseValue)).thenReturn(5);
        // Act
        int length = containerPointer.getLength();
        // Assert
        assertEquals(5, length, "Length should be returned from ValueUtils.getLength when base value is not null");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullParent_ChoL0() {
        DocumentContainer container = new DocumentContainer(null);
        ContainerPointer cp = new ContainerPointer(container, null);
        assertEquals("/", cp.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI() throws Exception {
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Setup
        String prefix = "xmlns";
        String expectedNamespaceURI = "http://www.example.com";
        when(domNodePointerMock.getNamespaceURI(prefix)).thenReturn(expectedNamespaceURI);
        // Execute
        String result = containerPointer.getNamespaceURI(prefix);
        // Verify
        verify(domNodePointerMock).getNamespaceURI(prefix);
        assertEquals(expectedNamespaceURI, result, "The returned namespace URI should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_BaseValueNull_wgmQ0() {
        DocumentContainer docContainer = new DocumentContainer(null);
        ContainerPointer containerPointer = new ContainerPointer(docContainer, Locale.getDefault());
        assertEquals(1, containerPointer.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_BaseValueNotNull_TABg1() {
        DocumentContainer docContainer = new DocumentContainer(null);
        DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault());
        ContainerPointer containerPointer = new ContainerPointer(domNodePointer, docContainer);
        assertEquals(5, containerPointer.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafFalse() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Setup the scenario
        when(domNodePointerMock.isLeaf()).thenReturn(false);
        // Execute the method under test
        boolean result = containerPointer.isLeaf();
        // Verify the result
        assertFalse(result, "ContainerPointer should not be leaf when DOMNodePointer is not leaf");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBaseValue_pOaB0() {
    DocumentContainer documentContainer = new DocumentContainer(null);
    ContainerPointer containerPointer = new ContainerPointer(documentContainer, Locale.getDefault());
    Object result = containerPointer.getBaseValue();
    assertEquals(documentContainer, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator() throws Exception {
        // Setup the containerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // When getValuePointer() is called on the mocked DOMNodePointer, return itself
        when(domNodePointerMock.namespaceIterator()).thenReturn(nodeIteratorMock);
        // Execute the method to test
        NodeIterator result = containerPointer.namespaceIterator();
        // Verify that the namespaceIterator method of DOMNodePointer was called
        verify(domNodePointerMock).namespaceIterator();
        // Assert that the result is the expected mocked NodeIterator
        assertEquals(nodeIteratorMock, result, "The namespaceIterator returned is not as expected.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_ValidIndex_tvaV1_uEzX0() {
    DocumentContainer docContainer = new DocumentContainer(null);
    ContainerPointer containerPointer = new ContainerPointer(docContainer, Locale.getDefault());
    NodeIterator result = containerPointer.namespaceIterator();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_InvalidIndex_Kywt2_HLSJ0() {
    DocumentContainer docContainer = new DocumentContainer(null);
    ContainerPointer containerPointer = new ContainerPointer(docContainer, Locale.getDefault());
    containerPointer.setIndex(-1);
    Object result = containerPointer.getImmediateNode();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNamespacePointer_aoSv0() throws Exception {
    ContainerPointer containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
    when(domNodePointerMock.namespaceIterator()).thenReturn(nodeIteratorMock);
    NodeIterator result = containerPointer.namespaceIterator();
    verify(domNodePointerMock).namespaceIterator();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_fid1() throws Exception {
        // Setup the mock behavior for the DOMNodePointer
        when(domNodePointerMock.getName()).thenReturn(qNameMock);
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        QName expected = qNameMock;
        // Act
        QName actual = containerPointer.getName();
        // Assert
    assertNull(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_InitialCall_CreatesNewValuePointer() throws Exception {
        // Setup the container pointer with mocked parent node and container
        containerPointer = new ContainerPointer(parentNode, container);
        when(parentNode.getName()).thenReturn(mockQName);
        when(parentNode.getImmediateNode()).thenReturn(mockNode);
        when(NodePointer.newChildNodePointer(any(NodePointer.class), any(QName.class), any())).thenReturn(mockValuePointer);
        // Act
        NodePointer result = containerPointer.getImmediateValuePointer();
        // Assert
        assertNotNull(result, "The result should not be null");
        assertEquals(mockValuePointer, result, "The returned value pointer should match the mock");
        verify(parentNode).getImmediateNode();
        verify(parentNode).getName();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeReturnsCorrectValue() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Arrange
        Object expectedValue = new Object();
        when(containerPointer.getBaseValue()).thenReturn(expectedValue);
        when(containerPointer.getLength()).thenReturn(1);
        when(containerPointer.getIndex()).thenReturn(0);
        // Act
        Object result = containerPointer.getImmediateNode();
        // Assert
        assertNotNull(result);
        assertEquals(expectedValue, result);
    }
}