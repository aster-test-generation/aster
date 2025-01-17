/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceContext_Test_Passing {
    @Mock
    SelfContext parentContext;
    @Mock
    NodeTypeTest nodeTest;
    NamespaceContext namespacecontext;
    private NodeIterator iterator;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    @Mock
    private SelfContext selfContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private NodeNameTest nodeNameTest;
    @Mock
    private QName testName;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodeIterator nodeIterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithNegativePosition_TqyK0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        boolean result = namespaceContext.setPosition(-1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithZeroPosition_iOEf1() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        boolean result = namespaceContext.setPosition(0);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithPositivePosition_SaBu2() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        boolean result = namespaceContext.setPosition(1);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithCurrentPosition_cFNY3() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        boolean result = namespaceContext.setPosition(namespaceContext.getCurrentPosition());
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_WAvo0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        namespaceContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeWhenStarted_tlYj0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        boolean result = namespaceContext.nextNode();
        Assertions.assertFalse(result);
    }
}