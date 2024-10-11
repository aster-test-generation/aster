/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicNodeSet_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointers_DWlt0_1() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List pointers = basicNodeSet.getPointers();
        assertNotNull(pointers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointers_DWlt0_2() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List pointers = basicNodeSet.getPointers();
        assertTrue(pointers.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_FsXy0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        assertEquals("[]", basicNodeSet.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodesWhenNodesAreNull_MFRP0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List<Object> nodes = basicNodeSet.getNodes();
        assertEquals(Collections.emptyList(), nodes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_wwWa0_CPaf0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        BasicNodeSet nodeSet = new BasicNodeSet();
        basicNodeSet.add(nodeSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointers_DWlt0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List pointers = basicNodeSet.getPointers();
        assertNotNull(pointers);
        assertTrue(pointers.isEmpty());
    }
}