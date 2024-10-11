/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AncestorContext_Test_Failing {
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private SelfContext selfContext;
@Mock
    private AncestorContext ancestorContext;
@Mock
    private Object superObject;
private boolean setStarted = false;
@Mock
    private NodePointer nodePointer;
@Mock
    private NodeTypeTest nodeTest;
    private NodePointer currentNodePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_SetStartedFalse_ReturnsFalse() {
        ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        when(nodePointer.getImmediateParentPointer()).thenReturn(nodePointer);
        when(nodePointer.testNode(nodeTest)).thenReturn(false);
        boolean result = ancestorContext.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_CurrentNodePointerIsNull_ReturnsFalse() {
        ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        when(nodePointer.getImmediateParentPointer()).thenReturn(nodePointer);
        when(nodePointer.getImmediateParentPointer()).thenReturn(null);
        boolean result = ancestorContext.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_StartsFromBeginning_pcaG0() {
    AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, null), null), true, new NodeTypeTest(0));
    boolean result = ancestorContext.nextNode();
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_NoNodeFound_afue1() {
    AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, null), null), false, new NodeTypeTest(0));
    boolean result = ancestorContext.nextNode();
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_FindsNode_rTZc2() {
    AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), null), true, new NodeTypeTest(0));
    boolean result = ancestorContext.nextNode();
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_FindsNodeAfterTraversal_dsnM5() {
    AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), null), true, new NodeTypeTest(0));
    boolean result = ancestorContext.nextNode();
    result = ancestorContext.nextNode();
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_LSSr0() throws Exception{
    MockitoAnnotations.initMocks(this);
    NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
    NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
    AncestorContext ancestorcontext = new AncestorContext(namespaceContext, true, nodeTypeTest);
    int position = 5;
    when(ancestorContext.getCurrentPosition()).thenReturn(3);
    boolean result = ancestorcontext.nextNode();
    Mockito.verify(ancestorcontext, Mockito.times(1)).reset();
    Mockito.verify(ancestorcontext, Mockito.times(position - 3)).nextNode();
    assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDocumentOrder_aDhE0_RdCZ0_fid2() {
    NodeTypeTest nodeTest = new NodeTypeTest(0);
    SelfContext selfContext = new SelfContext(null, nodeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
    AncestorContext ancestorContext = new AncestorContext(namespaceContext, false, nodeTest);
    int result = selfContext.getDocumentOrder();
    assertEquals(-1, result);
}
}