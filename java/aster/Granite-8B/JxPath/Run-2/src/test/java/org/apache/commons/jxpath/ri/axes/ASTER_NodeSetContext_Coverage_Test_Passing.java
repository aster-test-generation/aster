/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NodeSetContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSet1_YpjY0() {
    NodeSetContext nodeSetContext = new NodeSetContext(null, null);
    boolean result = nodeSetContext.nextSet();
    assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSet2_WmxV1() {
    NodeSetContext nodeSetContext = new NodeSetContext(null, null);
    nodeSetContext.nextSet();
    boolean result = nodeSetContext.nextSet();
    assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSet3_hRZG2() {
    NodeSetContext nodeSetContext = new NodeSetContext(null, null);
    nodeSetContext.nextSet();
    nodeSetContext.nextSet();
    boolean result = nodeSetContext.nextSet();
    assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSet4_QPgh3() {
    NodeSetContext nodeSetContext = new NodeSetContext(null, null);
    nodeSetContext.nextSet();
    nodeSetContext.nextSet();
    nodeSetContext.nextSet();
    boolean result = nodeSetContext.nextSet();
    assertEquals(false, result);
}
}