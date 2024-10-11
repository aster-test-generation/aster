/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Assertions;
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
public class Aster_ChildContext_Test_Passing {
@Mock
    private NodeIterator iterator;
@Mock
    private Object superObject;
private ChildContext childContext;
@Mock
    private NodeTypeTest nodeTest;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private SelfContext selfContext;
private ChildContext childcontext;
@Mock
    private NodePointer nodePointer;
@Mock
    private NodeTypeTest nodeTypeTest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_PositionZero_ReturnsNull_DsYt0() {
    ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, null), null), new NodeTypeTest(0), true, false);
    NodePointer result = childContext.getCurrentNodePointer();
    Assertions.assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_Lktd0_PhBM0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
    boolean result = childContext.nextNode();
    assertFalse(result);
}
}