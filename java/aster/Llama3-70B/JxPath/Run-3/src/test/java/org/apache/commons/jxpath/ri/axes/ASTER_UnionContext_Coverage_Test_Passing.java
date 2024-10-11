/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnionContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_PreparedFalse_YrvY0() {
        UnionContext unionContext = new UnionContext(new NamespaceContext(null, new NodeTypeTest(1)), new EvalContext[0]);
        assertFalse(unionContext.setPosition(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_GetNodeSet_yaOj2_jGeN0_1() {
    UnionContext unionContext = new UnionContext(new NamespaceContext(null, new NodeTypeTest(1)), new EvalContext[0]);
    BasicNodeSet nodeSet = new BasicNodeSet();
    unionContext.setPosition(0);
    assertNotNull(nodeSet);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_GetNodeSet_yaOj2_jGeN0_2() {
    UnionContext unionContext = new UnionContext(new NamespaceContext(null, new NodeTypeTest(1)), new EvalContext[0]);
    BasicNodeSet nodeSet = new BasicNodeSet();
    unionContext.setPosition(0);
    assertNotNull(unionContext.getNodeSet());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_PreparedTrue_Fulq1_kbLl0() {
    UnionContext unionContext = new UnionContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new EvalContext[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_CreateArrayList_QDWP3_sqkh0() {
    UnionContext unionContext = new UnionContext(new NamespaceContext(null, new NodeTypeTest(1)), new EvalContext[0]);
    unionContext.setPosition(0);
}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_CreateArrayList_QDWP3_bEMI1() {
    UnionContext unionContext = new UnionContext(new NamespaceContext(null, new NodeTypeTest(1)), new EvalContext[0]);
    unionContext.setPosition(0);
    assertEquals(1, unionContext.getDocumentOrder());
}
}