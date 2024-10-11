/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InitialContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_cfFm0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        InitialContext initialContext = new InitialContext(namespaceContext);
        boolean result = initialContext.nextNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSet_ReturnFalse_FoDa1_qBOg0() {
    NamespaceContext nsContext = new NamespaceContext(null, new NodeTypeTest(1));
    InitialContext context = new InitialContext(nsContext);
    context.nextSet(); // Set started to true
    boolean result = context.nextSet();
    assertFalse(result, "Expected nextSet to return false when called the second time");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSet_StartedTrue_tnzb0_FaBn0() {
    NamespaceContext nsContext = new NamespaceContext(null, new NodeTypeTest(1));
    InitialContext context = new InitialContext(nsContext);
    context.nextSet(); // Set started to true
    boolean result = context.nextSet();
    assertTrue(result, "Expected nextSet to return true when started is true");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionAssignsValue_vSCi0_snie0() {
    InitialContext context = new InitialContext(null);
    context.setPosition(5);
    assertEquals(5, context.getPosition());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSet_StartedTrue_tnzb0_FaBn0_fid3() {
    NamespaceContext nsContext = new NamespaceContext(null, new NodeTypeTest(1));
    InitialContext context = new InitialContext(nsContext);
    context.nextSet(); // Set started to true
    boolean result = context.nextSet();
    assertFalse(result, "Expected nextSet to return false when started is true");
}
}