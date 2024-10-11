/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
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

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DescendantContext_Test_Passing {
    @Mock
    NamespaceContext namespacecontext;
    @Mock
    SelfContext selfcontext;
    @Mock
    NodeTypeTest nodetypetest;
    DescendantContext descendantcontext;
    private boolean setStarted = false;
    private NodePointer currentNodePointer = null;
    private NodeTest nodeTest;
    private boolean includeSelf;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset11_RNdd10() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisChildOrderingRequired() throws Exception {
        SelfContext selfcontext = new SelfContext(Mockito.mock(NamespaceContext.class), new NodeTypeTest(1));
        descendantcontext = new DescendantContext(selfcontext, true, new NodeTypeTest(1));
        assertTrue(descendantcontext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequired_dSxA0() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        boolean includeSelf = true;
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        DescendantContext descendantContext = new DescendantContext(parentContext, includeSelf, nodeTest);
        boolean actual = descendantContext.isChildOrderingRequired();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset_GElw0() throws Exception {
        NamespaceContext namespacecontext = new NamespaceContext(null, null);
        NodeTypeTest nodetypetest = new NodeTypeTest(0);
        descendantcontext = new DescendantContext(namespacecontext, true, nodetypetest);
        descendantcontext.reset();
    }
}