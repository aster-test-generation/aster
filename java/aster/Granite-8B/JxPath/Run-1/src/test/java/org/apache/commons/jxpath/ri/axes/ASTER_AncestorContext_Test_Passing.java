/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AncestorContext_Test_Passing {
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private Object superObject;
    private AncestorContext ancestorcontext;
    @Mock
    private NodePointer nodePointer;
    private AncestorContext ancestorContext;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionLessThanCurrentPosition_CLeS0() {
        AncestorContext context = new AncestorContext(new SelfContext(null, null), false, new NodeTypeTest(0));
        context.setPosition(0);
        assertTrue(context.getPosition() == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder() throws Exception {
        ancestorcontext = new AncestorContext(namespaceContext, true, nodeTypeTest);
        // Arrange
        int expected = -1;
        // Act
        int actual = ancestorcontext.getDocumentOrder();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_ZKdP0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        assertEquals(-1, ancestorContext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_vTmg0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NamespaceContext parentContext = new NamespaceContext(new AncestorContext(null, false, nodeTest), nodeTest);
        AncestorContext ancestorContext = new AncestorContext(parentContext, true, nodeTest);
        NodePointer result = ancestorContext.getCurrentNodePointer();
        assertEquals(result, ancestorContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode() throws Exception {
        ancestorContext = new AncestorContext(namespaceContext, true, nodeTypeTest);
        when(nodePointer.getImmediateParentPointer()).thenReturn(nodePointer);
        when(nodePointer.testNode(nodeTypeTest)).thenReturn(true);
        when(namespaceContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodeTypeTest.getNodeType()).thenReturn(1);
        when(nodePointer.testNode(nodeTypeTest)).thenReturn(true);
        boolean result = ancestorContext.nextNode();
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_CurrentNodePointerIsNull_ReturnsFalse_yQqk4_IuaU0() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, null), null), true, new NodeTypeTest(1));
    }
}