/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PrecedingOrFollowingContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_StackIsEmpty_DMDu0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        context.nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_NextNodeReturnsFalse_VpDv2_HStw0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
    ((EvalContext) precedingOrFollowingContext).setPosition(5);
    boolean result = precedingOrFollowingContext.nextNode();
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_PositionEqualsCurrentPosition_nOga1_xLLN0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
    ((EvalContext) precedingOrFollowingContext).setPosition(10);
    boolean result = precedingOrFollowingContext.nextNode();
    assert(result);
}
}