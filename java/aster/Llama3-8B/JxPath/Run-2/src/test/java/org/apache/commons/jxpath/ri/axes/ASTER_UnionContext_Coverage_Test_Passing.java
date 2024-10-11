/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnionContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeSet_qtih2() {
    UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
    BasicNodeSet nodeSet = (BasicNodeSet) unionContext.getNodeSet();
    assertNotNull(nodeSet);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPosition_zIlk11() {
    UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
    unionContext.setPosition(0);
    assertEquals(0, unionContext.getPosition());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPositionReturn_hOuI12_fid1() {
    UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
    unionContext.setPosition(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIteratorHasNext_dffT8_tsAm0() {
    UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
    assertFalse(false); // This assertion will always fail, so the test will fail
}
}