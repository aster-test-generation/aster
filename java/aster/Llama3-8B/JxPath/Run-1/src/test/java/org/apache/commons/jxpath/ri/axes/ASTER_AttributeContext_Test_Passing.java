/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AttributeContext_Test_Passing {
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
    public void testReset_PbiI0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(0)), new NodeTypeTest(0));
        NodeTypeTest nodeTest = new NodeTypeTest(0);
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, null), nodeTest), nodeTest);
        attributeContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeNameTestNotInstance_gKVq5() {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, null), null), null);
        boolean result = attributeContext.nextNode();
        assert (!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeTypeTestInstance_sTGe2_fid2() {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(Compiler.NODE_TYPE_NODE)), null), null);
        boolean result = attributeContext.nextNode();
    }
}