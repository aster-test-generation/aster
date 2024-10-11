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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NodeSetContext_Test_Passing {
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
    public void testSetPositionInvalidPosition_LHYp1() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, nodeTest), nodeTest), nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, nodeSet);
        boolean result = nodeSetContext.setPosition(0);
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_wkJt0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, null), null), null);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, null);
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        boolean result = nodeSetContext.nextNode();
        assertEquals(false, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeSet_Urjy0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new NodeSetContext(null, new BasicNodeSet()), new NodeTypeTest(0)), new NodeTypeTest(0));
        NodeSetContext nodeSetContext = new NodeSetContext(new NamespaceContext(new NodeSetContext(null, new BasicNodeSet()), new NodeTypeTest(0)), new BasicNodeSet());
        NodeSet result = nodeSetContext.getNodeSet();
        assert result != null;
    }
}