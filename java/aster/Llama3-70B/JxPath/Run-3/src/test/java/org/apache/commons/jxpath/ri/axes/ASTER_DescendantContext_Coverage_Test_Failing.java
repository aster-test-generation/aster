/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
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
public class Aster_DescendantContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testnextNode_ifCurrentNodePointerIsLeaf_YfJS2_tdlb0() throws Exception {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
    DescendantContext descendantcontext = new DescendantContext(parentContext, true, nodeTypeTest);
    assertFalse(descendantcontext.isChildOrderingRequired());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testnextNode_ifCurrentNodePointerIsLeaf_YfJS2_tdlb0_fid1() throws Exception {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
    DescendantContext descendantcontext = new DescendantContext(parentContext, true, nodeTypeTest);
    when(descendantcontext.isChildOrderingRequired()).thenReturn(false);
    assertFalse(descendantcontext.isChildOrderingRequired());
}
}