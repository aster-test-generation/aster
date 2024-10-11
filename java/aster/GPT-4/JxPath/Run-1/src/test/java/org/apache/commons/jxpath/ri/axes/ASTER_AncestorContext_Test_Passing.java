/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
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
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AncestorContext_Test_Passing {
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private NodeTypeTest nodeTypeTest;
@InjectMocks
    private AncestorContext ancestorContext;
@Mock
    private NamespaceContext mockNamespaceContext;
@Mock
    private NodeTypeTest mockNodeTypeTest;
@Mock
    private NodePointer currentNodePointer;
@Mock
    private NamespaceContext parentContext;
@Mock
    private NodeTest nodeTest;
    private boolean setStarted = false;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_SuccessfullyMovesToPosition() throws Exception {
        // Initialize mocks and inject them into ancestorContext
        // Assuming NamespaceContext and NodeTypeTest are required for AncestorContext constructor
        ancestorContext = new AncestorContext(namespaceContext, true, nodeTypeTest);
        // Setup
        when(ancestorContext.getCurrentPosition()).thenReturn(1, 2, 3);
        when(ancestorContext.nextNode()).thenReturn(true, true, false);
        // Execute
        boolean result = ancestorContext.setPosition(3);
        // Verify
        assertTrue(result, "setPosition should return true when it can reach the desired position");
        verify(ancestorContext, times(2)).nextNode(); // Called twice to move from position 1 to 3
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_FailsToReachPosition() throws Exception {
        // Initialize mocks and inject them into ancestorContext
        // Assuming NamespaceContext and NodeTypeTest are required for AncestorContext constructor
        ancestorContext = new AncestorContext(namespaceContext, true, nodeTypeTest);
        // Setup
        when(ancestorContext.getCurrentPosition()).thenReturn(1);
        when(ancestorContext.nextNode()).thenReturn(false);
        // Execute
        boolean result = ancestorContext.setPosition(2);
        // Verify
        assertFalse(result, "setPosition should return false when it cannot reach the desired position");
        verify(ancestorContext).nextNode(); // Called once and failed
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_NoMovementNeeded() throws Exception {
        // Initialize mocks and inject them into ancestorContext
        // Assuming NamespaceContext and NodeTypeTest are required for AncestorContext constructor
        ancestorContext = new AncestorContext(namespaceContext, true, nodeTypeTest);
        // Setup
        when(ancestorContext.getCurrentPosition()).thenReturn(3);
        // Execute
        boolean result = ancestorContext.setPosition(3);
        // Verify
        assertTrue(result, "setPosition should return true when already at the desired position");
        verify(ancestorContext, never()).nextNode(); // No need to move
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_ResetAndMove() throws Exception {
        // Initialize mocks and inject them into ancestorContext
        // Assuming NamespaceContext and NodeTypeTest are required for AncestorContext constructor
        ancestorContext = new AncestorContext(namespaceContext, true, nodeTypeTest);
        // Setup
        when(ancestorContext.getCurrentPosition()).thenReturn(4, 1, 2);
        doNothing().when(ancestorContext).reset();
        when(ancestorContext.nextNode()).thenReturn(true, true, false);
        // Execute
        boolean result = ancestorContext.setPosition(2);
        // Verify
        assertTrue(result, "setPosition should return true when it needs to reset and then can reach the desired position");
        verify(ancestorContext).reset(); // Reset called once
        verify(ancestorContext, times(2)).nextNode(); // Move from 1 to 2 after reset
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder() throws Exception {
        // Assuming the NodeTypeTest and NamespaceContext can be mocked
        ancestorContext = new AncestorContext(mockNamespaceContext, true, mockNodeTypeTest);
        // Since getDocumentOrder() method returns a constant -1, we test exactly that
        int result = ancestorContext.getDocumentOrder();
        assertEquals(-1, result, "The getDocumentOrder method should always return -1");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDocumentOrder_zCUL0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTypeTest);
    int result = ancestorContext.getDocumentOrder();
    assertEquals(-1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IncludeSelf_True_NodeTestPasses() {
        // Initialize AncestorContext with includeSelf set to true for this example
        ancestorContext = new AncestorContext(parentContext, true, new NodeTypeTest(1));
        // Setup
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.testNode(nodeTest)).thenReturn(true);
        // Execute
        boolean result = ancestorContext.nextNode();
        // Verify
        assertTrue(result);
        verify(currentNodePointer).testNode(nodeTest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IncludeSelf_True_NodeTestFails() {
        // Initialize AncestorContext with includeSelf set to true for this example
        ancestorContext = new AncestorContext(parentContext, true, new NodeTypeTest(1));
        // Setup
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.testNode(nodeTest)).thenReturn(false);
        when(currentNodePointer.getImmediateParentPointer()).thenReturn(null);
        // Execute
        boolean result = ancestorContext.nextNode();
        // Verify
        assertFalse(result);
        verify(currentNodePointer).testNode(nodeTest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NoParentNode() {
        // Initialize AncestorContext with includeSelf set to true for this example
        ancestorContext = new AncestorContext(parentContext, true, new NodeTypeTest(1));
        // Setup
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.testNode(nodeTest)).thenReturn(false);
        when(currentNodePointer.getImmediateParentPointer()).thenReturn(null);
        // Execute
        boolean result = ancestorContext.nextNode();
        // Verify
        assertFalse(result);
        verify(currentNodePointer, times(1)).getImmediateParentPointer();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ParentNodeExists_NodeTestPasses() {
        // Initialize AncestorContext with includeSelf set to true for this example
        ancestorContext = new AncestorContext(parentContext, true, new NodeTypeTest(1));
        // Setup
        NodePointer parentPointer = mock(NodePointer.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.testNode(nodeTest)).thenReturn(false);
        when(currentNodePointer.getImmediateParentPointer()).thenReturn(parentPointer);
        when(parentPointer.testNode(nodeTest)).thenReturn(true);
        // Execute
        boolean result = ancestorContext.nextNode();
        // Verify
        assertTrue(result);
        verify(parentPointer).testNode(nodeTest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResetMethod_vOwb0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTypeTest);
    ancestorContext.reset();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_SAsR0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTypeTest);
    NodePointer expected = ancestorContext.getCurrentNodePointer();
    assertEquals(expected, ancestorContext.getCurrentNodePointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_initialIncludeSelfTrue_NodeMatches_vFDR0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        assertTrue(ancestorContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_initialIncludeSelfFalse_NodeMatches_MsyG1() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        AncestorContext ancestorContext = new AncestorContext(namespaceContext, false, nodeTest);
        assertFalse(ancestorContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_noParentNode_ReturnsFalse_oEeG2() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        ancestorContext.nextNode(); // Move to the first node
        assertFalse(ancestorContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_parentNodeDoesNotMatch_ReturnsFalse_vpeB3() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NodeTypeTest differentNodeTypeTest = new NodeTypeTest(2);
        SelfContext selfContext = new SelfContext(null, differentNodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, differentNodeTypeTest);
        AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        ancestorContext.nextNode(); // Move to the first node
        assertFalse(ancestorContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_multipleLevelsUp_NodeMatches_Bdpj4() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        assertTrue(ancestorContext.nextNode()); // First node
        assertTrue(ancestorContext.nextNode()); // Parent node
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_multipleLevelsUp_NoMatchingNode_ifRv5() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NodeTypeTest differentNodeTypeTest = new NodeTypeTest(2);
        SelfContext selfContext = new SelfContext(null, differentNodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, differentNodeTypeTest);
        AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        assertTrue(ancestorContext.nextNode()); // First node
        assertFalse(ancestorContext.nextNode()); // Parent node does not match
    }
}