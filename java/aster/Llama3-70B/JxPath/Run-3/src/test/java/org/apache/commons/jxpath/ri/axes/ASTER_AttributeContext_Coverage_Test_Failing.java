/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AttributeContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_nodeTestIsNodeTypeTestNodeTypeNode_ohpZ3() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
        assertTrue(attributeContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_nodeTestIsNodeTypeTestNodeTypeNotNode_sylQ4_JvOR0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1); 
    NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, nodeTypeTest), nodeTypeTest);
    AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
    assertFalse(attributeContext.nextNode());
}
}