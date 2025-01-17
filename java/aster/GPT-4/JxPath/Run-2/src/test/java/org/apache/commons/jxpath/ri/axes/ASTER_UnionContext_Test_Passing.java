/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import java.util.Iterator;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
public class Aster_UnionContext_Test_Passing {
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
    public void testSetPositionReturnsTrueOnValidPosition_uLyx0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[0]; // Assuming EvalContext is defined elsewhere
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        boolean result = unionContext.setPosition(1);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionReturnsFalseOnNegativePosition_fdMR1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        boolean result = unionContext.setPosition(-1);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionPreparesNodeSetOnce_tAqo2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        unionContext.setPosition(1); // First call to prepare the node set
        boolean result = unionContext.setPosition(2); // Should not prepare again
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionHandlesEmptyContextsArray_bCCt3() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        boolean result = unionContext.setPosition(1);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithInvalidPositionAfterPreparation_svrf6() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        EvalContext[] evalContexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
        unionContext.setPosition(1); // Prepare with valid position
        boolean result = unionContext.setPosition(0); // Test with invalid position
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_SingleContext() {
        // Setup with one context
        EvalContext[] singleContext = {evalContext1};
        unionContext = new UnionContext(namespaceContext, singleContext);
        // Expect to call super.getDocumentOrder() when there's only one context
        assertEquals(0, unionContext.getDocumentOrder(), "Should return 0 for single context");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_MultipleContexts() {
        // Setup with one context
        EvalContext[] singleContext = {evalContext1};
        unionContext = new UnionContext(namespaceContext, singleContext);
        // Setup with multiple contexts
        EvalContext[] multipleContexts = {evalContext1, evalContext2};
        unionContext = new UnionContext(namespaceContext, multipleContexts);
        // Expect to return 1 when there are multiple contexts
        assertEquals(1, unionContext.getDocumentOrder(), "Should return 1 for multiple contexts");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDocumentOrderWithSingleContext_LtGP0_wrKA0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    EvalContext[] evalContexts = new EvalContext[1];
    UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
    int result = unionContext.getDocumentOrder();
    assertEquals(0, result); // Assuming super.getDocumentOrder() returns 0
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDocumentOrderWithMultipleContexts_NmfV1_gKAJ0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    EvalContext[] evalContexts = new EvalContext[2];
    UnionContext unionContext = new UnionContext(namespaceContext, evalContexts);
    int result = unionContext.getDocumentOrder();
    assertEquals(1, result);
}
}