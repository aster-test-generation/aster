/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicNodeSet_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_Myik1() {
        BasicNodeSet nodeSet = new BasicNodeSet();
        List pointers = nodeSet.getPointers();
        Assertions.assertEquals(Collections.emptyList(), pointers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_yqnL0() {
        BasicNodeSet bns = new BasicNodeSet();
        assertEquals("[]", bns.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_UUoE0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        basicNodeSet.getValues();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNodesTest1_eviT0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List nodes = basicNodeSet.getNodes();
        assertEquals(nodes.size(), 0);
    }
}