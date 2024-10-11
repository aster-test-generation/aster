/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PrecedingOrFollowingContext_Test_Passing {
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private PrecedingOrFollowingContext precedingorfollowingcontext;
    private boolean reverse;
    private boolean setStarted = false;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    private NodePointer currentNodePointer;
    @Mock
    private NodePointer currentRootLocation;
    @Mock
    private NodePointer parent;
    @Mock
    private NodeIterator iterator;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(null, nodeTypeTest), nodeTypeTest);
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        assertEquals(-1, precedingorfollowingcontext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder_False() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(null, nodeTypeTest), nodeTypeTest);
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        assertEquals(1, precedingorfollowingcontext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_ReverseTrue_rWuF0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        assertEquals(-1, precedingOrFollowingContext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_ReverseFalse_xPLr1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        assertEquals(1, precedingOrFollowingContext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset() throws Exception {
        parentContext = Mockito.mock(NamespaceContext.class);
        nodeTest = Mockito.mock(NodeTypeTest.class);
        precedingorfollowingcontext = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        precedingorfollowingcontext.reset();
        assertFalse(setStarted);
    }
}