/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NamespaceContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPositionLessThanGetCurrentPosition_lUgb0() {
    NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
    namespaceContext.setPosition(0);
    assertEquals(true, namespaceContext.getPosition() == 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPositionGreaterThanGetCurrentPosition_sQaY1() {
    NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
    namespaceContext.setPosition(5);
    assertEquals(false, namespaceContext.getPosition() == 5);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPositionEqualToGetCurrentPosition_rVSY2() {
    NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
    namespaceContext.setPosition(1);
    assertEquals(true, namespaceContext.getPosition() == 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_ReturnFalse_WhenNodeTestIsNotInstanceOfNodeNameTest_WRrv1_nLyx0() {
    SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(2));
    boolean result = namespaceContext.nextNode();
    assert (!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_ReturnFalse_WhenTestNameGetPrefixIsNotNull_IwVX2_bFop0() {
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(null, nodeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
    namespaceContext.nextNode();
    boolean result = namespaceContext.nextNode();
    assert (!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_ReturnFalse_WhenIteratorIsNull_RhIc4_DEEm0() {
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    SelfContext selfContext = new SelfContext(new NamespaceContext(null, nodeTest), nodeTest);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
    namespaceContext.nextNode();
    namespaceContext.nextNode();
    boolean result = namespaceContext.nextNode();
    assert (!result);
}
}