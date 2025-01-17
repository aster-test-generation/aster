/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicNodeSet_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointersWhenReadOnlyPointersIsNull_oTVo0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List pointers = basicNodeSet.getPointers();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodesWhenNodesIsNull_QVJv0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List result = basicNodeSet.getNodes();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodes_NodesInitiallyNull_ZVoT0_tGzP0() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List result = nodeSet.getNodes();
    assertNotNull(result, "Nodes should not be null after method call");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_WhenPointersAreNotAdded_DoesNotClearCacheLists_zXHC1_SKcY0() {
    BasicNodeSet basicNodeSet = new BasicNodeSet();
    Set mockPointers = mock(Set.class);
    when(mockPointers.addAll(any(Set.class))).thenReturn(false);
    BasicNodeSet nodeSetToAdd = mock(BasicNodeSet.class);
    basicNodeSet.add(nodeSetToAdd);
}
}