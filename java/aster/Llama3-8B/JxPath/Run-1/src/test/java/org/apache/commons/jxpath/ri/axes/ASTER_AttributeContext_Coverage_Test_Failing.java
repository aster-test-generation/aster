/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AttributeContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeTypeTest_ReturnTrue_UGyq4() {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, null), null), new NodeTypeTest(Compiler.NODE_TYPE_NODE));
        attributeContext.nextNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPositionReset_BYhd3_TAvU0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, nodeTest), nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTest);
        attributeContext.setPosition(5);
        attributeContext.setPosition(0);
        assertEquals(0, attributeContext.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPositionNextNodeFalse_OlBd5_oWWm0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, nodeTest), nodeTest);
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(selfContext, nodeTest), nodeTest);
        attributeContext.setPosition(5);
        boolean result = attributeContext.nextNode();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeNameTest_ReturnTrue_Agqm5_XFBX1() {
        QName name = new QName("NodeName");
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), null), new NodeNameTest(name));
        attributeContext.nextNode();
    }
}