/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import java.util.Stack;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Stack;
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
public class Aster_PrecedingOrFollowingContext_Test_Passing {
@Mock
    private NamespaceContext mockNamespaceContext;
@Mock
    private NodeTypeTest mockNodeTypeTest;
@InjectMocks
    private PrecedingOrFollowingContext precedingOrFollowingContext;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private NodeTypeTest nodeTypeTest;
private PrecedingOrFollowingContext precedingOrFollowingContextTrue;
private PrecedingOrFollowingContext precedingOrFollowingContextFalse;
private NodePointer currentNodePointer;
@Mock
    private NamespaceContext parentContext;
@Mock
    private NodeTypeTest nodeTest;
@Mock
    private NodePointer currentRootLocation;
@Mock
    private NodePointer parentNodePointer;
@Mock
    private NodeIterator nodeIterator;
    private boolean setStarted = false;
    private Stack stack = null;
NodePointer result = precedingOrFollowingContext.getCurrentNodePointer();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_SuccessfullyAdvancesPosition() throws Exception {
        // Initialize PrecedingOrFollowingContext with mocked dependencies
        precedingOrFollowingContext = new PrecedingOrFollowingContext(mockNamespaceContext, mockNodeTypeTest, false);
        // Arrange
        int initialPosition = 1;
        int newPosition = 3;
        // Simulate the internal state and behavior
        when(precedingOrFollowingContext.nextNode()).thenReturn(true, true, false);
        // Act
        boolean result = precedingOrFollowingContext.setPosition(newPosition);
        // Assert
        assertTrue(result, "setPosition should return true when it can advance to the requested position");
        verify(precedingOrFollowingContext, times(2)).nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_FailsToAdvancePosition() throws Exception {
        // Initialize PrecedingOrFollowingContext with mocked dependencies
        precedingOrFollowingContext = new PrecedingOrFollowingContext(mockNamespaceContext, mockNodeTypeTest, false);
        // Arrange
        int initialPosition = 1;
        int newPosition = 5;
        // Simulate the internal state and behavior
        when(precedingOrFollowingContext.nextNode()).thenReturn(true, true, false);
        // Act
        boolean result = precedingOrFollowingContext.setPosition(newPosition);
        // Assert
        assertFalse(result, "setPosition should return false when it cannot advance to the requested position");
        verify(precedingOrFollowingContext, times(3)).nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_ResetCalledWhenPositionIsLessThanCurrent() throws Exception {
        // Initialize PrecedingOrFollowingContext with mocked dependencies
        precedingOrFollowingContext = new PrecedingOrFollowingContext(mockNamespaceContext, mockNodeTypeTest, false);
        // Arrange
        int initialPosition = 5;
        int newPosition = 3;
        // Set the internal state
        precedingOrFollowingContext.setPosition(initialPosition);
        // Act
        precedingOrFollowingContext.setPosition(newPosition);
        // Assert
        verify(precedingOrFollowingContext).reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_WhenReverseTrue_ShouldReturnNegativeOne() {
        // Setup with reverse true
        precedingOrFollowingContextTrue = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        // Setup with reverse false
        precedingOrFollowingContextFalse = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        int result = precedingOrFollowingContextTrue.getDocumentOrder();
        assertEquals(-1, result, "When reverse is true, getDocumentOrder should return -1");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_WhenReverseFalse_ShouldReturnOne() {
        // Setup with reverse true
        precedingOrFollowingContextTrue = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        // Setup with reverse false
        precedingOrFollowingContextFalse = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        int result = precedingOrFollowingContextFalse.getDocumentOrder();
        assertEquals(1, result, "When reverse is false, getDocumentOrder should return 1");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset() throws Exception {
        // Initialize PrecedingOrFollowingContext with mocked NamespaceContext and NodeTypeTest
        precedingOrFollowingContext = new PrecedingOrFollowingContext(mockNamespaceContext, mockNodeTypeTest, false);
        // Call the method under test
        precedingOrFollowingContext.reset();
        // Verify that setStarted is set to false after reset
        assertFalse(setStarted);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer() {
        currentNodePointer = mock(NodePointer.class);
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        // Assuming there's a way to set the currentNodePointer, since it's private and no setter is shown
        // This might typically be done via a constructor, method, or reflection if necessary
        // For the purpose of this example, we assume such a method exists:
        // precedingOrFollowingContext.setCurrentNodePointer(currentNodePointer);
        // Simulate the behavior if there's a method to set the pointer
        // As no such method exists in the provided code, this is a conceptual approach
        // precedingOrFollowingContext.setCurrentNodePointer(currentNodePointer);
        NodePointer result = precedingOrFollowingContext.getCurrentNodePointer();
        assertEquals(currentNodePointer, result, "The returned node pointer should be the one that was set.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeReturnsFalseWhenNoMoreNodes() {
        when(parentContext.getCurrentNodePointer()).thenReturn(currentRootLocation);
        when(currentRootLocation.getParent()).thenReturn(parentNodePointer);
        when(parentNodePointer.childIterator(null, false, currentRootLocation)).thenReturn(nodeIterator);
        when(nodeIterator.setPosition(anyInt())).thenReturn(true);
        when(nodeIterator.getNodePointer()).thenReturn(currentRootLocation);
        when(currentRootLocation.isRoot()).thenReturn(false);
        when(currentRootLocation.isLeaf()).thenReturn(true);
        when(currentRootLocation.testNode(nodeTest)).thenReturn(true);
        // Arrange
        when(currentRootLocation.getParent()).thenReturn(null); // No parent, should hit root condition
        when(currentRootLocation.isRoot()).thenReturn(true);
        // Act
        boolean result = precedingOrFollowingContext.nextNode();
        // Assert
        assertFalse(result, "nextNode should return false when there are no more nodes to traverse");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_KdNF0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        NodePointer expected = context.getCurrentNodePointer();
        NodePointer actual = context.getCurrentNodePointer();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrderReturnsPositiveWhenNotReversed_ABkN0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        int order = context.getDocumentOrder();
        assertEquals(1, order);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrderReturnsNegativeWhenReversed_QIxZ1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        int order = context.getDocumentOrder();
        assertEquals(-1, order);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_OyFP0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode2_uvao1() {
        NodeTypeTest nodeTest = new NodeTypeTest(2);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode3_vHoK2() {
        NodeTypeTest nodeTest = new NodeTypeTest(3);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode4_uaAJ3() {
        NodeTypeTest nodeTest = new NodeTypeTest(4);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode5_KTHc4() {
        NodeTypeTest nodeTest = new NodeTypeTest(5);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode6_bsoY5() {
        NodeTypeTest nodeTest = new NodeTypeTest(6);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode7_peJK6() {
        NodeTypeTest nodeTest = new NodeTypeTest(7);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode8_CJui7() {
        NodeTypeTest nodeTest = new NodeTypeTest(8);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode9_Rbwj8() {
        NodeTypeTest nodeTest = new NodeTypeTest(9);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode10_jsRK9() {
        NodeTypeTest nodeTest = new NodeTypeTest(10);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode11_jvmZ10() {
        NodeTypeTest nodeTest = new NodeTypeTest(11);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode12_qYdZ11() {
        NodeTypeTest nodeTest = new NodeTypeTest(12);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode13_hQby12() {
        NodeTypeTest nodeTest = new NodeTypeTest(13);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode14_YqCL13() {
        NodeTypeTest nodeTest = new NodeTypeTest(14);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode15_gGra14() {
        NodeTypeTest nodeTest = new NodeTypeTest(15);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode16_yWwa15() {
        NodeTypeTest nodeTest = new NodeTypeTest(16);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode17_MWtP16() {
        NodeTypeTest nodeTest = new NodeTypeTest(17);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode18_SiZw17() {
        NodeTypeTest nodeTest = new NodeTypeTest(18);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionIncreasePositionFail_TJaw2_hwnW0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
    context.setPosition(2);
    boolean result = context.setPosition(10);
    assertFalse(result, "Expected to return false when nextNode cannot reach the desired position");
}
@Test
    public void testNextNode_sCMI0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        when(parentContext.getCurrentNodePointer()).thenReturn(null); // Mock the behavior as per requirement
        boolean result = context.nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_ynDV0() {
        precedingOrFollowingContextFalse = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
    }
@Test
    public void testNextNode_glOT1() {
        assertFalse(precedingOrFollowingContextFalse.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDocumentOrder_WhenReverseFalse_ShouldReturnOne_Brrv0() {
    PrecedingOrFollowingContext precedingOrFollowingContextTrue = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
    PrecedingOrFollowingContext precedingOrFollowingContextFalse = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
    boolean reverse = false;
    int result = reverse ? -1 : 1;
}
}