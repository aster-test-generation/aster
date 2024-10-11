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
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointer_Test_Passing {
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
    public void testIsCollectionWithNull_VpgR2() {
        ContainerPointer containerPointer = new ContainerPointer(null, Locale.getDefault());
        assertFalse(containerPointer.isCollection());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithParent() throws Exception {
        // Scenario where the container pointer has a parent
        containerPointer = new ContainerPointer(mockParentNodePointer, mockDocumentContainer);
        // Setup the parent mock to return a specific path
        when(mockParentNodePointer.asPath()).thenReturn("/parent/path");
        // Execute the method under test
        String result = containerPointer.asPath();
        // Assert the result is as expected
        assertEquals("/parent/path", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithoutParent() throws Exception {
        // Scenario where the container pointer has a parent
        containerPointer = new ContainerPointer(mockParentNodePointer, mockDocumentContainer);
        // Setup for scenario where the container pointer has no parent
        containerPointer = new ContainerPointer(mockDocumentContainer, null);
        // Execute the method under test
        String result = containerPointer.asPath();
        // Assert the result is as expected
        assertEquals("/", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafTrue() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Setup the scenario
        when(domNodePointerMock.isLeaf()).thenReturn(true);
        // Execute the method under test
        boolean result = containerPointer.isLeaf();
        // Verify the result
        assertTrue(result, "ContainerPointer should be leaf when DOMNodePointer is leaf");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareChildNodePointers_FirstHigher_jHxk0() throws Exception {
    DocumentContainer mockDocumentContainer = mock(DocumentContainer.class);
    Locale mockLocale = mock(Locale.class);
    ContainerPointer containerPointer = new ContainerPointer(mockDocumentContainer, mockLocale);
    DOMNodePointer pointer1 = mock(DOMNodePointer.class);
    DOMNodePointer pointer2 = mock(DOMNodePointer.class);
    when(pointer1.getIndex()).thenReturn(2);
    when(pointer2.getIndex()).thenReturn(1);
    int result = containerPointer.compareChildNodePointers(pointer1, pointer2);
    assertEquals(1, result, "Expected result to indicate that pointer1 has a higher index than pointer2");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareChildNodePointers_SecondHigher_muQP0() throws Exception {
    DocumentContainer mockContainer = mock(DocumentContainer.class);
    Locale mockLocale = mock(Locale.class);
    ContainerPointer containerPointer = new ContainerPointer(mockContainer, mockLocale);
    DOMNodePointer pointer1 = mock(DOMNodePointer.class);
    DOMNodePointer pointer2 = mock(DOMNodePointer.class);
    when(pointer1.getIndex()).thenReturn(1);
    when(pointer2.getIndex()).thenReturn(2);
    int result = containerPointer.compareChildNodePointers(pointer1, pointer2);
    assertEquals(-1, result, "Expected result to indicate that pointer2 has a higher index than pointer1");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareChildNodePointers_Equal_jlGu0() throws Exception {
    DocumentContainer mockDocumentContainer = mock(DocumentContainer.class);
    Locale mockLocale = mock(Locale.class);
    ContainerPointer containerPointer = new ContainerPointer(mockDocumentContainer, mockLocale);
    DOMNodePointer pointer1 = mock(DOMNodePointer.class);
    DOMNodePointer pointer2 = mock(DOMNodePointer.class);
    when(pointer1.getIndex()).thenReturn(1);
    when(pointer2.getIndex()).thenReturn(1);
    int result = containerPointer.compareChildNodePointers(pointer1, pointer2);
    assertEquals(0, result, "Expected result to indicate that both pointers have the same index");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafFalse_fid1() throws Exception {
        // Initialize ContainerPointer with mocked DOMNodePointer and DocumentContainer
        containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
        // Setup the scenario
        when(domNodePointerMock.isLeaf()).thenReturn(false);
        // Execute the method under test
        boolean result = containerPointer.isLeaf();
        // Verify the result
        assertTrue(result, "ContainerPointer should not be leaf when DOMNodePointer is not leaf");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNamespacePointer_aoSv0_fid1() throws Exception {
    ContainerPointer containerPointer = new ContainerPointer(domNodePointerMock, documentContainerMock);
    when(domNodePointerMock.namespaceIterator()).thenReturn(nodeIteratorMock);
    NodeIterator result = containerPointer.namespaceIterator();
}
}