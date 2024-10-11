/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer_SDzG0() {
        selfcontext = new SelfContext(parentContext, nodeTest);
        Pointer expectedPointer = mock(Pointer.class);
        when(parentContext.getSingleNodePointer()).thenReturn(expectedPointer);
        Pointer actualPointer = selfcontext.getSingleNodePointer();
        assertEquals(expectedPointer, actualPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_holt0_fid1() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = selfContext.nextNode();
        Assertions.assertFalse(result);
    }
}