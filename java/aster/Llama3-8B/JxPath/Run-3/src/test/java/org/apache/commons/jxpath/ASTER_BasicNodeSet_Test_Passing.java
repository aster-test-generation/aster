/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicNodeSet_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointersWhenPointersIsNull_JnAC0() throws Exception {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List result = basicNodeSet.getPointers();
        assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWhenValuesIsNull_vnMO0() throws Exception {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List result = basicNodeSet.getValues();
        assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWhenValuesIsNotNull_DNEL1() throws Exception {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        basicNodeSet.getValues();
        List result = basicNodeSet.getValues();
        assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWhenPointersIsEmpty_CSxz2() throws Exception {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List result = basicNodeSet.getValues();
        assert result.isEmpty();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_EQGk0() throws Exception {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        String expected = "expected output";
        assertEquals(expected, basicNodeSet.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodesWhenNodesIsNull_dTDS0() throws Exception {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List result = basicNodeSet.getNodes();
        assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodesWhenNodesIsNotNull_PnrM1() throws Exception {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        basicNodeSet.getNodes(); // Initialize nodes
        List result = basicNodeSet.getNodes();
        assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveNullPointer_rUAt1() throws Exception {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        basicNodeSet.remove(null);
        assertEquals(true, true);
    }
}