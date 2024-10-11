/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
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

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AttributeContext_Test_Passing {
    private NodeIterator iterator;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    private static QName WILDCARD = new QName(null, "*");
    private NodeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointerWithNullParentContext_QLcM1() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        AttributeContext attributeContext = new AttributeContext(selfContext, new NodeTypeTest(1));
        NodePointer nodePointer = attributeContext.getCurrentNodePointer();
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointerWithNullNodeTest_XhEC2() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        AttributeContext attributeContext = new AttributeContext(selfContext, new NodeTypeTest(1));
        NodePointer nodePointer = attributeContext.getCurrentNodePointer();
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_gJjv0_fid2() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(namespaceContext, new NodeTypeTest(1));
        AttributeContext attributeContext = new AttributeContext(selfContext, new NodeTypeTest(1));
        NodePointer nodePointer = attributeContext.getCurrentNodePointer();
    }
}