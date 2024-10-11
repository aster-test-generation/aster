/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceContext_Test_Passing {
    NamespaceContext namespacecontext;
    SelfContext selfContext;
    NodeTypeTest nodeTypeTest;
    private NodeIterator iterator;
    private boolean setStarted = false;
    @Mock
    private SelfContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    private NodePointer currentNodePointer;
    @Mock
    private NamespaceContext parentNamespaceContext;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodeIterator nodeIterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithNegativePosition_XBxc0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = namespaceContext.setPosition(-1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithCurrentPosition_wVZf1() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = namespaceContext.setPosition(0);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithPositivePosition_Geab2() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = namespaceContext.setPosition(1);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithLargePosition_OTxJ3() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = namespaceContext.setPosition(100);
        assertFalse(result);
    }
}