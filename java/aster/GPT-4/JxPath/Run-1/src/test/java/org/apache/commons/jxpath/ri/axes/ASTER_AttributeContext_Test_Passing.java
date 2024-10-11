/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
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
public class Aster_AttributeContext_Test_Passing {
@Mock
    private NamespaceContext mockNamespaceContext;
@Mock
    private NodeTypeTest mockNodeTypeTest;
@InjectMocks
    private AttributeContext attributeContext;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private NodeIterator iterator;
@Mock
    private NodePointer currentNodePointer;
@Mock
    private NamespaceContext parentContext;
@Mock
    private NodeTypeTest nodeTest;
    private boolean setStarted = false;
    private static final QName WILDCARD = new QName(null, "*");
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_WithIteratorNull_ReturnsFalse() throws Exception {
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.attributeIterator(WILDCARD)).thenReturn(iterator);
        when(iterator.setPosition(anyInt())).thenReturn(true);
        when(iterator.getNodePointer()).thenReturn(currentNodePointer);
        // Setup
        when(currentNodePointer.attributeIterator(WILDCARD)).thenReturn(null);
        // Execute
        boolean result = attributeContext.nextNode();
        // Verify
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_WithIteratorFailingToSetPosition_ReturnsFalse() throws Exception {
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.attributeIterator(WILDCARD)).thenReturn(iterator);
        when(iterator.setPosition(anyInt())).thenReturn(true);
        when(iterator.getNodePointer()).thenReturn(currentNodePointer);
        // Setup
        when(iterator.setPosition(anyInt())).thenReturn(false);
        // Execute
        boolean result = attributeContext.nextNode();
        // Verify
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_KXVA0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
    NodePointer expected = attributeContext.getCurrentNodePointer();
    NodePointer actual = attributeContext.getCurrentNodePointer();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_WithIteratorNull_ReturnsFalse_InOK0() throws Exception {
    when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
    when(currentNodePointer.attributeIterator(any(QName.class))).thenReturn(null);
    boolean result = attributeContext.nextNode();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_yIqJ0_1() throws Exception {
    AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
    Field setStartedField = AttributeContext.class.getDeclaredField("setStarted");
    setStartedField.setAccessible(true);
    setStartedField.set(attributeContext, true);
    Field iteratorField = AttributeContext.class.getDeclaredField("iterator");
    iteratorField.setAccessible(true);
    iteratorField.set(attributeContext, iterator);
    attributeContext.reset();
    assertFalse((Boolean) setStartedField.get(attributeContext));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_yIqJ0_2() throws Exception {
    AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
    Field setStartedField = AttributeContext.class.getDeclaredField("setStarted");
    setStartedField.setAccessible(true);
    setStartedField.set(attributeContext, true);
    Field iteratorField = AttributeContext.class.getDeclaredField("iterator");
    iteratorField.setAccessible(true);
    iteratorField.set(attributeContext, iterator);
    attributeContext.reset();
    assertNull(iteratorField.get(attributeContext));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_WithIteratorFailingToSetPosition_ReturnsFalse_APMk0() throws Exception {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
    NamespaceContext parentContext = mock(NamespaceContext.class);
    AttributeContext attributeContext = new AttributeContext(parentContext, nodeTypeTest);
    NodePointer currentNodePointer = mock(NodePointer.class);
    NodeIterator iterator = mock(NodeIterator.class);
    QName WILDCARD = new QName("*");
    when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
    when(currentNodePointer.attributeIterator(WILDCARD)).thenReturn(iterator);
    when(iterator.setPosition(anyInt())).thenReturn(true);
    when(iterator.getNodePointer()).thenReturn(currentNodePointer);
    when(iterator.setPosition(anyInt())).thenReturn(false);
    boolean result = attributeContext.nextNode();
    assertFalse(result);
}
}