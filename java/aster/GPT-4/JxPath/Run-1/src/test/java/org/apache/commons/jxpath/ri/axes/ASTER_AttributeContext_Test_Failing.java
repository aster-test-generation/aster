/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
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
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AttributeContext_Test_Failing {
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
    public void testSetPosition_SuccessfullyAdvancesPosition() throws Exception {
        // Initialize AttributeContext with mocked NamespaceContext and NodeTypeTest
        attributeContext = new AttributeContext(mockNamespaceContext, mockNodeTypeTest);
        // Setup
        when(attributeContext.getCurrentPosition()).thenReturn(1, 2, 3);
        when(attributeContext.nextNode()).thenReturn(true, true, true);
        // Action
        boolean result = attributeContext.setPosition(3);
        // Assert
        assertTrue(result);
        verify(attributeContext, times(3)).nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_FailsToAdvancePosition() throws Exception {
        // Initialize AttributeContext with mocked NamespaceContext and NodeTypeTest
        attributeContext = new AttributeContext(mockNamespaceContext, mockNodeTypeTest);
        // Setup
        when(attributeContext.getCurrentPosition()).thenReturn(1);
        when(attributeContext.nextNode()).thenReturn(false);
        // Action
        boolean result = attributeContext.setPosition(2);
        // Assert
        assertFalse(result);
        verify(attributeContext, times(1)).nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_NoNeedToAdvance() throws Exception {
        // Initialize AttributeContext with mocked NamespaceContext and NodeTypeTest
        attributeContext = new AttributeContext(mockNamespaceContext, mockNodeTypeTest);
        // Setup
        when(attributeContext.getCurrentPosition()).thenReturn(3);
        // Action
        boolean result = attributeContext.setPosition(3);
        // Assert
        assertTrue(result);
        verify(attributeContext, never()).nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_ResetBeforeAdvance() throws Exception {
        // Initialize AttributeContext with mocked NamespaceContext and NodeTypeTest
        attributeContext = new AttributeContext(mockNamespaceContext, mockNodeTypeTest);
        // Setup
        when(attributeContext.getCurrentPosition()).thenReturn(5, 1, 2, 3);
        doNothing().when(attributeContext).reset();
        when(attributeContext.nextNode()).thenReturn(true, true, true);
        // Action
        boolean result = attributeContext.setPosition(3);
        // Assert
        assertTrue(result);
        verify(attributeContext).reset();
        verify(attributeContext, times(3)).nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer() throws Exception {
        // Initialize AttributeContext with mocked NamespaceContext and NodeTypeTest
        attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
        // Set the private field currentNodePointer in AttributeContext
        attributeContext.getClass().getDeclaredField("currentNodePointer").set(attributeContext, currentNodePointer);
        // Test the getCurrentNodePointer method
        NodePointer result = attributeContext.getCurrentNodePointer();
        // Assert that the result is the same as the mocked currentNodePointer
        assertEquals(currentNodePointer, result, "The returned NodePointer should be the same as the mocked one.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionReturnsTrueWhenPositionIsReached_KtcS0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
        assertTrue(attributeContext.setPosition(1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionReturnsFalseWhenPositionNotReachable_OPeB1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
        assertFalse(attributeContext.setPosition(10));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionResetsWhenPositionIsLessThanCurrent_DWFy2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
        attributeContext.setPosition(5);
        assertTrue(attributeContext.setPosition(3));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionDoesNotResetWhenPositionIsGreaterOrEqual_OkID3() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
        attributeContext.setPosition(3);
        assertTrue(attributeContext.setPosition(5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeNameTest_ReturnsTrue_aZRg1() {
        NodeNameTest nodeNameTest = new NodeNameTest(new QName("test"));
        SelfContext selfContext = new SelfContext(null, nodeNameTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeNameTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeNameTest);
        assertTrue(attributeContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeTypeTestWithNodeTypeNode_ReturnsTrue_HdQr2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
        assertTrue(attributeContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NoIteratorSet_ReturnsFalse_szUu3() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
        assertFalse(attributeContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IteratorCannotAdvance_ReturnsFalse_GVjO4() {
        NodeNameTest nodeNameTest = new NodeNameTest(new QName("test"));
        SelfContext selfContext = new SelfContext(null, nodeNameTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeNameTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeNameTest);
        assertFalse(attributeContext.nextNode());
    }
}