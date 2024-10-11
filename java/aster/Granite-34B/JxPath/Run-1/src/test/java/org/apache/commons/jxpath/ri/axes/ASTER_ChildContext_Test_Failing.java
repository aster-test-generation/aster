/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ChildContext_Test_Failing {
    private NodeIterator iterator;
    ChildContext childcontext;
    @Mock
    NamespaceContext parentContext;
    @Mock
    NodeTypeTest nodeTest;
    private final boolean startFromParentLocation = true;
    private final boolean reverse = true;
    private final ChildContext childContext = new ChildContext(parentContext, nodeTest, startFromParentLocation, reverse);

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_eQtA0() {
        final int position = 1;
        boolean result = childContext.setPosition(position);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenIteratorIsNullAndOldPositionIsNonZeroAndPositionIsZero_pJTt5() {
        final int position = 0;
        boolean result = childContext.setPosition(position);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_lctF0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, false);
        Pointer pointer = childContext.getSingleNodePointer();
        assertEquals(null, pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode() throws Exception {
        childcontext = new ChildContext(parentContext, nodeTest, true, false);
        when(childcontext.getCurrentPosition()).thenReturn(0);
        assertTrue(childcontext.nextNode());
        verify(childcontext, times(1)).setPosition(1);
    }
}