/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicNodeSet_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointersWhenPointersIsNull_dNDb0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List result = basicNodeSet.getPointers();
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_JINq0_fid2() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        String expected = "some expected string";
        assertEquals(expected, basicNodeSet.toString());
    }
}