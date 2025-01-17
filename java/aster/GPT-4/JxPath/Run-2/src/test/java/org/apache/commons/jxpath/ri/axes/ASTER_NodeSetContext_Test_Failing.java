/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.BasicNodeSet;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class Aster_NodeSetContext_Test_Failing {
@Mock
    private NodeSet nodeSet;
@Mock
    private NamespaceContext namespaceContext;
@InjectMocks
    private NodeSetContext nodeSetContext;
@Mock
    private BasicNodeSet basicNodeSet;
@Mock
    private NodePointer nodePointer;
@Mock
    private NamespaceContext mockNamespaceContext;
@Mock
    private BasicNodeSet mockBasicNodeSet;
@InjectMocks
    private NodeSetContext nodesetcontext;
    private boolean startedSet = false;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_1() throws Exception {
        nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        // Setup
        when(nodeSetContext.setPosition(anyInt())).thenReturn(true, false);
        // Execute & Verify
        // Verify setPosition was called with incremented values
        verify(nodeSetContext, times(2)).setPosition(anyInt());
        verify(nodeSetContext).setPosition(1);
        verify(nodeSetContext).setPosition(2);
        assertTrue(nodeSetContext.nextNode(), "nextNode should return true when position is valid");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_2() throws Exception {
        nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        // Setup
        when(nodeSetContext.setPosition(anyInt())).thenReturn(true, false);
        // Execute & Verify
        // Verify setPosition was called with incremented values
        verify(nodeSetContext, times(2)).setPosition(anyInt());
        verify(nodeSetContext).setPosition(1);
        verify(nodeSetContext).setPosition(2);
        assertFalse(nodeSetContext.nextNode(), "nextNode should return false when position is invalid");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeSet() throws Exception {
        // Initialize NodeSetContext with mocked NamespaceContext and BasicNodeSet
        nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        // Set the private field nodeSet using reflection or directly if the field is accessible
        nodeSetContext.getClass().getDeclaredField("nodeSet").set(nodeSetContext, nodeSet);
        // Act
        NodeSet result = nodeSetContext.getNodeSet();
        // Assert
        assertEquals(nodeSet, result, "The getNodeSet method should return the instance of NodeSet that was set.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_WhenPositionIsZeroAndSetPositionSucceeds_ReturnsNodePointer_jBpS0_1() throws Exception {
    when(basicNodeSet.getPointers()).thenReturn(Arrays.asList(nodePointer));
    nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
    doReturn(true).when(nodeSetContext).setPosition(1);
    NodePointer result = nodeSetContext.getCurrentNodePointer();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_WhenPositionIsZeroAndSetPositionSucceeds_ReturnsNodePointer_jBpS0_2() throws Exception {
    when(basicNodeSet.getPointers()).thenReturn(Arrays.asList(nodePointer));
    nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
    doReturn(true).when(nodeSetContext).setPosition(1);
    NodePointer result = nodeSetContext.getCurrentNodePointer();
    assertEquals(nodePointer, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_ValidPosition() throws Exception {
        List<NodePointer> pointers = new ArrayList<>();
        pointers.add(mock(NodePointer.class)); // Assuming NodePointer is a class used in nodeSet
        pointers.add(mock(NodePointer.class));
        when(nodeSet.getPointers()).thenReturn(pointers);
        assertTrue(nodeSetContext.setPosition(1), "Position should be valid and return true");
        assertTrue(nodeSetContext.setPosition(2), "Position should be valid and return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithinRange_wnfd0_fid2() {
        BasicNodeSet nodeSet = new BasicNodeSet();
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        NodeSetContext context = new NodeSetContext(namespaceContext, nodeSet);
        assertTrue(context.setPosition(1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode() throws Exception {
        nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        // Setup
        when(nodeSetContext.setPosition(anyInt())).thenReturn(true, false);
        // Execute & Verify
        assertTrue(nodeSetContext.nextNode(), "nextNode should return true when position is valid");
        assertFalse(nodeSetContext.nextNode(), "nextNode should return false when position is invalid");
        // Verify setPosition was called with incremented values
        verify(nodeSetContext, times(2)).setPosition(anyInt());
        verify(nodeSetContext).setPosition(1);
        verify(nodeSetContext).setPosition(2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_pchS0_fid2() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    BasicNodeSet basicNodeSet = new BasicNodeSet();
    NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
    boolean result = nodeSetContext.nextNode();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_ValidPosition_2_fid3() throws Exception {
        List<NodePointer> pointers = new ArrayList<>();
        pointers.add(mock(NodePointer.class)); // Assuming NodePointer is a class used in nodeSet
        pointers.add(mock(NodePointer.class));
        when(nodeSet.getPointers()).thenReturn(pointers);
        assertTrue(nodeSetContext.setPosition(2), "Position should be valid and return true");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_WhenPositionIsZeroAndSetPositionSucceeds_ReturnsNodePointer_jBpS0_1_fid3() throws Exception {
    when(basicNodeSet.getPointers()).thenReturn(Arrays.asList(nodePointer));
    nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
    when(nodeSetContext.setPosition(1)).thenReturn(true);
    NodePointer result = nodeSetContext.getCurrentNodePointer();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_WhenPositionIsZeroAndSetPositionSucceeds_ReturnsNodePointer_jBpS0_2_fid3() throws Exception {
    when(basicNodeSet.getPointers()).thenReturn(Arrays.asList(nodePointer));
    nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
    when(nodeSetContext.setPosition(1)).thenReturn(true);
    NodePointer result = nodeSetContext.getCurrentNodePointer();
    assertEquals(nodePointer, result);}
}