/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ChildContext_Test_Passing {
    private NodeIterator iterator;
    private ChildContext childcontext;
    @Mock
    private NodeIterator iteratorMock;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodePointer parentPointer;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @Mock
    private JXPathContext context;
    @Mock
    private NodeIterator mockIterator;
    @Mock
    private NodePointer mockPointer;
    @Mock
    NamespaceContext parentContext;
    @Mock
    NodeTypeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer1_CkVR0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, null), null), null), null, false, false);
        NodePointer actualCurrentNodePointer = childContext.getCurrentNodePointer();
        NodePointer expectedCurrentNodePointer = null;
        assertEquals(expectedCurrentNodePointer, actualCurrentNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_PPeX0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, null), null), null), null, false, false);
        boolean result = childContext.nextNode();
    }
}