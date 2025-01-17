/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.EvalContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnionContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPositionBeforePreparation_hbPo2() {
    UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
    unionContext.setPosition(0);
    assertEquals(0, unionContext.getPosition());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPreparedFalse_rXcd0_Butc0() {
    UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
    unionContext.setPosition(0);
    try {
        int documentOrder = unionContext.getDocumentOrder();
    } catch (Exception e) {
        fail("Expected a compilation error");
    }
}
}