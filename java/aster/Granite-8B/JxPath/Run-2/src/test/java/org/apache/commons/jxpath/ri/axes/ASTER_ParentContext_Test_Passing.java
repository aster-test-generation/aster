/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ParentContext_Test_Passing {
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    private ParentContext parentcontext;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private JXPathContext context;
    @Mock
    private NodeTypeTest nodeTypeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder() {
        parentcontext = new ParentContext(parentContext, nodeTest);
        when(parentContext.getDocumentOrder()).thenReturn(-1);
        int documentOrder = parentcontext.getDocumentOrder();
        assertEquals(-1, documentOrder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder_gtIy0() {
        ParentContext parentContext = new ParentContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0));
        int result = parentContext.getDocumentOrder();
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_FutE0() {
        ParentContext parentContext = new ParentContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), null), new NodeTypeTest(0));
        parentContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentPosition() {
        parentcontext = new ParentContext(parentContext, nodeTest);
        // Mock the behavior of the getCurrentPosition method
        when(parentContext.getCurrentPosition()).thenReturn(1);
        // Call the method under test
        int result = parentcontext.getCurrentPosition();
        // Assert that the result is as expected
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentPosition_fHDo0() {
        ParentContext parentContext = new ParentContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        assertEquals(1, parentContext.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IZza0() {
        nodeTest = new NodeTypeTest(1);
        parentcontext = new ParentContext(parentContext, nodeTypeTest);
        currentNodePointer = mock(NodePointer.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getImmediateParentPointer()).thenReturn(nodePointer);
        when(nodePointer.isContainer()).thenReturn(true);
        when(nodePointer.testNode(nodeTest)).thenReturn(true);
        boolean result = parentcontext.nextNode();
        verify(parentContext, times(1)).getCurrentNodePointer();
        verify(nodePointer, times(1)).getImmediateParentPointer();
        verify(nodePointer, times(1)).isContainer();
        verify(nodePointer, times(1)).testNode(nodeTest);
        assertTrue(result);
    }
}