/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
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
public class Aster_ChildContext_Test_Passing {
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private NodeIterator iterator;
@InjectMocks
    private ChildContext childContext;
@Mock
    private NodePointer nodePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode() throws Exception {
        // Assuming ChildContext has a constructor that takes NamespaceContext, NodeTypeTest, boolean, boolean
        childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        // Arrange
        when(childContext.getCurrentPosition()).thenReturn(1);
        when(childContext.setPosition(2)).thenReturn(true);
        // Act
        boolean result = childContext.nextNode();
        // Assert
        verify(childContext).setPosition(2);
        assertTrue(result, "nextNode should return true when setPosition is successful");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_InitialPosition_UIZD0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        boolean result = childContext.setPosition(1);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_NonInitialPosition_ZNGs1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, true);
        childContext.setPosition(1); // Set initial position
        boolean result = childContext.setPosition(2);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_InvalidPosition_ltId2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, false);
        boolean result = childContext.setPosition(-1);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_WithNullParent_kLLf3() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, true);
        boolean result = childContext.setPosition(0);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_ODZw0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
    boolean result = childContext.nextNode();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WhenIteratorIsNull_ADmN0() throws Exception {
    NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
    Field iteratorField = ChildContext.class.getDeclaredField("iterator");
    iteratorField.setAccessible(true);
    iteratorField.set(childContext, null);
    boolean result = childContext.setPosition(1);
    assertFalse(result, "setPosition should return false when iterator is null");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_ReturnsNullWhenIteratorIsNull_Mvmc0() throws Exception {
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, false);
    NodePointer result = childContext.getCurrentNodePointer();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WhenIteratorIsNotNull_tEMB0() throws Exception {
    NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    NodeIterator iterator = mock(NodeIterator.class);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
    Field iteratorField = ChildContext.class.getDeclaredField("iterator");
    iteratorField.setAccessible(true);
    iteratorField.set(childContext, iterator);
    when(iterator.setPosition(anyInt())).thenReturn(true);
    boolean result = childContext.setPosition(1);
    assertTrue(result, "setPosition should return true when iterator successfully sets position");
    verify(iterator).setPosition(1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_NoParentNode_mgMg0_uMQs0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
    assertNull(childContext.getCurrentNodePointer(), "Expected null when there is no parent node");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WhenIteratorFailsToSetPosition_vpIQ0() throws Exception {
    NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    NodeIterator iterator = mock(NodeIterator.class);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
    Field iteratorField = ChildContext.class.getDeclaredField("iterator");
    iteratorField.setAccessible(true);
    iteratorField.set(childContext, iterator);
    when(iterator.setPosition(anyInt())).thenReturn(false);
    boolean result = childContext.setPosition(1);
    assertFalse(result, "setPosition should return false when iterator fails to set position");
    verify(iterator).setPosition(1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_ReturnsNullWhenNodePointerIsNull_Albs0() throws Exception {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, false);
    NodeIterator iterator = mock(NodeIterator.class);
    when(childContext.getCurrentNodePointer()).thenCallRealMethod();
    when(iterator.getNodePointer()).thenReturn(null);
    when(iterator.setPosition(1)).thenReturn(true).thenReturn(false);
    NodePointer result = childContext.getCurrentNodePointer();
    assertNull(result);
    verify(iterator, times(1)).getNodePointer();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_InvalidNodeTest_KPyI4_QOvE0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(0); // Assuming 0 is an invalid type for this context
    SelfContext parentContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(parentContext, nodeTypeTest);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, false);
    assertNull(childContext.getCurrentNodePointer(), "Expected null for invalid node test");
}
}