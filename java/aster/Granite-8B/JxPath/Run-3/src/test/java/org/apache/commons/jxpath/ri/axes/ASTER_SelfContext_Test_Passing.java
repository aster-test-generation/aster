/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SelfContext_Test_Passing {
    private NodeTest nodeTest;
    private boolean startedSet = false;
    private NodePointer nodePointer;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private SelfContext selfcontext;
    NamespaceContext namespaceContext;
    Pointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer() throws Exception {
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        namespaceContext = mock(NamespaceContext.class);
        pointer = mock(Pointer.class);
        when(namespaceContext.getSingleNodePointer()).thenReturn(pointer);
        selfcontext = new SelfContext(namespaceContext, nodeTypeTest);
        Pointer result = selfcontext.getSingleNodePointer();
        verify(namespaceContext, times(1)).getSingleNodePointer();
        assertEquals(pointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCurrentNodePointer() throws Exception {
        nodePointer = mock(NodePointer.class);
        selfcontext = new SelfContext(null, null);
        when(selfcontext.getCurrentNodePointer()).thenReturn(nodePointer);
        NodePointer actualNodePointer = selfcontext.getCurrentNodePointer();
        assertEquals(nodePointer, actualNodePointer);
    }
}