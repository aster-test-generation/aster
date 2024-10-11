/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChildContext_Coverage_Test_Failing {
    private NodeIterator iterator;
    private ChildContext childContext;
    private NamespaceContext namespaceContext;
    private NodeTypeTest nodeTypeTest;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_wtmd0() {
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        when(childContext.getCurrentPosition()).thenReturn(1);
        when(childContext.setPosition(2)).thenReturn(true);
        boolean result = childContext.nextNode();
        verify(childContext).getCurrentPosition();
        verify(childContext).setPosition(2);
    }
}