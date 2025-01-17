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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceContext_Test_Failing {
    NamespaceContext namespacecontext;
    SelfContext selfContext;
    NodeTypeTest nodeTypeTest;
    private NodeIterator iterator;
    private boolean setStarted = false;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    private NodePointer currentNodePointer;
    @Mock
    private NamespaceContext parentNamespaceContext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodeIterator nodeIterator;
    @Mock
    private NodeNameTest nodeNameTest;
    @Mock
    private QName testName;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        nodeTypeTest = mock(NodeTypeTest.class);
        selfContext = mock(SelfContext.class);
        namespacecontext = new NamespaceContext(selfContext, nodeTypeTest);
        // arrange
        int position = 10;
        // act
        boolean result = namespacecontext.setPosition(position);
        // assert
        verify(selfContext, times(1)).setPosition(position);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_HHmd0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        NodePointer currentNodePointer = namespaceContext.getCurrentNodePointer();
        assertNotNull(currentNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithNegativePosition_QXai0_fid2() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = namespaceContext.setPosition(-1);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithPositivePosition_SlMx2_fid2() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = namespaceContext.setPosition(1);
        assertTrue(result);
    }
}