/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
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
public class Aster_AttributeContext_Test_Failing {
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private SelfContext selfContext;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private AttributeContext attributeContext;
    @Mock
    private NodeIterator iterator;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodePointer currentNodePointer;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private boolean setStarted = false;
    private static final QName WILDCARD = new QName(null, "*");

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_XnQi0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, nodeTest), nodeTest);
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(null, nodeTest), nodeTest);
        NodePointer result = attributeContext.getCurrentNodePointer();
        assertEquals(NodePointer.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeTypeTestInstance_sTGe2() {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(Compiler.NODE_TYPE_NODE)), null), null);
        boolean result = attributeContext.nextNode();
        assert (result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_hIte0() throws Exception {
        MockitoAnnotations.initMocks(this);
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(0));
        AttributeContext attributeContext = new AttributeContext(namespaceContext, new NodeTypeTest(0));
        int position = 5;
        int currentPosition = 3;
        boolean result = attributeContext.nextNode();
        for (int i = 0;i < position - currentPosition;i++) {
            result = attributeContext.nextNode();
        }
        for (int i = 0;i < position - currentPosition;i++) {
            Mockito.verify(attributeContext, Mockito.times(1)).nextNode();
        }
        Mockito.verifyNoMoreInteractions(attributeContext);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionEqualToCurrentPosition_wvlK1_pXpW0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTest);
        attributeContext.setPosition(1);
        assertTrue(attributeContext.getPosition() == 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_SetStartedTrue_drVW1_ugJC0() {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, null), null), null);
        boolean result = attributeContext.nextNode();
        assert (result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeNameTestInstance_vXze4_dHxw0() {
        QName name = new QName("test");
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeNameTest(name)), null), null);
        boolean result = attributeContext.nextNode();
        assert (result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_hIte0_fid2() throws Exception {
        MockitoAnnotations.initMocks(this);
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(0));
        AttributeContext attributeContext = new AttributeContext(namespaceContext, new NodeTypeTest(0));
        int position = 5;
        int currentPosition = 3;
        boolean result = attributeContext.nextNode();
        for (int i = 0;i < position - currentPosition;i++) {
            result = attributeContext.nextNode();
        }
        Mockito.verify(attributeContext, Mockito.times(position - currentPosition)).nextNode();
        Mockito.verifyNoMoreInteractions(attributeContext);
        Assertions.assertFalse(result);
    }
}