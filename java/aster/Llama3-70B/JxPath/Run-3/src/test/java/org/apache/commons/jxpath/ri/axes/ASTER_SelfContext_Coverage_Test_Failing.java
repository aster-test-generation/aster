/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SelfContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_startedSet_LjUe0_HOqQ0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
    boolean result = selfContext.nextNode();
    assert(result);
}
}