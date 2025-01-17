/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicNodeSet_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPointers_Initialization_SOgk0_Tluo0() {
    BasicNodeSet basicNodeSet = new BasicNodeSet();
    List pointers = basicNodeSet.getPointers();
    assertNotNull(pointers, "readOnlyPointers should be initialized and not null");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodesWhenNodesIsNull_YvII0_EksM0() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List result = nodeSet.getNodes();
    assertNotNull(result, "Nodes list should not be null");
}
}