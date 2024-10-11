/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AncestorContext_Test_Failing {
    @Mock
    NamespaceContext namespacecontext;
    @Mock
    SelfContext selfcontext;
    @Mock
    NodeTypeTest nodetypetest;
    private AncestorContext ancestorcontext;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    private boolean includeSelf;
    private NodeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition() throws Exception {
        MockitoAnnotations.initMocks(this);
        ancestorcontext = new AncestorContext(namespacecontext, true, nodetypetest);
        Mockito.when(ancestorcontext.getCurrentPosition()).thenReturn(1);
        Mockito.when(ancestorcontext.nextNode()).thenReturn(true);
        boolean result = ancestorcontext.setPosition(2);
        Mockito.verify(ancestorcontext, Mockito.times(1)).getCurrentPosition();
        Mockito.verify(ancestorcontext, Mockito.times(1)).reset();
        Mockito.verify(ancestorcontext, Mockito.times(1)).nextNode();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithValidPosition_qqWr0() {
        AncestorContext context = new AncestorContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), true, new NodeTypeTest(1));
        context.setPosition(10);
        assertEquals(10, context.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithLargePosition_leqW4() {
        AncestorContext context = new AncestorContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), true, new NodeTypeTest(1));
        context.setPosition(100);
        assertEquals(100, context.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCurrentNodePointerTest_hwGr0() {
        AncestorContext context = new AncestorContext(new NamespaceContext(new SelfContext(null, null), null), true, null);
        NodePointer nodePointer = context.getCurrentNodePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCurrentNodePointer_eGkd0() throws Exception {
        currentNodePointer = mock(NodePointer.class);
        ancestorcontext = new AncestorContext(null, false, null);
        when(ancestorcontext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        NodePointer returnedNodePointer = ancestorcontext.getCurrentNodePointer();
        assertEquals(currentNodePointer, returnedNodePointer);
    }
}