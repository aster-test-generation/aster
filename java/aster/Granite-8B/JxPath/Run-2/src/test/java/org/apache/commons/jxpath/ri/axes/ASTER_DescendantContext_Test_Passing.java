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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DescendantContext_Test_Passing {
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    private DescendantContext descendantContext;
    private boolean setStarted = false;
    private DescendantContext descendantcontext;
    private NodePointer currentNodePointer = null;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private SelfContext selfContext;
    @Mock
    private NodePointer nodePointer;
    private boolean includeSelf;
    private Stack stack = null;
    @Mock
    private NodeIterator nodeIterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_JWLP0() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisChildOrderingRequired() {
        descendantContext = new DescendantContext(parentContext, true, nodeTest);
        // arrange
        when(nodeTest.getNodeType()).thenReturn(1);
        // act
        boolean result = descendantContext.isChildOrderingRequired();
        // assert
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_cXSG0_JGOG0() {
        DescendantContext descendantContext = new DescendantContext(new NamespaceContext(new SelfContext(null, null), null), true, new NodeTypeTest(0));
        descendantContext.reset();
        assertTrue(descendantContext.isChildOrderingRequired());
    }
}