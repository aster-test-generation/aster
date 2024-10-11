/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import java.util.Iterator;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Iterator;
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
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_UnionContext_Test_Failing {
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private EvalContext evalContext;
@Mock
    private BasicNodeSet nodeSet;
@Mock
    private NodePointer nodePointer;
@Mock
    private Iterator pointerIterator;
@InjectMocks
    private UnionContext unionContext;
@Mock
    private EvalContext evalContext1;
@Mock
    private EvalContext evalContext2;
    private boolean prepared;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithMultipleContexts_AsMm4() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[2]; // Assuming EvalContext is defined and properly initialized elsewhere
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        boolean result = unionContext.setPosition(1);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithNullContexts_PoYA5() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        UnionContext unionContext = new UnionContext(namespaceContext, null);
        boolean result = unionContext.setPosition(1);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionReturnsTrueOnValidPosition_uLyx0_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[0]; // Assuming EvalContext is defined elsewhere
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        boolean result = unionContext.setPosition(1);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionPreparesNodeSetOnce_tAqo2_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        unionContext.setPosition(1); // First call to prepare the node set
        boolean result = unionContext.setPosition(2); // Should not prepare again
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionHandlesEmptyContextsArray_bCCt3_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        boolean result = unionContext.setPosition(1);
        assertTrue(result);
    }
}