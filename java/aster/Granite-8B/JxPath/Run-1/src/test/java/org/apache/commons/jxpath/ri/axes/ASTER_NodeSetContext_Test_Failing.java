/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.NodeSet;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NodeSetContext_Test_Failing {
    @Mock
    private BasicNodeSet nodeSet;
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    private NodeSetContext nodeSetContext;
    @Mock
    private NodeSet nodeSetMock;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private NodeSetContext nodesetcontext;
    @Mock
    private BasicNodeSet basicNodeSet;
    private boolean startedSet = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        nodeSetContext = new NodeSetContext(namespaceContext, nodeSet);
        // Arrange
        int position = 2;
        when(nodeSet.getPointers()).thenReturn(Arrays.asList(1, 2, 3));
        // Act
        boolean result = nodeSetContext.setPosition(position);
        // Assert
        verify(nodeSetContext).setPosition(position);
        assertEquals(position >= 1 && position <= 3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionInvalidPositionGreaterThanNodeSetSize_ldhn2() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        BasicNodeSet nodeSet = new BasicNodeSet();
        nodeSet.getPointers().add(new Object());
        nodeSet.getPointers().add(new Object());
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTest), nodeTest), nodeTest);
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, nodeSet);
        nodeSetContext.setPosition(3);
        assertFalse(nodeSetContext.setPosition(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IRDC0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, nodeSet);
        boolean result = nodeSetContext.nextNode();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionValidPosition_Bnuv0_fid2() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        BasicNodeSet nodeSet = new BasicNodeSet();
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTest), nodeTest), nodeTest);
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, nodeSet);
        nodeSetContext.setPosition(1);
        assertTrue(nodeSetContext.setPosition(1));
    }
}