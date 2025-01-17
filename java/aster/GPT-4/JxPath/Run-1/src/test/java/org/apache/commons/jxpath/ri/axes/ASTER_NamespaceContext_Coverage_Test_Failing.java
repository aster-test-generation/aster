/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NamespaceContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_YdeD0_IiMt0() {
    SelfContext parentContext = mock(SelfContext.class);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(parentContext, nodeTest);
    NodePointer expectedNodePointer = mock(NodePointer.class);
    when(parentContext.getCurrentNodePointer()).thenReturn(expectedNodePointer);
    NodePointer result = namespaceContext.getCurrentNodePointer();
    assertEquals(expectedNodePointer, result);
}
}