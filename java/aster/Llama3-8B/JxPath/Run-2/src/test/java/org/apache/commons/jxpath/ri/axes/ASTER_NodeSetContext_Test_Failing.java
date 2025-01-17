/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.BasicNodeSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NodeSetContext_Test_Failing {
@Mock
    private BasicNodeSet nodeSet;
@Mock
    private NodeSet nodeSetMock;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private SelfContext selfContext;
@Mock
    private NodeTypeTest nodeTypeTest;
private NodeSetContext nodesetcontext;
@Mock
    private NodePointer nodePointer;
@Mock
    private BasicNodeSet basicNodeSet;
private NodeSetContext nodeSetContext;
    private boolean startedSet = false;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionValidPosition_pRQJ0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, nodeTest), nodeTest), nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, nodeSet);
        boolean result = nodeSetContext.setPosition(2);
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionPositionGreaterThanSize_fNhw2() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, nodeTest), nodeTest), nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        BasicNodeSet nodeSet = new BasicNodeSet();
        nodeSet.getPointers().add(1);
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, nodeSet);
        boolean result = nodeSetContext.setPosition(3);
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeSet() {
        nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        Mockito.when(basicNodeSet).thenReturn(nodeSet);
        NodeSet actual = nodeSetContext.getNodeSet();
        assertEquals(nodeSet, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_wkJt0_fid2() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, null), null), null);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, null);
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        boolean result = nodeSetContext.nextNode();
        assertEquals(true, result);
    }
}