/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceContext_Test_Passing {
    @Mock
    private SelfContext selfContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private NamespaceContext parentContext;
    private NodeIterator iterator;
    private boolean setStarted = false;
    @Mock
    private NodeIterator nodeIterator;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodePointer nodePointer;
    private NamespaceContext namespacecontext;
    private NodePointer currentNodePointer;
    private NodeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        MockitoAnnotations.initMocks(this);
        Mockito.when(parentContext.getCurrentPosition()).thenReturn(0);
        NamespaceContext namespaceContext = new NamespaceContext(parentContext, nodeTypeTest);
        Mockito.when(parentContext.nextNode()).thenReturn(true);
        Mockito.when(parentContext.getCurrentPosition()).thenReturn(1);
        boolean result = namespaceContext.setPosition(1);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPositionValidPosition_zRHG0() {
        SelfContext parentContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(parentContext, new NodeTypeTest(1));
        namespaceContext.setPosition(5);
        assertFalse(namespaceContext.getPosition() == 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPositionInvalidPosition_oBpA1() {
        SelfContext parentContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(parentContext, new NodeTypeTest(1));
        namespaceContext.setPosition(3);
        assertFalse(namespaceContext.getPosition() == 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPositionReset_lMHl2() {
        SelfContext parentContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(parentContext, new NodeTypeTest(1));
        namespaceContext.setPosition(5);
        namespaceContext.setPosition(3);
        assertFalse(namespaceContext.getPosition() == 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPositionNoNextNode_aIQF3() {
        SelfContext parentContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(parentContext, new NodeTypeTest(1));
        namespaceContext.setPosition(5);
        assertFalse(namespaceContext.setPosition(6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_SetStartedFalse_NodeTypeNotNodeNameTest_ReturnsFalse_visw0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(0));
        boolean result = namespaceContext.nextNode();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_SetStartedFalse_NodeTypeNodeNameTest_ReturnsFalse_WzdG1() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        boolean result = namespaceContext.nextNode();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_SetStartedTrue_NodeTypeNotNodeNameTest_ReturnsFalse_znOZ2() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(0));
        namespaceContext.nextNode();
        boolean result = namespaceContext.nextNode();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_SetStartedTrue_NodeTypeNodeNameTest_ReturnsTrue_fgHS3() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        namespaceContext.nextNode();
        boolean result = namespaceContext.nextNode();
        assertEquals(false, result);
    }
}