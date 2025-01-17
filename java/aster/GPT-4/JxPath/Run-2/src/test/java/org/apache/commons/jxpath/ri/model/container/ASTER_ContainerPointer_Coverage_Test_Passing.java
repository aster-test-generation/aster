/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ContainerPointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueCallsContainerSetValue_ZQrc0() {
        DocumentContainer mockContainer = mock(DocumentContainer.class);
        DOMNodePointer mockParent = mock(DOMNodePointer.class);
        ContainerPointer containerPointer = new ContainerPointer(mockParent, mockContainer);
        Object value = new Object();
        containerPointer.setValue(value);
        verify(mockContainer).setValue(value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullValue_kQpu1() {
        DocumentContainer mockContainer = mock(DocumentContainer.class);
        DOMNodePointer mockParent = mock(DOMNodePointer.class);
        ContainerPointer containerPointer = new ContainerPointer(mockParent, mockContainer);
        containerPointer.setValue(null);
        verify(mockContainer).setValue(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_eQJt0() {
        DOMNodePointer mockDomNodePointer = mock(DOMNodePointer.class);
        DocumentContainer mockDocumentContainer = mock(DocumentContainer.class);
        QName mockQName = mock(QName.class);
        NodeIterator mockNodeIterator = mock(NodeIterator.class);
        when(mockDomNodePointer.attributeIterator(mockQName)).thenReturn(mockNodeIterator);
        ContainerPointer containerPointer = new ContainerPointer(mockDomNodePointer, mockDocumentContainer);
        NodeIterator result = containerPointer.attributeIterator(mockQName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChildIterator_UgLw0() {
        DOMNodePointer mockDomNodePointer = mock(DOMNodePointer.class);
        DocumentContainer mockDocumentContainer = mock(DocumentContainer.class);
        NodePointer mockNodePointer = mock(NodePointer.class);
        NodeTest mockNodeTest = mock(NodeTest.class);
        NodeIterator mockNodeIterator = mock(NodeIterator.class);
        when(mockNodePointer.childIterator(mockNodeTest, true, mockNodePointer)).thenReturn(mockNodeIterator);
        ContainerPointer containerPointer = new ContainerPointer(mockDomNodePointer, mockDocumentContainer);
        when(containerPointer.getValuePointer()).thenReturn(mockNodePointer);
        NodeIterator result = containerPointer.childIterator(mockNodeTest, true, mockNodePointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_PVdB0() {
        DOMNodePointer mockDomNodePointer = mock(DOMNodePointer.class);
        DocumentContainer mockDocumentContainer = mock(DocumentContainer.class);
        ContainerPointer containerPointer = new ContainerPointer(mockDomNodePointer, mockDocumentContainer);
        when(mockDomNodePointer.getNamespaceURI("testPrefix")).thenReturn("http://example.com/testNamespace");
        String result = containerPointer.getNamespaceURI("testPrefix");
        assertEquals("http://example.com/testNamespace", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLeaf_gVbC0_llAa0() {
    DOMNodePointer parentNode = mock(DOMNodePointer.class);
    DocumentContainer container = mock(DocumentContainer.class);
    ContainerPointer containerPointer = new ContainerPointer(parentNode, container);
    when(parentNode.isLeaf()).thenReturn(true);
    boolean result = containerPointer.isLeaf();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNodeWithValidIndex_YbPP0_pMew0_fid2() {
    DocumentContainer container = mock(DocumentContainer.class);
    DOMNodePointer parentNode = mock(DOMNodePointer.class);
    ContainerPointer containerPointer = mock(ContainerPointer.class);
    when(containerPointer.getBaseValue()).thenReturn(new Object());
    when(containerPointer.getLength()).thenReturn(5); // Assuming length is 5
    when(containerPointer.getImmediateNode()).thenCallRealMethod(); // Use real method to handle index internally
    Object result = containerPointer.getImmediateNode();
    assertNotNull(result);
    verify(containerPointer).getBaseValue();
    verify(containerPointer).getLength();
}
}