/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NamespaceContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeTestNotInstanceOfNodeNameTest_ZdsC0() {
        NodeTypeTest nodeTest = mock(NodeTypeTest.class);
        SelfContext parentContext = mock(SelfContext.class);
        NamespaceContext namespaceContext = new NamespaceContext(parentContext, nodeTest);
        assertFalse(namespaceContext.nextNode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NodeNameTestWithPrefix_qRSB1() {
        NodeNameTest nodeTest = mock(NodeNameTest.class);
        QName testName = new QName("prefix", "localName");
        when(nodeTest.getNodeName()).thenReturn(testName);
        when(nodeTest instanceof NodeNameTest).thenReturn(true);
        SelfContext parentContext = mock(SelfContext.class);
        NamespaceContext namespaceContext = new NamespaceContext(parentContext, nodeTest);
        assertFalse(namespaceContext.nextNode());
    }
}