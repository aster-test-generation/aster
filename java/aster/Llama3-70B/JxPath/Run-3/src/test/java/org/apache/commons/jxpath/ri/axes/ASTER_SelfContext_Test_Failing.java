/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SelfContext_Test_Failing {
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private SelfContext selfContext;
    private boolean startedSet = false;
    NamespaceContext namespaceContext;
    Pointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode() throws Exception {
        namespaceContext = mock(NamespaceContext.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        // given
        when(selfContext.getCurrentPosition()).thenReturn(0);
        when(selfContext.setPosition(1)).thenReturn(true);
        // when
        boolean result = selfContext.nextNode();
        // then
        verify(selfContext).getCurrentPosition();
        verify(selfContext).setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_qPpM0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        Pointer pointer = selfContext.getSingleNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_RzpM0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        assertTrue(selfContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_1_fNkl0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        assertTrue(selfContext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_3_DVNS2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        assertTrue(selfContext.setPosition(1));
    }
}