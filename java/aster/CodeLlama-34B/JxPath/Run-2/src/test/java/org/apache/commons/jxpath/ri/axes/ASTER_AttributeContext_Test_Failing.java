/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AttributeContext_Test_Failing {
    private NodeIterator iterator;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    private static QName WILDCARD = new QName(null, "*");
    private NodeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_ValidPosition_DckG0() {
        AttributeContext context = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        assertTrue(context.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_InvalidPosition_dMUP1() {
        AttributeContext context = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        assertFalse(context.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_NextNode_dmAY3() {
        AttributeContext context = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        context.setPosition(0);
        assertTrue(context.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_kPUw0() {
        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        NamespaceContext parentContext = new NamespaceContext(null, nodeTest);
        AttributeContext attributeContext = new AttributeContext(parentContext, nodeTest);
        assertTrue(attributeContext.nextNode());
    }
}