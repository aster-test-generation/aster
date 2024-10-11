/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AncestorContext_Test_Passing {
    private AncestorContext ancestorcontext;
    private NamespaceContext namespacecontext;
    private SelfContext selfcontext;
    private NodeTypeTest nodetypetest;
    private boolean setStarted = false;
    private NamespaceContext namespaceContext;
    private SelfContext selfContext;
    private NodeTypeTest nodeTypeTest;
    private NodePointer currentNodePointer;
    private boolean includeSelf;
    private NodeTest nodeTest;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private AncestorContext ancestorContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        namespacecontext = mock(NamespaceContext.class);
        selfcontext = mock(SelfContext.class);
        nodetypetest = mock(NodeTypeTest.class);
        ancestorcontext = new AncestorContext(namespacecontext, true, nodetypetest);
        when(ancestorcontext.getCurrentPosition()).thenReturn(1);
        when(ancestorcontext.nextNode()).thenReturn(true);
        assertTrue(ancestorcontext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_validPosition_returnsTrue_YDpA0() throws Exception {
        AncestorContext context = new AncestorContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), true, new NodeTypeTest(1));
        context.setPosition(5);
        assertTrue(context.setPosition(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_invalidPosition_returnsFalse_rzgG1() throws Exception {
        AncestorContext context = new AncestorContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), true, new NodeTypeTest(1));
        context.setPosition(5);
        assertFalse(context.setPosition(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_resetPosition_returnsTrue_xSgV2() throws Exception {
        AncestorContext context = new AncestorContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), true, new NodeTypeTest(1));
        context.setPosition(5);
        context.reset();
        assertTrue(context.setPosition(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_negativePosition_returnsFalse_mvzS3() throws Exception {
        AncestorContext context = new AncestorContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), true, new NodeTypeTest(1));
        context.setPosition(5);
        context.reset();
        assertFalse(context.setPosition(-1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_mmYC0() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        AncestorContext ancestorsContext = new AncestorContext(namespaceContext, true, new NodeTypeTest(1));
        int actual = ancestorsContext.getDocumentOrder();
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_EQPb1() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        AncestorContext ancestorsContext = new AncestorContext(namespaceContext, false, new NodeTypeTest(1));
        int actual = ancestorsContext.getDocumentOrder();
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_sHeG2() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        AncestorContext ancestorsContext = new AncestorContext(namespaceContext, true, new NodeTypeTest(2));
        int actual = ancestorsContext.getDocumentOrder();
        int expected = -1;
        assertEquals(expected, actual);
    }
}